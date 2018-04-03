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
import com.boa.cashfilm.sysindi.dto.IndividualSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSubjectDetail;
import com.boa.cashfilm.sysindi.dto.IndividualSystem;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndSubject;
import com.boa.cashfilm.sysindi.dto.IndividualSystemAndUSubject;
import com.boa.cashfilm.sysindi.dto.Individualcontent;
import com.boa.cashfilm.sysindi.dto.UserIndividualSubject;

@Controller
public class SystemIndividualController {
	@Autowired
	private SystemIndividualService systemIndiService;
	private static final Logger logger=LoggerFactory.getLogger(SystemIndividualService.class);
	
	//개인적요 등록 action
	@RequestMapping(value="/IndividualSystem/insertIndividualcontent",method = RequestMethod.POST)
	public String insertIndividualcontent(Individualcontent ic) {
		logger.debug("{} :addIndividualcontent SystemIndividualController.java",ic);
		systemIndiService.insertIndividualcontent(ic);
		return "redirect:/";
	}
	
	//개인적요 등록 form
	@RequestMapping(value="/IndividualSystem/insertIndividualcontent",method = RequestMethod.GET)
	public String addIndividualcontent(Model model,@RequestParam(value="memberEmail",required=true)String memberEmail) {
		logger.debug("{} :addIndividualcontent SystemIndividualController.java",memberEmail);
		List<IndividualSubject> list=systemIndiService.selectAllIndividualSubject();
		model.addAttribute("list", list);
		List<IndividualSystemAndUSubject> isuslist=systemIndiService.selectUserIndiSubject(memberEmail);
		model.addAttribute ("isuslist",  isuslist);
		return "system/insertIndividualcontent";
	}
	
	//개인계정 세부 삭제
	@RequestMapping(value="/IndividualSystem/deleteIndividualSubjectDetail",method = RequestMethod.GET)
	public String deleteIndividualSubjectDetail(IndividualSubjectDetail isd){
		logger.debug("{} :deleteIndividualSubjectDetail SystemIndividualController.java",isd);
		systemIndiService.deleteIndividualSubjectDetail(isd);
		return "redirect:/IndividualSystem/selectIndividualSubjectDetail";
	}
	
	//개인계정 세부 수정action
	@RequestMapping(value="/IndividualSystem/updateIndividualSubjectDetail",method = RequestMethod.POST)
	public String updateIndividualSubjectDetail(IndividualSubjectDetail isd){
		logger.debug("{} :updateIndividualSubjectDetail SystemIndividualController.java",isd);
		systemIndiService.updateIndividualSubjectDetail(isd);
		return "redirect:/IndividualSystem/selectIndividualSubjectDetail";
	}
	
	//개인계정 세부 수정 form
	@RequestMapping(value="/IndividualSystem/updateIndividualSubjectDetail",method = RequestMethod.GET)
	public String selectOneNuIndividualSubjectDetail(Model model, @RequestParam(value="individualSubjectDetailNumeral",required=true)int individualSubjectDetailNumeral){
		logger.debug("{} :selectOneNuIndividualSubjectDetail SystemIndividualService.java",individualSubjectDetailNumeral);
		List<IndividualSubject> list=systemIndiService.selectAllIndividualSubject();
		model.addAttribute("list", list); 
		IndividualSubjectDetail isd=systemIndiService.selectOneNuIndividualSubjectDetail(individualSubjectDetailNumeral);
		model.addAttribute("isd", isd);
	return "system/updateIndividualSubjectDetail";
	}

		
	//개인계정 세부 검색(세부명별검색)
	@RequestMapping(value="/IndividualSystem/selectIndividualSubjectDetail",method = RequestMethod.POST)
	public String selectIndividualSubjectDetail(Model model, @RequestParam(value="individualSubjectDetailName",required=true)String individualSubjectDetailName){
		logger.debug("{} :selectIndividualSubjectDetail post SystemIndividualController.java");
		List<IndividualSubjectDetail> isdlist= systemIndiService.selectAllIndividualSubjectDetail();
		model.addAttribute("isdlist", isdlist);
		IndividualSubjectDetail isd=systemIndiService.selectOneIndividualSubjectDetail(individualSubjectDetailName);
		model.addAttribute("isd", isd);
		return "system/selectIndividualSubjectDetail";
	}
	//개인계정 세부 검색(모든검색)
	@RequestMapping(value="/IndividualSystem/selectIndividualSubjectDetail",method = RequestMethod.GET)
	public String selectIndividualSubjectDetail(Model model){
		logger.debug("{} :selectIndividualSubjectDetail get SystemIndividualController.java");
		List<IndividualSubjectDetail> isdlist= systemIndiService.selectAllIndividualSubjectDetail();
		model.addAttribute("isdlist", isdlist);
		return "system/selectIndividualSubjectDetail";
	}

