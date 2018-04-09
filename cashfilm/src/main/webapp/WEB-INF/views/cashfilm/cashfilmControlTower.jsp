<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

관리자 페이지

<a href="${pageContext.request.contextPath}/member/memberDelList">회원탈퇴 조회</a>
<br>
<a href="${pageContext.request.contextPath}/member/memberClassificationList">회원구분 조회</a>
<br>
<a href="${pageContext.request.contextPath}/member/memberList">회원 조회</a>
<br>
<a href="${pageContext.request.contextPath}/item/itemList">상품 조회</a>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>