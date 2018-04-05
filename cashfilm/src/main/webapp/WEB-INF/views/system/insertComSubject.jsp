<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사계정과목 등록</h1>
	
	<form action="${pageContext.request.contextPath}/ComSubjct/insertComSubject" method="post">
		회사계정체계명:
		<select name="comSystemNumeral">
			<c:forEach var="ComSystem" items="${csyslist}">
	       		<option value="${ComSystem.comSystemNumeral}">${ComSystem.comSystemName}</option>
	       </c:forEach>
		</select>
		<br>
		회사계정과목코드:<input type="text" name="comSubjectNumeral" value="숫자를 입력하세요">
		<br>
		회사계정과목명:<input type="text" name="comSubjectName">
		<br>
		<input type="submit" value="등록"> 
	</form>
	<a href="${pageContext.request.contextPath}/ComSystem/selectComSubject">회사계정과목 전체검색</a><br>
	회사계정체계별 검색:
	<form action="${pageContext.request.contextPath}/ComSystem/selectComSubject?comSystemNumeral=${ComSystem.comSystemNumeral}" method="get">
		<select name="comSystemNumeral">
			<c:forEach var="ComSystem" items="${csyslist}">
	       		<option value="${ComSystem.comSystemNumeral}">${ComSystem.comSystemName}</option>
	       </c:forEach>
		</select>
		<input type="submit" value="검색"> 
	</form>
	<br>
	회사계정과목별검색:
	<form action="${pageContext.request.contextPath}/ComSystem/selectComSubjectKeyword?comSubjectName=${comSubjectName}" method="get">
		<input type="text" name="comSubjectName">
		<input type="submit" value="검색"> 
	</form>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
