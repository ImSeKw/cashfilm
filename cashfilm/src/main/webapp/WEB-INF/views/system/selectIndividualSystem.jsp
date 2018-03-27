<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

	<table border="1">
	  <tr>
	      <th>계정체계명</th>
	      <th>수정</th>
	      <th>삭제</th>
	  </tr>
	  <c:forEach var="IndividualSystem" items="${list}">
		  <tr>
		    <td>${IndividualSystem.individualSystemName}</td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSystem?individualSystemNumeral=${IndividualSystem.individualSystemNumeral}">수정</a></td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/deleteIndividualSystem?individualSystemNumeral=${IndividualSystem.individualSystemNumeral}">삭제</a></td>
		  </tr>
	  </c:forEach>
	</table>

 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>