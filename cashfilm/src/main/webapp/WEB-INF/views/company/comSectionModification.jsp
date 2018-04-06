<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp" />
<jsp:include page="/WEB-INF/views/module/topSecond.jsp" />

<c:set var="memberSession" value="${memberSession}" />
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />

<script type="text/javascript">
	$(document).ready(function() {
		$("#updateButton").click(function() {
			$("#comSectionModification").submit();
		});
	});
</script>

<c:forEach var="list" items="${list}">
	<form
		action="${pageContext.request.contextPath}/company/comSectionModification"
		method="post" id="comSectionModification">

		<table border=1>
			<tr>
				<th>부서 코드</th>
				<th>부서 명</th>
			</tr>

			<tr>
				<td><input type="text" name="comSectionCode"
					id="comSectionCode" value="${list.comSectionCode}" readonly>
				</td>
				<td><input type="text" name="comSectionName"
					id="comSectionName" value="${list.comSectionName}"></td>
				<td><input type="hidden" name="comCode" id="comCode"
					value="${memberSession.comCode} "></td>
				<td>
					<button type="button" id="updateButton">수정</button>
				</td>
			</tr>

		</table>
	</form>
</c:forEach>
<jsp:include page="/WEB-INF/views/module/bottom.jsp" />