<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />

<table border=1>
	<tr>
		<th>회원 이메일</th>
		<th>회원 이름</th>
		<th>부서 이름</th>
	</tr>
	<c:forEach var="list" items="${list}">
	
			<tr>
				<td>
					${list.memberEmail}
				</td>
				<td>
					${list.memberName}
				</td>
				<td>

				</td>
			</tr>

	</c:forEach>
	<c:forEach var="sectionList" items="${sectionList}">
				<SELECT NAME=sltSample SIZE=1>
			        <OPTION VALUE="${sectionList.comSectionName}">${sectionList.comSectionName}</OPTION>
			    </SELECT>
	</c:forEach>




<%-- 		<td>
		<a href="${pageContext.request.contextPath}/company/?comCode=${list.comCode}&memberEmail=${list.memberEmail}&memberEmailApproval=${memberSession.memberEmail} " > 승인 
		</a> 
		</td> --%>
			

</table>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>