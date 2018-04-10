<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		// 처음 입력 재무 수정 화면
		$(".financeModificationButton").click(function(){
			var fmbthis = $(this);
			var fmbval = $(this).val();
			var comCode = ${memberSession.comCode};
			$.ajax({
				url : '/cashfilm/statement/financeListByCompanyAjax'
				, type : "post"
				, datatype : "json"
				, data : { 
					financeCode : fmbval
					, comCode : comCode
				}
				, success : function(data){
					$.each(data, function(i, elt) {
						$.ajax({
							url : '/cashfilm/statement/financeComSystemAjax'
							, type : "post"
							, datatype : "json"
							, success : function(data2){
								var tagform = '<tr>';
								tagform += '<td>';
								tagform += '<select name="comSystemNumeral">';
								$.each(data2, function(index, comSystem){
									tagform += '<option value="'+comSystem.comSystemNumeral+'">'+comSystem.comSystemName+'</option>';
								});
								tagform += '</select>';
								tagform += '</td>';
								tagform += '<td><input type="hidden" name="financeCode" value="'+elt.financeCode+'">'+elt.financeCode+'</td>';
								tagform += '<td>'+elt.comCode+'</td>';
								tagform += '<td>'+elt.comSystemNumeral+'</td>';
								tagform += '<td><input type="hidden" name="memberEmail" value="'+elt.memberEmail+'">'+elt.memberEmail+'</td>';
								tagform += '<td><input type="text" name="financeAmount" value="'+elt.financeAmount+'"></td>';
								tagform += '<td><input type="text" name="closingStatementCode" value="'+elt.closingStatementCode+'"></td>';
								tagform += '<td colspan="2"><button type="submit" id="financeModificationSubmit">확인</button></td>';
								tagform += '</tr>';
								$(fmbthis).closest("tr").replaceWith(tagform);
							}
						});
					});
				}
				, error:function(request,status,error){
					alert("실패");
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
				}
			});
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="comCode" value="${memberSession.comCode}"/>

<form id="financeModification" action="${pageContext.request.contextPath}/statement/financeModificationByCompany" method="post">
	<input type="hidden" name="comCode" value="${memberSession.comCode}">
	<table border="1" id="selectAdd">
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
			<tr>
				<td>${list.comSystemName}</td>
				<td>${list.financeCode}</td>
				<td class="test">${list.comCode}</td>
				<td>${list.comSystemNumeral}</td>
				<td>${list.memberEmail}</td>
				<td>${list.financeAmount}</td>
				<td>${list.closingStatementCode}</td>
				<td><button type="button" class="financeModificationButton" value="${list.financeCode}">수정</button></td>
				<td><button type="button" class="financeDeletionButton">삭제</button></td>
			</tr>
		</c:forEach>
	</table>
</form>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>