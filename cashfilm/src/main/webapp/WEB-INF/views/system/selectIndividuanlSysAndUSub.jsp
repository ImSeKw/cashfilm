<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

	<table border="1">
	  <tr>
	  	  <th>사용자계정과목코드</th>	
	  	  <th>계정체계코드</th>	
	  	  <th>계정체계명</th>
	  	  <th>사용자계정과목명</th>	
	      <th>회원이메일</th>
	      <th>사용자계정과목</th>
	      <th>수정</th>
	      <th>삭제</th>
	  </tr>
	  <c:forEach var="IndividualSystemAndUSubject" items="${isuslist}">
		  <tr>
		  	<td>${IndividualSystemAndUSubject.userIndividualSubjectCode}</td>
		  	<td>${IndividualSystemAndUSubject.individualSystemNumeral}</td>
		  	<td>${IndividualSystemAndUSubject.individualSystemName}</td>
		    <td>${IndividualSystemAndUSubject.userIndividualSubjectName}</td>
		    <td>${IndividualSystemAndUSubject.memberEmail}</td>
		    <td>${IndividualSystemAndUSubject.userIndividualSubjectNumeral}</td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/updateUserIndiSubject?userIndividualSubjectCode=${IndividualSystemAndUSubject.userIndividualSubjectCode}">수정</a></td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/deleteUserIndiSubject?userIndividualSubjectCode=${IndividualSystemAndUSubject.userIndividualSubjectCode}">삭제</a></td>
		  </tr>
	  </c:forEach>
	</table>
 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>