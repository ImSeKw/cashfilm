<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<c:set var="memberEmail" value="memberEmail"/>
<c:set var="comCode" value="comCode"/>
<c:choose>
	<c:when test="${empty memberEmail}">
		<a href="">로그인</a>
		<a href="">회원가입</a>
	</c:when>
	<c:otherwise>
		<a href="">로그아웃</a>
		<a href="">나의정보</a>
		<c:when test="${comCode ne null \\ comCode != ''}">
			<a href="">회사정보</a>
		</c:when>
		<c:otherwise>
			<a href="">회사등록</a>
			<a href="">회사검색</a>
		</c:otherwise>
	</c:otherwise>
</c:choose>
