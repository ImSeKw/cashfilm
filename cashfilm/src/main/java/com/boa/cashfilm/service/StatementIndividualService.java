package com.boa.cashfilm.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.StatementIndividualDao;
import com.boa.cashfilm.smtindi.dto.StatementIndiFinanceCode;
import com.boa.cashfilm.smtindi.dto.StatementIndividual;
import com.boa.cashfilm.smtindi.dto.StatementIndividualList;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;



@Service
@Transactional
public class StatementIndividualService {
	@Autowired
	private StatementIndividualDao statementindIvidualDao;
	private static final Logger logger = LoggerFactory.getLogger(StatementIndividualService.class);
	
	//개인 처음 입력 재무 삭제 
	public int deleteStatementIndiFinance(StatementIndividual si) {
		logger.debug("{} : deleteStatementIndiFinance StatementIndividualService",si);
		return statementindIvidualDao.deleteStatementIndiFinance(si);
	}
	
	//개인 처음 입력 재무 수정을 위한 검색 
	public StatementIndividualList selectStatementIndiFinanceOne(int financeCode) {
		logger.debug("{} : selectStatementIndiFinanceList StatementIndividualService",financeCode);
		return statementindIvidualDao.selectStatementIndiFinanceOne(financeCode);
	}
	
	//개인 처음 입력 재무 검색
	public List<StatementIndividualList> selectStatementIndiFinanceList(StatementIndiFinanceCode statementIndiFinanceCode) {
		logger.debug("{} : selectStatementIndiFinanceList StatementIndividualService",statementIndiFinanceCode);
		List<StatementIndividualList> silist = statementindIvidualDao.selectStatementIndiFinanceList(statementIndiFinanceCode);
		for(StatementIndividualList si : silist) {
			logger.debug("{} : selectStatementIndiFinanceList() StatementCompanyService", si.getMemberEmail());
			logger.debug("{} : selectStatementIndiFinanceList() StatementCompanyService", si.getClosingStatementCode());
			logger.debug("{} : selectStatementIndiFinanceList() StatementCompanyService", si.getIndividualSystemNumeral());
			logger.debug("{} : selectStatementIndiFinanceList() StatementCompanyService", si.getIndividualSystemName());
			logger.debug("{} : selectStatementIndiFinanceList() StatementCompanyService", si.getFinanceAmount());
			logger.debug("{} : selectStatementIndiFinanceList() StatementCompanyService", si.getFinanceCode());
		}
		return silist;
	}
	
	//개인 처음 입력 재무 등록 처리 -->
	public void insertStatementIndiFinance(List<Integer> individualSystemNumeralList
										,List<Integer> financeAmountList
										, String closingStatementCode
										, String memberEmail) {
		logger.debug("{} : insertStatementIndiFinance StatementIndividualService",closingStatementCode);
		logger.debug("{} : insertStatementIndiFinance StatementIndividualService",memberEmail);
		List<StatementIndividual> list = new ArrayList();
		StatementIndividual si =null;
		for(int i =0; i< individualSystemNumeralList.size();i++) {
			logger.debug("{} : insertStatementIndiFinance() StatementIndividualService", individualSystemNumeralList.get(i));
			logger.debug("{} : insertStatementIndiFinance() StatementIndividualService", financeAmountList.get(i));
			si=new StatementIndividual();
			si.setIndividualSystemNumeral(individualSystemNumeralList.get(i));
			si.setFinanceAmount(financeAmountList.get(i));
			si.setClosingStatementCode(closingStatementCode);
			si.setMemberEmail(memberEmail);
			list.add(si);
		}
		statementindIvidualDao.insertStatementIndiFinance(list);
	}

	//개인입력재무 등록화면
	public List<IndividualSystem> selectStatementIndiSystem(){
		logger.debug("{} : selectStatementIndiSystem StatementIndividualService");
		List<IndividualSystem> list =statementindIvidualDao.selectStatementIndiSystem();
		for(IndividualSystem isys : list) {
			logger.debug("{} : selectStatementIndiSystem StatementIndividualService", isys.getIndividualSystemNumeral());
			logger.debug("{} : selectStatementIndiSystem StatementIndividualService", isys.getIndividualSystemNumeral());
		}
		return list;
	}
}
