package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.syscom.dto.ComSystem;



@Repository
public class SystemCompanyDao {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	private static final Logger logger = LoggerFactory.getLogger(SystemCompanyDao.class);
	private final String NAMESPACE ="com.boa.cashfilm.mapper.cashfilmMapper.";
	
	//회사 계정체계 삭제 
	public int deleteComSystem (ComSystem csys) {
		logger.debug("{} : deleteComSystem SystemCompanyDao",csys);
		return sqlsessiontemplate.delete(NAMESPACE +"deleteComSystem", csys);
	}
	
	//회사 계정체계 수정
	public int updateComSystem(ComSystem csys) {
		logger.debug("{} : updateComSystem SystemCompanyDao",csys);
		return sqlsessiontemplate.update(NAMESPACE + "updateComSystem", csys);
	}
	
	//회사 계정체계 수정을 위한 검색 
	public ComSystem selectOneComSystem(int comSystemNumeral){
		logger.debug("{} : selectOneComSystem SystemCompanyDao",comSystemNumeral);
		return sqlsessiontemplate.selectOne(NAMESPACE +"selectOneComSystem",comSystemNumeral);
	}
	
	//회사 계정체계 검색 
	public List<ComSystem> selectAllComSystem(){
		logger.debug("{} : selectAllComSystem SystemCompanyDao");
		return sqlsessiontemplate.selectList(NAMESPACE + "selectAllComSystem");
	}
			
	//회사계정체계 등록
	public int insertComSystem(ComSystem csys) {
		logger.debug("{} : insertComSystem SystemCompanyDao", csys);
		return sqlsessiontemplate.insert(NAMESPACE +"insertComSystem", csys);
	}
	
	

}
