<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<form action="${pageContext.request.contextPath}/IndividualSystem/selectIndividualSubjectOfSystem" method="post">
		<select name="individualSystemNumeral">
			<c:forEach var="IndividualSystem" items="${syslist}">
	       <option value="${IndividualSystem.individualSystemNumeral}">${IndividualSystem.individualSystemName}</option>
	       </c:forEach>
	    </select>
	    <input type="submit" value="검색"> 
 	</form>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>