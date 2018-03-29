package com.boa.cashfilm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.SystemIndividualDao;
import com.boa.cashfilm.sysindi.dto.IndividualSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndSubject;


@Service
@Transactional
public class SystemIndividualService {
	@Autowired
	private SystemIndividualDao systemindividualDao;
	private static final Logger logger = LoggerFactory.getLogger(SystemIndividualService.class);
	
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
