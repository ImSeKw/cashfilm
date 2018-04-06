package com.boa.cashfilm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.SystemCompanyDao;
import com.boa.cashfilm.syscom.dto.ComSubject;
import com.boa.cashfilm.syscom.dto.ComSystem;
import com.boa.cashfilm.syscom.dto.ComSystemAndSubject;


@Service
@Transactional
public class SystemCompanyService {
	
	@Autowired
	private SystemCompanyDao systemcomDao;
	private static final Logger logger = LoggerFactory.getLogger(SystemCompanyService.class);
	
	//회사 계정과목 삭제 
	public int deleteComSubject(ComSubject csub) {
		logger.debug("{} : deleteComSubject SystemCompanyService",csub);
		return systemcomDao.deleteComSubject(csub);
	}
	
	//회사 계정과목 수정 
	public int updateComSubject(ComSubject csub) {
		logger.debug("{} : updateComSubject SystemCompanyService",csub);
		return systemcomDao.updateComSubject(csub);
	}
	
	//회사 계정과목 수정을 위한 검색 
	public ComSubject selectOneComSubject(int comSubjectNumeral){
		logger.debug("{} : selectOneComSubject SystemCompanyService",comSubjectNumeral);
		return systemcomDao.selectOneComSubject(comSubjectNumeral);
	}
	
	//회사 계정명별 검색
	public List<ComSubject> selectOneComSubjectofsub(String comSubjectName){
		logger.debug("{} : selectOneComSubjectofsys SystemCompanyService",comSubjectName);
		return systemcomDao.selectOneComSubjectofsub(comSubjectName);
	}
	
	//회사 계정체계별 검색 
	public List<ComSystemAndSubject> selectOneComSubjectofsys(int comSystemNumeral){
		logger.debug("{} : selectOneComSubjectofsys SystemCompanyService",comSystemNumeral);
		return systemcomDao.selectOneComSubjectofsys(comSystemNumeral);
	}
	
	//회사계정과목 검색 
	public List<ComSystemAndSubject> selectAllComSubject(){
		logger.debug("{} : selectAllComSubject SystemCompanyService");
		return systemcomDao.selectAllComSubject();
	}
	
	//회사 계정과목 등록 
	public int insertComSubject(ComSubject csub) {
		logger.debug("{} : insertComSubject SystemCompanyService",csub);
		return systemcomDao.insertComSubject(csub);
	}
	
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