	//개인계정 세부 등록(action)
	@RequestMapping(value="/IndividualSystem/insertIndividualSubjectDetail",method = RequestMethod.POST)
	public String addIndividualSubjectDetail(IndividualSubjectDetail isd) {
		logger.debug("{} :addIndividualSubjectDetail action SystemIndividualController.java",isd);
		systemIndiService.insertIndividualSubjectDetail(isd);
		return "redirect:/";
	}
	
	//개인계정 세부 등록(form)
	@RequestMapping(value="/IndividualSystem/insertIndividualSubjectDetail",method = RequestMethod.GET)
	public String addIndividualSubjectDetail(Model model) {
		logger.debug("{} :addIndividualSubjectDetail form SystemIndividualController.java",model);
		List<IndividualSubject> list=systemIndiService.selectAllIndividualSubject();
		model.addAttribute("list", list);
		return "system/InsertIndividualSubjectDetail";
		
		
	}
	
	//개인 사용자 계정과목  삭제 
	@RequestMapping(value="/IndividualSystem/deleteUserIndiSubject",method = RequestMethod.GET)
	public String deleteUserIndiSubject(UserIndividualSubject uis) {
		logger.debug("{} :deleteUserIndiSubject form SystemIndividualController.java",uis);
		systemIndiService.deleteUserIndiSubject(uis);
		return "redirect:/";
	}
		
	//개인 사용자 계정과목 수정 action
	@RequestMapping(value="/IndividualSystem/updateUserIndiSubject",method = RequestMethod.POST)
	public String updateUserIndiSubject(Model model,UserIndividualSubject uis) {
		logger.debug("{} :updateUserIndiSubject form SystemIndividualController.java",uis);
		systemIndiService.updateUserIndiSubject(uis);
		return "redirect:/";
	}
	
	//개인 사용자 계정과목 수정 form
	@RequestMapping(value="/IndividualSystem/updateUserIndiSubject",method = RequestMethod.GET)
	public String selectOneUserIndiSubject(Model model,int userIndividualSubjectCode) {
		logger.debug("{} :updateUserIndiSubject form SystemIndividualController.java",userIndividualSubjectCode);
		List<IndividualSystem> syslist = systemIndiService.selectIndividualSystem();
		model.addAttribute("syslist",syslist);
		UserIndividualSubject uis =systemIndiService.selectOneUserIndiSubject(userIndividualSubjectCode);
		model.addAttribute("uis", uis);
		return "system/updateUserIndiSubject"; 
	}
	
	//개인 사용자 계정과목 검색 (이메일별 체계별검색)
	@RequestMapping(value="/IndividualSystem/selectUserIndiSubject",method = RequestMethod.GET)
	public String selectUserIndiSubject(Model model,@RequestParam(value="memberEmail",required=true)String memberEmail){
		logger.debug("{} :selectUserIndiSubject action SystemIndividualController.java",memberEmail);
		List<IndividualSystemAndUSubject> isuslist=systemIndiService.selectUserIndiSubject(memberEmail);
		model.addAttribute ("isuslist",  isuslist);
		return "system/selectIndividuanlSysAndUSub";
	}
	
	//개인 사용자 계정과목 등록 action
	@RequestMapping(value="/IndividualSystem/insertUserIndiSubject", method = RequestMethod.POST)
	public String addIndiSubject(UserIndividualSubject uisubject) {
		logger.debug("{} :insertUserIndiSubject action SystemIndividualController.java");
		systemIndiService.insertUserIndiSubject(uisubject);
		return "redirect:/IndividualSystem/selectUserIndiSubject";
	}
		
	//개인 사용자 계정과목 등록  form
	@RequestMapping(value="/IndividualSystem/insertUserIndiSubject", method = RequestMethod.GET)
	public String addIndiSubject(Model model) {
		logger.debug("{} :insertUserIndiSubject form SystemIndividualController.java");
		List<IndividualSystem> syslist = systemIndiService.selectIndividualSystem();
		model.addAttribute("syslist",syslist);
		return "system/insertUserIndiSubject";
	}
	
