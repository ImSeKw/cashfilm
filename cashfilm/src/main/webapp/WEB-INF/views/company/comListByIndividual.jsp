<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSimple" value="${memberSimple}"/>

<table>
	<c:forEach var="list" items="${list}">
		<tr>
			<td>
				${list.comCode}
			</td>
			<td>
				${list.comName}
			</td>
			<td>
				${list.comCeoName}
			</td>
			<td>
				${list.comRegistrationNumber}
			</td>
			<td>
				${list.comInfo}
			</td>
			<td>
				${list.comAddress}
			</td>
			<td>
				${list.comPhone}
			</td>
			<td>
				${list.comIndustry}
			</td>
			<td>
			<a href="${pageContext.request.contextPath}/company/comApprovalByIndividual?comCode=${list.comCode}&memberEmail=${memberSimple.memberEmail} " > 승인 요청
			</a>
			</td>
		</tr>
	</c:forEach>
</table>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>