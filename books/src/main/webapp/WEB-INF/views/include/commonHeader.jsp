<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>

<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="resourcePath" value="${contextPath}/resources"/>
<c:set var="commResourcePath" value="${resourcePath}/common"/>
<c:set var="compoResourcePath" value="${resourcePath}/component"/>

<c:set var="cssPath" value="${resourcePath}/css"/>
<c:set var="jsPath" value="${resourcePath}/js"/>
<c:set var="imagesPath" value="${resourcePath}/images"/>

<script>
var contextPath = "${contextPath}";
var resourcePath = "${resourcePath}";
var commResourcePath = "${commResourcePath}";
var compoResourcePath = "${compoResourcePath}";
var cssPath = "${cssPath}";
var imagesPath = "${imagesPath}";
var jsPath = "${jsPath}";
</script>

<link href="${commResourcePath}/fontawesome-free-5.13.0-web/all.css" rel="stylesheet">
<link href="${commResourcePath}/fontawesome-free-5.13.0-web/brands.css" rel="stylesheet">
<link href="${cssPath}/common/common.css" rel="stylesheet">