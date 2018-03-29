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

import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;
import com.boa.cashfilm.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	CompanyService companyService;
	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	//개인회원이  회사소속으로 승인요청 
	@RequestMapping(value = "/company/comApprovalByIndividual" , method = RequestMethod.GET)
	public String comApprovalByIndividual(@RequestParam("memberEmail") String memberEmail,@RequestParam("comCode") int  comCode) {
		logger.debug("{} : CompanyController comApprovalByIndividual comCode", comCode);
		logger.debug("{} : CompanyController comApprovalByIndividual memberEmail", memberEmail);
		companyService.comApprovalByIndividual(memberEmail , comCode);
		
		return "redirect:/";		
	}
	
	//개인회원이 승인된 전체 회사 조회
	@RequestMapping(value = "/company/comListByIndividual" , method = RequestMethod.GET)
	public String comListByIndividual(Model model) {
		logger.debug("{} : <model comListByIndividual CompanyController", model);
		List<ComListByIndividual> list = companyService.comListByIndividual();
		logger.debug("{} : list comListByIndividual CompanyController", list);
		model.addAttribute("list", list);
		return "company/comListByIndividual";
	}
	
	
	//insert 회사 기본정보 등록 Action
	@RequestMapping(value = "/company/insertCompanyBaseInfo" , method = RequestMethod.POST)
	public String insertCompanyBaseInfo(InsertCompanyBaseInfo insertCompanyBaseInfo) {
		companyService.insertCompanyBaseInfo(insertCompanyBaseInfo);
		logger.debug("{} : CompanyController insertCompanyBaseInfo insertCompanyBaseInfo", insertCompanyBaseInfo);
		return "redirect:/";
	}
	//insert 회사 기본정보 등록 Form
	@RequestMapping(value = "/company/insertCompanyBaseInfo" , method = RequestMethod.GET)
	public String insertCompanyBaseInfo() {
				 /*		
					 // 로그인 처리
					 String view = null;
					 if(httpSession.getAttribute("loginMember") == null) {
						view = "redirect:/cashfilm";
					} else if(httpSession.getAttribute("loginMember") != null) {
						view = "/company/insertCompanyBaseInfo";
					}
				 */
		logger.debug("{} : CompanyController insertCompanyBaseInfo Form");
		return "company/comRegistration";	
	}
}
