package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.item.dto.IndiOrCom;
import com.boa.cashfilm.item.dto.Item;

@Repository
public class ItemDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private static final Logger logger = LoggerFactory.getLogger(ItemDao.class);
	//중복경로설정
	private final String NAMESPACE = "com.boa.cashfilm.mapper.itemMapper.";
	
	// 상품 판매 조회
	public List<Item> selectMyItemSell(IndiOrCom indiOrCom) {
		logger.debug("{} : < indiOrCom selectMyItemSell() ItemDao", indiOrCom.getIndiOrCom());
		return sqlSessionTemplate.selectList(NAMESPACE + "selectMyItemSell", indiOrCom);
	}
	
	// cfmyitem 상품등록 Dao
	public void insertCfMyItem(Item item) {
		logger.debug("{} : < item insertCfMyItem itemDao", item);
		sqlSessionTemplate.insert(NAMESPACE + "insertCfMyItem", item);
	}
	
	// cfmyitem 상품조회 Dao
	public List<Item> selectCfMyItem() {
		return sqlSessionTemplate.selectList(NAMESPACE + "selectCfMyItem");
	}
	
	// cfmyitem 상품수정 Dao
	public int updateCfMyItem(Item item) {
		return sqlSessionTemplate.update(NAMESPACE + "updateCfMyItem", item);
	}
	
	// cfmyitem 상품수정 처리 code조회 select
	public Item selectAndupdateCfMyItem(int myItemCode) {
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectAndupdateCfMyItem", myItemCode);
	}
	
	// cfmyitem 상품삭제 Dao
	public int deleteCfMyItem(Item item) {
		return sqlSessionTemplate.delete(NAMESPACE + "deleteCfMyItem", item);
	}
}
