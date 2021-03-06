package com.boa.cashfilm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boa.cashfilm.member.dto.MemberCheck;
import com.boa.cashfilm.member.dto.MemberClassification;
import com.boa.cashfilm.member.dto.MemberInfo;
import com.boa.cashfilm.member.dto.MemberList;
import com.boa.cashfilm.member.dto.MemberSession;
import com.boa.cashfilm.member.dto.MemberSessionByCompanyPayment;
import com.boa.cashfilm.member.dto.MemberSignUp;
import com.boa.cashfilm.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	// 회원 구분 삭제
	@RequestMapping(value = "/member/memberClassificationDeletion", method = RequestMethod.GET)
	public String deleteMemberClassification(@RequestParam("memberClassificationCode") int memberClassificationCode) {
		logger.debug("{} : < memberClassificationCode deleteMemberClassification() MemberController", memberClassificationCode);
		memberService.deleteMemberClassification(memberClassificationCode);
		return "redirect:/member/memberClassificationList";
	}
	
	// 회원 구분 수정
	@RequestMapping(value = "/member/memberClassificationModification", method = RequestMethod.POST)
	public String updateMemberClassification(MemberClassification memberClassification) {
		logger.debug("{} : < memberClassificationCode updateMemberClassification() MemberController", memberClassification.getMemberClassificationCode());
		logger.debug("{} : < memberClassificationName updateMemberClassification() MemberController", memberClassification.getMemberClassificationName());
		memberService.updateMemberClassification(memberClassification);
		return "redirect:/member/memberClassificationList";
	}
	
	// 회원 구분 조회
	@RequestMapping(value = "/member/memberClassificationList", method = RequestMethod.GET)
	public String selectMemberClassification(Model model) {
		logger.debug("{} : < selectMemberClassification() MemberController");
		List<MemberClassification> list = memberService.selectMemberClassification();
		for(MemberClassification mc : list) {
			logger.debug("{} : > memberClassificationName selectMemberClassification() MemberController", mc.getMemberClassificationName());
		}
		model.addAttribute("memberClassificationList", list);
		return "member/memberClassificationList";
	}
	
	// 회원 구분 등록
	@RequestMapping(value = "/member/memberClassificationRegistration", method = RequestMethod.GET)
	public String insertMemberClassification(@RequestParam("memberClassificationName") String memberClassificationName) {
		logger.debug("{} : < memberClassificationName insertMemberClassification() MemberController", memberClassificationName);
		memberService.insertMemberClassification(memberClassificationName);
		return "redirect:/member/memberClassificationList";
	}
	
	// 회원 조회
	@RequestMapping(value = "/member/memberList", method = RequestMethod.GET)
	public String selectMemberList(Model model) {
		logger.debug("< selectMemberList() MemberController");
		List<MemberList> list = memberService.selectMemberList();
		model.addAttribute("memberList", list);
		return "member/memberList";
	}
	
	// 회원 탈퇴 요청 승인 (관리자)
	@RequestMapping(value = "/member/memberDelApproval", method = RequestMethod.POST)
	public String updateMemberDel(@RequestParam("memberEmail") String memberEmail
								, @RequestParam("memberDelRequestDay") String memberDelRequestDay
								, @RequestParam("memberDelApprovalEmail") String memberDelApprovalEmail) {
		logger.debug("{} : < memberEmail updateMemberDel() MemberController", memberEmail);
		logger.debug("{} : < memberDelRequestDay updateMemberDel() MemberController", memberDelRequestDay);
		logger.debug("{} : < memberDelApprovalEmail updateMemberDel() MemberController", memberDelApprovalEmail);
		Map map = new HashMap();
		map.put("memberEmail", memberEmail);
		map.put("memberDelRequestDay", memberDelRequestDay);
		map.put("memberDelApprovalEmail", memberDelApprovalEmail);
		memberService.updateMemberDel(map);
		return "redirect:/member/memberDelList";
	}
	
	// 회원 탈퇴 요청 조회 (관리자)
	@RequestMapping(value = "/member/memberDelList", method = RequestMethod.GET)
	public String selectMemberDelList(Model model) {
		logger.debug("< 회원 탈퇴 요청 조회 selectMemberDelList() MemberController");
		List list = memberService.selectMemberDelList();
		model.addAttribute("memberDelList", list);
		return "member/memberDelList";
	}
	
	// 회원 탈퇴 요청
	@RequestMapping(value = "/member/memberDel", method = RequestMethod.POST)
	public @ResponseBody int insertMemberDel(MemberCheck memberCheck) {
		logger.debug("< 회원 탈퇴 요청 insertMemberDel() MemberController");
		logger.debug("{} : < memberEmail insertMemberDel() MemberController", memberCheck.getMemberEmail());
		logger.debug("{} : < memberDelReason insertMemberDel() MemberController", memberCheck.getMemberDelReason());
		int result = memberService.insertMemberDel(memberCheck);
		logger.debug("{} : > result insertMemberDel() MemberController", result);
		return result;
	}
	
	// 회원 탈퇴 체크 처리
	@RequestMapping(value = "/member/memberDelCheck", method = RequestMethod.POST)
	public @ResponseBody int selectMemberDelCheck(Model model, MemberCheck memberCheck) {
		logger.debug("{} : < memberEmail memberDelCheck() MemberController", memberCheck.getMemberEmail());
		logger.debug("{} : < memberPassword memberDelCheck() MemberController", memberCheck.getMemberPassword());
		int memberDelCheckCount = memberService.selectMemberDelCheck(memberCheck);
		logger.debug("{} : > memberDelCheckCount memberDelCheck() MemberController", memberDelCheckCount);
		return memberDelCheckCount;
	}
	
	// 회원 탈퇴 체크 화면
	@RequestMapping(value = "/member/memberDelCheck", method = RequestMethod.GET)
	public String selectMemberDelCheck() {
		logger.debug("< 회원탈퇴체크화면 memberDelCheck() MemberController");
		return "member/memberDelCheck";
	}
	
	// 회원 정보 수정 처리
	@RequestMapping(value = "/member/memberModification", method = RequestMethod.POST)
	public String insertMemberModification(MemberInfo memberInfo) {
		logger.debug("{} : < memberInfo insertMemberModification() MemberController", memberInfo);
		memberService.insertMemberModification(memberInfo);
		return "redirect:/";
	}
	
	// 회원 정보 수정 화면
	@RequestMapping(value = "/member/memberModification", method = RequestMethod.GET)
	public String selectMemberModification(Model model, @RequestParam("memberEmail") String memberEmail) {
		logger.debug("{} : < memberEmail selectMemberModification() MemberController", memberEmail);
		MemberInfo memberInfo = memberService.selectMemberModification(memberEmail);
		model.addAttribute("memberInfo", memberInfo);
		return "member/memberModification";
	}
	
	// 회원 정보 조회
	@RequestMapping(value = "/member/memberInfo", method = RequestMethod.GET)
	public String selectMemberInfo(Model model, @RequestParam("memberEmail") String memberEmail) {
		logger.debug("{} : < memberEmail selectMemberInfo () MemberController", memberEmail);
		MemberInfo memberInfo = memberService.selectMemberInfo(memberEmail);
		model.addAttribute("memberInfo", memberInfo);
		return "member/memberInfo";
	}
	
	// 회원가입 처리
	@RequestMapping(value = "/member/signUp", method = RequestMethod.POST)
	public String insertSignUp(MemberSignUp memberSignUp) {
		logger.debug("{} : < memberSignUp insertSignUp() MemberController", memberSignUp);
		memberService.insertSignUp(memberSignUp);
		return "redirect:/";
	}
	
	// 이메일 중복 검사
	@RequestMapping(value = "/member/emailOverlap", method = RequestMethod.POST)
	public @ResponseBody int selectEmailOverlap(@RequestParam("memberEmail") String memberEmail) {
		logger.debug("{} : < memberEmail selectEmailOverlap() MemberController", memberEmail);
		int result = memberService.selectEmailOverlap(memberEmail);
		logger.debug("{} : > result selectEmailOverlap() MemberController", result);
		return result;
	}
	
	// 회원가입 화면
	@RequestMapping(value = "/member/signUp", method = RequestMethod.GET)
	public String insertSignUp() {
		return "member/memberSignUp";
	}
	
	// 로그아웃 처리
	@RequestMapping(value = "/member/signOut", method = RequestMethod.GET)
	public String signOut(HttpSession httpSession) {
		MemberSession memberSession = (MemberSession)httpSession.getAttribute("memberSession");
		logger.debug("{} : < memberEmail signOut() MemberController", memberSession.getMemberEmail());
		httpSession.invalidate();
		return "redirect:/";
	}
	
	// 로그인 처리
	@RequestMapping(value = "/member/signIn", method = RequestMethod.POST)
	public String selectSignIn(HttpSession httpSession, MemberCheck memberCheck) {
		logger.debug("{} : < memberCheck.getMemberEmail() selectSignIn() MemberController", memberCheck.getMemberEmail());
		logger.debug("{} : < memberCheck.getMemberPassword() selectSignIn() MemberController", memberCheck.getMemberPassword());
		Map sessionMap = null;
		logger.debug("{} : < start sessionMap selectSignIn() MemberController", sessionMap);
		sessionMap = memberService.selectSignIn(memberCheck);
		logger.debug("{} : > end sessionMap selectSignIn() MemberController", sessionMap);
		String view = null;
		if(sessionMap == null) {
			logger.debug("{} : > null sessionMap selectSignIn() MemberController", sessionMap);
			view = "redirect:/";
		} else {
			logger.debug("{} : > ok sessionMap selectSignIn() MemberController", sessionMap);
			MemberSession memberSession = (MemberSession)sessionMap.get("memberSession");
			MemberSessionByCompanyPayment memberSessionByCompanyPayment = (MemberSessionByCompanyPayment)sessionMap.get("memberSessionByCompanyPayment");
			httpSession.setAttribute("memberSession", memberSession);
			httpSession.setAttribute("memberSessionByCompanyPayment", memberSessionByCompanyPayment);
			view = "redirect:/";
		}
		return view;
	}
	
	// 로그인 화면
	@RequestMapping(value = "/member/signIn", method = RequestMethod.GET)
	public String selectSignIn() {
		logger.debug("로그인 화면 : < selectSignIn() MemberController");
		return "member/memberSignIn";
	}
}