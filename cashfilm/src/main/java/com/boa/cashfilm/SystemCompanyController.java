package com.boa.cashfilm;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boa.cashfilm.company.dto.ComSystem;
import com.boa.cashfilm.service.SystemCompanyService;

@Controller
public class SystemCompanyController {
	
	@Autowired
	private SystemCompanyService systemcompanyService;
	private static final Logger logger=LoggerFactory.getLogger(SystemCompanyController.class);
	
	//회사 계정체계 검색 
	@RequestMapping(value="/ComSystem/selectComSystem",method=RequestMethod.GET)
	public String selectAllComSystem(Model model){
		logger.debug("{} : selectAllComSystem SystemCompanyController");
		List<ComSystem> csyslist =systemcompanyService.selectAllComSystem();
		model.addAttribute("csyslist", csyslist);
		return "system/selectComSystem";
	}
	
	//회사계정체계 등록 action
	@RequestMapping(value="/ComSystem/insertComSystem",method=RequestMethod.POST)
	public String addComSystem(ComSystem csys) {
		logger.debug("{} : addComSystem action SystemCompanyController",csys);
		systemcompanyService.insertComSystem(csys);
		return "redirect:/";
	}
	
	//회사계정체계 등록 form
	@RequestMapping(value="/ComSystem/insertComSystem", method=RequestMethod.GET)
	public String addComSystem() {
		logger.debug("{} : addComSystem form SystemCompanyController");
		return "system/insertComSystem";
	}
	
	
}
