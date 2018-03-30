package com.boa.cashfilm;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.boa.cashfilm.service.CashfilmService;

@Controller
public class CashfilmController {
	@Autowired
	CashfilmService cashfilmService;
	private static final Logger logger = LoggerFactory.getLogger(CashfilmController.class);
	
	// 관리자 페이지
	@RequestMapping(value = "/cashfilm/cashfilmControlTower", method = RequestMethod.GET)
	public String controlTower(@RequestParam(value = "memberClassificationCode", defaultValue = "0") int memberClassificationCode) {
		logger.debug("관리자 페이지");
		logger.debug("{} : memberClassificationCode controlTower() CashfilmController", memberClassificationCode);
		String view = null;
		// 회원구분 접근 식별
		if(memberClassificationCode == 1) {
			view = "cashfilm/cashfilmControlTower";
		} else {
			view = "redirect:/";
		}
		return view;
	}
	
	// 메인화면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.debug("메인화면");
		return "cashfilm";
	}
}