<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사계정체계 수정</h1>
	<form action="${pageContext.request.contextPath}/ComSystem/updateComSystem" method="post">
	<input type="hidden" name="comSystemNumeral" value="${csys.comSystemNumeral}">
	회사계정체계명:<input type="text" name="comSystemName" value="${csys.comSystemName}">
	<br>
	<input type="submit" value="수정"> 
	</form>
		
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>