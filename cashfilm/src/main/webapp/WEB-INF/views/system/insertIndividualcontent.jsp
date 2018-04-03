<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>

<script>
	$(document).ready(function(){
		$('input:radio[name=individualSubject]').click(function() {
			var chkvalue = $('input:radio[name=individualSubject]:checked').val();
			if(chkvalue == "1"){
				$('#individualSubjectNumeral').css('display','block')      // 보이게
				$('#userIndividualSubjectCode').css('display','none')   // 안보이게 */
			}else{
				$('#individualSubjectNumeral').css('display','none')   // 안보이게 */
				$('#userIndividualSubjectCode').css('display','block')        // 보이게
			};
		});
	});
</script>

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	<h1>개인적요등록</h1>
		    <input type="radio" name="individualSubject" id="individualSubject" value="1" checked="checked"> 개인계정과목코드
			<input type="radio" name="individualSubject" id="individualSubject" value="2"> 개인사용자계정과목코드
	<form action="${pageContext.request.contextPath}/IndividualSystem/insertIndividualcontent" method="post">
		<div id="individualSubjectNumeral" style="display:block;">   
	       <select name="individualSubjectNumeral">
				<c:forEach var="IndividualSubject" items="${list}">
		      	 <option value="${IndividualSubject.individualSubjectNumeral}">${IndividualSubject.individualSubjectName}</option>
		        </c:forEach>
			</select>
	    </div>
		<div id="userIndividualSubjectCode" style="display:none;">
			<select name="userIndividualSubjectCode" >
			   <c:forEach var="IndividualSystemAndUSubject" items="${isuslist}">
		       	<option value="${IndividualSystemAndUSubject.userIndividualSubjectCode}">${IndividualSystemAndUSubject.userIndividualSubjectName}</option>
		       </c:forEach>
			</select>
	    </div>
	개인적요내용:
	<input type="text" name="individualContentName">
	<br>
	 회원 이메일:<c:set var="memberSession" value="${memberSession}"/>
	<input type="text" name="memberEmail" value="${memberSession.memberEmail}" readonly="readonly">
	<br>
	<input type="submit" value="등록"> 
	</form>
 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>