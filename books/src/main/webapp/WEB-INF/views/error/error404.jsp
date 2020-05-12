<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Error</title>
	<style type="text/css">
		html, body { display:flex; align-items:center; width:100%; height:100%; margin:0; padding:0; }
		section { width:100%; text-align:center; }
		section img { width:200px; }
	</style>
</head>
<body>
		
	<section>
		<img src='${pageContext.request.contextPath}/resources/images/common/404-error.png' />
		<h2>Page Not Found</h2>
	</section>

</body>
</html>