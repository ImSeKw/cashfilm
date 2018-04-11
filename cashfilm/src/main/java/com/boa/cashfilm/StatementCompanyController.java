package com.boa.cashfilm;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boa.cashfilm.company.dto.ComSystem;
import com.boa.cashfilm.service.StatementCompanyService;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinance;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinanceCode;
import com.boa.cashfilm.smtcom.dto.StatementCompanyFinanceList;

@Controller
public class StatementCompanyController {
	@Autowired
	StatementCompanyService statementCompanyService;
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyController.class);
	
	// 회사 처음 입력 재무 수정 : 처리
	@RequestMapping(value = "/statement/financeModificationByCompanyAjax", method = RequestMethod.POST)
	public @ResponseBody List<StatementCompanyFinanceList> updateStatementCompanyFinance(StatementCompanyFinance statementCompanyFinance) {
		logger.debug("{} : < closingStatementCode updateStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getClosingStatementCode());
		logger.debug("{} : < comCode updateStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getComCode());
		logger.debug("{} : < comSystemNumeral updateStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getComSystemNumeral());
		logger.debug("{} : < financeAmount updateStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getFinanceAmount());
		logger.debug("{} : < financeCode updateStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getFinanceCode());
		logger.debug("{} : < memberEmail updateStatementCompanyFinance() StatementCompanyController", statementCompanyFinance.getMemberEmail());
		List<StatementCompanyFinanceList> list = statementCompanyService.updateStatementCompanyFinance(statementCompanyFinance);
		return list;
	}
	
	// 회사 처음 입력 재무 수정 : 계정 체계 목록
	@RequestMapping(value = "/statement/financeComSystemAjax", method = RequestMethod.POST)
	public @ResponseBody List<ComSystem> selectStatementCompanySystem() {
		logger.debug("{} : < 계정 체계 목록 ajax selectStatementCompanySystem()");
		List<ComSystem> list = statementCompanyService.selectStatementCompanySystem();
		return list;
	}
	
	// 회사 처음 입력 재무 수정 : 화면
	@RequestMapping(value = "/statement/financeListByCompanyAjax", method = RequestMethod.POST)
	public @ResponseBody List<StatementCompanyFinanceList> selectStatementCompanyFinanceList(StatementCompanyFinanceCode statementCompanyFinanceCode) {
		logger.debug("{} : < financeCode selectStatementCompanyFinanceList() StatementCompanyController", statementCompanyFinanceCode.getFinanceCode());
		logger.debug("{} : < comCode selectStatementCompanyFinanceList() StatementCompanyController", statementCompanyFinanceCode.getComCode());
		List<StatementCompanyFinanceList> list = statementCompanyService.selectStatementCompanyFinanceList(statementCompanyFinanceCode);
		return list;
	}
	
	// 회사 처음 입력 재무 조회
	@RequestMapping(value = "/statement/financeListByCompany", method = RequestMethod.GET)
	public String selectStatementCompanyFinanceList(Model model, StatementCompanyFinanceCode statementCompanyFinanceCode) {
		logger.debug("{} : < comCode selectStatementCompanyFinanceList() StatementCompanyController", statementCompanyFinanceCode.getComCode());
		logger.debug("{} : < closingStatementCode selectStatementCompanyFinanceList() StatementCompanyController", statementCompanyFinanceCode.getClosingStatementCode());
		List<StatementCompanyFinanceList> list = statementCompanyService.selectStatementCompanyFinanceList(statementCompanyFinanceCode);
		model.addAttribute("FinanceListByCompany", list);
		return "statement/financeListByCompany";
	}
	
	// 회사 처음 입력 재무 등록 처리
	@RequestMapping(value = "/statement/financeRegistrationByCompany", method = RequestMethod.POST)
	public String insertStatementCompanyFinance(@RequestParam("comSystemNumeral") List<Integer> comSystemNumeralList
												, @RequestParam("financeAmount") List<Integer> financeAmountList
												, @RequestParam("closingStatementCode") String closingStatementCode
												, @RequestParam("memberEmail") String memberEmail
												, @RequestParam("comCode") int comCode) {
		for(int comSystemNumeral : comSystemNumeralList) {
			logger.debug("{} : < comSystemNumeral insertStatementCompanyFinance() StatementCompanyController", comSystemNumeral);
		}
		for(int financeAmount : financeAmountList) {
			logger.debug("{} : < financeAmount insertStatementCompanyFinance() StatementCompanyController", financeAmount);
		}
		logger.debug("{} : < closingStatementCode insertStatementCompanyFinance() StatementCompanyController", closingStatementCode);
		logger.debug("{} : < memberEmail insertStatementCompanyFinance() StatementCompanyController", memberEmail);
		logger.debug("{} : < comCode insertStatementCompanyFinance() StatementCompanyController", comCode);
		statementCompanyService.insertStatementCompanyFinance(comSystemNumeralList, financeAmountList, closingStatementCode, memberEmail, comCode);
		return "redirect:/";
	}
	
	// 회사 처음 입력 재무 등록 화면
	@RequestMapping(value = "/statement/financeRegistrationByCompany", method = RequestMethod.GET)
	public String selectStatementCompanySystem(Model model) {
		logger.debug("< insertStatementCompanyFinance() StatementCompanyController");
		List<ComSystem> list = statementCompanyService.selectStatementCompanySystem();
		model.addAttribute("comSystemList", list);
		return "statement/financeRegistrationByCompany";
	}
}