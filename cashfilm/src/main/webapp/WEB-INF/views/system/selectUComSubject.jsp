<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사사용자계정과목</h1>
		<table border="1">
	  <tr>
	  	  <th>회사 사용자계정과목코드</th>
	  	  <th>회사계정체계코드</th>	
	      <th>회사계정체계명</th>
	      <th>회사코드</th>
	      <th>회사 사용자계정과목명</th>
	      <th>회원이메일</th>
	      <th>사용자계정과목코드</th>
	      <th>수정</th>
	      <th>삭제</th>
	  </tr>
	  <c:forEach var="ComSystemAndUSubject" items="${csysusublist}">
		  <tr>
		  	<td>${ComSystemAndUSubject.userComSubjectCode}</td>
		    <td>${ComSystemAndUSubject.comSystemNumeral}</td>
		    <td>${ComSystemAndUSubject.comSystemName}</td>
		    <td>${ComSystemAndUSubject.comCode}</td>
		    <td>${ComSystemAndUSubject.userComSubjectName}</td>
		    <td>${ComSystemAndUSubject.memberEmail}</td>
		    <td>${ComSystemAndUSubject.userComSubjectNumeral}</td>
		    <td><a href="${pageContext.request.contextPath}/ComSystem/updateUComSubject?userComSubjectCode=${ComSystemAndUSubject.userComSubjectCode}">수정</a></td>
		    <td><a href="${pageContext.request.contextPath}/ComSystem/deleteUComSubject?userComSubjectCode=${ComSystemAndUSubject.userComSubjectCode}">삭제</a></td>
		  </tr>
	  </c:forEach>
	</table>
	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>