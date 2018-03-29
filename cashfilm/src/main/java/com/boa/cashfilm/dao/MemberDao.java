package com.boa.cashfilm.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boa.cashfilm.member.dto.MemberCheck;
import com.boa.cashfilm.member.dto.MemberInfo;
import com.boa.cashfilm.member.dto.MemberSession;
import com.boa.cashfilm.member.dto.MemberSessionByCompanyPayment;
import com.boa.cashfilm.member.dto.MemberSignUp;
import com.boa.cashfilm.member.dto.MemberSimple;

@Repository
public class MemberDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	private final String NAMESPACE = "com.boa.cashfilm.mapper.memberMapper.";
	private static final Logger logger = LoggerFactory.getLogger(MemberDao.class);
	
	// 회원 탈퇴 요청
	public int insertMemberDel(MemberCheck memberCheck) {
		logger.debug("{} : < memberCheck insertMemberDel() MemberDao", memberCheck);
		return sqlSessionTemplate.insert(NAMESPACE + "insertMemberDel", memberCheck);
	}
	
	// 회원 탈퇴 체크 처리
	public int selectMemberDelCheck(MemberCheck memberCheck) {
		logger.debug("{} : < memberCheck selectMemberDelCheck() MemberDao", memberCheck);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectMemberDelCheck", memberCheck);
	}
	
	// 회원 정보 수정 처리
	public void insertMemberModification(MemberInfo memberInfo) {
		logger.debug("{} : < memberInfo insertMemberModification() MemberDao", memberInfo);
		sqlSessionTemplate.insert(NAMESPACE + "insertMemberModification", memberInfo);
	}
	
	// 회원 정보 수정 화면
	public MemberInfo selectMemberModification(String memberEmail) {
		logger.debug("{} : < memberEmail selectMemberModification() MemberDao", memberEmail);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectMemberModification", memberEmail);
	}
	
	// 회원 정보 조회
	public MemberInfo selectMemberInfo(String memberEmail) {
		logger.debug("{} : < memberEmail selectMemberInfo() MemberDao", memberEmail);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectMemberInfo", memberEmail);
	}
	
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
	
	// 이메일 중복 검사
	public int selectEmailOverlap(String memberEmail) {
		logger.debug("{} : < memberEmail selectEmailOverlap() MemberDao", memberEmail);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectEmailOverlap", memberEmail);
	}
	
	// 로그인 처리 (기업결제 정보)
	public MemberSessionByCompanyPayment selectSignInCompany(MemberSimple memberSimple) {
		logger.debug("{} : < comCode selectSignInCompany() MemberDao", memberSimple.getComCode());
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectSignInCompany",memberSimple);
	}
	
	// 로그인 처리 (개인이메일과 기업이메일 일치여부)
	public MemberSimple selectSignInEmailCheck(int comCode) {
		logger.debug("{} : < comCode selectSignInEmailCheck() MemberDao", comCode);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectSignInEmailCheck", comCode);
	}
	
	// 로그인 처리 (개인)
	public MemberSession selectSignInMember(MemberCheck memberCheck) {
		logger.debug("{} : < memberCheck selectSignInMember() MemberDao", memberCheck);
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectSignInMember", memberCheck);
	}
}