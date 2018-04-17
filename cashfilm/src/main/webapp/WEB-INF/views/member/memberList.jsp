<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/module/topFirst.jsp"/>
<jsp:include page="/WEB-INF/views/module/topSecond.jsp"/> 
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
              <a class="btn btn-info edit" href="path/to/settings" aria-label="Settings">
                <i class="fas fa-wrench" aria-hidden="true"></i>
              </a> 
           </td>
        </tr>
        </c:forEach>
   
     </tbody>
  </table>

<jsp:include page="/WEB-INF/views/module/bottom.jsp"/> 