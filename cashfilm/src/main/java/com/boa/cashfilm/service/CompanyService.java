package com.boa.cashfilm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boa.cashfilm.company.dto.ComCustomer;
import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.Company;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;
import com.boa.cashfilm.dao.CompanyDao;

@Service
public class CompanyService {
	@Autowired
	CompanyDao companyDao;
	private static final Logger logger = LoggerFactory.getLogger(CompanyService.class);
	//회사별 거래처 조회
	public List<ComCustomer> comCustomerList(int comCode) {
		logger.debug("{} : <comCode comCustomerList CompanyService.java",comCode);
		return companyDao.comCustomerList(comCode);
	}
	
	//회사 거래처 등록 Action
	public void comCustomerRegistration(ComCustomer comCustomer) {
		//세팅
		comCustomer.setComCode(comCustomer.getComCode());
		comCustomer.setCustomerNumber(comCustomer.getCustomerNumber());
		comCustomer.setCustomerCeo(comCustomer.getCustomerCeo());
		comCustomer.setCustomerName(comCustomer.getCustomerName());
		comCustomer.setCustomerAddress(comCustomer.getCustomerAddress());
		comCustomer.setCustomerPhone(comCustomer.getCustomerPhone());
		comCustomer.setCustomerCreditNumber(comCustomer.getCustomerCreditNumber());
		comCustomer.setCustomerContactNumber(comCustomer.getCustomerContactNumber());
		comCustomer.setCustomerCategory(comCustomer.getCustomerCategory());
		comCustomer.setCustomerRemarks(comCustomer.getCustomerRemarks());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getComCode()", comCustomer.getComCode());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerNumber()", comCustomer.getCustomerNumber());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerCeo()", comCustomer.getCustomerCeo());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerName()", comCustomer.getCustomerName());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerAddress()", comCustomer.getCustomerAddress());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerPhone()", comCustomer.getCustomerPhone());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerCreditNumber()", comCustomer.getCustomerCreditNumber());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerContactNumber()", comCustomer.getCustomerContactNumber());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerCategory()", comCustomer.getCustomerCategory());
		logger.debug("{} : CountryService comCustomerRegistration comCustomer.getCustomerRemarks()", comCustomer.getCustomerRemarks());
		companyDao.comCustomerRegistration(comCustomer);
	}
	
	
	//자신의 회사 정보  권한 조회(회사정보수정,부서관리,직급관리는 회사별권한승인여부의 값으로 판단한다)
	public List<Object> selectComAuthorityApproval(String memberEmail, int comCode) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("memberEmail", memberEmail);
		map.put("comCode", comCode);
		List<Object> ComAuthorityApproval = companyDao.selectComAuthorityApproval(map);
		return ComAuthorityApproval;
	}
	//자신의 회사 정보 조회
	public List<Company> comInfo(int comCode){
		List<Company> returnList = companyDao.comInfo(comCode);
		logger.debug("{} : CountryService comInfo returnList", returnList);
		return returnList;
	}
	//cashfilm 관리자 권한으로 승인 전 회사 검색
	public List<Company> comListBeforeApproval(){
		return companyDao.comListBeforeApproval();
	}
	//개인회원이  회사소속으로 승인요청 
	public void comApprovalByIndividual(String memberEmail,Object comCode) {
		logger.debug("{} : CountryService comApprovalByIndividual comCode", comCode);
		logger.debug("{} : CountryService comApprovalByIndividual memberEmail", memberEmail);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("memberEmail", memberEmail);
		map.put("comCode", comCode);
		
		companyDao.comApprovalByIndividual(map);
	}
	//개인회원이 승인된 전체 회사 조회
	public List<ComListByIndividual> comListByIndividual() {
		return companyDao.comListByIndividual();
	}
	//insert 회사 기본정보 등록 
	public void insertCompanyBaseInfo(InsertCompanyBaseInfo insertCompanyBaseInfo) {
		logger.debug("{} : CountryService insertCompanyBaseInfo company.getComName()", insertCompanyBaseInfo.getComName());
		//화시 기본정보 셋팅 후 Id 받기
		insertCompanyBaseInfo.setComName(insertCompanyBaseInfo.getComName());
		insertCompanyBaseInfo.setComRegistrationNumber(insertCompanyBaseInfo.getComRegistrationNumber());
		insertCompanyBaseInfo.setComWebPage(insertCompanyBaseInfo.getComWebPage());
		insertCompanyBaseInfo.setComCeoName(insertCompanyBaseInfo.getComCeoName());
		insertCompanyBaseInfo.setComInfo(insertCompanyBaseInfo.getComInfo());
		insertCompanyBaseInfo.setComIntroduction(insertCompanyBaseInfo.getComIntroduction());
		insertCompanyBaseInfo.setComAddress(insertCompanyBaseInfo.getComAddress());
		insertCompanyBaseInfo.setComPhone(insertCompanyBaseInfo.getComPhone());
		insertCompanyBaseInfo.setMemberEmail(insertCompanyBaseInfo.getMemberEmail());
		insertCompanyBaseInfo.setComIndustry(insertCompanyBaseInfo.getComIndustry());		
		insertCompanyBaseInfo.setComCondition(insertCompanyBaseInfo.getComCondition());
		companyDao.insertCompanyBaseInfo(insertCompanyBaseInfo);
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComName()", insertCompanyBaseInfo.getComName());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComRegistrationNumber()", insertCompanyBaseInfo.getComRegistrationNumber());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComWebPage()", insertCompanyBaseInfo.getComWebPage());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComCeoName()", insertCompanyBaseInfo.getComCeoName());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComInfo()", insertCompanyBaseInfo.getComInfo());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComIntroduction()", insertCompanyBaseInfo.getComIntroduction());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComAddress()", insertCompanyBaseInfo.getComAddress());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComPhone()", insertCompanyBaseInfo.getComPhone());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getMemberEmail()", insertCompanyBaseInfo.getMemberEmail());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComIndustry()", insertCompanyBaseInfo.getComIndustry());
		logger.debug("{} : CountryService insertCompanyBaseInfo insertCompanyBaseInfo.getComCondition()", insertCompanyBaseInfo.getComCondition());

	}



	
}
