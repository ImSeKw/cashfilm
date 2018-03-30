package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.sysindi.dto.IndividualSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndSubject;
import com.boa.cashfilm.sysindi.dto.UserIndividualSubject;


@Repository
public class SystemIndividualDao {
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	private static final Logger logger = LoggerFactory.getLogger(SystemIndividualDao.class);
	private final String NAMESPACE ="com.boa.cashfilm.mapper.systemIndividualMapper.";
	
	//개인 사용자 계정과목 등록  
	public int insertUserIndiSubject(UserIndividualSubject uisubject) {
		logger.debug("uisubject insertUserIndiSubject");
		return sqlsessiontemplate.insert(NAMESPACE + "insertUserIndiSubject", uisubject);
	}
	
	//개인계정과목 삭제 
	public int deleteIndividualSubject(IndividualSubject isubject) {
		logger.debug("isubject deleteIndividualSubject");
		return sqlsessiontemplate.delete(NAMESPACE + "deleteIndividualSubject",isubject);
	}
	
	//개인계정과목 수정 
	public int updateIndividualSubject(IndividualSubject isubject) {
		logger.debug("isubject updateIndividualSubject");
		return sqlsessiontemplate.update(NAMESPACE + "updateIndividualSubject",isubject);
	}
		
	//개인계정 과목 수정을 위한 검색
	public IndividualSubject selectOneIndividualSubject(int individualSubjectNumeral) {
		logger.debug("isubject selectOneIndividualSubject");
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneIndividualSubject",individualSubjectNumeral);
	}
	
	//개인계정과목 체계별검색 
	public List<IndividualSystemAndSubject> selectIndividualSubjectOfIndividualSystem(int individualSystemNumeral){
		logger.debug("isubject selectIndividualSubjectOfIndividualSystem");
		return sqlsessiontemplate.selectList(NAMESPACE + "selectIndividualSubjectOfIndividualSystem", individualSystemNumeral);
	}
	
	//개인계정과목 검색 
	public List<IndividualSubject> selectAllIndividualSubject(){
		logger.debug("isubject selectAllIndividualSubject");
		return sqlsessiontemplate.selectList(NAMESPACE +"selectAllIndividualSubject");
	}
	
	//개인계정과목 등록 
	public int insertIndividualSubject(IndividualSubject isubject) {
		logger.debug("isubject insertIndividualSubject");
		return sqlsessiontemplate.insert(NAMESPACE + "insertIndividualSubject",isubject);
	}
		
	//계정체계관리 삭제 
	public int deleteIndividualSystem(IndividualSystem isystem) {
		logger.debug("isystem deleteIndividualSystem");
		return sqlsessiontemplate.delete(NAMESPACE + "deleteIndividualSystem",isystem);
	}
		
	
	//계정체계관리 수정 
	public int updateIndividualSystem(IndividualSystem isystem) {
		logger.debug("isystem updateIndividualSystem");
		return sqlsessiontemplate.update(NAMESPACE + "updateIndividualSystem",isystem);
	}
	
	//계정체계관리수정을 위한 검색
	public IndividualSystem selectOneIndividualSystem(int individualSystemNumeral) {
		logger.debug("{} : selectOneIndividualSystem",individualSystemNumeral);
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneIndividualSystem",individualSystemNumeral);
	}
	
	//계정체계관리 검색  /
	public List<IndividualSystem>selectIndividualSystem() {
		logger.debug("isystem selectIndividualSystem");
		return sqlsessiontemplate.selectList(NAMESPACE +"selectIndividualSystem");
	}	
	
	//계정체계관리 등록 
	public int insertIndividualSystem(IndividualSystem isystem) {
		logger.debug("{} : isystem insertIndividualSystem",isystem);
		return sqlsessiontemplate.insert(NAMESPACE + "insertIndividualSystem", isystem);
	}
}

