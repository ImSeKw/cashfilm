<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<table border="1">
	<tr>
		<td>회사계정체계명</td>
		<td>처음입력재무코드</td>
		<td>회사코드</td>
		<td>회사계정체계코드</td>
		<td>회원이메일</td>
		<td>금액</td>
		<td>결산년도</td>
	</tr>
	<c:forEach var="list" items="${FinanceListByCompany}">
		<tr>
			<td>${list.comSystemName}</td>
			<td>${list.financeCode}</td>
			<td>${list.comCode}</td>
			<td>${list.comSystemNumeral}</td>
			<td>${list.memberEmail}</td>
			<td>${list.financeAmount}</td>
			<td>${list.closingStatementCode}</td>
		</tr>
	</c:forEach>
</table>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>