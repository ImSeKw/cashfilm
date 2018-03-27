package com.boa.cashfilm;

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

import com.boa.cashfilm.member.dto.EmailAndPassword;
import com.boa.cashfilm.member.dto.MemberDetails;
import com.boa.cashfilm.member.dto.MemberSignUp;
import com.boa.cashfilm.member.dto.MemberSimple;
import com.boa.cashfilm.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
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
	
	// 로그인 처리
	@RequestMapping(value = "/member/signIn", method = RequestMethod.POST)
	public String selectSignIn(HttpSession httpSession, EmailAndPassword emailAndPassword) {
		logger.debug("{} : < emailAndPassword.getMemberEmail() selectSignIn() MemberController", emailAndPassword.getMemberEmail());
		logger.debug("{} : < emailAndPassword.getMemberPassword() selectSignIn() MemberController", emailAndPassword.getMemberPassword());
		
		MemberSimple memberSimple = memberService.selectSignIn(emailAndPassword);
		String view = null;
		if(memberSimple == null) {
			logger.debug("{} : > null memberSimple selectSignIn() MemberController", memberSimple);
			view = "redirect:/";
		} else if(memberSimple.getMemberEmail().equals(emailAndPassword.getMemberEmail())) {
			if(memberSimple.getMemberPassword().equals(emailAndPassword.getMemberPassword())) {
				logger.debug("{} : > password memberSimple selectSignIn() MemberController", memberSimple);
				httpSession.setAttribute("memberSimple", memberSimple);
				view = "redirect:/";
			} else {
				logger.debug("{} : > email memberSimple selectSignIn() MemberController", memberSimple);
				view = "redirect:/";
			}
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