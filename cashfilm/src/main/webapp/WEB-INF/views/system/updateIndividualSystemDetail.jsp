<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>개인계정상세수정</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSystemDetail" method="post">
		<input type="hidden" name="individualSystemDetailCode" value=${isd.individualSystemDetailCode }>
		개인계정상세명:<input type="text" name="individualSystemDetailName" value=${isd.individualSystemDetailName }>
		<br>
		<input type="text" name="memberEmail" value=${isd.memberEmail}>
	    <input type="submit" value="수정"> 
 	</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>