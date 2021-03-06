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

import com.boa.cashfilm.company.dto.ComAuthority;
import com.boa.cashfilm.company.dto.ComCustomer;
import com.boa.cashfilm.company.dto.ComListByIndividual;
import com.boa.cashfilm.company.dto.ComPosition;
import com.boa.cashfilm.company.dto.ComPositionListAndMember;
import com.boa.cashfilm.company.dto.ComSection;
import com.boa.cashfilm.company.dto.ComSectionListAndMember;
import com.boa.cashfilm.company.dto.Company;
import com.boa.cashfilm.company.dto.InsertCompanyBaseInfo;
import com.boa.cashfilm.member.dto.MemberSession;
import com.boa.cashfilm.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	CompanyService companyService;
	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	
	//테스트입니다
	@RequestMapping(value = "company/comcomcom" , method = RequestMethod.POST)
	public String Test(ComAuthority comAuthority) {
		logger.debug("{} : CompanyController Test comAuthority.getMemberEmail()",comAuthority.getMemberEmail());
		return "redirect:/";
	}

	//기업회원 직급 등록을 위한 조회
	@RequestMapping(value = "company/comPositionListBeforeApproval" , method = RequestMethod.GET)
	public String comPositionListBeforeApproval(@RequestParam("comCode") int comCode,Model model) {
		logger.debug("{} : CompanyController comPositionListBeforeApproval comCode",comCode);
		List<ComPositionListAndMember> list = companyService.comPositionListBeforeApproval(comCode);
		logger.debug("{} : CompanyController comPositionListBeforeApproval list",list);
		model.addAttribute("list", list);
		return "company/comPositionListBeforeApproval";
	}
	//기업회원 부서 등록을 위한 조회
	
	//회사 부서 조회(기업회원 부서 등록을 위한 조회)
	@RequestMapping(value = "company/comSectionListBeforeApproval" , method = RequestMethod.GET)
	public String comSectionListBeforeApproval(@RequestParam("comCode") int comCode,Model model) {
		logger.debug("{} : CompanyController comSectionListBeforeApproval comCode",comCode);
		List<ComSectionListAndMember> list = companyService.comSectionListBeforeApproval(comCode);
		List<ComSectionListAndMember> sectionList = companyService.comSectionList(comCode);
		logger.debug("{} : CompanyController comSectionListBeforeApproval list",list);
		model.addAttribute("list", list);
		model.addAttribute("sectionList", sectionList);
		return "company/comSectionListBeforeApproval";
	}
	//회사체계변경 권한을 가진 회원이 회사권한승인  1(memberEmail테이블에 회원구분코드 기업회원으로 변경,회사코드 생성)
	//회사체계변경 권한을 가진 회원이 회사권한승인  2(회사별권한여부 테이블에 회사별권한여부 0->1,회사별권한승인일,회사별승인이메일 update )
	@RequestMapping(value = "company/comAuthorityApprovalByMember" , method = RequestMethod.GET)
	public String comAuthorityApprovalByMember(@RequestParam("memberEmail") String memberEmail,@RequestParam("comCode") int comCode,@RequestParam("memberEmailApproval") String memberEmailApproval) {
		logger.debug("{} : CompanyController comAuthorityApprovalByMember memberEmail",memberEmail);
		logger.debug("{} : CompanyController comAuthorityApprovalByMember comCode",comCode);
		logger.debug("{} : CompanyController comAuthorityApprovalByMember memberEmailApproval",memberEmailApproval);
		companyService.comAuthorityApprovalByMember(memberEmail, comCode);
		companyService.comAuthorityApprovalByAuthority(memberEmail, comCode, memberEmailApproval);
		return "redirect:/";
	}
	//개인회원이 회사승인 요청 후 회사체계변경가능자가 승인요청 조회(회사별 권한 승인 여부 조회)
	@RequestMapping(value = "company/comAuthorityApprovalList" , method = RequestMethod.GET)
	public String comAuthorityApprovalList(@RequestParam("memberEmail") String memberEmail,@RequestParam("comCode") int comCode,Model model) {
		logger.debug("{} : CompanyController comAuthorityApprovalList comCode",comCode);
		logger.debug("{} : CompanyController comAuthorityApprovalList memberEmail",memberEmail);
		List<ComAuthority> list =companyService.comAuthorityApprovalList(memberEmail,comCode);
		model.addAttribute("list", list);
		return "company/comAuthorityApprovalList";
	}
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
	
	
	
	
	//회사 부서 등록 form
	@RequestMapping(value = "company/comSectionRegistration" , method = RequestMethod.GET)
	public String comSectionRegistration() {
		return "company/comSectionRegistrationForm";
	}
	//회사 직급 등록 form
	@RequestMapping(value = "company/comPositionRegistration" , method = RequestMethod.GET)
	public String comPositionRegistration() {
		return "company/comPositionRegistrationForm";
	}
	
	//회사 부서 등록 Action
	@RequestMapping(value = "company/comSectionRegistration" , method = RequestMethod.POST)
	public String comSectionRegistration(ComSection comSection) {
		logger.debug("{} : CompanyController comSectionRegistration comSection", comSection);
		companyService.comSectionRegistration(comSection);
		return "redirect:/company/comSectionList";
	}
	//회사 직급 등록 Action
	@RequestMapping(value = "company/comPositionRegistration" , method = RequestMethod.POST)
	public String comPositionRegistration(ComPosition comPosition) {
		logger.debug("{} : CompanyController comPositionRegistration comPosition", comPosition);
		companyService.comPositionRegistration(comPosition);
		return "redirect:/company/comSectionList";
	}
	//회사 부서 조회
	@RequestMapping(value = "company/comSectionList" , method = RequestMethod.GET)
	public String comSectionList(HttpSession httpSession,Model model) {
		MemberSession memberSession = (MemberSession) httpSession.getAttribute("memberSession");
		logger.debug("{} : CompanyController comSectionList memberSession.getComCode()", memberSession.getComCode());
		List<ComSectionListAndMember> list = companyService.comSectionList(memberSession.getComCode());
		model.addAttribute("list", list);
		logger.debug("{} : CompanyController comSectionList list", list);
		return "company/comSectionList";
	}
	
	//회사 직급 조회
	@RequestMapping(value = "company/comPositionList" , method = RequestMethod.GET)
	public String comPositionList(HttpSession httpSession,Model model) {
		MemberSession memberSession = (MemberSession) httpSession.getAttribute("memberSession");
		logger.debug("{} : CompanyController comPositionList memberSession.getComCode()", memberSession.getComCode());
		List<ComPositionListAndMember> list = companyService.comPositionList(memberSession.getComCode());
		model.addAttribute("list", list);
		logger.debug("{} : CompanyController comPositionList list", list);
		return "company/comPositionList";
	}
	
	//회사 부서 수정 form 
	@RequestMapping(value = "company/comSectionModification" , method = RequestMethod.GET)
	public String comSectionModificationForm(HttpSession httpSession,Model model) {
		MemberSession memberSession = (MemberSession) httpSession.getAttribute("memberSession");
		logger.debug("{} : CompanyController comSectionModificationform memberSession.getComCode()", memberSession.getComCode());
		//comSection 조회를 통해서 화면에서 보여주기 때문에 comSectionList를 호출했다.
		List<ComSectionListAndMember> list = companyService.comSectionList(memberSession.getComCode());
		model.addAttribute("list", list);
		logger.debug("{} : CompanyController comSectionModificationform list", list);
		return "company/comSectionModification";
	}

	//회사 직급 수정 form
	@RequestMapping(value = "company/comPositionModification" , method = RequestMethod.GET)
	public String comPositionModificationForm(HttpSession httpSession,Model model) {
		MemberSession memberSession = (MemberSession) httpSession.getAttribute("memberSession");
		logger.debug("{} : CompanyController comPositionModificationForm memberSession.getComCode()", memberSession.getComCode());
		//comSection 조회를 통해서 화면에서 보여주기 때문에 comSectionList를 호출했다.
		List<ComPositionListAndMember> list = companyService.comPositionList(memberSession.getComCode());
		model.addAttribute("list", list);
		logger.debug("{} : CompanyController comPositionModificationForm list", list);
		return "company/comPositionModification";
	}
	//회사 부서 수정 Action
	@RequestMapping(value = "company/comSectionModification" , method = RequestMethod.POST)
	public String comSectionModification(ComSection comSection) {
		logger.debug("{} : CompanyController comSectionModification comSection", comSection);
		companyService.comSectionModification(comSection);
		return "redirect:/company/comSectionList";
	}
	//회사 직급 수정 Action
	@RequestMapping(value = "company/comPositionModification" , method = RequestMethod.POST)
	public String comPositionModification(ComPosition comPosition) {
		logger.debug("{} : CompanyController comPositionModification comPosition", comPosition);
		companyService.comPositionModification(comPosition);
		return "redirect:/company/comPositionList";
	}
	//회사 부서 삭제
	@RequestMapping(value = "company/comSectionDel" , method = RequestMethod.GET)
	public String comSectionDel() {
		
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
		int ComAuthorityApproval = companyService.selectComAuthorityApproval(memberEmail, comCode);
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
