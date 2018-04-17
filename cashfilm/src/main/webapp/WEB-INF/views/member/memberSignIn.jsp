<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
	

<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>

<article id="main">


<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	관리자 : <input type="text" name="memberEmail" value="id001@naver.com">
	<input type="text" name="memberPassword" value="pw001">
	<button type="submit">확인</button>
</form>
	<br>
<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	기업 + 개인 : <input type="text" name="memberEmail" value="id011@naver.com">
	<input type="text" name="memberPassword" value="pw011">
	<button type="submit">확인</button>
</form>
	<br>
<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	기업회원 : <input type="text" name="memberEmail" value="samsung01@naver.com">
	<input type="text" name="memberPassword" value="samsung01">
	<button type="submit">확인</button>
</form>
	<br>
<form action="${pageContext.request.contextPath}/member/signIn" method="post">
	개인회원 : <input type="text" name="memberEmail" value="id111@naver.com">
	<input type="text" name="memberPassword" value="pw111">
	<button type="submit">확인</button>
</form>
<div class="col-sm-3"></div>
<div class="col-sm-6">
	<div class="col-md-8">
		<form class="form-horizontal">
			 <div class="form-group">
	          <label class="control-label col-sm-3">Email ID <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
	             <span class="input-group-addon"><i class="fas fa-at"></i></span>
	             <input type="email" name="memberEmail" id="memberEmail" placeholder="Enter your Email ID"> 
	            </div>
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="control-label col-sm-3"> Password <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	            <div class="input-group">
	              <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
	              <input type="password" name="memberPassword" placeholder="Choose password (5-15 chars)" value="">
	           </div>   
	          </div>
	        </div>
	        <div class="text-center">
	        <button type="submit" class="button special">login</button>
	        </div>
		</form>
	</div>
</div>
</article>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>