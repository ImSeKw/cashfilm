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

<div class="col-sm-3"></div>
<div class="col-sm-6">
	<div class="container">
		<div class="row">
	    <div class="col-md-8">
	      <section>      
	        <h1 class="entry-title"><span>Sign Up</span> </h1>
	        <hr>
	        <form class="form-horizontal" method="post" name="signup" id="signup" enctype="multipart/form-data" >
	           
	        <div class="form-group">
	          <label class="control-label col-sm-3">Email ID <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div><span style="float:right"><button type="button" id="emailOverlap" class="button special">중복확인</button></span></div>    
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
	        <div class="form-group">
	          <label class="control-label col-sm-3"> Name <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
		          	<span class="input-group-addon"><i class="fas fa-user"></i></span>
		            <input type="text" name="memberName" placeholder="Enter your Name here" value="">
		        </div>    
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="control-label col-sm-3"> 휴대폰 식별 번호 <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
		          	<span class="input-group-addon"><i class="fab fa-nutritionix"></i></span>
		            <input type="text" name="memberPhoneFirst" placeholder="Enter your first sellphone number here" value="">
		        </div>    
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="control-label col-sm-3"> 휴대폰 번호 <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
		          	<span class="input-group-addon"><i class="fas fa-mobile-alt"></i></span>
		            <input type="text" name="memberPhoneSecond" placeholder="Enter your second sellphone number here" value="">
		        </div>    
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="control-label col-sm-3"> 우편번호 <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
		          	<span class="input-group-addon"><i class="far fa-envelope"></i></span>
		            <input type="text" name="memberPostalCode" placeholder="Enter your PostalCode here" value="">
		        </div>    
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="control-label col-sm-3"> 주소 <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
		          	<span class="input-group-addon"><i class="fas fa-home"></i></span>
		            <input type="text" name="memberAddress" placeholder="Enter your address here" value="">
		        </div>    
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="control-label col-sm-3"> 실명인증여부 <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
		          	<span class="input-group-addon"><i class="fas fa-check"></i></span>
		            <input type="number" name="memberCertification" placeholder="Enter your Certification here" value="">
		        </div>    
	          </div>
	        </div>
	        <div class="form-group">
	          <label class="control-label col-sm-3"> 전화번호 <span class="text-danger">*</span></label>
	          <div class="col-md-8 col-sm-9">
	          	<div class="input-group">
		          	<span class="input-group-addon"><i class="fas fa-phone"></i></span>
		            <input type="tel" name="memberPhone" placeholder="Enter your phone here" value="">
		        </div>    
	          </div>
	        </div>
	     </form>
	    <div class="col-md-12 text-center">
		<button type="button" class="button special" id="signUpButton">확인</button>
		</div>
	    </div>
	 </div>
	</div>
</div>
<div class="col-sm-3"></div>
	


<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>