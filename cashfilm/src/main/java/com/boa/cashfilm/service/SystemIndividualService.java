package com.boa.cashfilm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.SystemIndividualDao;
import com.boa.cashfilm.sysindi.dto.IndividualSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSubjectDetail;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndUSubject;
import com.boa.cashfilm.sysindi.dto.Individualcontent;
import com.boa.cashfilm.sysindi.dto.UserIndividualSubject;


@Service
@Transactional
public class SystemIndividualService {
	@Autowired
	private SystemIndividualDao systemindividualDao;
	private static final Logger logger = LoggerFactory.getLogger(SystemIndividualService.class);
	
	//개인적요 등록
	public int insertIndividualcontent(Individualcontent ic) {
		logger.debug("{} :insertIndividualcontent SystemIndividualService.java",ic);
		return systemindividualDao.insertIndividualcontent(ic);
	}
	
	//개인계정 세부 삭제
	public int deleteIndividualSubjectDetail(IndividualSubjectDetail isd) {
		logger.debug("{} :deleteIndividualSubjectDetail SystemIndividualService.java",isd);
		return systemindividualDao.deleteIndividualSubjectDetail(isd);
	}
	
	//개인계정 세부 수정
	public int updateIndividualSubjectDetail(IndividualSubjectDetail isd) {
		logger.debug("{} :updateIndividualSubjectDetail SystemIndividualService.java",isd);
		return systemindividualDao.updateIndividualSubjectDetail(isd);
	}
	
	//개인계정 세부 수정을 위한 검색
	public IndividualSubjectDetail selectOneNuIndividualSubjectDetail(int individualSubjectDetailNumeral) {
		logger.debug("{} :selectOneNuIndividualSubjectDetail SystemIndividualService.java",individualSubjectDetailNumeral);
		return systemindividualDao.selectOneNuIndividualSubjectDetail(individualSubjectDetailNumeral);
	}
	
	//개인계정 세부 검색(세부명별 검색)
	public IndividualSubjectDetail selectOneIndividualSubjectDetail(String individualSubjectDetailName){
		logger.debug("{} :selectOneIndividualSubjectDetail SystemIndividualService.java",individualSubjectDetailName);
		return systemindividualDao.selectOneIndividualSubjectDetail(individualSubjectDetailName);
	}
	
	//개인계정 세부 검색(모든검색)
	public List<IndividualSubjectDetail> selectAllIndividualSubjectDetail(){
		logger.debug("{} :selectAllIndividualSubjectDetail SystemIndividualService.java");
		return systemindividualDao.selectAllIndividualSubjectDetail();
	}
	
	//개인계정 세부 등록
	public int insertIndividualSubjectDetail(IndividualSubjectDetail isd) {
		logger.debug("{} :insertIndividualSubjectDetail SystemIndividualService.java",isd);
		return systemindividualDao.insertIndividualSubjectDetail(isd);
	}
	
	//개인 사용자 계정과목  삭제 
	public int deleteUserIndiSubject(UserIndividualSubject uis) {
		logger.debug("{} :deleteUserIndiSubject SystemIndividualService.java",uis);
		return systemindividualDao.deleteUserIndiSubject(uis);
	}
	
	//개인 사용자 계정과목 수정
	public int updateUserIndiSubject(UserIndividualSubject uis) {
		logger.debug("{} :updateUserIndiSubject SystemIndividualService.java",uis);
		return systemindividualDao.updateUserIndiSubject(uis);
	}
		
	//개인 사용자 계정과목 수정을 위한 검색 
	public UserIndividualSubject selectOneUserIndiSubject(int userIndividualSubjectCode) {
		logger.debug("{} :selectOneUserIndiSubject SystemIndividualService.java",userIndividualSubjectCode);
		return systemindividualDao.selectOneUserIndiSubject(userIndividualSubjectCode);
	}
	
	//개인 사용자 계정과목 검색 
	public List<IndividualSystemAndUSubject> selectUserIndiSubject(String memberEmail){
		logger.debug("{} :selectUserIndiSubject SystemIndividualService.java",memberEmail);
		return systemindividualDao.selectUserIndiSubject(memberEmail);
	}
	
	//개인 사용자 계정과목 등록  
	public int insertUserIndiSubject(UserIndividualSubject uisubject) {
		logger.debug("{} :insertUserIndiSubject SystemIndividualService.java",uisubject);
		return systemindividualDao.insertUserIndiSubject(uisubject);
	}
	
	//개인계정과목 삭제 
	public int deleteIndividualSubject(IndividualSubject isubject) {
		logger.debug("{} :deleteIndividualSubject SystemIndividualService.java",isubject);
		return systemindividualDao.deleteIndividualSubject(isubject);
	}
	
	//개인계정과목 수정 
	public int updateIndividualSubject(IndividualSubject isubject) {
		logger.debug("{} :updateIndividualSubject SystemIndividualService.java",isubject);
		return systemindividualDao.updateIndividualSubject(isubject);
	}
	
	//개인계정 과목 수정을 위한 검색
	public IndividualSubject selectOneIndividualSubject(int individualSubjectNumeral) {
		logger.debug("{} :selectOneIndividualSubject SystemIndividualService.java",individualSubjectNumeral);
		return systemindividualDao.selectOneIndividualSubject(individualSubjectNumeral);
	}
	
	//개인계정과목 체계별검색 
	public List<IndividualSystemAndSubject> selectIndividualSubjectOfIndividualSystem(int individualSystemNumeral){
		logger.debug("{} :selectIndividualSubjectOfIndividualSystem SystemIndividualService.java",individualSystemNumeral);
		return systemindividualDao.selectIndividualSubjectOfIndividualSystem(individualSystemNumeral);
	}
	
	
	//개인계정과목 검색 
	public List<IndividualSubject> selectAllIndividualSubject(){
		logger.debug("selectAllIndividualSubject SystemIndividualService.java");
		return systemindividualDao.selectAllIndividualSubject();
	}
	
	//개인계정과목 등록 
	public int insertIndividualSubject(IndividualSubject isubject) {
		logger.debug("{} :insertIndividualSubject SystemIndividualService.java",isubject);
		return systemindividualDao.insertIndividualSubject(isubject);
	}
	
	//계정체계관리 삭제 
	public int deleteIndividualSystem(IndividualSystem isystem) {
		logger.debug("{} :deleteIndividualSystem SystemIndividualService.java",isystem);
		return systemindividualDao.deleteIndividualSystem(isystem);
	}
	
	//계정체계관리 수정 
	public int updateIndividualSystem(IndividualSystem isystem) {
		logger.debug("{} :updateIndividualSystem SystemIndividualService.java",isystem);
		return systemindividualDao.updateIndividualSystem(isystem);
	}
	
	//계정체계관리수정을 위한 검색
	public IndividualSystem selectOneIndividualSystem(int individualSystemNumeral) {
		logger.debug("{} : selectOneIndividualSystem SystemIndividualService.java",individualSystemNumeral);
		return systemindividualDao.selectOneIndividualSystem(individualSystemNumeral);
	}
	
	//계정체계관리 검색
	public List<IndividualSystem> selectIndividualSystem() {
		logger.debug("selectIndividualSystem SystemIndividualService.java");
		return systemindividualDao.selectIndividualSystem();
	}
	
	//계정체계관리 등록
	public int insertIndividualSystem(IndividualSystem isystem) {
		logger.debug("{} :insertIndividualSystem SystemIndividualService.java",isystem);
		return systemindividualDao.insertIndividualSystem(isystem);
	}

}
