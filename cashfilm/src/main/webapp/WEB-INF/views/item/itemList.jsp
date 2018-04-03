<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	
<div>
	<table border="1">
		<tbody>
			<c:forEach var="list" items="${list}">
			<input type="checkbox" class="test" name="myItemCode" value="${list.myItemCode}">
				<tr>
					<td>${list.myItemName}</td>
					<td>${list.myItemAmount}</td>
					<td>${list.myItemExpiration}</td>
					<td>
						<a href="${pageContext.request.contextPath}/item/updateCfMyItem?myItemCode=${list.myItemCode}">수정</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath}/item/deleteCfMyItem?myItemCode=${list.myItemCode}">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="${pageContext.request.contextPath}/item/insertCfMyItem" role="button">추가</a>
</div>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>