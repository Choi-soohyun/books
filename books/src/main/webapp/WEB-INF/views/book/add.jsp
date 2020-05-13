<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="../include/commonHeader.jsp" %>
	<link href="${cssPath}/book/add.css" rel="stylesheet" type="text/css" />
</head>
<body>	
	
	<%@include file="../include/navbar.jsp" %>

	<div class="container">
		<section class="page-header">
			<h1>Add Book</h1>
			<p class="sub">추가할 도서의 내용을 입력하세요</p>
		</section>

		<section class="page-container">
			<div class="item-img">
				<figure style="background-image: url();">
				</figure>
				<label for=file>Click</label>
				<input type="file" name="" id="file">
			</div>

			<label for="title">도서명</label>
			<input type="text" name="" id="title">

			<label for="author">지은이</label>
			<input type="text" name="" id="author">
			<label for="leaveDate">기록</label>
			<input type="date" name="" id="leaveDate">

			<label for="quo">인용구</label>
			<textarea id="quo" name="" rows="5" maxlength="5000"></textarea>
			<input type="button" name="" value="내용 추가">

			<label for="tag">#</label>
			<input type="text" name="" id="tag">

			<input type="submit" name="" value="Add" disabled="">
		</section>
		
	</div>
	
	<%@include file="../include/commonFooter.jsp" %>
	<script src="${jsPath}/book/add.js" type="text/javascript" charset="utf-8"></script>
	
</body>
</html>