<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<table border="1">
	  <tr>
	  	  <th>개인계정상세코드</th>
	  	  <th>개인계정과목코드</th>	
	      <th>개인계정과목명</th>
	      <th>개인사용자계정과목코드</th>
	      <th>개인사용자계정과목명</th>
	      <th>개인계정상세명</th>
	      <th>수정</th>
	      <th>삭제</th>
	  </tr>
	  <c:forEach var="IndividualSystemDetailAndSubjectAndUsubject" items="${isdlist}">
		  <tr>
		  	<td>${IndividualSystemDetailAndSubjectAndUsubject.individualSystemDetailCode}</td>
		    <td>${IndividualSystemDetailAndSubjectAndUsubject.individualSubjectNumeral}</td>
		    <td>${IndividualSystemDetailAndSubjectAndUsubject.individualSubjectName}</td>
		    <td>${IndividualSystemDetailAndSubjectAndUsubject.userIndividualSubjectCode}</td>
		    <td>${IndividualSystemDetailAndSubjectAndUsubject.userIndividualSubjectName}</td>
		    <td>${IndividualSystemDetailAndSubjectAndUsubject.individualSystemDetailName}</td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSystemDetail?individualSystemDetailCode=${IndividualSystemDetailAndSubjectAndUsubject.individualSystemDetailCode}">수정</a></td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/deleteIndividualSystemDetail?individualSystemDetailCode=${IndividualSystemDetailAndSubjectAndUsubject.individualSystemDetailCode}">삭제</a></td>
		  </tr>
	  </c:forEach>
	</table>
		
 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>