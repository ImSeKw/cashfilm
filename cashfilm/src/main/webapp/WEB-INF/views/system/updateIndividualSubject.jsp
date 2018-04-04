<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>계정과목수정</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSubject" method="post">
	<select name="individualSystemNumeral">
		<c:forEach var="IndividualSystem" items="${syslist}">
       <option value="${IndividualSystem.individualSystemNumeral}">${IndividualSystem.individualSystemName}</option>
       </c:forEach>
	</select>
	<input type="text" name="individualSubjectNumeral" value="${isubject.individualSubjectNumeral}">
	<input type="text" name="individualSubjectName" value="${isubject.individualSubjectName}">
	<input type="submit" value="등록"> 
	</form>
 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>