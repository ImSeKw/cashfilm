package com.boa.cashfilm.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.member.dto.EmailAndPassword;
import com.boa.cashfilm.member.dto.MemberSimple;

@Repository
public class MemberDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private final String NAMESPACE = "com.boa.cashfilm.mapper.memberMapper.";
	private static final Logger logger = LoggerFactory.getLogger(MemberDao.class);
	
	// 로그인
	public MemberSimple selectSignIn(EmailAndPassword emailAndPassword) {
		logger.debug("{} : < emailAndPassword selectSignIn() MemberDao", emailAndPassword);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectSignIn", emailAndPassword);
	}
}