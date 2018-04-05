<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사계정체계 등록</h1>
	<form action="${pageContext.request.contextPath}/ComSystem/insertComSystem" method="post">
	회사계정체계명:<input type="text" name="comSystemName">
	<br>
	<input type="submit" value="등록"> 
	</form>
	<a href="${pageContext.request.contextPath}/ComSystem/selectComSystem">회사계정체계 검색</a>
	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
