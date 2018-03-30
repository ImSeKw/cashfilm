<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>개인사용사 계정과목 등록</h1>
	<form action="${pageContext.request.contextPath}/IndividualSystem/insertUserIndiSubject" method="post">
		개인계정체계:
		<select name="individualSystemNumeral">
		   <c:forEach var="IndividualSystem" items="${syslist}">
	       	<option value="${IndividualSystem.individualSystemNumeral}">${IndividualSystem.individualSystemName}</option>
	       </c:forEach>
	    </select>
	    <br>
	   	 개인사용자 계정 과목명:<input type="text" name="userIndividualSubjectName">
	   	<br>
	        회원 이메일:<c:set var="memberSession" value="${memberSession}"/>
	    <input type="text" name="memberEmail" value="${memberSession.memberEmail}" readonly="readonly">
	    <br>  
	   	 개인 사용자 계정과목:<input type="text" name="userIndividualSubjectNumeral" value="숫자를 입력하세요">
	   	<input type="submit" value="등록"> 
	</form>
	<c:set var="memberSession" value="${memberSession}"/>
	<a href="${pageContext.request.contextPath}//IndividualSystem/selectUserIndiSubject?memberEmail=${memberSession.memberEmail}">내 계정과목조회</a></td>
	


<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>