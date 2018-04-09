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
import com.boa.cashfilm.syscom.dto.ComContent;
import com.boa.cashfilm.syscom.dto.ComSubject;
import com.boa.cashfilm.syscom.dto.ComSystem;
import com.boa.cashfilm.syscom.dto.ComSystemAndSubject;
import com.boa.cashfilm.syscom.dto.ComSystemAndUSubject;
import com.boa.cashfilm.syscom.dto.UserComSubject;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@Controller
public class SystemCompanyController {
	
	@Autowired
	private SystemCompanyService systemcompanyService;
	private static final Logger logger=LoggerFactory.getLogger(SystemCompanyController.class);
	
	//회사 적요등록 action 
	@RequestMapping(value="/ComSystem/insertComContent",method=RequestMethod.POST)
	public String insertComContent(ComContent ccon) {
		logger.debug("{} : insertComContent action SystemCompanyController",ccon);
		systemcompanyService.insertComContent(ccon);
		return "redirect:/";
	}
	
	//회사 적요등록 form
	@RequestMapping(value="/ComSystem/insertComContent",method=RequestMethod.GET)
	public String insertComContent(Model model,@RequestParam(value="comCode")int comCode) {
		logger.debug("{} : insertComContent SystemCompanyController");
		List<ComSystemAndSubject> csyssublist =systemcompanyService.selectAllComSubject();
		model.addAttribute("csyssublist", csyssublist);
		List<ComSystemAndUSubject> csysusublist = systemcompanyService.selectUComSubject(comCode);
		model.addAttribute("csysusublist", csysusublist);
		return "system/insertComContent";
	}
		
	//회사 사용자 계정과목 삭제 
	@RequestMapping(value="/ComSystem/deleteUComSubject",method=RequestMethod.GET)
	public String deleteUComSubject(UserComSubject ucsub) {
		logger.debug("{} : deleteUComSubject SystemCompanyController",ucsub);
		systemcompanyService.deleteUComSubject(ucsub);
		return "redirect:/";
	}
	
	//회사 사용자 계정과목 수정 
	@RequestMapping(value="/ComSystem/updateUComSubject",method=RequestMethod.POST)
	public String updateUComSub(UserComSubject ucsub) {
		logger.debug("{} : updateUComSub SystemCompanyController",ucsub);
		systemcompanyService.updateUComSub(ucsub);
		return "redirect:/";
	}
	
	//회사 사용자 계정과목 수정form
	@RequestMapping(value="/ComSystem/updateUComSubject",method=RequestMethod.GET)
	public String selectOneUComSubject(Model model,@RequestParam(value="userComSubjectCode")int userComSubjectCode) {
		logger.debug("{} : selectOneUComSubject SystemCompanyController",userComSubjectCode);
		UserComSubject ucsub = systemcompanyService.selectOneUComSubject(userComSubjectCode);
		model.addAttribute("ucsub", ucsub);
		return "system/updateUComSubject";
	}
	
	//회사 사용자 계정과목 검색 
	@RequestMapping(value="/ComSystem/selectUComSubject",method=RequestMethod.GET)
	public String selectUComSubject(Model model,@RequestParam(value="comCode")int comCode) {
		logger.debug("{} : insertUComSubject SystemCompanyController",comCode);
		List<ComSystemAndUSubject> csysusublist = systemcompanyService.selectUComSubject(comCode);
		model.addAttribute("csysusublist", csysusublist);
		return "system/selectUComSubject";
	}
	
	//회사 사용자 계정과목 등록 action
	@RequestMapping(value="/ComSystem/insertUComSubject",method=RequestMethod.POST)
	public String insertUComSubject(UserComSubject ucsub) {
		logger.debug("{} : insertUComSubject SystemCompanyController",ucsub);
	systemcompanyService.insertUComSubject(ucsub);
		return "redirect:/";
	}
	
