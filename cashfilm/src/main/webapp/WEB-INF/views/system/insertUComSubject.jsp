<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사사용자계정과목등록</h1>
	<form action="${pageContext.request.contextPath}/ComSystem/insertUComSubject" method="post">
		회사계정체계명:
			<select name="comSystemNumeral">
				<c:forEach var="ComSystem" items="${csyslist}">
		       		<option value="${ComSystem.comSystemNumeral}">${ComSystem.comSystemName}</option>
		       </c:forEach>
			</select>
		<br>
		<c:set var="memberSession" value="${memberSession}"/>
		회사코드:<input type="text" name="comCode" value="${memberSession.comCode}" readonly="readonly">
		<br>
		회사 사용자계정과목명:<input type="text" name="userComSubjectName">
		<br>
		회원이메일:<input type="text" name="memberEmail" value="${memberSession.memberEmail}" readonly="readonly">
		<br>
		사용자계정과목코드:<input type="text" name="userComSubjectNumeral">
		<input type="submit" value="등록"> 
	
	</form>
	<a href="${pageContext.request.contextPath}/ComSystem/selectComSystem">회사 사용자 계정과목 검색</a>
	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
