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


import com.boa.cashfilm.service.SystemCompanyService;
import com.boa.cashfilm.syscom.dto.ComSystem;

@Controller
public class SystemCompanyController {
	
	@Autowired
	private SystemCompanyService systemcompanyService;
	private static final Logger logger=LoggerFactory.getLogger(SystemCompanyController.class);
	
	//회사 계정체계 삭제 
	@RequestMapping(value="/ComSystem/deleteComSystem",method=RequestMethod.GET)
	public String deleteComSystem (ComSystem csys) {
		logger.debug("{} : deleteComSystem SystemCompanyController",csys);
		systemcompanyService.deleteComSystem(csys);
		return "redirect:/";
	}

	//회사 계정체계 수정 action
	@RequestMapping(value="/ComSystem/updateComSystem",method=RequestMethod.POST)
	public String updateComSystem(ComSystem csys) {
		logger.debug("{} : updateComSystem SystemCompanyController",csys);
		systemcompanyService.updateComSystem(csys);
		return "redirect:/";
	}
	
	//회사 계정체계 수정 form
	@RequestMapping(value="/ComSystem/updateComSystem",method=RequestMethod.GET)
	public String selectOneComSystem(Model model, @RequestParam(value="comSystemNumeral",required=true)int comSystemNumeral){
		logger.debug("{} : selectOneComSystem SystemCompanyController",comSystemNumeral);
		ComSystem csys =systemcompanyService.selectOneComSystem(comSystemNumeral);
		model.addAttribute("csys", csys);
		return "system/updateComSystem";
	}
	
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
