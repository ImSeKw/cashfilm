<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/> 
	 <script>
	    function modal_view(cp, mng, tel, add, seq) {
	        $('#ModificationMember').on('show.bs.modal', function (event) {
	
	            $(".modal-body #Email").val( cp );
	            $(".modal-body #Classification").val( mng );
	            $(".modal-body #Name").val( tel );
	            $(".modal-body #Condition").val( add );
	            $(".modal-body #seq").val( seq );
	
	        })
	    }
	
	</script>	
	
<!--회원조회  -->
	<table class="table table-striped">
     <thead>
        <tr class="row-name">
           <!-- <th style="width:12%">Check/UnCheck</th>
           <th style="width:10%">New/Old</th> -->
           <th><strong>Email</strong></th>
           <th><strong>Classification</strong></th>
           <th><strong>Name</strong></th>
           <th><strong>Condition</strong></th>
           <th><strong>Settings</strong></th>
        </tr>
     </thead>   
     <tbody>
     <c:forEach var="memberList" items="${memberList}">
        <tr class="row-content">
           <td>${memberList.memberEmail}</td>
           <c:set var="name" value="${memberList.memberClassificationName}" />
			<c:choose>
				<c:when test="${name eq '개인회원'}">
      				<td> <span class="label label-info"> ${memberList.memberClassificationName} </span></td>
    			</c:when>
    			<c:when test="${name eq '기업회원'}">
      				<td> <span class="label label-danger"> ${memberList.memberClassificationName} </span></td>
    			</c:when>
				<c:otherwise>
       				<td> <span class="label label-success"> ${memberList.memberClassificationName} </span></td>
    			</c:otherwise>
			</c:choose>
		   <td>${memberList.memberName}</td>
           <td>${memberList.memberCondition}</td>
           <td>
              <a class="btn btn-danger edit" href="path/to/settings" aria-label="Settings">
                <i class="fa fa-trash" aria-hidden="true"></i>
              </a>
              &nbsp 
              <!-- <a class="btn btn-info edit" href="path/to/settings" aria-label="Settings">
                <i class="fas fa-wrench" aria-hidden="true"></i>
              </a> -->
              <a class="btn btn-info edit" href="#" aria-label="Settings" data-toggle="modal" data-target="#ModificationMember" onclick="modal_view('${memberList.memberEmail}','${memberList.memberClassificationName}','${memberList.memberName}','${memberList.memberCondition}');">
                <i class="fas fa-wrench" aria-hidden="true"></i>
              </a> 
           </td>
        </tr>
        </c:forEach>
       
       


<!-- 수정 모달 창 -->
<div class="modal fade" id="ModificationMember" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="exampleModalLabel">수정</h4>
            </div>
            <div class="modal-body">
                <form name="customer" method="post" action="action="${pageContext.request.contextPath}/member/memberModification" method="post">
                    <input type="hidden" class="form-control" id="seq" name="seq">
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">Email</label>
                        <input type="text" class="form-control" id="Email" name="Email">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">Classification</label>
                        <input type="text" class="form-control" id="Classification" name="Classification">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">Name</label>
                        <input type="text" class="form-control" id="Name" name="Name">
                    </div>
                    <div class="form-group">
                        <label for="recipient-name" class="control-label">Condition</label>
                        <textarea class="form-control" id="Condition" name="Condition"></textarea>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
                <button type="button" id="insert_customer_btn" class="btn btn-primary">수정</button>
            </div>
        </div>
    </div>
</div>
   
     </tbody>
  </table>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/> 