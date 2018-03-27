<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberInfo" value="${memberInfo}"></c:set>
<table>
	<tr>
		<td>이메일</td>
		<td>이름</td>
		<td>휴대폰 식별 번호</td>
		<td>휴대폰 번호</td>
		<td>우편번호</td>
		<td>주소</td>
		<td>전화번호</td>
		<td>등급</td>
		<td>회사명</td>
		<td><td>
	</tr>
	<tr>
		<td>${memberInfo.memberEmail}</td>
		<td>${memberInfo.memberName}</td>
		<td>${memberInfo.memberPhoneFirst}</td>
		<td>${memberInfo.memberPhoneSecond}</td>
		<td>${memberInfo.memberPostalCode}</td>
		<td>${memberInfo.memberAddress}</td>
		<td>${memberInfo.memberPhone}</td>
		<td>${memberInfo.memberClassificationName}</td>
		<td>${memberInfo.comName}</td>
		<td><a href="${pageContext.request.contextPath}/member/memberModification">수정</a><td>
	</tr>
</table>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>