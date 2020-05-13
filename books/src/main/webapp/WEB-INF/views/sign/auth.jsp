<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="../include/commonHeader.jsp" %>
	<link href="${cssPath}/sign/auth.css" rel="stylesheet" type="text/css" />
</head>
<body>	
	
	<div class="container">
		<section class="page-header">
			<h1>Authentication</h1>
			<p class="sub">Check your mail</p>
		</section>

		<section class="page-container">
			<form class="auth-form">
				<label for="number">Number</label>				
				<input type="number" name="" id="number">
				<a class="auth-guide">Please enter the 6 digits of the authentication number you received by mail.</a>
				<input type="submit" name="" id="enter" value="Authentication">
			</form>
		</section>
	</div>
	
	<script src="${jsPath}/sign/auth.js" type="text/javascript" charset="utf-8"></script>
	
</body>
</html>