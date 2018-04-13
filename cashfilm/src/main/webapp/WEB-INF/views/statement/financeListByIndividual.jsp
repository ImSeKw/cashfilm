<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

	<script>
	//처음 입력 재무 수정 화면
	$(document).on("click", ".financeModificationButton", function(){
		var fmbthis = $(this);
		var fmbval = $(this).val();
		var memberEmail = ${memberSession.memberEmail};
		$.ajax({
			url : '/cashfilm/statement/financeListByIndiAjax'
			, type : "post"
			, datatype : "json"
			, data : { 
				financeCode : fmbval
				, memberEmail : memberEmail
			}
			, success : function(data){
				$.each(data, function(i, elt) {
					$.ajax({
						url : '/cashfilm/statement/financeIndiSystemAjax'
						, type : "post"
						, datatype : "json"
						, success : function(data2){
							var tagform = '<tr>';
							tagform += '<td>';
							tagform += '<select id="individualSystemNumeral" name="individualSystemNumeral">';
							$.each(data2, function(index, IndividualSystem){
								tagform += '<option value="'+IndividualSystem.individualSystemNumeral+'">'+IndividualSystem.individualSystemName+'</option>';
							});
							tagform += '</select>';
							tagform += '</td>';
							tagform += '<td><input type="hidden" id="financeCode" name="financeCode" value="'+elt.financeCode+'">'+elt.financeCode+'</td>';
							tagform += '<td>${memberSession.memberEmail}</td>';
							tagform += '<td>'+elt.individualSystemNumeral+'</td>';
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
				individualSystemNumeral : $("#individualSystemNumeral").val()
				, memberEmail : $("#memberEmail").val()
				, financeCode : $("#financeCode").val()
				, financeAmount : $("#financeAmount").val()
				, closingStatementCode : $("#closingStatementCode").val()
			}
			, success : function(data){
				var tagform = '<tbody>';
				$.each(data, function(index, change){
					tagform += '<tr>';
					tagform += '<td>'+change.comSystemName+'</td>';
					tagform += '<td>'+change.financeCode+'</td>';
					tagform += '<td>'+change.memberEmail+'</td>';
					tagform += '<td>'+change.comSystemNumeral+'</td>';
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
	</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberEmail" value="${memberSession.memberEmail}"/>
<article id="main">
<form id="financeModification" action="${pageContext.request.contextPath}/statement/financeListByIndiAjax" method="post">
	<input type="hidden" name="memberEmail" value="${memberSession.memberEmail}">
	<table border="1" id="selectAdd">
		<thead>
			<tr>
				<td>개인계정체계명</td>
				<td>처음입력재무코드</td>
				<td>개인계정체계코드</td>
				<td>회원이메일</td>
				<td>금액</td>
				<td>결산년도</td>
				<td colspan="2"></td>
			</tr>
		</thead>
		<tbody>	
			<c:forEach var="StatementIndividualList" items="${silist}" varStatus="status">
				<tr>
					<td>${StatementIndividualList.individualSystemName}</td>
					<td>${StatementIndividualList.financeCode}</td>
					<td>${StatementIndividualList.individualSystemNumeral}</td>
					<td>${StatementIndividualList.memberEmail}</td>
					<td>${StatementIndividualList.financeAmount}</td>
					<td>${StatementIndividualList.closingStatementCode}</td>
					<td><button type="button" class="financeModificationButton" value="${StatementIndividualList.financeCode}">수정</button></td>
					<td><button type="button" id="financeDeletionButton">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>	
	</table>
</form>	
</article>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>