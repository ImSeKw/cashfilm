<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		var tag = '<tr>';
		tag += '<td>';
		tag += '<select>';
		tag += '<c:forEach var="list" items="${comSystemList}">';
		tag += '<option value="${list.comSystemNumeral}">${list.comSystemName}</option>';
		tag += '</c:forEach>';
		tag += '</select>';
		tag += '</td>';
		tag += '<td><input type="text" name="financeAmount"></td>';
		tag += '<td><input type="date" name="closingStatementCode"></td>';
		tag += '</tr>';
		$("#selectAddButton").click(function(){
			$("#selectAdd").append(tag);
		});
		$("#financeRegistrationBCButton").click(function(){
			$("#financeRegistrationBC").submit();
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<div id="test">
	<button type="button" id="testButton">추가</button>
</div>

<form id="financeRegistrationBC" action="/statement/financeRegistrationByCompany" method="post">
	<table id="selectAdd">
		<tr>
			<td>계정체계명</td>
			<td>금액</td>
			<td>결산년도</td>
		</tr>
		<tr>
			<td>
				<select>
					<c:forEach var="list" items="${comSystemList}">
						<option name="comSystemNumeral" value="${list.comSystemNumeral}">${list.comSystemName}</option>
					</c:forEach>
				</select>
			</td>
			<td><input type="text" name="financeAmount"></td>
			<td><input type="date" name="closingStatementCode"></td>
		</tr>
	</table>
	<button type="button" id="selectAddButton">추가</button>
	<button type="button" id="financeRegistrationBCButton">등록</button>
</form>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>