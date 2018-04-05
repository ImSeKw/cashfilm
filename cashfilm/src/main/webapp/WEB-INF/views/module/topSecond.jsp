<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />

<c:choose>
	<c:when test="${empty memberSession.memberEmail}">
		<a href="${pageContext.request.contextPath}/member/signIn">로그인</a>
		<a href="${pageContext.request.contextPath}/member/signUp">회원가입</a>
	</c:when>
	<c:otherwise>
		<a href="${pageContext.request.contextPath}/member/signOut">로그아웃</a>
		<a href="${pageContext.request.contextPath}/member/memberInfo?memberEmail=${memberSession.memberEmail}">나의정보</a>
		<c:choose>
			<c:when test="${empty memberSession.comCode || memberSession.comCode == ''}">
				<a href="${pageContext.request.contextPath}/company/insertCompanyBaseInfo">회사등록</a>
				<a href="${pageContext.request.contextPath}/company/comListByIndividual">회사검색</a>
			</c:when>
			<c:otherwise>
				<a href="${pageContext.request.contextPath}/company/comInfo?comCode=${memberSession.comCode}">회사정보</a>
				<a href="${pageContext.request.contextPath}/company/comCustomerRegistration">거래처 등록</a>
				<a href="${pageContext.request.contextPath}/company/comCustomerList?comCode=${memberSession.comCode}">거래처 조회</a>
				<a href="${pageContext.request.contextPath}/company/comInfo?comCode=${memberSession.comCode}">회사정보</a>
				<a href="${pageContext.request.contextPath}/company/comInfo?comCode=${memberSession.comCode}">회사정보</a>
				<c:if test="${memberSession.comSystemChange eq 1 }">
					<a href="${pageContext.request.contextPath}//">회사체계변경입니다.공사중!!</a>
					<a href="${pageContext.request.contextPath}/company/comAuthorityApprovalList?comCode=${memberSession.comCode}&memberEmail=${memberSession.memberEmail}"> 사원 등록 요청 조회</a>
				
				</c:if>
			</c:otherwise>
		</c:choose>
		<c:if test="${memberSession.memberClassificationCode eq 1}">
			<a href="${pageContext.request.contextPath}/cashfilm/cashfilmControlTower?memberClassificationCode=${memberSession.memberClassificationCode}">관리자</a>
		</c:if>
	</c:otherwise>
</c:choose>

<br>

<a href="${pageContext.request.contextPath}/statement/financeListByCompany?comCode=${memberSession.comCode}">회사 처음 입력 재무 조회</a>

<br>

<table border="1">
	<tr>
		<td>이메일</td>
		<td>${memberSession.memberEmail}</td>
	</tr>
	<tr>
		<td>구분코드</td>
		<td>${memberSession.memberClassificationCode}</td>
	</tr>
	<tr>
		<td>구분명</td>
		<td>${memberSession.memberClassificationName}</td>
	</tr>
	<tr>
		<td>회사코드</td>
		<td>${memberSession.comCode}</td>
	</tr>
	<tr>
		<td>회사명</td>
		<td>${memberSession.comName}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${memberSession.memberName}</td>
	</tr>
	<tr>
		<td>회원상태</td>
		<td>${memberSession.memberCondition}</td>
	</tr>
	<tr>
		<td>회사체계변경</td>
		<td>${memberSession.comSystemChange}</td>
	</tr>
	<tr>
		<td>결제코드</td>
		<td>${memberSession.voucherPaymentCode}</td>
	</tr>
	<tr>
		<td>결제일</td>
		<td>${memberSession.voucherPaymentDay}</td>
	</tr>
	<tr>
		<td>상품코드</td>
		<td>${memberSession.myItemCode}</td>
	</tr>
	<tr>
		<td>상품명</td>
		<td>${memberSession.myItemName}</td>
	</tr>
	<tr>
		<td>이름 or 회사대표이름</td>
		<td>${memberSessionBCP.memberEmail}</td>
	</tr>
	<tr>
		<td>회사코드</td>
		<td>${memberSessionBCP.comCode}</td>
	</tr>
	<tr>
		<td>결제코드</td>
		<td>${memberSessionBCP.voucherPaymentCode}</td>
	</tr>
	<tr>
		<td>결제일</td>
		<td>${memberSessionBCP.voucherPaymentDay}</td>
	</tr>
	<tr>
		<td>상품코드</td>
		<td>${memberSessionBCP.myItemCode}</td>
	</tr>
	<tr>
		<td>상품명</td>
		<td>${memberSessionBCP.myItemName}</td>
	</tr>
</table>