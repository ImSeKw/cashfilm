<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<br>
회사 전표 및 거래 등록 화면
<br>

<ul>
	<c:forEach var="sc" items="${SCSCList}">
		<li>${sc.statementClassificationName}</li>
	</c:forEach>
</ul>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>