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

import com.boa.cashfilm.service.StatementIndividualService;
import com.boa.cashfilm.smtindi.dto.StatementIndividual;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;

@Controller
public class StatementIndividualController {
	@Autowired
	private StatementIndividualService statementIndividualService;
	private static final Logger logger=LoggerFactory.getLogger(StatementIndividualController.class);
	
	//개인 처음 입력 재무 등록 처리 -->
	@RequestMapping(value="/statement/financeRegistrationByIndi",method = RequestMethod.POST)
	public String insertStatementIndiFinance(@RequestParam(value="individualSystemNumeral") List<Integer> individualSystemNumeralList
											,@RequestParam(value="financeAmount") List<Integer> financeAmountList
											,@RequestParam(value="closingStatementCode") String closingStatementCode
											,@RequestParam(value="memberEmail") String memberEmail) {
		for(int individualSystemNumeral : individualSystemNumeralList) {
			logger.debug("{} : insertStatementIndiFinance StatementIndividualController",individualSystemNumeral);
		}for(int financeAmount : financeAmountList) {
			logger.debug("{} : insertStatementIndiFinance StatementIndividualController",financeAmount);
		}
		logger.debug("{} : insertStatementIndiFinance StatementIndividualController",closingStatementCode);
		logger.debug("{} : insertStatementIndiFinance StatementIndividualController",memberEmail);
		statementIndividualService.insertStatementIndiFinance(individualSystemNumeralList,financeAmountList,closingStatementCode,memberEmail);
		return "redirect:/";
	}
	
	//개인입력재무 등록 form
	@RequestMapping(value="/statement/financeRegistrationByIndi",method = RequestMethod.GET)
	public String selectStatementIndiSystem(Model model){
		logger.debug("{} : selectStatementIndiSystem StatementIndividualController");
		List<IndividualSystem> isyslist=statementIndividualService.selectStatementIndiSystem();
		model.addAttribute("isyslist", isyslist);
		return "statement/financeRegistrationByIndividual";
	}
}
