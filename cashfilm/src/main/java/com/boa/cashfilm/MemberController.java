package com.boa.cashfilm;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boa.cashfilm.member.dto.EmailAndPassword;
import com.boa.cashfilm.member.dto.MemberSimple;
import com.boa.cashfilm.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	// 로그인
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
	
	// 메인화면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String cashfilm() {
		return "cashfilm";
	}
}