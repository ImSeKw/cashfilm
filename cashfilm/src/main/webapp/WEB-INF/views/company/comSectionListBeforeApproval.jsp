<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />
	<script type="text/javascript">
		JQuery("#selectBox option:selected").val();
		JQuery("select[name=selectBox]").val()
		
		$(document).ready(function(){
			$("#insertButton").click(function(){
				$("#comcomcom").submit();
			});
		});
	</script>
	<form action = "${pageContext.request.contextPath}/company/comcomcom" method = "post" id = "comcomcom">
		<table border=1>
			<tr>
				<th>회원 이메일</th>
				<th>회원 이름</th>
				<th>부서 이름</th>
			</tr>
			<c:forEach var="list" items="${list}">
			
					<tr>
						<td>
							<input type="text" name ="memberEmail" id = "memberEmail" value="${list.memberEmail}" readonly>	
	
						</td>
						<td>
							<input type="text" name ="memberName" id = "memberName" value="${list.memberName}" readonly>	
							
						</td>
						<td>			
							<select id="selectBox" name="selectBox" SIZE=1>
								<OPTION VALUE="">선택</OPTION>
								<c:forEach var="sectionList" items="${sectionList}">
							        <OPTION VALUE="${sectionList.comSectionCode}">${sectionList.comSectionName}</OPTION>
							    </c:forEach>
		  
						    </select>
						</td>
						<td>
							<button type="button" id="insertButton" >확인</button>
						</td>
					</tr>
			</c:forEach>
		</table>
		
	
	<%-- 
		<a href="${pageContext.request.contextPath}/company/comcomcom?memberEmail=${list.memberEmail}&comSectionName=${sectionList.comSectionCode} " > 승인 
		</a>   --%>
	
	<%-- 		<td>
			<a href="${pageContext.request.contextPath}/company/?comCode=${list.comCode}&memberEmail=${list.memberEmail}&memberEmailApproval=${memberSession.memberEmail} " > 승인 
			</a> 
			</td> --%>
				
	
	
	</form>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>