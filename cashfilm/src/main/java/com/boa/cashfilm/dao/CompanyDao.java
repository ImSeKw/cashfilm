package com.boa.cashfilm.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;

@Repository
public class CompanyDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private static final Logger logger = LoggerFactory.getLogger(CompanyDao.class);
	//경로 설정 중복처리
	private final String NAMESPACE = "com.boa.cashfilm.mapper.CompanyMapper.";
	//개인회원이  회사소속으로 승인요청 
	public void comApprovalByIndividual(Map<String, Object> map) {
		sqlSessionTemplate.insert(NAMESPACE + "comApprovalByIndividual", map);
	}
	
	//개인회원이 승인된 전체 회사 조회
	public List<ComListByIndividual> comListByIndividual() {
		logger.debug("{} : <company comListByIndividual CompanyDao.java");		
		return sqlSessionTemplate.selectList(NAMESPACE + "comListByIndividual");
	}
	
	//insert 회사 기본정보 등록 
	public void insertCompanyBaseInfo(InsertCompanyBaseInfo insertCompanyBaseInfo) {
		logger.debug("{} : <company insertCompanyBaseInfo CompanyDao.java",insertCompanyBaseInfo);
		sqlSessionTemplate.insert(NAMESPACE + "insertCompanyBaseInfo",insertCompanyBaseInfo);
	}


}
