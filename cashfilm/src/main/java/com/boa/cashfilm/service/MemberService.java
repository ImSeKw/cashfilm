package com.boa.cashfilm.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.MemberDao;
import com.boa.cashfilm.member.dto.EmailAndPassword;
import com.boa.cashfilm.member.dto.MemberInfo;
import com.boa.cashfilm.member.dto.MemberSignUp;
import com.boa.cashfilm.member.dto.MemberSimple;

@Service
@Transactional
public class MemberService {
	@Autowired
	MemberDao memberDao;
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	// 회원 탈퇴 체크 처리
	public int selectMemberDelCheck(EmailAndPassword emailAndPassword) {
		logger.debug("{} : < emailAndPassword selectMemberDelCheck() MemberService", emailAndPassword);
		return memberDao.selectMemberDelCheck(emailAndPassword);
	}
	
	// 회원 정보 수정 처리
	public void insertMemberModification(MemberInfo memberInfo) {
		logger.debug("{} : < memberInfo insertMemberModification() MemberService", memberInfo);
		memberDao.insertMemberModification(memberInfo);
	}

	// 회원 정보 수정 화면
	public MemberInfo selectMemberModification(String memberEmail) {
		logger.debug("{} : < memberEmail selectMemberModification() MemberService", memberEmail);
		return memberDao.selectMemberModification(memberEmail);
	}
	
	// 회원 정보 조회
	public MemberInfo selectMemberInfo(String memberEmail) {
		logger.debug("{} : < memberEmail selectMemberInfo() MemberService", memberEmail);
		return memberDao.selectMemberInfo(memberEmail);
	}

	// 회원가입 처리
	public void insertSignUp(MemberSignUp memberSignUp) {
		logger.debug("{} : < memberSignUp insertSignUp() MemberService", memberSignUp);
		memberDao.insertSignUpSimple(memberSignUp);
		memberDao.insertSignUpDetails(memberSignUp);
	}

	// 이메일 중복 검사
	public int selectEmailOverlap(String memberEmail) {
		logger.debug("{} : < memberEmail selectEmailOverlap() MemberService", memberEmail);
		return memberDao.selectEmailOverlap(memberEmail);
	}

	// 로그인 처리
	public MemberSimple selectSignIn(EmailAndPassword emailAndPassword) {
		logger.debug("{} : < emailAndPassword selectSignIn() MemberService", emailAndPassword);
		return memberDao.selectSignIn(emailAndPassword);
	}
}
