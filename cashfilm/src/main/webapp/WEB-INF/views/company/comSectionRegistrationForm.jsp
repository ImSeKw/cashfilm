<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />
	<script type="text/javascript">
	$(document).ready(function(){
		$("#insertButton").click(function(){
			$("#comSectionRegistration").submit();
		});
	});
	</script>

	<form action = "${pageContext.request.contextPath}/company/comSectionRegistration" method = "post" id = "comSectionRegistration">
		<input type="text" name ="comCode" id = "comCode" value="${memberSession.comCode}" hidden="" >	
		<br>	
		부서 명 : <input type="text" name ="comSectionName" id = "comSectionName" >	
		<br>
		<button type="button" id="insertButton" >등록
		</button>
	</form>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
