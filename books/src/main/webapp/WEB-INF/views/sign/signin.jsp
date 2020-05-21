<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="../include/commonHeader.jsp" %>
	<link href="${cssPath}/sign/signin.css" rel="stylesheet" type="text/css" />
</head>
<body>	
	
	<div class="container">
		<section class="page-header">
			<h1>Books</h1>
			<p class="sub">Sign in to Books</p>
		</section>

		<section class="page-container">
			<form class="signin-form" action="loginProcess" method="POST">
				<label for="email">Email address</label>
				<input type="email" name="email" id="email">
				<label for="password">Password
					<a href="#" class="forgot-pw">Forgot password?</a>
				</label>				
				<input type="password" name="password" id="password">
				<input type="hidden" name="books-remember" value="on" />
				<input type="submit" name="" id="signin" value="Sign in">
			</form>
		</section>

		<section class="signup">
			New to Books? 
			<a href="#" class="account">Create an account.</a>
		</section>
	</div>
	
	<script src="${jsPath}/sign/signin.js" type="text/javascript" charset="utf-8"></script>
	
</body>
</html>