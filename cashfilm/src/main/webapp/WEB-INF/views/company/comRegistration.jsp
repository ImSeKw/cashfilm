<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<c:set var="memberSimple" value="${memberSimple}"/>
	<script type="text/javascript">
	$(document).ready(function(){
		$("#insertButton").click(function(){
			$("#insertCompanyBaseInfo").submit();
		});
	});
	</script>

<!--파일 업로드는 action에 multipart/form.data를 활용하자 post 방식으로만 가능하고  컨트롤러에서도 받는걸 생각해야 한다 .-->
	<form action = "${pageContext.request.contextPath}/company/insertCompanyBaseInfo" method = "post" id = "insertCompanyBaseInfo">
		*회사이름 : <input type="text" name ="ComName" id = "ComName" value="TestValue입니다">	
		<br>	
		*사업자등록번호 : <input type="text" name ="ComRegistrationNumber" id = "ComRegistrationNumber" value="123-12-12345">	
		<br>	
		웹주소 : <input type="text" name ="ComWebPage" id = "ComWebPage" value="http://www.cashfilm.com">	
		<br>
		*대표자명 : <input type="text" name ="ComCeoName" id = "ComCeoName" value="TestValue입니다">	
		<br>
		회사정보 : <input type="text" name ="ComInfo" id = "ComInfo" value="ex)생활용품 물류센터">	
		<br>
		회사소개 : <input type="text" name ="ComIntroduction" id = "ComIntroduction" value="생활용품 및 생활가구 전문점입니다.">	
		<br>
		*회사주소 : <input type="text" name ="ComAddress" id = "ComAddress" value="전라북도 전주시 덕진구 여의동">	
		<br>
		*회사전화번호 :<input type="text" name ="ComPhone" id = "ComPhone" value="063-212-4734">	
		<br>
		등록이메일 : <input type="text" name ="MemberEmail" id = "MemberEmail" value="${memberSimple.memberEmail}" readonly >	
		<br>
		*업종 : <input type="text" name ="ComIndustry" id = "ComIndustry" value="생활용품도소매업">	
		<br>
		업태 : <input type="text" name ="ComCondition" id = "ComCondition" value="인테리어소품 및 빈티지 가구 전문점">	
		<br>
		<button type="button" id="insertButton" >확인
		</button>
		<!-- 취소버튼 -->
		<button type="button" id="cancelButton" >취소
		</button>
	</form>
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
