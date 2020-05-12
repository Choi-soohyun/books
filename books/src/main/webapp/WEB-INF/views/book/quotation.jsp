<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="../include/commonHeader.jsp" %>
	<link href="${cssPath}/book/quotation.css" rel="stylesheet" type="text/css" />
	<script src="${jsPath}/book/quotation.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
	
	<%@include file="../include/navbar.jsp" %>
	
	<div class="container">
		<div class="book-subject">
			<h1>나는 불평을 그만 두기로 했다</h1>
			<p class="sub">Quotation of book</p>
		</div>

		<section class="page-container book-container">
			<ul class="book-comment-list">
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book01.jpg); ">
						<img src="${imagesPath}/book01.jpg" alt="책제목">
					</figure>
					<p class="book-subject">나는 불평을 그만두기로 했다</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book02.jpg); ">
						<img src="${imagesPath}/book02.jpg" alt="책제목">
					</figure>
					<p class="book-subject">신경끄기의 기술</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book03.jpg); ">
						<img src="${imagesPath}/book03.jpg" alt="책제목">
					</figure>
					<p class="book-subject">슬리하는 습관</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book04.jpg); ">
						<img src="${imagesPath}/book04.jpg" alt="책제목">
					</figure>
					<p class="book-subject">이 한마디가 나를 살렸다</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book05.jpg); ">
						<img src="${imagesPath}/book05.jpg" alt="책제목">
					</figure>
					<p class="book-subject">아주 작은 습관의 힘</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book06.jpg); ">
						<img src="${imagesPath}/book06.jpg" alt="책제목">
					</figure>
					<p class="book-subject">나를 몰랐기 때문이다</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book07.jpg); ">
						<img src="${imagesPath}/book07.jpg" alt="책제목">
					</figure>
					<p class="book-subject">해빗</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book08.jpg); ">
						<img src="${imagesPath}/book08.jpg" alt="책제목">
					</figure>
					<p class="book-subject">타인의 해석</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book09.jpg); ">
						<img src="${imagesPath}/book09.jpg" alt="책제목">
					</figure>
					<p class="book-subject">하버드 상위 1퍼센트의 비밀</p>
				</li>
				<li class="book-item">
					<span class="count">3개</span>
					<figure class="book-img" style="background-image:url(${imagesPath}/book10.jpg); ">
						<img src="${imagesPath}/book10.jpg" alt="책제목">
					</figure>
					<p class="book-subject">한 줄 정리의 힘</p>
				</li>
			</ul>

			<section class="book-comment">
				<ul>
					<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus unde tempore omnis molestias et, eaque, doloremque ab asperiores odio labore iusto.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus unde tempore omnis molestias et, eaque, doloremque ab asperiores odio labore iusto.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus unde tempore omnis molestias et, eaque, doloremque ab asperiores odio labore iusto.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus unde tempore omnis molestias et, eaque, doloremque ab asperiores odio labore iusto.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus unde tempore omnis molestias et, eaque, doloremque ab asperiores odio labore iusto.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus unde tempore omnis molestias et, eaque, doloremque ab asperiores odio labore iusto.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus unde tempore omnis molestias et, eaque, doloremque ab asperiores odio labore iusto.</li>
				</ul>
			</section>
		</section>

	</div>

	<div class="toggle-menu-background hidden" id="toggleBackground">
		
	</div>

	<script src="${jsPath}/common/common.js" type="text/javascript" charset="utf-8"></script>

</body>
</html>