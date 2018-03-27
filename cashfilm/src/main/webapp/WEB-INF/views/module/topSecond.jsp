<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<c:set var="memberSimple" value="${memberSimple}"/>
<c:choose>
	<c:when test="${empty memberSimple.memberEmail}">
		<a href="${pageContext.request.contextPath}/member/signIn">로그인</a>
		<a href="${pageContext.request.contextPath}/member/signUp">회원가입</a>
	</c:when>
	<c:otherwise>
		<a href="">로그아웃</a>
		<a href="${pageContext.request.contextPath}/member/memberInfo?memberEmail=${memberSimple.memberEmail}">나의정보</a>
		<c:choose>
			<c:when test="${empty memberSimple.comCode || memberSimple.comCode == ''}">
				<a href="">회사등록</a>
				<a href="">회사검색</a>
			</c:when>
			<c:otherwise>
				<a href="">회사정보</a>
			</c:otherwise>
		</c:choose>
	</c:otherwise>
</c:choose>
