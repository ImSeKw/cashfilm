package com.boa.cashfilm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.company.dto.ComCustomer;
import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.Company;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;

@Repository
public class CompanyDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private static final Logger logger = LoggerFactory.getLogger(CompanyDao.class);
	//경로 설정 중복처리
	private final String NAMESPACE = "com.boa.cashfilm.mapper.CompanyMapper.";
	
	//회사별 거래처 조회
	public List<ComCustomer> comCustomerList(int comCode) {
		logger.debug("{} : <comCode comCustomerList CompanyDao.java",comCode);
		return sqlSessionTemplate.selectList(NAMESPACE + "comCustomerList", comCode);
	}
	
	//회사별 거래처 등록  Action
	public void comCustomerRegistration(ComCustomer comCustomer) {
		logger.debug("{} : <comCustomer comCustomerRegistration CompanyDao.java",comCustomer);
		sqlSessionTemplate.insert(NAMESPACE + "comCustomerRegistration",comCustomer);
	}
	//자신의 회사 정보  권한 조회(회사정보수정,부서관리,직급관리는 회사별권한승인여부의 값으로 판단한다)
	public List<Object> selectComAuthorityApproval(Map<String,Object> map) {
		logger.debug("{} : <map selectComAuthorityApproval CompanyDao.java",map);
		return sqlSessionTemplate.selectList(NAMESPACE + "selectComAuthorityApproval", map);
	}
	//자신의 회사 정보 조회
	public List<Company> comInfo(int comCode){
		logger.debug("company comInfo CompanyDao.java");	
		return sqlSessionTemplate.selectList(NAMESPACE + "comInfo", comCode);
	}
	//cashfilm 관리자 권한으로 승인 전 회사 검색
	public List<Company> comListBeforeApproval(){
		logger.debug("company comListBeforeApproval CompanyDao.java");		
		return sqlSessionTemplate.selectList(NAMESPACE + "comListBeforeApproval");
	}
	//개인회원이  회사소속으로 승인요청 
	public void comApprovalByIndividual(Map<String, Object> map) {
		sqlSessionTemplate.insert(NAMESPACE + "comApprovalByIndividual", map);
	}
	//개인회원이 승인된 전체 회사 조회
	public List<ComListByIndividual> comListByIndividual() {
		logger.debug("company comListByIndividual CompanyDao.java");		
		return sqlSessionTemplate.selectList(NAMESPACE + "comListByIndividual");
	}
	//insert 회사 기본정보 등록 
	public void insertCompanyBaseInfo(InsertCompanyBaseInfo insertCompanyBaseInfo) {
		logger.debug("{} : <company insertCompanyBaseInfo CompanyDao.java",insertCompanyBaseInfo);
		sqlSessionTemplate.insert(NAMESPACE + "insertCompanyBaseInfo",insertCompanyBaseInfo);
	}

}
