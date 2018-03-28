<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		$("#memberDelCheckButton").click(function(){
			if($("#memberDelCheck").val()){
				$.ajax({
					url : '/cashfilm/member/memberDelCheck'
					, type : 'post'
					, data : {
						memberPassword : $("#memberDelCheck").val()
						, memberEmail : $("#memberEmail").val()}
					, success : function(data){
						if(data==1){
							alert("탈퇴 요청되었습니다.");
							$.ajax({
								url : '/cashfilm/member/memberDel'
								, type : 'post'
								, data : {
									memberEmail : $("#memberEmail").val()
									, memberDelReason : $("#memberDelReason").val()}
							});
						} else {
							alert("비밀번호를 확인해주세요.");
						}
					}
				});
			}
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<input type="hidden" id="memberEmail" name="memberEmail" value="${memberSimple.memberEmail}">
탈퇴이유 : <input type="text" name="memberDelReason">
비밀번호 확인 : <input type="text" id="memberDelCheck">
<button type="button" id="memberDelCheckButton">확인</button>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>