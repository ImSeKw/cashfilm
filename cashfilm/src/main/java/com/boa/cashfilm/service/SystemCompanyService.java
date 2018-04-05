package com.boa.cashfilm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.SystemCompanyDao;
import com.boa.cashfilm.syscom.dto.ComSystem;


@Service
@Transactional
public class SystemCompanyService {
	
	@Autowired
	private SystemCompanyDao systemcomDao;
	private static final Logger logger = LoggerFactory.getLogger(SystemCompanyService.class);

	//회사 계정체계 삭제 
	public int deleteComSystem (ComSystem csys) {
		logger.debug("{} : deleteComSystem SystemCompanyService",csys);
		return systemcomDao.deleteComSystem(csys);
	}

	//회사 계정체계 수정
	public int updateComSystem(ComSystem csys) {
		logger.debug("{} : updateComSystem SystemCompanyService",csys);
		return systemcomDao.updateComSystem(csys);
	}
	
	//회사 계정체계 수정을 위한 검색 
	public ComSystem selectOneComSystem(int comSystemNumeral){
		logger.debug("{} : selectOneComSystem SystemCompanyService",comSystemNumeral);
		return systemcomDao.selectOneComSystem(comSystemNumeral);
	}

	//회사 계정체계 검색 
	public List<ComSystem> selectAllComSystem(){
		logger.debug("{} : selectAllComSystem SystemCompanyService");
		return systemcomDao.selectAllComSystem();
	}
	
	//회사계정체계 등록
	public int insertComSystem(ComSystem csys) {
		logger.debug("{} : insertComSystem SystemCompanyService", csys);
		return systemcomDao.insertComSystem(csys);
	}
	
}
