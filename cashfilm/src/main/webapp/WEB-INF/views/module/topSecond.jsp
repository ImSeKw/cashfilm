<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<jsp:useBean id="nowYear" class="java.util.Date"/>
<fmt:formatDate var="pastYear" value="${nowYear}" pattern="yyyy"/>

	<script>
		// 첫 화면만 배너 보임
		$(document).ready(function(){
			/* alert($(location).attr('pathname')); */
			var nowHref = $(location).attr('pathname');
			if(nowHref == '/cashfilm/') {
				$(".inner").show();
			} else {
				$(".inner").hide();
			}
		
			$("#control").on("click", function(){
				$(".ctrlBtn").show();
				
			});
						
		});
	</script>
	
</head>
<body class="index">

	<div id="page-wrapper" class="col-lg-12">

			<!-- Header -->
				<header id="header" class="alt">
					<h1 id="logo"><a href="${pageContext.request.contextPath}/">Cash <span>Film</span></a></h1>
					<c:set var="memberSession" value="${memberSession}"/>
					<c:set var="memberSessionBCP" value="${memberSessionByCompanyPayment}" />
					<nav id="nav">
						<ul>
							<li class="current"><a href="${pageContext.request.contextPath}/">Welcome</a></li>
							<c:choose>
								<c:when test="${empty memberSession.memberEmail}">
									<!-- <li data-toggle="modal" data-target="#loginModal"><a href="#" class="button special js-scroll-trigger">Login</a></li> -->
									<li><a href="${pageContext.request.contextPath}/member/signIn" class="button special">Login</a></li>
									<li><a href="${pageContext.request.contextPath}/member/signUp" class="button special">sign up</a></li>
									
								</c:when>
								<c:otherwise>
									<li><a href="${pageContext.request.contextPath}/member/signOut" class="button special">Logout</a></li>
									<li class="submenu">
										<a href="#">Myinfo</a>
										<ul>
											<li><a href="${pageContext.request.contextPath}/member/memberInfo?memberEmail=${memberSession.memberEmail}">내정보</a></li>
											<li><a href="#">회원 탈퇴 요청 비밀번호 확인</a></li>
										</ul>
									</li>
									
									<c:choose>
										<c:when test="${memberSession.memberClassificationCode eq 1}">
											<li class="current" id="control">
												<a href="#" id="control">관리자</a>
											</li>		
										</c:when>
										<c:otherwise>
											<c:choose>
												<c:when test="${empty memberSession.comCode || memberSession.comCode == ''}">
													<li class="submenu">
														<a href ="#">상품</a>
														<ul>
															<li><a href="${pageContext.request.contextPath}">상품조회 </a></li>
															<li><a href="${pageContext.request.contextPath}">상품주문 </a></li>
															<li><a href="${pageContext.request.contextPath}">주문 조회 </a></li> 
															<li><a href="${pageContext.request.contextPath}">결제 조회 </a></li>
														</ul>
													</li>
													<li class="submenu">
														<a href ="#">내 재무관리</a>
														<ul>
															<li class="submenu">
																<a href ="#">초기재무관리</a>
																<ul>
																	<li><a href="${pageContext.request.contextPath}">초기재무등록 </a></li>
																	<li><a href="${pageContext.request.contextPath}">초기재무조회 </a></li>
																	<li><a href="${pageContext.request.contextPath}">초기재무수정 </a></li>
																</ul>
															</li>
															<li class="submenu">
																<a href ="#">예산관리</a>
																<ul>
																	<li><a href="${pageContext.request.contextPath}">예산등록 </a></li>
																	<li><a href="${pageContext.request.contextPath}">예산조회 </a></li>
																	<li><a href="${pageContext.request.contextPath}">예산수정 </a></li>
																</ul>
															</li>
															<li class="submenu">
																<a href ="#">개인전표</a>
																<ul>
																	<li><a href="${pageContext.request.contextPath}">전표등록 </a></li>
																	<li><a href="${pageContext.request.contextPath}">전표조회 </a></li>
																	<li><a href="${pageContext.request.contextPath}">전표수정 </a></li>
																</ul>
															</li>		 
														</ul>
													</li>
												</c:when>
												<c:otherwise>
													<li class="submenu"><a href="${pageContext.request.contextPath}/company/comInfo?comCode=${memberSession.comCode}">회사정보</a></li>
													<li class="submenu"><a href="${pageContext.request.contextPath}/company/comCustomerRegistration">거래처 등록</a></li>
													<li class="submenu"><a href="${pageContext.request.contextPath}/company/comCustomerList?comCode=${memberSession.comCode}">거래처 조회</a></li>
													<li class="submenu">
														<a href="#">회사체계변경공사중!!</a>
														<ul>
															<li><a href="${pageContext.request.contextPath}/company/comAuthorityApprovalList?comCode=${memberSession.comCode}&memberEmail=${memberSession.memberEmail}"> 사원 등록 요청 조회</a></li>
															<li><a href="${pageContext.request.contextPath}/company/comSectionListBeforeApproval?comCode=${memberSession.comCode}">부서 미등록 직원 조회 및 등록</a></li>
															<li><a href="${pageContext.request.contextPath}/company/comPositionListBeforeApproval?comCode=${memberSession.comCode}">직급 미동록 직원 조회 및 등록</a></li>
															<li><a href="${pageContext.request.contextPath}/company/comSectionRegistration?comCode=${memberSession.comCode}">부서 등록</a></li>
															<li><a href="${pageContext.request.contextPath}/company/comSectionList?comCode=${memberSession.comCode}">부서 조회</a></li>
															<li><a href="${pageContext.request.contextPath}/company/comPositionRegistration?comCode=${memberSession.comCode}">직급 등록</a></li>
															<li><a href="${pageContext.request.contextPath}/company/comSectionList?comCode=${memberSession.comCode}">직급 조회</a></li>
														</ul>
													</li>	
												</c:otherwise>
											</c:choose>
										</c:otherwise>
									</c:choose>
								</c:otherwise>
							</c:choose>
						</ul>
					</nav>
				</header>
				
	<!-- Modal -->
	<div class="modal fade" id="loginModal" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<form class="form-horizontal" action="${pageContext.request.contextPath}/member/loginMember" method="post">
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
				</form>
			</div>
		</div>
	</div>
	<!-- Modal end-->		

				
				<!-- Banner -->
				<section id="banner">
					<%-- <div class="wrap">
					  <a href="${pageContext.request.contextPath}/member/memberList" id="btn" class="button" style="display:none;">회원관리</a>
					  <a href="${pageContext.request.contextPath}/company/comListByIndividual" id="btn"class="button" style="display:none;">회사관리</a>
					  <a href="${pageContext.request.contextPath}/item/itemList" id="btn"class="button" style="display:none;">상품관리</a>
					  <a href="${pageContext.request.contextPath}/IndividualSystem/selectIndividualSystem" id="btn"class="button" style="display:none;">개인체계관리</a>
					  <a href="${pageContext.request.contextPath}/ComSystem/selectComSystem" id="btn"class="button" style="display:none;">회사체계관리</a>
					</div> --%>
		<div class="container">
		    <div class="row">
		 		<div class="col-lg-12">
					<div class="tabbable-panel">
						<div class="tabbable-line">
							<ul class="nav nav-tabs">
								<li>
									<a href="${pageContext.request.contextPath}/member/memberList" class="ctrlBtn" style="display:none;">
									회원관리 </a>
								</li>
								<li>
									<a href="#tab_default_2" data-toggle="tab"  class="ctrlBtn" style="display:none;">
									회사관리</a>
								</li>
								<li>
									<a href="#tab_default_3" data-toggle="tab"  class="ctrlBtn" style="display:none;">
									개인체계관리 </a>
								</li>
								<li>
									<a href="#tab_default_4" data-toggle="tab"  class="ctrlBtn" style="display:none;">
									회사체계관리 </a>
								</li>
								<li>
									<a href="#tab_default_5" data-toggle="tab"  class="ctrlBtn" style="display:none;">
									상품관리 </a>
								</li>
							</ul>
									<!--  <div class="tab-content">
								<div class="tab-pane active" id="tab_default_1">
									<p>
										Howdy, I'm in Tab 2.
									</p>
									<p>
										Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat. Ut wisi enim ad minim veniam, quis nostrud exerci tation.
									</p>
									<p>
										<a class="btn btn-warning" href="http://j.mp/metronictheme" target="_blank">
											Click for more features...
										</a>
									</p>
								</div>
								<div class="tab-pane" id="tab_default_2" >
									<p>
										Howdy, I'm in Tab 2.
									</p>
									<p>
										Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat. Ut wisi enim ad minim veniam, quis nostrud exerci tation.
									</p>
									<p>
										<a class="btn btn-warning" href="http://j.mp/metronictheme" target="_blank">
											Click for more features...
										</a>
									</p>
								</div>
								<div class="tab-pane" id="tab_default_3">
									<p>
										Howdy, I'm in Tab 3.
									</p>
									<p>
										Duis autem vel eum iriure dolor in hendrerit in vulputate. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat
									</p>
									<p>
										<a class="btn btn-info" href="http://j.mp/metronictheme" target="_blank">
											Learn more...
										</a>
									</p>
								</div>
							</div> -->
						</div>	
					</div>
				</div>
			</div>
		</div>			
						<div class="inner">
							<header>
								<h2>CASHFILM</h2>
							</header>
							<p>this is <strong>CASHIFILM</strong>, a free
							<br />
							asset management system
							<br />
							<footer>
								<ul class="buttons vertical">
									<li><a href="#main" class="button fit scrolly">Tell Me More</a></li>
								</ul>
							</footer>
						</div>
						
				
				</section>
				<!-- <div class="col-sm-4">
				</div>
				<div class="col-sm-4">
					<div class="center-block">
							  <div class="mat-div">
							    <label>First Name</label>
							    <input type="text" class="mat-input" id="first-name">
							  </div>
							  
							    <div class="mat-div">
							    <label>Last Name</label>
							    <input type="text" class="mat-input" id="last-name">
							  </div>
							
							    <div class="mat-div">
							    <label>Address</label>
							    <input type="text" class="mat-input" id="address">
							  </div>
							    <button>Submit</button>
					</div>		    
				</div>
				<div class="col-sm-4">
				</div> -->
						
						<script>
						    $(".mat-input").focus(function(){
						  $(this).parent().addClass("is-active is-completed");
						});
						
						$(".mat-input").focusout(function(){
						  if($(this).val() === "")
						    $(this).parent().removeClass("is-completed");
						  $(this).parent().removeClass("is-active");
						})
						</script>
				
						
			 
						
				

