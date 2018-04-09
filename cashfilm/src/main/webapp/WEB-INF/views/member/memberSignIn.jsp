<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<article id="main">


<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	관리자 : <input type="text" name="memberEmail" value="id001@naver.com">
	<input type="text" name="memberPassword" value="pw001">
	<button type="submit">확인</button>
</form>
	<br>
<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	기업 + 개인 : <input type="text" name="memberEmail" value="id011@naver.com">
	<input type="text" name="memberPassword" value="pw011">
	<button type="submit">확인</button>
</form>
	<br>
<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	기업회원 : <input type="text" name="memberEmail" value="samsung01@naver.com">
	<input type="text" name="memberPassword" value="samsung01">
	<button type="submit">확인</button>
</form>
	<br>
<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	개인회원 : <input type="text" name="memberEmail" value="id111@naver.com">
	<input type="text" name="memberPassword" value="pw111">
	<button type="submit">확인</button>
</form>
</article>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>