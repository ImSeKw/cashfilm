<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
	 <script>
		$(document).ready(function(){
			$('input:radio[name=individualSubject]').click(function() {
				var chkvalue = $('input:radio[name=individualSubject]:checked').val();
				if(chkvalue == "1"){
					$('#comSubjectNumeral').css('display','block')      // 보이게
					$('#userComSubjectCode').css('display','none')   // 안보이게 */
					$('#cs').prop("disabled",false);
					$('#ucs').prop("disabled",true);
				}else{
					$('#comSubjectNumeral').css('display','none')   // 안보이게 */
					$('#userComSubjectCode').css('display','block')        // 보이게
					$('#cs').prop("disabled",true);
					$('#ucs').prop("disabled",false);
					
				};
			});
		});
	</script>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>	
	<h1>회사적요 등록</h1>
	<br>
	 <input type="radio" name="Subject" id="individualSubject" value="1" checked="checked" > 회사계정과목코드
	 <input type="radio" name="individualSubject" id="individualSubject" value="2">회사사용자계정과목코드
	<c:set var="memberSession" value="${memberSession}"/>
	<form action="${pageContext.request.contextPath}/ComSystem/insertComContent" method="post">
		<div id="comSubjectNumeral" style="display:block;">   
	       <select name="comSubjectNumeral" id="cs">
				<c:forEach var="ComSystemAndSubject" items="${csyssublist}">
		      	 <option value="${ComSystemAndSubject.comSubjectNumeral}">${ComSystemAndSubject.comSubjectName}</option>
		        </c:forEach>
			</select>
	    </div>
		<div id="userComSubjectCode" style="display:none;">
			<select name="userComSubjectCode" id="ucs" disabled="true">
			   <c:forEach var="ComSystemAndUSubject" items="${csysusublist}">
		       	<option value="${ComSystemAndUSubject.userComSubjectCode}">${ComSystemAndUSubject.userComSubjectName}</option>
		       </c:forEach>
			</select>
	    </div>
		<br>
		회사적요내용:<input type="text" name="comContentName">
		<br>
		회사코드:<input type="text" name="comCode" value="${memberSession.comCode}" readonly="readonly">
		<br>
		회원이메일:<input type="text" name="memberEmail" value="${memberSession.memberEmail}" readonly="readonly">
		<input type="submit" value="등록">
	</form>
	<a href="${pageContext.request.contextPath}/ComSystem/selecttComContent?comCode=${memberSession.comCode}">회사적요 검색</a>
	<br>
	
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>
