<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>개인계정과목세부 등록</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/insertIndividualSubjectDetail" method="post">
	개인계정과목:<select name="individualSubjectNumeral">
		<c:forEach var="IndividualSubject" items="${list}">
      		 <option value="${IndividualSubject.individualSubjectNumeral}">${IndividualSubject.individualSubjectName}</option>
        </c:forEach>
	</select>
	<br>
	개인계정과목세부명:<input type="text" name="individualSubjectDetailName">
	<br>
	개인계정과목세부내용:<input type="text" name="individualSubjectDetailContent">
	<br>
	<input type="submit" value="등록"> 
	</form>
	<form action="${pageContext.request.contextPath}/IndividualSystem/selectIndividualSubjectDetail" method="post">
		개인계정과목 세부명 검색:<input type="text" name="individualSubjectDetailName">	
		<input type="submit" value="검색"> 
	</form>
	<a href="${pageContext.request.contextPath}/IndividualSystem/selectIndividualSubjectDetail">개인계정과목세부 전체검색</a></td>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
