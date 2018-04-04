package com.boa.cashfilm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.company.dto.ComSystem;
import com.boa.cashfilm.dao.StatementCompanyDao;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinance;

@Service
@Transactional
public class StatementCompanyService {
	@Autowired
	StatementCompanyDao statementCompanyDao;
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyService.class);
	
	// 회사 처음 입력 재무 등록 처리
	public void insertStatementCompanyFinance(List<StatementCompanyFinance> statementCompanyFinanceList) {
		logger.debug("{} : < statementCompanyFinanceList insertStatementCompanyFinance() StatementCompanyService", statementCompanyFinanceList);
		statementCompanyDao.insertStatementCompanyFinance(statementCompanyFinanceList);
	}
	
	// 회사 처음 입력 재무 등록 화면
	public List<ComSystem> selectStatementCompanySystem() {
		logger.debug("< selectStatementCompanySystem() StatementCompanyService");
		List<ComSystem> list = statementCompanyDao.selectStatementCompanySystem();
		for(ComSystem cs : list) {
			logger.debug("{} : > comSystemNumeral selectStatementCompanySystem() StatementCompanyService", cs.getComSystemNumeral());
			logger.debug("{} : > comSystemName selectStatementCompanySystem() StatementCompanyService", cs.getComSystemName());
		}
		return list;
	}
}