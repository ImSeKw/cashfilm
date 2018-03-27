package com.boa.cashfilm;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.boa.cashfilm.service.SystemIndividualService;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;

@Controller
public class SystemIndividualController {
	@Autowired
	private SystemIndividualService systemIndiService;
	private static final Logger logger=LoggerFactory.getLogger(SystemIndividualService.class);
	
	//계정체계관리 삭제 
	@RequestMapping(value="/IndividualSystem/deleteIndividualSystem",method = RequestMethod.GET)
	public String deleteIndividualSystem(IndividualSystem isystem){
		logger.debug("{} :deleteIndividualSystem action SystemIndividualController.java",isystem);
		systemIndiService.deleteIndividualSystem(isystem);
		return "redirect:/IndividualSystem/selectIndividualSystem";
		
	}
	
	
	//계정체계관리 수정 action
	@RequestMapping(value="/IndividualSystem/updateIndividualSystem",method = RequestMethod.POST)
	public String updateIndividualSystem(IndividualSystem isystem) {
		logger.debug("{} :updateIndividualSystem action SystemIndividualController.java",isystem);
		systemIndiService.updateIndividualSystem(isystem);
		return "redirect:/IndividualSystem/selectIndividualSystem";
	}
	
	//계정체계관리 수정 form
	@RequestMapping(value="/IndividualSystem/updateIndividualSystem",method = RequestMethod.GET)
	public String updateIndividualSystem(Model model,@RequestParam(value="individualSystemNumeral",required=true) int individualSystemNumeral) {
		logger.debug("{} :updateIndividualSystem form SystemIndividualController.java");
		IndividualSystem IndiSystem=systemIndiService.selectOneIndividualSystem(individualSystemNumeral);
		model.addAttribute("IndiSystem", IndiSystem);
		return "system/updateIndividualSystem";
	}
	
		
	//계정체계관리 목록
	@RequestMapping(value="/IndividualSystem/selectIndividualSystem", method = RequestMethod.GET)
	public String selectindisystem(Model model) {
		logger.debug("selectindisystem form SystemIndividualController.java");
		List<IndividualSystem> list = systemIndiService.selectIndividualSystem();
		model.addAttribute("list",list);
		return "system/selectIndividualSystem";
	}
	
	//계정체계관리 등록 form
	@RequestMapping(value="/IndividualSystem/insertIndividualSystem", method=RequestMethod.GET)
	public String addindisystem(){
		logger.debug("addindisystem form SystemIndividualController.java");
		return "system/insertIndividualSystem";
	}
	//계정체계관리 등록 action
	@RequestMapping(value="/IndividualSystem/insertIndividualSystem", method=RequestMethod.POST)
	public String addindisystem(IndividualSystem isystem){
		logger.debug("{} : addindisystem Action SystemIndividualController.java",isystem);
		systemIndiService.insertIndividualSystem(isystem);
		return "redirect:/";
	}

}
