package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.sysindi.dto.IndividualSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSubjectDetail;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndUSubject;
import com.boa.cashfilm.sysindi.dto.Individualcontent;
import com.boa.cashfilm.sysindi.dto.UserIndividualSubject;


@Repository
public class SystemIndividualDao {
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	private static final Logger logger = LoggerFactory.getLogger(SystemIndividualDao.class);
	private final String NAMESPACE ="com.boa.cashfilm.mapper.systemIndividualMapper.";
	
	//개인적요 등록
	public int insertIndividualcontent(Individualcontent ic) {
		logger.debug("uisubject insertIndividualcontent");
		return sqlsessiontemplate.insert(NAMESPACE + "insertIndividualcontent", ic);
	}
		
	
	//개인계정 세부 삭제
	public int deleteIndividualSubjectDetail(IndividualSubjectDetail isd) {
		logger.debug("uisubject deleteIndividualSubjectDetail");
		return sqlsessiontemplate.delete(NAMESPACE + "deleteIndividualSubjectDetail", isd);
	}
		
	
	//개인계정 세부 수정
	public int updateIndividualSubjectDetail(IndividualSubjectDetail isd) {
		logger.debug("uisubject updateIndividualSubjectDetail");
		return sqlsessiontemplate.update(NAMESPACE + "updateIndividualSubjectDetail",isd);
	}
	
	//개인계정 세부 수정을 위한 검색
	public IndividualSubjectDetail selectOneNuIndividualSubjectDetail(int individualSubjectDetailNumeral) {
		logger.debug("uisubject selectOneNuIndividualSubjectDetail");
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneNuIndividualSubjectDetail", individualSubjectDetailNumeral);
	}
		
	
	
	//개인계정 세부 검색(세부명별 검색)
	public IndividualSubjectDetail selectOneIndividualSubjectDetail(String individualSubjectDetailName){
		logger.debug("uisubject selectOneIndividualSubjectDetail");
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneIndividualSubjectDetail", individualSubjectDetailName);
	}

	//개인계정 세부 검색(모든검색)
	public List<IndividualSubjectDetail> selectAllIndividualSubjectDetail(){
		logger.debug("uisubject selectAllIndividualSubjectDetail");
		return sqlsessiontemplate.selectList(NAMESPACE +"selectAllIndividualSubjectDetail");
	}
	
	//개인계정 세부 등록
	public int insertIndividualSubjectDetail(IndividualSubjectDetail isd) {
		logger.debug("uisubject insertIndividualSubjectDetail");
		return sqlsessiontemplate.insert(NAMESPACE + "insertIndividualSubjectDetail",isd);
	}
	
	//개인 사용자 계정과목  삭제 
	public int deleteUserIndiSubject(UserIndividualSubject uis) {
		logger.debug("uisubject deleteUserIndiSubject");
		return sqlsessiontemplate.delete(NAMESPACE + "deleteUserIndiSubject", uis);
	}
		
	//개인 사용자 계정과목 수정
	public int updateUserIndiSubject(UserIndividualSubject uis) {
		logger.debug("uisubject updateUserIndiSubject");
		return sqlsessiontemplate.update(NAMESPACE + "updateUserIndiSubject", uis);
	}
	
	
	//개인 사용자 계정과목 수정을 위한 검색 
	public UserIndividualSubject selectOneUserIndiSubject(int userIndividualSubjectCode) {
		logger.debug("uisubject selectOneUserIndiSubject");
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneUserIndiSubject", userIndividualSubjectCode);
	}
	
	//개인 사용자 계정과목 검색 
	public List<IndividualSystemAndUSubject> selectUserIndiSubject(String memberEmail){
		logger.debug("uisubject selectUserIndiSubject");
		return sqlsessiontemplate.selectList(NAMESPACE + "selectUserIndiSubject", memberEmail);
	}
	
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

