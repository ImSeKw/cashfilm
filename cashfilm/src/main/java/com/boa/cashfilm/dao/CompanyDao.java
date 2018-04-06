package com.boa.cashfilm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.company.dto.ComAuthority;
import com.boa.cashfilm.company.dto.ComCustomer;
import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.ComPositionListAndMember;
import com.boa.cashfilm.company.dto.ComSection;
import com.boa.cashfilm.company.dto.ComSectionListAndMember;
import com.boa.cashfilm.company.dto.Company;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;

@Repository
public class CompanyDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private static final Logger logger = LoggerFactory.getLogger(CompanyDao.class);
	//경로 설정 중복처리
	private final String NAMESPACE = "com.boa.cashfilm.mapper.CompanyMapper.";
	
	
	//회사 부서 수정
	public void comSectionModification(ComSection comSection) {
		sqlSessionTemplate.update(NAMESPACE + "comSectionModification", comSection);
	}
	//회사 부서 조회
	public List<ComSection> comSectionList(Map<String,Object> map){
		logger.debug("{} : <map comSectionList CompanyDao.java",map);
		return sqlSessionTemplate.selectList(NAMESPACE + "comSectionList", map);
	}
	
	//회사 부서 등록
	public void comSectionRegistration(ComSection comSection) {
		logger.debug("{} : <comSection comSectionRegistration CompanyDao.java",comSection);
		sqlSessionTemplate.insert(NAMESPACE + "comSectionRegistration", comSection);
	}
	//회사 부서 조회(기업회원 부서 등록을 위한 조회)
	public List<ComSectionListAndMember> comSectionListRegistration(Map<String,Object> map){
		logger.debug("{} : <map comSectionList CompanyDao.java",map);
		return sqlSessionTemplate.selectList(NAMESPACE + "comSectionList", map);
	}
	//기업회원 직급 등록을 위한 조회
	public List<ComPositionListAndMember> comPositionListBeforeApproval(Map<String,Object> map){
		logger.debug("{} : <map comPositionListBeforeApproval CompanyDao.java",map);
		return sqlSessionTemplate.selectList(NAMESPACE + "comPositionListBeforeApproval", map);
	}
	//기업회원 부서 등록을 위한 조회
	public List<ComSectionListAndMember> comSectionListBeforeApproval(Map<String,Object> map){
		logger.debug("{} : <map comSectionListBeforeApproval CompanyDao.java",map);
		return sqlSessionTemplate.selectList(NAMESPACE + "comSectionListBeforeApproval", map);
	}
	//회사체계변경 권한을 가진 회원이 회사권한승인  2(회사별권한여부 테이블에 회사별권한여부 0->1,회사별권한승인일,회사별승인이메일 update )
	public void comAuthorityApprovalByAuthority(Map<String,Object> map) {
		logger.debug("{} : <map comAuthorityApprovalByAuthority CompanyDao.java",map);
		sqlSessionTemplate.update(NAMESPACE + "comAuthorityApprovalByAuthority", map);
	}
	
	//회사체계변경 권한을 가진 회원이 회사권한승인  1(memberEmail테이블에 회원구분코드 기업회원으로 변경,회사코드 생성)
	public void comAuthorityApprovalByMember(Map<String,Object> map) {
		logger.debug("{} : <map comAuthorityApprovalByMember CompanyDao.java",map);
		sqlSessionTemplate.update(NAMESPACE + "comAuthorityApprovalByMember", map);
	}
	//개인회원이 회사승인 요청 후 회사체계변경가능자가 승인요청 조회
	public List<ComAuthority> comAuthorityApprovalList(Map<String,Object> map){
		logger.debug("{} : <map comAuthorityApprovalList CompanyDao.java",map);
		return sqlSessionTemplate.selectList(NAMESPACE + "comAuthorityApprovalList", map);
	}
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
	public int selectComAuthorityApproval(Map<String,Object> map) {
		logger.debug("{} : <map selectComAuthorityApproval CompanyDao.java",map);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectComAuthorityApproval", map);
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
