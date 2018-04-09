<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사적요 수정</h1>
	<form action="${pageContext.request.contextPath}/ComSystem/updateComContent" method="post">
		<input type="hidden" name="comContentCode" value="${cc.comContentCode}"readonly="readonly">
		<br>
		 회사계정과목코드:<input type="text" name="comSubjectNumeral" value="${cc.comSubjectNumeral}"readonly="readonly">
		<br>
		회사사용자계정과목코드:<input type="text" name="userComSubjectCode" value="${cc.userComSubjectCode}"readonly="readonly">
		<br>
		회사적요내용:<input type="text" name="comContentName" value="${cc.comContentName}">
		<br>
		회사코드:<input type="text" name="comCode" value="${cc.comCode}" readonly="readonly">
		<br>
		회원이메일:<input type="text" name="memberEmail" value="${cc.memberEmail}" readonly="readonly">
		<input type="submit" value="등록">
	</form>		
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>