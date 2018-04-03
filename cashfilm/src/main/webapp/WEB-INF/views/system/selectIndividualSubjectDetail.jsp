<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	
	<c:set var="individualSubjectDetailName" value="${isd.individualSubjectDetailName}" />
		<c:choose>
			 <c:when test="${empty individualSubjectDetailName}">
      			<table border="1">
				  <tr>
				  	  <th>개인계정과목세부코드</th>	
				      <th>개인계정과목</th>
				      <th>개인계정과목세부명</th>
				      <th>개인계정과목세부내용</th>
				      <th>수정</th>
				      <th>삭제</th>
				  </tr>
				  <c:forEach var="IndividualSubjectDetail" items="${isdlist}">
					  <tr>
					  	<td>${IndividualSubjectDetail.individualSubjectDetailNumeral}</td>
					    <td>${IndividualSubjectDetail.individualSubjectNumeral}</td>
					    <td>${IndividualSubjectDetail.individualSubjectDetailName}</td>
					    <td>${IndividualSubjectDetail.individualSubjectDetailContent}</td>
					    <td><a href="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSubjectDetail?individualSubjectDetailNumeral=${IndividualSubjectDetail.individualSubjectDetailNumeral}">수정</a></td>
					    <td><a href="${pageContext.request.contextPath}/IndividualSystem/deleteIndividualSubjectDetail?individualSubjectDetailNumeral=${IndividualSubjectDetail.individualSubjectDetailNumeral}">삭제</a></td>
					  </tr>
				  </c:forEach>
				</table>
    		 </c:when>
		    <c:otherwise>
		    	<table border="1">
				  <tr>
				  	  <th>개인계정과목세부코드</th>	
				      <th>개인계정과목</th>
				      <th>개인계정과목세부명</th>
				      <th>개인계정과목세부내용</th>
				      <th>수정</th>
				      <th>삭제</th>
				  </tr>
				  <tr>
					  	<td>${isd.individualSubjectDetailNumeral}</td>
					    <td>${isd.individualSubjectNumeral}</td>
					    <td>${isd.individualSubjectDetailName}</td>
					    <td>${isd.individualSubjectDetailContent}</td>
					    <td><a href="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSubjectDetail?individualSubjectDetailNumeral=${isd.individualSubjectDetailNumeral}">수정</a></td>
					    <td><a href="${pageContext.request.contextPath}/IndividualSystem/deleteIndividualSubjectDetail?individualSubjectDetailNumeral=${isd.individualSubjectDetailNumeral}">삭제</a></td>
				  </tr>
				</table>
		   </c:otherwise>
		</c:choose>

	
 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>