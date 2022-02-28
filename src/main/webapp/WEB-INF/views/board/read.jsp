<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<%@include file="../includes/header.jsp"%>


<div class="row" style="margin-bottom:20px; margin-left:1px;">
<div class="col-lg-12">
<h1 class="page-header">상세 페이지</h1>
</div>
</div>

<div class="panel" style="margin-left:1px;">
<div id="contAreaBox">
<div class="panel">
<div class="panel-body">
<div class="table-responsive" style="text-align:center;">
<table id="datatable-scroller"
	class="table table-bordered tbl_Form">
	<caption></caption>
	<colgroup>
		<col width="250px" />
		<col />
	</colgroup>
	<tbody>
		<tr>
			<th class="active" >제목</th>
			<td>
				${boardContents.board_title }
			</td>
		</tr>
		<tr>
			<th class="active">작성자</th>
			<td>
				${boardContents.board_writer }
			</td>
		</tr>
		<tr>
			<th class="active" >내용</th>
			<td>
				${boardContents.board_content }
			</td>
		</tr>
	</tbody>
</table>
</div>
<div style="margin-left:1px;">
<a href="/board/list" class="btn btn-primary">목록</a>
</div>
</div>
</div>
</div>
</div>


<%@include file="../includes/footer.jsp"%>