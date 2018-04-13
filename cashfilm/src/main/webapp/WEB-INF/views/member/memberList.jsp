<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/> --%>
<!--회원조회  -->
<table>
	<tr>
		<td>이메일</td>
		<td>회원구분</td>
		<td>이름</td>
		<td>상태</td>
	</tr>
	<c:forEach var="memberList" items="${memberList}">
		<tr>
			<td>${memberList.memberEmail}</td>
			<td>${memberList.memberClassificationName}</td>
			<td>${memberList.memberName}</td>
			<td>${memberList.memberCondition}</td>
		</tr>
	</c:forEach>
</table>
<%-- 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/> --%>