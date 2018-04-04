<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

	<h1>계정체계</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/insertIndividualSystem" method="post">
	<input type="text" name="individualSystemName">
	<input type="submit" value="등록"> 
	</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>