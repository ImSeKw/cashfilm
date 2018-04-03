package com.boa.cashfilm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.StatementCompanyDao;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinance;

@Service
@Transactional
public class StatementCompanyService {
	@Autowired
	StatementCompanyDao statementCompanyDao;
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyService.class);
	
	// 회사 처음 입력 재무 등록 처리
	public void insertStatementCompanyFinance(StatementCompanyFinance statementCompanyFinance) {
		logger.debug("{} : < statementCompanyFinance insertStatementCompanyFinance() StatementCompanyService", statementCompanyFinance);
		statementCompanyDao.insertStatementCompanyFinance(statementCompanyFinance);
	}
}
