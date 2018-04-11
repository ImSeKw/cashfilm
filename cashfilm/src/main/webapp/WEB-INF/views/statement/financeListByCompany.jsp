<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	function appendYear(){
		var date = new Date();
		var year = date.getFullYear();
		var selectValue = document.getElementById("year");
		var optionIndex = -1;
		
		for(var i=year; i>=year-150; i--){
				selectValue.add(new Option(i+"년", i), optionIndex--);
		}
	}

	$(document).ready(function(){
		// 결산년도 생성
		appendYear();
		
		// 결산년도 선택 조회
		$(document).on("change", "#year", function() {
			var selectYear = $(this).val();
			$.ajax({
				url : "/cashfilm/statement/financeListByCompanyAjax"
				, type : "post"
				, datatype : "json"
				, data : {
					closingStatementCode : selectYear
					, comCode : ${memberSession.comCode}
				}
				, success : function(data){
					var tagform = '<tbody>';
					$.each(data, function(index, change){
						tagform += '<tr>';
						tagform += '<td>'+change.comSystemName+'</td>';
						tagform += '<td>'+change.financeCode+'</td>';
						tagform += '<td>'+change.comCode+'</td>';
						tagform += '<td>'+change.comSystemNumeral+'</td>';
						tagform += '<td>'+change.memberEmail+'</td>';
						tagform += '<td>'+change.financeAmount+'</td>';
						tagform += '<td>'+change.closingStatementCode+'</td>';
						tagform += '<td><button type="button" class="financeModificationButton" value="'+change.financeCode+'">수정</button></td>';
						tagform += '<td><button type="button" class="financeDeletionButton">삭제</button></td>';
						tagform += '</tr>';
					});
					tagform += '</tbody>';
					$("tbody").replaceWith(tagform);
				}
			});
		});
		
		// 처음 입력 재무 수정 화면
		$(document).on("click", ".financeModificationButton", function(){
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
								tagform += '<select id="comSystemNumeral" name="comSystemNumeral">';
								$.each(data2, function(index, comSystem){
									tagform += '<option value="'+comSystem.comSystemNumeral+'">'+comSystem.comSystemName+'</option>';
								});
								tagform += '</select>';
								tagform += '</td>';
								tagform += '<td><input type="hidden" id="financeCode" name="financeCode" value="'+elt.financeCode+'">'+elt.financeCode+'</td>';
								tagform += '<td>${memberSession.comCode}</td>';
								tagform += '<td>'+elt.comSystemNumeral+'</td>';
								tagform += '<td><input type="hidden" name="memberEmail" value="${memberSession.memberEmail}">${memberSession.memberEmail}</td>';
								tagform += '<td><input type="text" id="financeAmount" name="financeAmount" value="'+elt.financeAmount+'"></td>';
								tagform += '<td><input type="text" id="closingStatementCode" name="closingStatementCode" value="'+elt.closingStatementCode+'"></td>';
								tagform += '<td colspan="2"><button type="button" id="financeModificationSubmit">확인</button></td>';
								tagform += '</tr>';
								$(fmbthis).closest("tr").replaceWith(tagform);
							}
						});
					});
				}
				, error:function(request, status, error){
					alert("실패");
					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
				}
			});
		});
		
		// 처음 입력 재무 수정 확인
		$(document).on("click", "#financeModificationSubmit", function(){
			var memberEmail = $("input[name=memberEmail]").val();
			$.ajax({
				url : "/cashfilm/statement/financeModificationByCompanyAjax"
				, type : "post"
				, datatype : "json"
				, data : {
					comSystemNumeral : $("#comSystemNumeral").val()
					, financeCode : $("#financeCode").val()
					, comCode : ${memberSession.comCode}
					, financeAmount : $("#financeAmount").val()
					, closingStatementCode : $("#closingStatementCode").val()
					, memberEmail : memberEmail
				}
				, success : function(data){
					var tagform = '<tbody>';
					$.each(data, function(index, change){
						tagform += '<tr>';
						tagform += '<td>'+change.comSystemName+'</td>';
						tagform += '<td>'+change.financeCode+'</td>';
						tagform += '<td>'+change.comCode+'</td>';
						tagform += '<td>'+change.comSystemNumeral+'</td>';
						tagform += '<td>'+change.memberEmail+'</td>';
						tagform += '<td>'+change.financeAmount+'</td>';
						tagform += '<td>'+change.closingStatementCode+'</td>';
						tagform += '<td><button type="button" class="financeModificationButton" value="'+change.financeCode+'">수정</button></td>';
						tagform += '<td><button type="button" class="financeDeletionButton">삭제</button></td>';
						tagform += '</tr>';
					});
					tagform += '</tbody>';
					$("tbody").replaceWith(tagform);
				}
			});
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="comCode" value="${memberSession.comCode}"/>

<select id="year">
	<option>- 결산년도선택 -</option>
</select>

<form id="financeModification" action="${pageContext.request.contextPath}/statement/financeModificationByCompany" method="post">
	<input type="hidden" name="comCode" value="${memberSession.comCode}">
	<table border="1" id="selectAdd">
		<thead>
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
		</thead>
		<tbody>
			<c:forEach var="list" items="${FinanceListByCompany}" varStatus="status">
				<tr>
					<td>${list.comSystemName}</td>
					<td>${list.financeCode}</td>
					<td>${list.comCode}</td>
					<td>${list.comSystemNumeral}</td>
					<td>${list.memberEmail}</td>
					<td>${list.financeAmount}</td>
					<td>${list.closingStatementCode}</td>
					<td><button type="button" class="financeModificationButton" value="${list.financeCode}">수정</button></td>
					<td><button type="button" class="financeDeletionButton">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>