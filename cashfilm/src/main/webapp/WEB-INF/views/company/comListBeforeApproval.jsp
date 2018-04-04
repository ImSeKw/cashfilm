<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />

<table border=1>
	<tr>
		<th>회사코드</th>
		<th>회사이름</th>
		<th>사업자등록번호</th>
		<th>웹주소</th>
		<th>회사대표자명</th>
		<th>회사정보</th>
		<th>회사소개</th>
		<th>회사주소</th>
		<th>회사전화번호</th>
		<th>회사개설신청이메일</th>
		<th>회사개설요청일</th>
		<th>관리자승인여부</th>
		<th>관리자승인일</th>
		<th>관리자승인이메일</th>
		<th>업종</th>
		<th>업태</th>
	</tr>
	<c:forEach var="list" items="${list}">
		<tr>
			<td>
				${list.comCode}
			</td>
			<td>
				${list.comName}
			</td>
			<td>
				${list.comRegistrationNumber}
			</td>
			<td>
				${list.comWebPage}
			</td>
			<td>
				${list.comCeoName}
			</td>
			<td>
				${list.comInfo}
			</td>
			<td>
				${list.comIntroduction}
			</td>
			<td>
				${list.comAddress}
			</td>
			<td>
				${list.comPhone}
			</td>
			<td>
				${list.memberEmail}
			</td>
			<td>
				${list.comRegistrationRequestDay}
			</td>
			<td>
				${list.managerApproval}
			</td>
			<td>
				${list.managerApprovalDay}
			</td>
			<td>
				${list.managerApprovalEmail}
			</td>
			<td>
				${list.comIndustry}
			</td>
			<td>
				${list.comCondition}
			</td>
			<td>
			<a href="${pageContext.request.contextPath}//?comCode=${list.comCode}&memberEmail=${memberSession.memberEmail} " > 승인 요청
			</a>
			</td>
		</tr>
	</c:forEach>
</table>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>