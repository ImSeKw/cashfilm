package com.boa.cashfilm;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boa.cashfilm.service.CashfilmService;

@Controller
public class CashfilmController {
	@Autowired
	CashfilmService cashfilmService;
	private static final Logger logger = LoggerFactory.getLogger(CashfilmController.class);
	
	// 메인화면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.debug("main 화면");
		return "cashfilm";
	}
}