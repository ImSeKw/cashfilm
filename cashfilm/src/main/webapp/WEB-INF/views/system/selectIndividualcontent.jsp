<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<table border="1">
	  <tr>
	  	  <th>개인적요코드</th>	
	      <th>개인계정과목코드</th>
	      <th>개인계정과목명</th>
	      <th>개인사용자계정과목코드</th>
	      <th>개인사용자계정과목명</th>
	      <th>개인적요내용</th>
	      <th>회원이메일</th>
	      <th>등록날짜</th>
	      <th>수정</th>
	      <th>삭제</th>
	  </tr>
	  <c:forEach var="IndividualcontentAndSubAndUsub" items="${icsuslist}">
		  <tr>
		  	<td>${IndividualcontentAndSubAndUsub.individualContentCode}</td>
		  	<td>${IndividualcontentAndSubAndUsub.individualSubjectNumeral}</td>
		  	<td>${IndividualcontentAndSubAndUsub.individualSubjectName}</td>
		  	<td>${IndividualcontentAndSubAndUsub.userIndividualSubjectCode}</td>
		  	<td>${IndividualcontentAndSubAndUsub.userIndividualSubjectName}</td>
		  	<td>${IndividualcontentAndSubAndUsub.individualContentName}</td>
		    <td>${IndividualcontentAndSubAndUsub.memberEmail}</td>
		    <td>${IndividualcontentAndSubAndUsub.individualContentRegistrationDay}</td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/updateIndividualcontent?individualContentCode=${IndividualcontentAndSubAndUsub.individualContentCode}">수정</a></td>
		    <td><a href="${pageContext.request.contextPath}/IndividualSystem/deleteIndividualcontent?individualContentCode=${IndividualcontentAndSubAndUsub.individualContentCode}">삭제</a></td>
		  </tr>
	  </c:forEach>
	</table>
 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>