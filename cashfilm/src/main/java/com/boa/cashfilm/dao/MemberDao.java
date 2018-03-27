package com.boa.cashfilm.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.member.dto.EmailAndPassword;
import com.boa.cashfilm.member.dto.MemberDetails;
import com.boa.cashfilm.member.dto.MemberSignUp;
import com.boa.cashfilm.member.dto.MemberSimple;

@Repository
public class MemberDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private final String NAMESPACE = "com.boa.cashfilm.mapper.memberMapper.";
	private static final Logger logger = LoggerFactory.getLogger(MemberDao.class);
	
	// 회원가입 상세 처리
	public void insertSignUpDetails(MemberSignUp memberSignUp) {
		logger.debug("{} : < memberSignUp insertSignUpDetails() MemberDao", memberSignUp);
		sqlSessionTemplate.insert(NAMESPACE + "insertSignUpDetails", memberSignUp);
	}
	
	// 회원가입 간단 처리
	public void insertSignUpSimple(MemberSignUp memberSignUp) {
		logger.debug("{} : < memberSignUp insertSignUp() MemberDao", memberSignUp);
		sqlSessionTemplate.insert(NAMESPACE + "insertSignUpSimple", memberSignUp);
	}
	
	// 로그인 처리
	public MemberSimple selectSignIn(EmailAndPassword emailAndPassword) {
		logger.debug("{} : < emailAndPassword selectSignIn() MemberDao", emailAndPassword);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectSignIn", emailAndPassword);
	}
}