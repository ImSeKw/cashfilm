<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사계정체계 </h1>
	<table border="1">
	  <tr>
	 	 <th>회사계정체계코드</th>
	 	 <th>회사계정체계명</th>
	     <th>수정</th>
	     <th>삭제</th>
	  </tr>
	  <c:forEach var="ComSystem" items="${csyslist}">
		  <tr>
		  	<td>${ComSystem.comSystemNumeral}</td>
		  	<td>${ComSystem.comSystemName}</td>
			<td><a href="${pageContext.request.contextPath}/ComSystem/updateComSystem?comSystemNumeral=${ComSystem.comSystemNumeral}">수정</a></td>
		    <td><a href="${pageContext.request.contextPath}/ComSystem/deleteComSystem?comSystemNumeral=${ComSystem.comSystemNumeral}">삭제</a></td>
		  </tr>
	  </c:forEach>
	</table>
	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>