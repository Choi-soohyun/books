"use strict";

// 메뉴
const toggleBackground = document.querySelector('#toggleBackground');
const navbarToggler = document.querySelector('#navbarToggler');
const navbarNav = document.querySelector('#navbarNav');

const clickToggleMenu = (event) => {
	toggleBackground.classList.toggle('hidden');
};

const navbarNavCopy = () => {
	toggleBackground.innerHTML = navbarNav.outerHTML;
}

navbarToggler.addEventListener('click', clickToggleMenu);
toggleBackground.addEventListener('click', clickToggleMenu);

navbarNavCopy();

// 공백 체크
const isEmpty = (str) => {
	if(typeof str == "undefined" || str == null || str == "") 
		return true;
	else 
		return false;
}

// 이메일 체크
const emailRegChk = (txt) => {
	const regex = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
	return (txt != '' && txt != 'undefined' && regex.test(txt));
}