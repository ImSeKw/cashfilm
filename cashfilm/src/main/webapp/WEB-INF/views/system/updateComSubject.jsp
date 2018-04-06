<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
		<h1>회사계정과목 수정</h1>
	<form action="${pageContext.request.contextPath}/ComSystem/updateComSubject" method="post">
		회사계정체계명:<input type="text" name="comSystemNumeral" value="${csub.comSystemNumeral}" readonly="readonly">
		<br>
		회사계정과목코드:<input type="text" name="comSubjectNumeral" value="${csub.comSubjectNumeral}" readonly="readonly">
		<br>
		회사계정과목명:<input type="text" name="comSubjectName" value="${csub.comSubjectName}">
		<br>
		<input type="submit" value="수정"> 
	</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>