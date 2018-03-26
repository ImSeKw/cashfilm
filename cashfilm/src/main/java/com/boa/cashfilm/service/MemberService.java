package com.boa.cashfilm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.MemberDao;
import com.boa.cashfilm.member.dto.EmailAndPassword;
import com.boa.cashfilm.member.dto.MemberSimple;

@Service
@Transactional
public class MemberService {
	@Autowired
	MemberDao memberDao;
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	// 로그인
	public MemberSimple selectSignIn(EmailAndPassword emailAndPassword) {
		logger.debug("{} : < emailAndPassword selectSignIn() MemberService", emailAndPassword);
		return memberDao.selectSignIn(emailAndPassword);
	}
}
