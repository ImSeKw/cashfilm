<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<table>
	<c:forEach var="mcl" items="${memberClassificationList}">
		<tr>
			<td>${mcl.memberClassificationName}</td>
			<form action="${pageContext.request.contextPath}/member/memberClassificationModification" method="post">
				<input type="hidden" name="memberClassificationCode" value="${mcl.memberClassificationCode}">
				<td><input type="text" name="memberClassificationName"></td>
				<td><button type="submit">수정</button></td>
			</form>
			<td><a href="${pageContext.request.contextPath}/member/memberClassificationDeletion?memberClassificationCode=${mcl.memberClassificationCode}">삭제</a></td>
		</tr>
	</c:forEach>
</table>
<a data-toggle="collapse" href="#collapse1">추가</a>
<div id="collapse1" class="panel-collapse collapse">
	<form action="${pageContext.request.contextPath}/member/memberClassificationRegistration" method="get">
		<input type="text" name="memberClassificationName">
		<button type="submit">등록</button>
	</form>
</div>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>