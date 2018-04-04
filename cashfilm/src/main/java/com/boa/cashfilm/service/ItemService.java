package com.boa.cashfilm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.cashfilm.dao.ItemDao;
import com.boa.cashfilm.item.dto.Item;

@Service
public class ItemService {
	@Autowired
	ItemDao itemDao;
	private static final Logger logger = LoggerFactory.getLogger(ItemService.class);
	
	//cfmyitem 상품 등록
	public void insertCfMyItem(Item item) {
		logger.debug("{} : < item insertCfMyItem ItemService", item);
		item.setMyItemName(item.getMyItemName());
		item.setMyItemAmount(item.getMyItemAmount());
		item.setMyItemExpiration(item.getMyItemExpiration());
		itemDao.insertCfMyItem(item);
	}
	
	// cfmyitem 상품조회
	public List<Item> selectCfMyItem() {
		return itemDao.selectCfMyItem();
	}
	
	// cfmyitem 상품수정
	public int updateCfMyItem(Item item) {
		return itemDao.updateCfMyItem(item);
	}
	
	// cfmyitem 상품수정을 위한 code값 조회 
	public Item selectAndupdateCfMyItem(int myItemCode) {
		return itemDao.selectAndupdateCfMyItem(myItemCode);
	}
	
	// cfmyitem 상품삭제
	public int deleteCfMyItem(Item item) {
		return itemDao.deleteCfMyItem(item);
	}
}
