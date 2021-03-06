package com.boa.cashfilm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.company.dto.ComSystem;
import com.boa.cashfilm.dao.StatementCompanyDao;
import com.boa.cashfilm.smtcom.dto.StatementCompanyCustomer;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinance;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinanceCode;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinanceList;
import com.boa.cashfilm.smtcom.dto.StatementCompanyStatementClassification;

@Service
@Transactional
public class StatementCompanyService {
	@Autowired
	StatementCompanyDao statementCompanyDao;
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyService.class);
	
	// 회사 전표 및 거래 등록 : 화면
	public Map selectStatementCompanyStatementAndTradeRegistration(int comCode) {
		logger.debug("{} : < comCode selectStatementCompanyStatementAndTradeRegistration()", comCode);
		Map map = new HashMap();
		List<StatementCompanyStatementClassification> SCSCList = statementCompanyDao.selectStatementCompanyStatementClassification();
		for(StatementCompanyStatementClassification scsc : SCSCList) {
			logger.debug("{} : > statementClassificationCode selectStatementCompanyStatementAndTradeRegistration()", scsc.getStatementClassificationCode());
			logger.debug("{} : > statementClassificationName selectStatementCompanyStatementAndTradeRegistration()", scsc.getStatementClassificationName());
		}
		List<StatementCompanyCustomer> SCCList = statementCompanyDao.selectStatementCompanyCustomer(comCode);
		for(StatementCompanyCustomer scc : SCCList) {
			logger.debug("{} : > customerCode selectStatementCompanyStatementAndTradeRegistration()", scc.getCustomerCode());
			logger.debug("{} : > comCode selectStatementCompanyStatementAndTradeRegistration()", scc.getComCode());
			logger.debug("{} : > customerName selectStatementCompanyStatementAndTradeRegistration()", scc.getCustomerName());
			logger.debug("{} : > customerPhone selectStatementCompanyStatementAndTradeRegistration()", scc.getCustomerPhone());
		}
		map.put("SCSCList", SCSCList);
		map.put("SCCList", SCCList);
		return map;
	}
	
	// 회사 처음 입력 재무 삭제 처리
	public void deleteStatementCompanyFinance(int financeCode) {
		logger.debug("{} : < statementCompanyFinanceCode deleteStatementCompanyFinance() StatementCompanyService", financeCode);
		statementCompanyDao.deleteStatementCompanyFinance(financeCode);
	}
	
	// 회사 처음 입력 재무 수정 처리
	public void updateStatementCompanyFinance(StatementCompanyFinance statementCompanyFinance) {
		logger.debug("{} : < statementCompanyFinance updateStatementCompanyFinance() StatementCompanyService", statementCompanyFinance);
		statementCompanyDao.updateStatementCompanyFinance(statementCompanyFinance);
	}
	
	// 회사 처음 입력 재무 조회
	public List<StatementCompanyFinanceList> selectStatementCompanyFinanceList(StatementCompanyFinanceCode statementCompanyFinanceCode) {
		logger.debug("{} : < comCode selectStatementCompanyFinanceList() StatementCompanyService", statementCompanyFinanceCode.getComCode());
		logger.debug("{} : < financeCode selectStatementCompanyFinanceList() StatementCompanyService", statementCompanyFinanceCode.getFinanceCode());
		logger.debug("{} : < closingStatementCode selectStatementCompanyFinanceList() StatementCompanyService", statementCompanyFinanceCode.getClosingStatementCode());
		List<StatementCompanyFinanceList> list = statementCompanyDao.selectStatementCompanyFinanceList(statementCompanyFinanceCode);
		for(StatementCompanyFinanceList scfl : list) {
			logger.debug("{} : > closingStatementCode selectStatementCompanyFinanceList() StatementCompanyService", scfl.getClosingStatementCode());
			logger.debug("{} : > comCode selectStatementCompanyFinanceList() StatementCompanyService", scfl.getComCode());
			logger.debug("{} : > comSystemName selectStatementCompanyFinanceList() StatementCompanyService", scfl.getComSystemName());
			logger.debug("{} : > comSystemNumeral selectStatementCompanyFinanceList() StatementCompanyService", scfl.getComSystemNumeral());
			logger.debug("{} : > financeAmount selectStatementCompanyFinanceList() StatementCompanyService", scfl.getFinanceAmount());
			logger.debug("{} : > financeCode selectStatementCompanyFinanceList() StatementCompanyService", scfl.getFinanceCode());
			logger.debug("{} : > memberEmail selectStatementCompanyFinanceList() StatementCompanyService", scfl.getMemberEmail());
		}
		return list;
	}
	
	// 회사 처음 입력 재무 등록 처리
	public void insertStatementCompanyFinance(List<Integer> comSystemNumeralList
											, List<Integer> financeAmountList
											, String closingStatementCode
											, String memberEmail
											, int comCode) {
		logger.debug("{} : < closingStatementCode insertStatementCompanyFinance() StatementCompanyService", closingStatementCode);
		logger.debug("{} : < memberEmail insertStatementCompanyFinance() StatementCompanyService", memberEmail);
		logger.debug("{} : < comCode insertStatementCompanyFinance() StatementCompanyService", comCode);
		List<StatementCompanyFinance> list = new ArrayList();
		StatementCompanyFinance statementCompanyFinance = null;
		for(int i = 0; i < comSystemNumeralList.size(); i++) {
			logger.debug("{} : < comSystemNumeral insertStatementCompanyFinance() StatementCompanyService", comSystemNumeralList.get(i));
			logger.debug("{} : < financeAmount insertStatementCompanyFinance() StatementCompanyService", financeAmountList.get(i));
			statementCompanyFinance = new StatementCompanyFinance();
			statementCompanyFinance.setComSystemNumeral(comSystemNumeralList.get(i));
			statementCompanyFinance.setFinanceAmount(financeAmountList.get(i));
			statementCompanyFinance.setClosingStatementCode(closingStatementCode);
			statementCompanyFinance.setMemberEmail(memberEmail);
			statementCompanyFinance.setComCode(comCode);
			list.add(statementCompanyFinance);
		}
		statementCompanyDao.insertStatementCompanyFinance(list);
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