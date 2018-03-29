package com.boa.cashfilm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;
import com.boa.cashfilm.dao.CompanyDao;

@Service
public class CompanyService {
	@Autowired
	CompanyDao companyDao;
	private static final Logger logger = LoggerFactory.getLogger(CompanyService.class);
	//개인회원이  회사소속으로 승인요청 
	public void comApprovalByIndividual(String memberEmail,Object comCode) {
		logger.debug("{} : CountryService comApprovalByIndividual comCode", comCode);
		logger.debug("{} : CountryService comApprovalByIndividual memberEmail", memberEmail);
		Map<String,Object> map = new HashMap();
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
