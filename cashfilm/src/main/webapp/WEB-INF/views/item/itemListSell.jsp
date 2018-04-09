<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		$("#indiButton").click(function(){
			$.ajax({
				url : '/cashfilm/item/itemListSellAjax'
				, type : "post"
				, data : { indiOrCom : 0 }
				, datatype : "json" 
				, success : function(data){
					$("#indiOrComSelect").empty();
					$.each(data, function(i){
						$("#indiOrComSelect").append("<tr>" 
								+ "<td>" + data[i].myItemCode + "</td>"
								+ "<td>" + data[i].myItemName + "</td>"
								+ "<td>" + data[i].myItemAmount + "</td>"
								+ "<td>" + data[i].myItemExpiration + "</td>"
								+ "</tr>");
					})
				}
			});
		});
		$("#comButton").click(function(){
			$.ajax({
				url : '/cashfilm/item/itemListSellAjax'
				, type : "post"
				, data : { indiOrCom : 1 }
				, datatype : "json"
				, success : function(data){
					$("#indiOrComSelect").empty();
					$.each(data, function(i){
						$("#indiOrComSelect").append("<tr>" 
								+ "<td>" + data[i].myItemCode + "</td>"
								+ "<td>" + data[i].myItemName + "</td>"
								+ "<td>" + data[i].myItemAmount + "</td>"
								+ "<td>" + data[i].myItemExpiration + "</td>"
								+ "</tr>");
					})
				}
			});
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<button type="button" id="indiButton">개인</button>
<button type="button" id="comButton">기업</button>

<br>
<table id="indiOrComSelect" border="1">
	<c:forEach var="list" items="${MyItemSellList}">
	<tr>
		<td>${list.myItemCode}</td>
		<td>${list.myItemName}</td>
		<td>${list.myItemAmount}</td>
		<td>${list.myItemExpiration}</td>
	</tr>
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>