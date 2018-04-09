package com.boa.cashfilm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.SystemCompanyDao;
import com.boa.cashfilm.syscom.dto.ComContent;
import com.boa.cashfilm.syscom.dto.ComContentAndSubUsub;
import com.boa.cashfilm.syscom.dto.ComSubject;
import com.boa.cashfilm.syscom.dto.ComSystem;
import com.boa.cashfilm.syscom.dto.ComSystemAndSubject;
import com.boa.cashfilm.syscom.dto.ComSystemAndUSubject;
import com.boa.cashfilm.syscom.dto.UserComSubject;


@Service
@Transactional
public class SystemCompanyService {
	
	@Autowired
	private SystemCompanyDao systemcomDao;
	private static final Logger logger = LoggerFactory.getLogger(SystemCompanyService.class);
	
	//회사 적요 삭제
	public int deleteComContent(ComContent cc) {
		logger.debug("{} : deleteComContent SystemCompanyService",cc);
		return systemcomDao.deleteComContent(cc);
	}
	
	//회사 적요 수정
	public int updateComContent(ComContent cc) {
		logger.debug("{} : updateComContent SystemCompanyService",cc);
		return systemcomDao.updateComContent(cc);
	}
	
	//회사 적요 수정을 위한 검색
	public ComContent selectOneComContent(int comContentCode){
		logger.debug("{} : selectOneComContent SystemCompanyService",comContentCode);
		return systemcomDao.selectOneComContent(comContentCode);
	}
	
	//회사 적요 검색 
	public List<ComContentAndSubUsub> selectAllComContent(int comCode){
		logger.debug("{} : selectAllComContent SystemCompanyService",comCode);
		return systemcomDao.selectAllComContent(comCode);
	}
	
	//회사 적요관리 
	public int insertComContent(ComContent ccon) {
		logger.debug("{} : insertComContent SystemCompanyService",ccon);
		return systemcomDao.insertComContent(ccon);
	}

	//회사 사용자 계정과목 삭제  -->
	public int deleteUComSubject(UserComSubject ucsub) {
		logger.debug("{} : deleteUComSubject SystemCompanyService",ucsub);
		return systemcomDao.deleteUComSubject(ucsub);
	}
	
	//회사 사용자 계정과목 수정 
	public int updateUComSub(UserComSubject ucsub) {
		logger.debug("{} : updateUComSub SystemCompanyService",ucsub);
		return systemcomDao.updateUComSub(ucsub);
	}
	
	//회사 사용자 계정과목 수정을 위한 검색  
	public UserComSubject selectOneUComSubject(int userComSubjectCode) {
		logger.debug("{} : selectOneUComSubject SystemCompanyService",userComSubjectCode);
		return systemcomDao.selectOneUComSubject(userComSubjectCode);
	}
	
	//회사 사용자 계정과목 검색 
	public List<ComSystemAndUSubject> selectUComSubject(int comCode) {
		logger.debug("{} : insertUComSubject SystemCompanyService",comCode);
		return systemcomDao.selectUComSubject(comCode);
	}
	
	//회사 사용자 계정과목 등록
	public int insertUComSubject(UserComSubject ucsub) {
		logger.debug("{} : insertUComSubject SystemCompanyService",ucsub);
		return systemcomDao.insertUComSubject(ucsub);
	}
	
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
