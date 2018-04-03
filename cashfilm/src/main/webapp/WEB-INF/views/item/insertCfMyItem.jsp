<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function() {
		$('#insertCfMyItemButton').click(function() {
			if ($('#myItemName').val() == '') {
				alert('상품명을 입력해주세요.')
				$('#myItemName').focus();
			} else {
				$('#itemAdd').submit();	
			}
		})
		/* 취소버튼 경로 설정 */
		$('#cancelCfMyItemButton').click(function(){
			document.location.href="<%= request.getContextPath() %>/item/itemList"
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<h1>상품등록</h1>
<form action="${pageContext.request.contextPath}/item/insertCfMyItem" method="post" id="itemAdd">
	<input type="text" name="myItemName" id="myItemName">
	<input type="text" name="myItemAmount" id="myItemAmount">
	<input type="text" name="myItemExpiration" id="myItemExpiration">
	<button type="button" id="insertCfMyItemButton">등록</button>
	<button type="button" id=cancelCfMyItemButton>취소</button>
</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>