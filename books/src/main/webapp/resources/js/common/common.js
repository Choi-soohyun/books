"use strict";

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