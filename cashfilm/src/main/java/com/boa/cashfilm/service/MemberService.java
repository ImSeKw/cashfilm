package com.boa.cashfilm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boa.cashfilm.dao.MemberDao;
import com.boa.cashfilm.member.dto.MemberCheck;
import com.boa.cashfilm.member.dto.MemberClassification;
import com.boa.cashfilm.member.dto.MemberDel;
import com.boa.cashfilm.member.dto.MemberInfo;
import com.boa.cashfilm.member.dto.MemberList;
import com.boa.cashfilm.member.dto.MemberSession;
import com.boa.cashfilm.member.dto.MemberSessionByCompanyPayment;
import com.boa.cashfilm.member.dto.MemberSignUp;
import com.boa.cashfilm.member.dto.MemberSimple;

@Service
@Transactional
public class MemberService {
	@Autowired
	MemberDao memberDao;
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	// 회원 구분 삭제
	public void deleteMemberClassification(int memberClassificationCode) {
		logger.debug("{} : < memberClassifcationCode deleteMemberClassification() MemberDao", memberClassificationCode);
		memberDao.deleteMemberClassification(memberClassificationCode);
	}
	
	// 회원 구분 수정
	public void updateMemberClassification(MemberClassification memberClassification) {
		logger.debug("{} : < memberClassification updateMemberClassification() MemberDao", memberClassification);
		memberDao.updateMemberClassification(memberClassification);
	}
	
	// 회원 구분 조회
	public List<MemberClassification> selectMemberClassification() {
		logger.debug("{} : < selectMemberClassification() MemberService");
		return memberDao.selectMemberClassification();
	}
	
	// 회원 구분 등록
	public void insertMemberClassification(String memberClassificationName) {
		logger.debug("{} : < memberClassificationName insertMemberClassification() MemberService", memberClassificationName);
		memberDao.insertMemberClassification(memberClassificationName);
	}
	
	// 회원 조회
	public List<MemberList> selectMemberList() {
		logger.debug("< selectMemberList() MemberService");
		return memberDao.selectMemberList();
	}
	
	// 회원 탈퇴 요청 승인
	public void updateMemberDel(Map map) {
		logger.debug("{} : < map updateMemberDel() MemberService", map);
		memberDao.updateMemberDel(map);
		map.get("memberEmail");
		// 이메일과 관련된 모든 정보 삭제 (회사사원일 경우 회사쪽 전표는 삭제 불가)
		// 만약 회사대표이메일이라면 모든 회사 정보 삭제
		// 순서
		// 1. 계정(검은색)
		// 2. 전표(보라색)
		// 3. 회사(초록색)
		// 4. 상품?
		// 5. 회원
	}
	
	// 회원 탈퇴 요청 조회
	public List<MemberDel> selectMemberDelList() {
		logger.debug("< selectMemberDelList() MemberService");
		List list = memberDao.selectMemberDelList();
		return list;
	}
	
	// 회원 탈퇴 요청
	public int insertMemberDel(MemberCheck memberCheck) {
		logger.debug("{} : memberCheck insertMemberDel() MemberService", memberCheck);
		return memberDao.insertMemberDel(memberCheck);
	}
	
	// 회원 탈퇴 체크 처리
	public int selectMemberDelCheck(MemberCheck memberCheck) {
		logger.debug("{} : < memberCheck selectMemberDelCheck() MemberService", memberCheck);
		return memberDao.selectMemberDelCheck(memberCheck);
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
		String memberEmail = memberSignUp.getMemberEmail();
		memberDao.insertSignUpOrders(memberEmail);
		int ordersCode = memberDao.selectSignUpOrders(memberEmail);
		memberDao.insertSignUpVoucherPayment(ordersCode);
	}

	// 이메일 중복 검사
	public int selectEmailOverlap(String memberEmail) {
		logger.debug("{} : < memberEmail selectEmailOverlap() MemberService", memberEmail);
		return memberDao.selectEmailOverlap(memberEmail);
	}

	// 로그인 처리
	public Map selectSignIn(MemberCheck memberCheck) {
		logger.debug("{} : < memberCheck selectSignIn() MemberService", memberCheck);
		Map sessionMap = new HashMap();
		MemberSession memberSession = memberDao.selectSignInMember(memberCheck);
		logger.debug("{} : > memberSession selectSignIn() MemberService", memberSession);
		logger.debug("{} : > comCode selectSignIn() MemberService", memberSession.getComCode());
		sessionMap.put("memberSession", memberSession);
		if(memberSession.getComCode() != 0) {
			MemberSimple memberSimple = memberDao.selectSignInEmailCheck(memberSession.getComCode());
			logger.debug("{} : > memberEmail selectSignIn() MemberService", memberSimple.getMemberEmail());
			MemberSessionByCompanyPayment memberSessionByCompanyPayment = memberDao.selectSignInCompany(memberSimple);
			sessionMap.put("memberSessionByCompanyPayment", memberSessionByCompanyPayment);
		}
		return sessionMap;
	}
}
