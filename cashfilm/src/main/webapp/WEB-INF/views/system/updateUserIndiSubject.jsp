<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>개인사용사 계정과목 수정</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/updateUserIndiSubject" method="post">
		<input type="hidden" name="userIndividualSubjectCode" value="${uis.userIndividualSubjectCode}">
		개인계정체계:
		<select name="individualSystemNumeral">
		   <c:forEach var="IndividualSystem" items="${syslist}">
	       	<option value="${IndividualSystem.individualSystemNumeral}">${IndividualSystem.individualSystemName}</option>
	       </c:forEach>
	    </select>
	    <br>
	   	 개인사용자 계정 과목명:<input type="text" name="userIndividualSubjectName" value="${uis.userIndividualSubjectName}">
	   	<br>
	        회원 이메일:
	    <input type="text" name="memberEmail" value="${uis.memberEmail}" readonly="readonly">
	    <br>  
	   	 개인 사용자 계정과목:<input type="text" name="userIndividualSubjectNumeral" value="${uis.userIndividualSubjectNumeral}">
	   	<input type="submit" value="수정"> 
	</form>
	
	


<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>