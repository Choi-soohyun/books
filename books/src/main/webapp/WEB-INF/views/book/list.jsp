<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="../include/commonHeader.jsp" %>
	<link href="${cssPath}/book/list.css" rel="stylesheet" type="text/css" />
</head>
<body>	
	
	<%@include file="../include/navbar.jsp" %>

	<div class="container">
		<section class="page-header">
			<h1>Book List</h1>
			<p class="sub">These books are amazing in my life</p>
		</section>

		<section class="page-container">
			<ul class="book-list">
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book01.jpg); ">
						<img src="${imagesPath}/book01.jpg" alt="책제목">
					</figure>
					<p class="book-subject">나는 불평을 그만두기로 했다</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book02.jpg); ">
						<img src="${imagesPath}/book02.jpg" alt="책제목">
					</figure>
					<p class="book-subject">신경끄기의 기술</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book03.jpg); ">
						<img src="${imagesPath}/book03.jpg" alt="책제목">
					</figure>
					<p class="book-subject">슬리하는 습관</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book04.jpg); ">
						<img src="${imagesPath}/book04.jpg" alt="책제목">
					</figure>
					<p class="book-subject">이 한마디가 나를 살렸다</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book05.jpg); ">
						<img src="${imagesPath}/book05.jpg" alt="책제목">
					</figure>
					<p class="book-subject">아주 작은 습관의 힘</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book06.jpg); ">
						<img src="${imagesPath}/book06.jpg" alt="책제목">
					</figure>
					<p class="book-subject">나를 몰랐기 때문이다</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book07.jpg); ">
						<img src="${imagesPath}/book07.jpg" alt="책제목">
					</figure>
					<p class="book-subject">해빗</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book08.jpg); ">
						<img src="${imagesPath}/book08.jpg" alt="책제목">
					</figure>
					<p class="book-subject">타인의 해석</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book09.jpg); ">
						<img src="${imagesPath}/book09.jpg" alt="책제목">
					</figure>
					<p class="book-subject">하버드 상위 1퍼센트의 비밀</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
				<li class="book-item">
					<figure class="book-img" style="background-image:url(${imagesPath}/book10.jpg); ">
						<img src="${imagesPath}/book10.jpg" alt="책제목">
					</figure>
					<p class="book-subject">한 줄 정리의 힘</p>
					<p class="book-read-date">2020.05.05</p>
				</li>
			</ul>
		</section>
		
	</div>

	<%@include file="../include/commonFooter.jsp" %>
	<script src="${jsPath}/book/list.js" type="text/javascript" charset="utf-8"></script>

</body>
</html>