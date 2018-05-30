package com.boa.cashfilm.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.company.dto.ComSystem;
import com.boa.cashfilm.smtcom.dto.StatementCompanyCustomer;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinance;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinanceCode;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinanceList;
import com.boa.cashfilm.smtcom.dto.StatementCompanyStatementClassification;
import com.boa.cashfilm.smtcom.dto.StatementCompanyTradeClassification;

@Repository
public class StatementCompanyDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private final String NAMESPACE = "com.boa.cashfilm.mapper.statementCompanyMapper.";
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyDao.class);
	
	
	// 회사 전표 및 거래 등록 : 화면 - 거래구분
	public List<StatementCompanyTradeClassification> selectStatementCompanyTradeClassification() {
		return sqlSessionTemplate.selectList(NAMESPACE + "selectStatementCompanyTradeClassification");
	}
	
	// 회사 전표 및 거래 등록 : 화면 - 모든거래처
	public List<StatementCompanyCustomer> selectStatementCompanyCustomer(int comCode) {
		logger.debug("{} : < comCode selectStatementCompanyCustomer()", comCode);
		return sqlSessionTemplate.selectList(NAMESPACE + "selectStatementCompanyCustomer", comCode);
	}
	
	// 회사 전표 및 거래 등록 : 화면 - 전표분류
	public List<StatementCompanyStatementClassification> selectStatementCompanyStatementClassification() {
		logger.debug("< selectStatementCompanyStatementClassification()");
		return sqlSessionTemplate.selectList(NAMESPACE + "selectStatementCompanyStatementClassification");
	}
	
	// 회사 처음 입력 재무 삭제 처리
	public void deleteStatementCompanyFinance(int financeCode) {
		logger.debug("{} : < statementCompanyFinanceCode deleteStatementCompanyFinance() StatementCompanyDao", financeCode);
		sqlSessionTemplate.delete(NAMESPACE + "deleteStatementCompanyFinance", financeCode);
	}
	
	// 회사 처음 입력 재무 수정 처리
	public void updateStatementCompanyFinance(StatementCompanyFinance statementCompanyFinance) {
		logger.debug("{} : < statementCompanyFinance updateStatementCompanyFinance() StatementCompanyDao", statementCompanyFinance);
		sqlSessionTemplate.update(NAMESPACE + "updateStatementCompanyFinance", statementCompanyFinance);
	}
	
	// 회사 처음 입력 재무 조회
	public List<StatementCompanyFinanceList> selectStatementCompanyFinanceList(StatementCompanyFinanceCode statementCompanyFinanceCode) {
		logger.debug("{} : < statementCompanyFinanceCode selectStatementCompanyFinanceList() StatementCompanyDao", statementCompanyFinanceCode);
		return sqlSessionTemplate.selectList(NAMESPACE + "selectStatementCompanyFinanceList", statementCompanyFinanceCode);
	}
	
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