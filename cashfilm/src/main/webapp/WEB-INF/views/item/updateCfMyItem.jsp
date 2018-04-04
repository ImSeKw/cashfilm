<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<form action="${pageContext.request.contextPath}/item/updateCfMyItem" method="post">
	<input type="hidden" name="myItemCode" value="${item.myItemCode}">
	<input type="text" name="myItemName" id="myItemName" value="${item.myItemName}">
	<input type="text" name="myItemAmount" id="myItemAmount" value="${item.myItemAmount}">
	<input type="text" name="myItemExpiration" id="myItemExpiration" value="${item.myItemExpiration}">
	<br>
	<button type="submit" id="updateButton">수정</button>
	<button type="submit" id="cancelButton">취소</button>
</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>