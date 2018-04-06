<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>회사계정과목 </h1>
	<table border="1">
	  <tr>
	 	 <th>회사계정체계코드</th>
	 	 <th>회사계정체계명</th>
	 	 <th>회사계정과목코드</th>
	 	 <th>회사계정과목명</th>
	     <th>수정</th>
	     <th>삭제</th>
	  </tr>
	  <c:forEach var="ComSystemAndSubject" items="${csyssublist}">
	  			  <tr>
				  	<td>${ComSystemAndSubject.comSystemNumeral}</td>
				  	<td>${ComSystemAndSubject.comSystemName}</td>
				  	<td>${ComSystemAndSubject.comSubjectNumeral}</td>
				  	<td>${ComSystemAndSubject.comSubjectName}</td>
					<td><a href="${pageContext.request.contextPath}/ComSystem/updateComSubject?comSubjectNumeral=${ComSystemAndSubject.comSubjectNumeral}">수정</a></td>
				    <td><a href="${pageContext.request.contextPath}/ComSystem/deleteComSubject?comSubjectNumeral=${ComSystemAndSubject.comSubjectNumeral}">삭제</a></td>
				  </tr>
			      			  
	  </c:forEach>
	</table>
	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>