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

import com.boa.cashfilm.company.dto.ComCustomer;
import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.Company;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;
import com.boa.cashfilm.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	CompanyService companyService;
	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	//회사 탈퇴 조회
	@RequestMapping(value = "company/comDelList" , method = RequestMethod.GET)
	public String comDelList() {
		return "company/comDelList";
	}
	//회사 조회
	@RequestMapping(value = "company/comListByCompany" , method = RequestMethod.GET)
	public String comListByCompany() {
		return "company/comListByCompany";
	}
	//회사 등록 요청 조회
	@RequestMapping(value = "company/comListByMaster" , method = RequestMethod.GET)
	public String comListByMaster() {
		return "company/comListByMaster";
	}
	//회사 거래처 등록 Form
	@RequestMapping(value = "company/comCustomerRegistration" , method = RequestMethod.GET)
	public String comCustomerRegistration() {
		logger.debug("{} : CompanyController comCustomerRegistration Form");
		return "company/comCustomerRegistration";
	}
	
	//회사 거래처 등록 Action
	@RequestMapping(value = "company/comCustomerRegistration" , method = RequestMethod.POST)
	public String comCustomerRegistration(ComCustomer comCustomer) {
		logger.debug("{} : CompanyController comCustomerRegistration comCustomer",comCustomer.getComCode());

		companyService.comCustomerRegistration(comCustomer);

		logger.debug("CompanyController comCustomerRegistration Action");
		return "redirect:/";
	}
	//회사 거래처 조회
	@RequestMapping(value = "company/comCustomerList" , method = RequestMethod.GET)
	public String comCustomerList(@RequestParam("comCode") int comCode,Model model) {
		logger.debug("{} : CompanyController comCustomerList comCode",comCode );
		List<ComCustomer> list = companyService.comCustomerList(comCode);
		logger.debug("{} : CompanyController comCustomerList list",list );
		model.addAttribute("list", list);
		return "company/comCustomerList";
	}
	//회사 거래처 수정 form
	@RequestMapping(value = "company/comCustomerModification" , method = RequestMethod.GET)
	public String comCustomerModification(@RequestParam("comCode") int comCode,@RequestParam("memberEmail") String memberEmail,@RequestParam("customerCode") int customerCode) {

		return "";
	}
	//회사 거래처 수정 Action
	@RequestMapping(value = "company/comCustomerModification" , method = RequestMethod.POST)
	public String comCustomerModification(Model model) {
		return "company/comCustomerModification";
	}
	//회사 거래처 삭제
	@RequestMapping(value = "company/comCustomerDel" , method = RequestMethod.GET)
	public String comCustomerDel() {
		return "";
	}
	//회사별 권한 여부 요청
	@RequestMapping(value = "company/comAuthorityApprovalRequest" , method = RequestMethod.GET)
	public String comAuthorityApprovalRequest() {
		return "";
	}
	//회사별 권한 여부 조회
	@RequestMapping(value = "company/comAuthorityApprovalList" , method = RequestMethod.GET)
	public String comAuthorityApprovalList() {
		return "";
	}
	//회사별 권한 여부 수정
	@RequestMapping(value = "company/comAuthorityApprovalModification" , method = RequestMethod.GET)
	public String comAuthorityApprovalModification() {
		return "";
	}
	//회사별 권한 조회
	@RequestMapping(value = "company/comAuthorityList" , method = RequestMethod.GET)
	public String comAuthorityList() {
		return "";
	}
	//회사 부서 등록
	@RequestMapping(value = "company/comSectionRegistration" , method = RequestMethod.GET)
	public String comSectionRegistration() {
		return "";
	}
	//회사 부서 조회
	@RequestMapping(value = "company/comSectionList" , method = RequestMethod.GET)
	public String comSectionList() {
		return "";
	}
	//회사 부서 수정
	@RequestMapping(value = "company/comSectionModification" , method = RequestMethod.GET)
	public String comSectionModification() {
		return "";
	}
	//회사 부서 삭제
	@RequestMapping(value = "company/comSectionDel" , method = RequestMethod.GET)
	public String comSectionDel() {
		
		return "";
	}
	//회사 직급 등록
	@RequestMapping(value = "company/comPositionRegistration" , method = RequestMethod.GET)
	public String comPositionRegistration() {
		return "";
	}
	//회사 직급 조회
	@RequestMapping(value = "company/comPositionList" , method = RequestMethod.GET)
	public String comPositionList() {
		return "";
	}

	//회사 직급 수정
	@RequestMapping(value = "company/comPositionModification" , method = RequestMethod.GET)
	public String comPositionModification() {
		return "";
	}
	//회사 직급 삭제
	@RequestMapping(value = "company/comPositionDel" , method = RequestMethod.GET)
	public String comPositionDel() {
		return "";
	}
	
	
	
	
	
	//자신의 회사 정보  권한 조회(회사정보수정,부서관리,직급관리는 회사별권한승인여부의 값으로 판단한다)
	@RequestMapping(value = "company/selectComAuthorityApproval" , method = RequestMethod.GET)
	public String selectComAuthorityApproval(@RequestParam("memberEmail") String memberEmail, @RequestParam("comCode") int comCode , Model model) {
	logger.debug("{} : CompanyController selectComAuthorityApproval memberEmail",memberEmail );
	logger.debug("{} : CompanyController selectComAuthorityApproval comCode",comCode );
	List<Object> ComAuthorityApproval = companyService.selectComAuthorityApproval(memberEmail, comCode);
	logger.debug("{} : CompanyController selectComAuthorityApproval ComAuthorityApproval",ComAuthorityApproval );

	model.addAttribute("ComAuthorityApproval", ComAuthorityApproval);
		return "company/selectComAuthorityApproval";
	}
	//자신의 회사 정보 검색
	@RequestMapping(value = "company/comInfo" , method = RequestMethod.GET)
	public String comInfo(@RequestParam("comCode") int comCode,Model model) {
		List<Company> list = companyService.comInfo(comCode);
		logger.debug("{} : CompanyController comInfo list", list);
		model.addAttribute("list", list);
		return "company/comInfo";
	}
	//cashfilm 관리자 권한으로 승인 전 회사 검색
	@RequestMapping(value = "/company/comListBeforeApproval" , method = RequestMethod.GET)
	public String comListBeforeApproval(Model model) {
		List<Company> list = companyService.comListBeforeApproval();
		model.addAttribute("list", list);
		logger.debug("{} : CompanyController comListBeforeApproval list", list);
		return "company/comListBeforeApproval";
	}
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
