<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />

<table border=1>
	<tr>
		<th>*회사코드</th>
		<th>거래처사업자등록번호</th>
		<th>대표자명</th>
		<th>*거래처명</th>
		<th>거래처주소</th>
		<th>*거래처전화번호</th>
		<th>입금계좌번호</th>
		<th>업체담당장연락처</th>
		<th>업종</th>
		<th>비고</th>
	</tr>
	<c:forEach var="list" items="${list}">
		<tr>
			<td>
				${list.comCode}
			</td>
			<td>
				${list.customerNumber}
			</td>
			<td>
				${list.customerCeo}
			</td>
			<td>
				${list.customerName}
			</td>
			<td>
				${list.customerAddress}
			</td>
			<td>
				${list.customerPhone}
			</td>
			<td>
				${list.customerCreditNumber}
			</td>
			<td>
				${list.customerContactNumber}
			</td>
			<td>
				${list.customerCategory}
			</td>
			<td>
				${list.customerRemarks}
			</td>
			<td>
			<%-- <a href="${pageContext.request.contextPath}/company/comCustomerModification?comCode=${list.comCode}&customerCode=${list.customerCode}&memberEmail=${memberSession.memberEmail}" > 거래처 수정
			</a>
			<a href="${pageContext.request.contextPath}/company/?comCode=${list.comCode}&customerCode=${list.customerCode}&memberEmail=${memberSession.memberEmail}" > 거래처 삭제
			</a> --%>
			</td>
		</tr>
	</c:forEach>
</table>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>