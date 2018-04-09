package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.syscom.dto.ComContent;
import com.boa.cashfilm.syscom.dto.ComContentAndSubUsub;
import com.boa.cashfilm.syscom.dto.ComSubject;
import com.boa.cashfilm.syscom.dto.ComSystem;
import com.boa.cashfilm.syscom.dto.ComSystemAndSubject;
import com.boa.cashfilm.syscom.dto.ComSystemAndUSubject;
import com.boa.cashfilm.syscom.dto.UserComSubject;



@Repository
public class SystemCompanyDao {
	
	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	private static final Logger logger = LoggerFactory.getLogger(SystemCompanyDao.class);
	private final String NAMESPACE ="com.boa.cashfilm.mapper.cashfilmMapper.";
	
	//회사 적요 삭제
	public int deleteComContent(ComContent cc) {
		logger.debug("{} : deleteComContent SystemCompanyDao",cc);
		return sqlsessiontemplate.delete(NAMESPACE + "deleteComContent", cc);
	}
	
	//회사 적요 수정
	public int updateComContent(ComContent cc) {
		logger.debug("{} : updateComContent SystemCompanyDao",cc);
		return sqlsessiontemplate.update(NAMESPACE + "updateComContent", cc);
	}
	
	//회사 적요 수정을 위한 검색
	public ComContent selectOneComContent(int comContentCode){
		logger.debug("{} : selectOneComContent SystemCompanyDao",comContentCode);
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneComContent", comContentCode);
	}
	
	//회사 적요 검색 
	public List<ComContentAndSubUsub> selectAllComContent(int comCode){
		logger.debug("{} : selectAllComContent SystemCompanyDao",comCode);
		return sqlsessiontemplate.selectList(NAMESPACE + "selectAllComContent", comCode);
	}
		
	//회사 적요관리 
	public int insertComContent(ComContent ccon) {
		logger.debug("{} : insertComContent SystemCompanyDao",ccon);
		return sqlsessiontemplate.insert(NAMESPACE + "insertComContent",ccon);
	}
	
	//회사 사용자 계정과목 삭제  -->
	public int deleteUComSubject(UserComSubject ucsub) {
		logger.debug("{} : deleteUComSubject SystemCompanyDao",ucsub);
		return sqlsessiontemplate.delete(NAMESPACE +"deleteUComSubject", ucsub);
	}
	
	//회사 사용자 계정과목 수정 
	public int updateUComSub(UserComSubject ucsub) {
		logger.debug("{} : updateUComSub SystemCompanyDao",ucsub);
		return sqlsessiontemplate.update(NAMESPACE + "updateUComSubject",ucsub);
	}
	
	//회사 사용자 계정과목 수정을 위한 검색  
	public UserComSubject selectOneUComSubject(int userComSubjectCode) {
		logger.debug("{} : selectOneUComSubject SystemCompanyDao",userComSubjectCode);
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneUComSubject", userComSubjectCode);
	}
	
	//회사 사용자 계정과목 검색 
	public List<ComSystemAndUSubject> selectUComSubject(int comCode) {
		logger.debug("{} : selectUComSubject SystemCompanyDao",comCode);
		return sqlsessiontemplate.selectList(NAMESPACE +"selectUComSubject", comCode);
	}
		
	//회사 사용자 계정과목 등록
	public int insertUComSubject(UserComSubject ucsub) {
		logger.debug("{} : insertUComSubject SystemCompanyDao",ucsub);
		return sqlsessiontemplate.insert(NAMESPACE + "insertUComSubject",ucsub);
	}
	
	//회사 계정과목 삭제 
	public int deleteComSubject(ComSubject csub) {
		logger.debug("{} : deleteComSubject SystemCompanyDao",csub);
		return sqlsessiontemplate.delete(NAMESPACE + "deleteComSubject",csub);
	}
	
	//회사 계정과목 수정 
	public int updateComSubject(ComSubject csub) {
		logger.debug("{} : updateComSubject SystemCompanyDao",csub);
		return sqlsessiontemplate.update(NAMESPACE + "updateComSubject", csub);
	}
	
	//회사 계정과목 수정을 위한 검색 
	public ComSubject selectOneComSubject(int comSubjectNumeral){
		logger.debug("{} : selectOneComSubject SystemCompanyDao",comSubjectNumeral);
		return sqlsessiontemplate.selectOne(NAMESPACE + "selectOneComSubject", comSubjectNumeral);
	}
		
	//회사 계정명별 검색
	public List<ComSubject> selectOneComSubjectofsub(String comSubjectName){
		logger.debug("{} : selectOneComSubjectofsys SystemCompanyDao",comSubjectName);
		return sqlsessiontemplate.selectList(NAMESPACE + "selectOneComSubjectofsub", comSubjectName);
	}
	
	//회사 계정체계별 검색 
	public List<ComSystemAndSubject> selectOneComSubjectofsys(int comSystemNumeral){
		logger.debug("{} : selectOneComSubjectofsys SystemCompanyDao",comSystemNumeral);
		return sqlsessiontemplate.selectList(NAMESPACE + "selectOneComSubjectofsys", comSystemNumeral);
	}
	
	//회사계정과목 검색 
	public List<ComSystemAndSubject> selectAllComSubject(){
		logger.debug("{} : selectAllComSubject SystemCompanyDao");
		return sqlsessiontemplate.selectList(NAMESPACE +"selectAllComSubject") ;
	}
		
	//회사 계정과목 등록 
	public int insertComSubject(ComSubject csub) {
		logger.debug("{} : insertComSubject SystemCompanyDao",csub);
		return sqlsessiontemplate.insert(NAMESPACE + "insertComSubject",csub);
	}
	
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
