package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.company.dto.ComSystem;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinance;

@Repository
public class StatementCompanyDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private final String NAMESPACE = "com.boa.cashfilm.mapper.statementCompanyMapper.";
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyDao.class);
	
	// 회사 처음 입력 재무 등록 처리
	public void insertStatementCompanyFinance(List<StatementCompanyFinance> list) {
		logger.debug("{} : < list insertStatementCompanyFinance() StatementCompanyDao", list);
		for(StatementCompanyFinance scf : list) {
			sqlSessionTemplate.insert(NAMESPACE + "insertStatementCompanyFinance", scf);
		}
		
	}
	
	// 회사 처음 입력 재무 등록 화면
	public List<ComSystem> selectStatementCompanySystem() {
		logger.debug("< selectStatementCompanySystem() StatementCompanyDao");
		return sqlSessionTemplate.selectList(NAMESPACE + "selectStatementCompanySystem");
	}
}