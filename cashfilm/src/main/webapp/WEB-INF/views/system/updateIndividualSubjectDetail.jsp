<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>개인계정과목세부 수정</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSubjectDetail" method="post">
	개인계정과목세부코드:<input type="hidden" name="individualSubjectDetailNumeral" value="${isd.individualSubjectDetailNumeral}">
	개인계정과목:<select name="individualSubjectNumeral">
		<c:forEach var="IndividualSubject" items="${list}">
       		<option value="${IndividualSubject.individualSubjectNumeral}">${IndividualSubject.individualSubjectName}</option>
        </c:forEach>
	</select>
	<br>
	개인계정과목세부명:<input type="text" name="individualSubjectDetailName" value="${isd.individualSubjectDetailName}">
	<br>
	개인계정과목세부내용:<input type="text" name="individualSubjectDetailContent" value="${isd.individualSubjectDetailContent}">
	<br>
	<input type="submit" value="수정"> 
	</form>
	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
