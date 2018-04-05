<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSession" value="${memberSession}"/>
<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />
	<script type="text/javascript">
	$(document).ready(function(){
		$("#insertButton").click(function(){
			$("#comCustomerRegistration").submit();
		});
	});
	</script>

	<form action = "${pageContext.request.contextPath}/company/comCustomerRegistration" method = "post" id = "comCustomerRegistration">
		*회사코드<input type="text" name ="comCode" id = "comCode" value="${memberSession.comCode}" readonly>	
		<br>	
		거래처사업자등록번호 : <input type="text" name ="customerNumber" id = "customerNumber" value="123-12-12345">	
		<br>	
		대표자명 : <input type="text" name ="customerCeo" id = "customerCeo" value="김수정">	
		<br>
		*거래처명 : <input type="text" name ="customerName" id = "customerName" value="반짝반짝수정금은방">	
		<br>
		거래처주소 : <input type="text" name ="customerAddress" id = "customerAddress" value="전라북도 전주시 덕진구">	
		<br>
		*거래처전화번호 : <input type="text" name ="customerPhone" id = "customerPhone" value="063-212-2121">	
		<br>
		입금계좌번호 : <input type="text" name ="customerCreditNumber" id = "customerCreditNumber" value="하나은행 12345-456-456456">	
		<br>
		업체담당자연락처 :<input type="text" name ="customerContactNumber" id = "customerContactNumber" value="010-8382-1150">	
		<br>
		업종 : <input type="text" name ="customerCategory" id = "customerCategory" value="공예품 소매업" >	
		<br>
		비고 : <input type="text" name ="customerRemarks" id = "customerRemarks" value="크리스탈입니다">	
		<br>
		<button type="button" id="insertButton" >확인
		</button>
		<!-- 취소버튼 -->
		<button type="button" id="cancelButton" >취소
		</button>
	</form>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
