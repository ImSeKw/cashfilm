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

import com.boa.cashfilm.company.dto.ComSystem;
import com.boa.cashfilm.service.StatementCompanyService;

@Controller
public class StatementCompanyController {
	@Autowired
	StatementCompanyService statementCompanyService;
	private static final Logger logger = LoggerFactory.getLogger(StatementCompanyController.class);
	
	// 회사 처음 입력 재무 등록 처리
	@RequestMapping(value = "/statement/financeRegistrationByCompany", method = RequestMethod.POST)
	public String insertStatementCompanyFinance(@RequestParam("comSystemNumeral") List<Integer> comSystemNumeralList
												, @RequestParam("financeAmount") List<Integer> financeAmountList
												, @RequestParam("closingStatementCode") List<String> closingStatementCodeList
												, @RequestParam("memberEmail") String memberEmail
												, @RequestParam("comCode") int comCode) {
		for(int comSystemNumeral : comSystemNumeralList) {
			logger.debug("{} : < comSystemNumeral insertStatementCompanyFinance() StatementCompanyController", comSystemNumeral);
		}
		for(int financeAmount : financeAmountList) {
			logger.debug("{} : < financeAmount insertStatementCompanyFinance() StatementCompanyController", financeAmount);
		}
		for(String closingStatementCode : closingStatementCodeList) {
			logger.debug("{} : < closingStatementCode insertStatementCompanyFinance() StatementCompanyController", closingStatementCode);
		}
		logger.debug("{} : < memberEmail insertStatementCompanyFinance() StatementCompanyController", memberEmail);
		logger.debug("{} : < comCode insertStatementCompanyFinance() StatementCompanyController", comCode);
//		statementCompanyService.insertStatementCompanyFinance(statementCompanyFinanceList);
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