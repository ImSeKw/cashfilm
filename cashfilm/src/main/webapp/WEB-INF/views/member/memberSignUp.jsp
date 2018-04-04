<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script type="text/javascript">
	$(document).ready(function(){
		$("#signUpButton").click(function(){
			$("#signUp").submit();
		});
		$("#emailOverlap").click(function(){
			if($("#memberEmail").val()){
				$.ajax({
					url : '/cashfilm/member/emailOverlap'
					, type : "post"
					, data : { memberEmail : $("#memberEmail").val() }
					, success : function(data){
						if(data==1){
							alert("사용할 수 없습니다.");
							$("#memberEmail").val("");
							$("#memberEmail").focus();
						} else if(data==0){
							alert("사용할 수 있습니다.");
						}
					}
				});
			} else {
				alert("이메일을 입력해주세요.");
				$("#memberEmail").focus();
			}
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<form id="signUp" action="${pageContext.request.contextPath}/member/signUp" method="post">
	이메일 : <input type="email" name="memberEmail" id="memberEmail"> <button type="button" id="emailOverlap">중복확인</button>
	이름 : <input type="text" name="memberName">
	비밀번호 : <input type="password" name="memberPassword">
	휴대폰 식별 번호 : <input type="text" name="memberPhoneFirst">
	휴대폰 번호 : <input type="text" name="memberPhoneSecond">
	우편번호 : <input type="text" name="memberPostalCode">
	주소 : <input type="text" name="memberAddress">
	실명인증여부 : <input type="number" name="memberCertification">
	전화번호 : <input type="tel" name="memberPhone">
</form>
<button type="button" id="signUpButton">확인</button>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>