	//개인계정과목 삭제 
	@RequestMapping(value="/IndividualSystem/deleteIndividualSubject", method = RequestMethod.GET)
	public String deleteIndividualSubject(IndividualSubject isubject) {
		logger.debug("{} :deleteIndividualSubject form SystemIndividualController.java",isubject);
		systemIndiService.deleteIndividualSubject(isubject);
		return "redirect:/IndividualSystem/selectIndividualSubject";
	}
	
	//개인계정 과목 수정을  action
	@RequestMapping(value="/IndividualSystem/updateIndividualSubject", method = RequestMethod.POST)
	public String updateIndividualSubject(IndividualSubject isubject) {
		logger.debug("{} :updateIndividualSubject form SystemIndividualController.java",isubject);
		systemIndiService.updateIndividualSubject(isubject);
		return "redirect:/IndividualSystem/selectIndividualSubject";
	}
	
	//개인계정 과목 수정을  form
	@RequestMapping(value="/IndividualSystem/updateIndividualSubject", method = RequestMethod.GET)
	public String selectOneIndividualSubject(Model model,@RequestParam(value="individualSubjectNumeral",required=true) int individualSubjectNumeral) {
		logger.debug("{} :selectOneIndividualSubject form SystemIndividualController.java",individualSubjectNumeral);
		List<IndividualSystem> syslist = systemIndiService.selectIndividualSystem();
		model.addAttribute("syslist",syslist);
		IndividualSubject isubject =systemIndiService.selectOneIndividualSubject(individualSubjectNumeral);
		model.addAttribute("isubject", isubject);
		return "system/updateIndividualSubject";
	}
	
	//개인계정과목 체계별검색 action
	@RequestMapping(value="/IndividualSystem/selectIndividualSubjectOfSystem",method = RequestMethod.POST)
	public String selectIndividualSubjectOfIndividualSystem(Model model,@RequestParam(value="individualSystemNumeral",required=true) int individualSystemNumeral) {
		List<IndividualSystemAndSubject> indisysandsub =systemIndiService.selectIndividualSubjectOfIndividualSystem(individualSystemNumeral);
		model.addAttribute("indisysandsub", indisysandsub);
		return"system/selectIndividuanlSysAndSub";
	}
	
	//개인계정과정 체계별 검색 form
	@RequestMapping(value="/IndividualSystem/selectIndividualSubjectOfSystem",method = RequestMethod.GET)
	public String selectIndividualSubjectOfIndividualSystem(Model model) {
		List<IndividualSystem> syslist = systemIndiService.selectIndividualSystem();
		model.addAttribute("syslist",syslist);
		return "system/insertIndividuanlSysAndSub";
	}
	
	//개인계정과목 검색 
	@RequestMapping(value="/IndividualSystem/selectIndividualSubject",method = RequestMethod.GET)
	public String selectAllIndividualSubject(Model model){
		logger.debug("selectAllIndividualSubject SystemIndividualService.java");
		List<IndividualSubject> list=systemIndiService.selectAllIndividualSubject();
		model.addAttribute("list", list);
		return"system/selectIndividualSubject";
	}
	
	//개인계정과목 등록 action
	@RequestMapping(value="/IndividualSystem/insertIndividualSubject",method = RequestMethod.POST)
	public String addIndividualSubject(IndividualSubject isubject) {
		logger.debug("{} :insertIndividualSubject action SystemIndividualController.java",isubject);
		systemIndiService.insertIndividualSubject(isubject);
		return "redirect:/IndividualSystem/selectIndividualSubject";
	}
	
	//개인계정과목 등록 form
	@RequestMapping(value="/IndividualSystem/insertIndividualSubject",method = RequestMethod.GET)
	public String addIndividualSubject(Model model) {
		logger.debug("{} :insertIndividualSubject form SystemIndividualController.java");
		List<IndividualSystem> syslist = systemIndiService.selectIndividualSystem();
		model.addAttribute("syslist",syslist);
		return "system/insertIndividualSubject";
	}
	
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
		IndividualSystem indiSystem=systemIndiService.selectOneIndividualSystem(individualSystemNumeral);
		model.addAttribute("indiSystem", indiSystem);
		return "system/updateIndividualSystem";
	}
	
		
	//계정체계관리 검색
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
		return "redirect:/IndividualSystem/selectIndividualSystem";
	}

}