<a href="${pageContext.request.contextPath}/statement/financeListByCompany?comCode=${memberSession.comCode}&closingStatementCode=${pastYear - 1}">회사 처음 입력 재무 조회</a>
<%-- <br>



<br>

<table border="1">
	<tr>
		<td>이메일</td>
		<td>${memberSession.memberEmail}</td>
	</tr>
	<tr>
		<td>구분코드</td>
		<td>${memberSession.memberClassificationCode}</td>
	</tr>
	<tr>
		<td>구분명</td>
		<td>${memberSession.memberClassificationName}</td>
	</tr>
	<tr>
		<td>회사코드</td>
		<td>${memberSession.comCode}</td>
	</tr>
	<tr>
		<td>회사명</td>
		<td>${memberSession.comName}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${memberSession.memberName}</td>
	</tr>
	<tr>
		<td>회원상태</td>
		<td>${memberSession.memberCondition}</td>
	</tr>
	<tr>
		<td>회사체계변경</td>
		<td>${memberSession.comSystemChange}</td>
	</tr>
	<tr>
		<td>결제코드</td>
		<td>${memberSession.voucherPaymentCode}</td>
	</tr>
	<tr>
		<td>결제일</td>
		<td>${memberSession.voucherPaymentDay}</td>
	</tr>
	<tr>
		<td>상품코드</td>
		<td>${memberSession.myItemCode}</td>
	</tr>
	<tr>
		<td>상품명</td>
		<td>${memberSession.myItemName}</td>
	</tr>
	<tr>
		<td>이름 or 회사대표이름</td>
		<td>${memberSessionBCP.memberEmail}</td>
	</tr>
	<tr>
		<td>회사코드</td>
		<td>${memberSessionBCP.comCode}</td>
	</tr>
	<tr>
		<td>결제코드</td>
		<td>${memberSessionBCP.voucherPaymentCode}</td>
	</tr>
	<tr>
		<td>결제일</td>
		<td>${memberSessionBCP.voucherPaymentDay}</td>
	</tr>
	<tr>
		<td>상품코드</td>
		<td>${memberSessionBCP.myItemCode}</td>
	</tr>
	<tr>
		<td>상품명</td>
		<td>${memberSessionBCP.myItemName}</td>
	</tr>
</table> --%>