	//회사 사용자 계정과목 등록 form
	@RequestMapping(value="/ComSystem/insertUComSubject",method=RequestMethod.GET)
	public String insertUComSubject(Model model) {
		logger.debug("{} : insertUComSubject SystemCompanyController");
		List<ComSystem> csyslist =systemcompanyService.selectAllComSystem();
		model.addAttribute("csyslist", csyslist);
		return "system/insertUComSubject";
	}
	
	//회사 계정과목 삭제 
	@RequestMapping(value="/ComSystem/deleteComSubject",method=RequestMethod.GET)
	public String deleteComSubject(ComSubject csub) {
		logger.debug("{} : deleteComSubject SystemCompanyController",csub);
		systemcompanyService.deleteComSubject(csub);
		return "redirect:/";
	}
	
	//회사 계정과목 수정 action
	@RequestMapping(value="/ComSystem/updateComSubject",method=RequestMethod.POST)
	public String updateComSubject(ComSubject csub) {
		logger.debug("{} : updateComSubject action SystemCompanyController",csub);
		systemcompanyService.updateComSubject(csub);
		return "redirect:/";
	}
	
	//회사 계정과목 수정을 form 
	@RequestMapping(value="/ComSystem/updateComSubject",method=RequestMethod.GET)
	public String selectOneComSubject(Model model, @RequestParam(value="comSubjectNumeral",required=true)int comSubjectNumeral){
		logger.debug("{} : selectOneComSubject form SystemCompanyController",comSubjectNumeral);
		ComSubject csub=systemcompanyService.selectOneComSubject(comSubjectNumeral);
		model.addAttribute("csub", csub);
		return "system/updateComSubject";
	}
	
	//회사계정과목 과목키워드 검색
	@RequestMapping(value="/ComSystem/selectComSubjectKeyword",method=RequestMethod.GET)
	public String selectOneComSubjectofsub(Model model,@RequestParam(value="comSubjectName",required=true)String comSubjectName) {
		logger.debug("{} : selectOneComSubjectofsub SystemCompanyController",comSubjectName);
		List<ComSubject> csublist =systemcompanyService.selectOneComSubjectofsub(comSubjectName);
		model.addAttribute("csublist", csublist);
		return "system/selectComSubjectKeyword";
	}
	
	//회사계정과목 검색 (전체,체계별)
	@RequestMapping(value="/ComSystem/selectComSubject",method=RequestMethod.GET)
	public String selectAllComSubject(Model model,@RequestParam(value="comSystemNumeral",required=true)int comSystemNumeral){
		logger.debug("{} : selectAllComSubject SystemCompanyController", comSystemNumeral);
		if(comSystemNumeral == 0) {
			List<ComSystemAndSubject> csyssublist =systemcompanyService.selectAllComSubject();
			model.addAttribute("csyssublist", csyssublist);
		} else if(comSystemNumeral != 0) {
			List<ComSystemAndSubject> csyssublist1 =systemcompanyService.selectOneComSubjectofsys(comSystemNumeral);
			model.addAttribute("csyssublist", csyssublist1);
		}
		return "system/selectComSubject";
	}
	
	//회사 계정과목 등록 action 
	@RequestMapping(value="/ComSystem/insertComSubject",method=RequestMethod.POST)
	public String addComSubject(ComSubject csub) {
		logger.debug("{} : addComSubject action SystemCompanyController",csub);
		systemcompanyService.insertComSubject(csub);
		return "redirect:/";
	}
	
	//회사 계정과목 등록 form
	@RequestMapping(value="/ComSystem/insertComSubject",method=RequestMethod.GET)
	public String addComSubject(Model model) {
		logger.debug("{} : addComSubject form SystemCompanyController");
		List<ComSystem> csyslist =systemcompanyService.selectAllComSystem();
		model.addAttribute("csyslist", csyslist);
		return "system/insertComSubject";
	}
	
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
		return "redirect:/ComSystem/selectComSystem";
	}
	
	//회사계정체계 등록 form
	@RequestMapping(value="/ComSystem/insertComSystem", method=RequestMethod.GET)
	public String addComSystem() {
		logger.debug("{} : addComSystem form SystemCompanyController");
		return "system/insertComSystem";
	}
	
	
}
