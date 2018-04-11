<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body class="index">
	<div id="page-wrapper">

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
									<li><a href="${pageContext.request.contextPath}/member/signIn" class="button special">Login</a></li>
									<li><a href="${pageContext.request.contextPath}/member/signUp" class="button special">Membership</a></li>
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
											<li class="submenu">
												<a href="#">회원관리</a>
												<ul>
													<li><a href="${pageContext.request.contextPath}/member/memberList">회원 조회</a></li>
													<li><a href="#">회원 구분 등록</a></li>
													<li><a href="${pageContext.request.contextPath}/member/memberClassificationList">회원구분 조회</a></li>
													<li><a href="#">회원 구분 수정</a></li>
													<li><a href="${pageContext.request.contextPath}/member/memberDelList">회원탈퇴 조회</a></li>
												</ul>
											</li>
											<li class="submenu">
												<a href="#">회사관리</a>
												<ul>
													<li><a href="${pageContext.request.contextPath}/company/insertCompanyBaseInfo">회사등록</a></li>
													<li><a href="${pageContext.request.contextPath}/company/comListByIndividual">회사검색</a></li>
													<li><a href="#">회사수정</a></li>
													<li><a href="#">회사 등록 요청 조회</a></li>
												</ul>
											</li>
											<li class="submenu">
												<a href ="#">상품관리</a>
												<ul>
													<%-- <li><a href="${pageContext.request.contextPath}/item/itemListSell?indiOrCom=0">상품주문</a></li> --%>
													<li><a href="${pageContext.request.contextPath}/item/itemList">상품 조회</a></li>
													<li><a href="${pageContext.request.contextPath}/item/itemList">상품 수정</a></li>
													<li><a href="#">결제 조회</a></li>
													<li><a href="#">환불 조회</a></li>
												</ul>
											</li>
											<li class="submenu">
												<a href ="#">개인체계관리</a>
												<ul>
													<li><a href="${pageContext.request.contextPath}">개인 계정 체계 </a></li>
													<li><a href="${pageContext.request.contextPath}">개인 계정 과목 </a></li>
													<%-- <li><a href="${pageContext.request.contextPath}">개인 사용자 계정 과목 </a></li> --%>
													<%-- <li><a href="${pageContext.request.contextPath}">개인 계정 상세 </a></li> --%>
													<li><a href="${pageContext.request.contextPath}">개인 계정 과목 세부 </a></li>
													<%-- <li><a href="${pageContext.request.contextPath}">개인 적요 </a></li> --%>
												</ul>
											</li>
											<li class="submenu">
												<a href ="#">회사체계관리</a>
												<ul>
													<li><a href="${pageContext.request.contextPath}">회사 계정 체계 </a></li>
													<li><a href="${pageContext.request.contextPath}">회사 계정 과목 </a></li>
													<%-- <li><a href="${pageContext.request.contextPath}">회사 사용자 계정 과목 </a></li> --%>
													<%-- <li><a href="${pageContext.request.contextPath}">회사 계정 상세 </a></li>
													<li><a href="${pageContext.request.contextPath}">회사 적요 </a></li> --%>
												</ul>
											</li>
											<li class="current"><a href="${pageContext.request.contextPath}/cashfilm/cashfilmControlTower?memberClassificationCode=${memberSession.memberClassificationCode}">관리자</a></li>
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

			<!-- Banner -->
				<section id="banner">

						<div class="inner">

						<header>
							<h2>CASHFILM</h2>
						</header>
						<p>This is <strong>CASHIFILM</strong>, a free
						<br />
						responsive template
						<br />
						
						<footer>
							<ul class="buttons vertical">
								<li><a href="#main" class="button fit scrolly">Tell Me More</a></li>
							</ul>
						</footer>

					</div>

				</section>

<%-- <a href="${pageContext.request.contextPath}/statement/financeListByCompany?comCode=${memberSession.comCode}">회사 처음 입력 재무 조회</a> --%>

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