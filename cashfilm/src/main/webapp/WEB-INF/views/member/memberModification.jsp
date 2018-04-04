<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		$("#memberModificationButton").click(function(){
			$("#memberModification").submit();
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberInfo" value="${memberInfo}" />
<form id="memberModification" action="${pageContext.request.contextPath}/member/memberModification" method="post">
	<table>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="memberEmail" value="${memberInfo.memberEmail}" readonly></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="memberName" value="${memberInfo.memberName}"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="memberPassword" value="${memberInfo.memberPassword}"></td>
		</tr>
		<tr>
			<td>휴대폰 식별 번호</td>
			<td><input type="text" name="memberPhoneFirst" value="${memberInfo.memberPhoneFirst}"></td>
		</tr>
		<tr>
			<td>휴대폰 번호</td>
			<td><input type="text" name="memberPhoneSecond" value="${memberInfo.memberPhoneSecond}"></td>
		</tr>
		<tr>
			<td>우편번호</td>
			<td><input type="text" name="memberPostalCode" value="${memberInfo.memberPostalCode}"></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="memberAddress" value="${memberInfo.memberAddress}"></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" name="memberPhone" value="${memberInfo.memberPhone}"></td>
		</tr>
	</table>
</form>
<button type="button" id="memberModificationButton">확인</button>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>