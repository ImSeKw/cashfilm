package com.boa.cashfilm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.MemberDao;
import com.boa.cashfilm.member.dto.EmailAndPassword;
import com.boa.cashfilm.member.dto.MemberDetails;
import com.boa.cashfilm.member.dto.MemberSignUp;
import com.boa.cashfilm.member.dto.MemberSimple;

@Service
@Transactional
public class MemberService {
	@Autowired
	MemberDao memberDao;
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	// 회원가입 처리
	public void insertSignUp(MemberSignUp memberSignUp) {
		logger.debug("{} : < memberSignUp insertSignUp() MemberService", memberSignUp);
		// 간단
		MemberSimple memberSimple = new MemberSimple();
		memberSimple.setMemberEmail(memberSignUp.getMemberEmail());
		memberSimple.setMemberName(memberSignUp.getMemberName());
		memberSimple.setMemberPassword(memberSignUp.getMemberPassword());
		memberDao.insertSignUpSimple(memberSimple);
		// 상세
		MemberDetails memberDetails = new MemberDetails();
		memberDetails.setMemberEmail(memberSignUp.getMemberEmail());
		memberDetails.setMemberPhoneFirst(memberSignUp.getMemberPhoneFirst());
		memberDetails.setMemberPhoneSecond(memberSignUp.getMemberPhoneSecond());
		memberDetails.setMemberPostalCode(memberSignUp.getMemberPostalCode());
		memberDetails.setMemberAddress(memberSignUp.getMemberAddress());
		memberDetails.setMemberCertification(memberSignUp.getMemberCertification());
		memberDetails.setMemberPhone(memberSignUp.getMemberPhone());
		memberDao.insertSignUpDetails(memberDetails);
	}
	
	// 로그인 처리
	public MemberSimple selectSignIn(EmailAndPassword emailAndPassword) {
		logger.debug("{} : < emailAndPassword selectSignIn() MemberService", emailAndPassword);
		return memberDao.selectSignIn(emailAndPassword);
	}
}
