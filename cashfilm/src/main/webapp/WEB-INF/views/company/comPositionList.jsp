<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />

<table border=1>
	<tr>
		<th>부서 명</th>
	</tr>
	<c:forEach var="list" items="${list}">

			<tr>
				<td>
					${list.comPositionName}
				</td>
				<td>
				<a href="${pageContext.request.contextPath}/company/comPositionModification?comCode=${list.comCode}&comPositionCode=${list.comPositionCode}&comPositionnName=${list.comPositionName} " > 수정 
				</a> 
				</td>
				<td>
				<a href="${pageContext.request.contextPath}/company/?comCode=${list.comCode}&memberEmail=${list.memberEmail}&memberEmailApproval=${memberSession.memberEmail} " > 삭제 
				</a> 
				</td>
			</tr>
	</c:forEach>
</table>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>