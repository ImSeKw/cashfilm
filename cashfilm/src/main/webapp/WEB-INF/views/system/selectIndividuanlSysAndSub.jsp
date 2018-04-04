<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

	<table border="1">
	  <tr>
	  	  <th>계정체계코드</th>	
	  	  <th>계정체계명</th>
	  	  <th>계정과목코드</th>	
	      <th>계정과목명</th>
	      <th>수정</th>
	      <th>삭제</th>
	  </tr>
	  <c:forEach var="IndividualSystemAndSubject" items="${indisysandsub}">
		  <tr>
		  	<td>${IndividualSystemAndSubject.individualSystemNumeral}</td>
		  	<td>${IndividualSystemAndSubject.individualSystemName}</td>
		  	<td>${IndividualSystemAndSubject.individualSubjectNumeral}</td>
		    <td>${IndividualSystemAndSubject.individualSubjectName}</td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSubject?individualSubjectNumeral=${IndividualSubject.individualSubjectNumeral}">수정</a></td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/deleteIndividualSubject?individualSubjectNumeral=${IndividualSubject.individualSubjectNumeral}">삭제</a></td>
		  </tr>
	  </c:forEach>
	</table>
 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>