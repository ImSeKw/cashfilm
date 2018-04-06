<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사사용자계정과목수정</h1>
	
	<form action="${pageContext.request.contextPath}/ComSystem/updateUComSubject" method="post">
		<input type="hidden" name="userComSubjectCode" value="${ucsub.userComSubjectCode}" readonly="readonly">
		회사계정체계코드:	<input type="text" name="comSystemNumeral" value="${ucsub.comSystemNumeral}" readonly="readonly">
		<br>
		회사코드:<input type="text" name="comCode" value="${ucsub.comCode}" readonly="readonly">
		<br>
		회사 사용자계정과목명:<input type="text" name="userComSubjectName" value="${ucsub.userComSubjectName} ">
		<br>
		회원이메일:<input type="text" name="memberEmail" value="${ucsub.memberEmail}" readonly="readonly">
		<br>
		사용자계정과목코드:<input type="text" name="userComSubjectNumeral" value="${ucsub.userComSubjectNumeral}" >
		<input type="submit" value="수정"> 
	</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
