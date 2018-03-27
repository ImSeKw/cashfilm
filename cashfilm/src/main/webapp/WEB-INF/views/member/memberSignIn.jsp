<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	<input type="text" name="memberEmail">
	<input type="text" name="memberPassword">
	<button type="submit">확인</button>
</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>