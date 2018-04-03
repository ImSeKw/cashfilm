<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		var tag = '<input type="text">';
		$("#testButton").click(function(){
			$("#test").append(tag);
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<div id="test">
	<button type="button" id="testButton">추가</button>
</div>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>