<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		$("#memberDelApprovalButton").click(function(){
			$("#memberDelApproval").submit();
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<table>
	<c:forEach var="mdl" items="${memberDelList}">
		<tr>
			<td>회원탈퇴 요청 이메일</td>
			<td>${mdl.memberEmail}</td>
		</tr>
		<tr>
			<td>회원탈퇴 요청일</td>
			<td>${mdl.memberDelRequestDay}</td>
		</tr>
		<tr>
			<td>회원탈퇴 사유</td>
			<td>${mdl.memberDelReason}</td>
		</tr>
		<tr>
			<td>회원탈퇴일</td>
			<td>${mdl.memberDelDay}</td>
		</tr>
		<tr>
			<td>회원탈퇴 승인 이메일</td>
			<td>${mdl.memberDelApprovalEmail}</td>
		</tr>
		<tr>
			<td></td>
			<td>
				<form id="memberDelApproval" action ="${pageContext.request.contextPath}/member/memberDelApproval" method="post">
					<input type="hidden" name="memberEmail" value="${mdl.memberEmail}">
					<input type="hidden" name="memberDelRequestDay" value="${mdl.memberDelRequestDay}">
					<input type="hidden" name="memberDelApprovalEmail" value="${memberSession.memberEmail}">
				<button type="button" id="memberDelApprovalButton">승인</button>
				</form>
			</td>
		</tr>
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>