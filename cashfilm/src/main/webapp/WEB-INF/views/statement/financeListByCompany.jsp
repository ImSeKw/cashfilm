<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		$("button").click(function(){
			var fmb = $(this).val();
			var comCode = ${memberSession.comCode}
			alert(fmb);
			$.ajax({
				url : '/cashfilm/statement/financeListByCompanyAjax'
				, type : "post"
				, data : { 
					financeCode : fmb
					, comCode : comCode
				}
				, success : function(data){
					alert("success");
				}
				, error:function(request,status,error){
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
				}
			});
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="comCode" value="${memberSession.comCode}"/>

<table border="1">
	<tr>
		<td>회사계정체계명</td>
		<td>처음입력재무코드</td>
		<td>회사코드</td>
		<td>회사계정체계코드</td>
		<td>회원이메일</td>
		<td>금액</td>
		<td>결산년도</td>
		<td colspan="2"></td>
	</tr>
	<c:forEach var="list" items="${FinanceListByCompany}" varStatus="status">
		<tr id="financeResult">
			<td>${list.comSystemName}</td>
			<td>${list.financeCode}</td>
			<td>${list.comCode}</td>
			<td>${list.comSystemNumeral}</td>
			<td>${list.memberEmail}</td>
			<td>${list.financeAmount}</td>
			<td>${list.closingStatementCode}</td>
			<td><button type="button" class="financeModificationButton" id="${list.financeCode}" value="${list.financeCode}">수정</button></td>
			<td><button type="button" id="financeDeletionButton${status.index}">삭제</button></td>
		</tr>
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>