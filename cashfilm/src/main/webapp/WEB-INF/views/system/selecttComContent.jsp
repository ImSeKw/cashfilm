<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사적요 </h1>
	<table border="1">
	  <tr>
	 	 <th>회사적요코드</th>
	 	 <th>회사계정과목코드</th>
	 	 <th>회사계정과목명</th>
	 	 <th>회사사용자계정과목코드</th>
	 	 <th>회사사용자계정과목명</th>
	 	 <th>회사적요명</th>
	 	 <th>회사코드</th>
	 	 <th>회원이메일</th>
	 	 <th>회사적요등록날짜</th>
	 	 <th>수정</th>
	     <th>삭제</th>
	  </tr>
	  <c:forEach var="ComContentAndSubUsub" items="${ccsubusublist}">
		<tr>
		  	<td>${ComContentAndSubUsub.comContentCode}</td>
		  	<td>${ComContentAndSubUsub.comSubjectNumeral}</td>
		  	<td>${ComContentAndSubUsub.comSubjectName}</td>
		  	<td>${ComContentAndSubUsub.userComSubjectCode}</td>
		  	<td>${ComContentAndSubUsub.userComSubjectName}</td>
		  	<td>${ComContentAndSubUsub.comContentName}</td>
		  	<td>${ComContentAndSubUsub.comCode}</td>
		  	<td>${ComContentAndSubUsub.memberEmail}</td>
		  	<td>${ComContentAndSubUsub.comContentRegistrationDay}</td>
			<td><a href="${pageContext.request.contextPath}/ComSystem/updateComContent?comContentCode=${ComContentAndSubUsub.comContentCode}">수정</a></td>
	    	<td><a href="${pageContext.request.contextPath}/ComSystem/deleteComContent?comContentCode=${ComContentAndSubUsub.comContentCode}">삭제</a></td>
	  	</tr>
			      			  
	  </c:forEach>
	</table>

	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>