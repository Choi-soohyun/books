<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="../include/commonHeader.jsp" %>
	<link href="${cssPath}/sign/signup.css" rel="stylesheet" type="text/css" />
</head>
<body>	
	
	<div class="container">
		<section class="page-header">
			<h1>Join Books</h1>
			<p class="sub">Create your account</p>
		</section>

		<section class="page-container">
			<form class="signup-form">
				<label for="username">Username</label>
				<input type="text" name="" id="username">
				<label for="email">Email address</label>
				<input type="email" name="" id="email">
				<label for="password">Password</label>				
				<input type="password" name="" id="password">
				<a class="password-guide">Make sure it's at least 15 characters OR at least 8 characters including a number and a lowercase letter.</a>
				<input type="submit" name="" id="account" value="Create account" disabled="">
			</form>
		</section>
	</div>
	
	<script src="${jsPath}/sign/signup.js" type="text/javascript" charset="utf-8"></script>
	
</body>
</html>