<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script type="text/javascript">
	$(document).ready(function(){
		$("#signUpButton").click(function(){
			$("#signUp").submit();
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<form id="signUp" action="${pageContext.request.contextPath}/member/signUp" method="post">
	이메일 : <input type="email" name="memberEmail">
	이름 : <input type="text" name="memberName">
	비밀번호 : <input type="password" name="memberPassword">
	휴대폰 식별 번호 : <input type="text" name="memberPhoneFirst">
	휴대폰 번호 : <input type="text" name="memberPhoneSecond">
	우편번호 : <input type="text" name="memberPostalCode">
	주소 : <input type="text" name="memberAddress">
	실명인증여부 : <input type="number" name="memberCertification">
	전화번호 : <input type="tel" name="memberPhone">
</form>
<button type="button" id="signUpButton">확인</button>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>