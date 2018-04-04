<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>개인적요수정</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/updateIndividualcontent" method="post">
		<input type="hidden" name="individualContentCode" value="${icsus.individualContentCode}" readonly="readonly">
		<input type="hidden" name="individualSubjectNumeral" value="${icsus.individualSubjectNumeral}" readonly="readonly">
		개인계정과목:
		<input type="text" name="individualSubjectName" value="${icsus.individualSubjectName}" readonly="readonly">
		<input type="hidden" name="userIndividualSubjectCode" value="${icsus.userIndividualSubjectCode}" readonly="readonly">
		<br>
		개인사용자계정과목:
		<input type="text" name="userIndividualSubjectName" value="${icsus.userIndividualSubjectName}" readonly="readonly">		
		<br>
		개인적요내용:
		<input type="text" name="individualContentName" value="${icsus.individualContentName}">
		<br>
		 회원 이메일:
		 <c:set var="memberSession" value="${memberSession}"/>
		<input type="text" name="memberEmail" value="${memberSession.memberEmail}" readonly="readonly">
		<br>
		<input type="submit" value="수정"> 
	</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>