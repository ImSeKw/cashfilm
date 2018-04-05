<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />

<table border=1>
	<tr>
		<th>요청 이메일</th>
		<th>요청 이름</th>
		<th>승인여부</th>
		<th>요청 회사1</th>
	</tr>
	<c:forEach var="list" items="${list}">
		<tr>
			<td>
				${list.memberEmail}
			</td>
			<td>
				${list.memberName}
			</td>
			<td>
				${list.comAuthorityApproval}
			</td>
			
			<td>
				${list.comCode}
			</td>
			<td>
			<a href="${pageContext.request.contextPath}/company/comAuthorityApprovalByMember?comCode=${list.comCode}&memberEmail=${list.memberEmail}&memberEmailApproval=${memberSession.memberEmail} " > 승인 
			</a> 
			</td>
		</tr>
	</c:forEach>
</table>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>