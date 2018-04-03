package com.boa.cashfilm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boa.cashfilm.service.StatementCompanyService;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinance;

@Controller
public class StatementCompanyController {
	@Autowired
	StatementCompanyService statementCompanyService;
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyController.class);
	
	// 회사 처음 입력 재무 등록 처리
	@RequestMapping(value = "/statement/financeRegistrationByCompany", method = RequestMethod.POST)
	public String insertStatementCompanyFinance(StatementCompanyFinance statementCompanyFinance) {
		logger.debug("{} : < closingStatementCode insertStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getClosingStatementCode());
		logger.debug("{} : < comCode insertStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getComCode());
		logger.debug("{} : < comSystemNumeral insertStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getComSystemNumeral());
		logger.debug("{} : < financeAmount insertStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getFinanceAmount());
		logger.debug("{} : < financeCode insertStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getFinanceCode());
		logger.debug("{} : < memberEmail insertStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getMemberEmail());
		statementCompanyService.insertStatementCompanyFinance(statementCompanyFinance);
		return "redirect:/";
	}
	
	// 회사 처음 입력 재무 등록 화면
	@RequestMapping(value = "/statement/financeRegistrationByCompany", method = RequestMethod.GET)
	public String insertStatementCompanyFinance() {
		return "statement/financeRegistrationByCompany";
	}
}