<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
	<script type="text/javascript">
	$(document).ready(function() {
	    function show(str){
	    	 $("#individualSystemNumeral").text("${IndividualSystem.individualSystemNumeral}");

	    	/* var a = $(event.relatedTarget)
	     	var individualSystemNumeral= a.data('individualSystemNumeral');
	    	
		 ${event.currentTarget}.find('input[name="individualSystemNumeral"]').text(individualSystemNumeral);
		}); */
	});
	</script>	
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/>
	
	<a class="btn" href="#"><span class="label label-success" data-toggle="modal" data-target="#insertsystem"><i class="fas fa-plus"></i> &nbsp 추가</span></a>
	<table class="table table-striped">
     <thead>
        <tr class="row-name">
           <th><strong>계정체계명</strong></th>
           <th><strong>Settings</strong></th>
        </tr>
     </thead>   
     <tbody>
    	<c:forEach var="IndividualSystem" items="${list}">
        <tr class="row-content">
           <td>${IndividualSystem.individualSystemName}</td>
           <td>
              <a class="btn btn-danger edit" href="${pageContext.request.contextPath}/IndividualSystem/deleteIndividualSystem?individualSystemNumeral=${IndividualSystem.individualSystemNumeral}" aria-label="Settings">
                <i class="fa fa-trash" aria-hidden="true"></i>
              </a>
              &nbsp 
              <a class="btn btn-info edit" href="#updatesystem" data-toggle="modal" onclick="show('${IndividualSystem.individualSystemNumeral}') aria-label="Settings">
                <i class="fas fa-wrench" aria-hidden="true"></i>
              </a> 
           </td>
        </tr>
        </c:forEach>
	   </tbody>
	  </table>
	  
  <!-- 추가 Modal -->
  <div class="modal fade" id="insertsystem" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">×</button>
          <h4 class="modal-title">계정체계 등록</h4>
        </div>
        <div class="modal-body">
        	 <div class="col-md-3"></div>
       		 <div class="form-group">
	         <div class="col-md-6">
	         	 <form action="${pageContext.request.contextPath}/IndividualSystem/insertIndividualSystem" method="post">
	         	 	<div><span style="float:right"><button type="submit" id="emailOverlap" class="button special">등록</button></span></div>    
	          		<div class="input-group">
	          	 		<input type="text" name="individualSystemName" placeholder="Enter SystemName">
	          	 	</div>	
	             </form>  
	         </div>
	         <div class="col-md-3"></div>
	        </div>
	    </div>
	    <div class="modal-footer">   
        	<div class="btn-group">
            	<button class="btn btn-danger" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
            </div>
        </div>
      </div>
  	</div>
  </div>
  
  <!--수정 모달 --> 
   <div class="modal fade" id="updatesystem" role="dialog">
    <div class="modal-dialog">
     <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">×</button>
          <h4 class="modal-title">계정체계 등록</h4>
        </div>
        <div class="modal-body">
        	 <div class="col-md-3"></div>
       		 <div class="form-group">
	         <div class="col-md-6">
	         	 <form action="${pageContext.request.contextPath}/IndividualSystem/updateIndividualSystem" method="post">
	         	 	<div><span style="float:right"><button type="submit" id="emailOverlap" class="button special">수정</button></span></div>    
	          		<div class="input-group">
	          	 		<input type="text" name="individualSystemNumeral" id="individualSystemNumeral" >
	          	 		<input type="text" name="individualSystemName" id="individualSystemName" >
	          	 	</div>	
	             </form>  
	         </div>
	         <div class="col-md-3"></div>
	        </div>
	    </div>
	    <div class="modal-footer">   
        	<div class="btn-group">
            	<button class="btn btn-danger" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
            </div>
        </div>
      </div>
  	</div>
  </div>

	 
<jsp:include page="/WEB-INF/views/module/bottom.jsp"/>