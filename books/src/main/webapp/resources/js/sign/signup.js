"use strict";

{
	const userName = document.querySelector("#username");
	const email = document.querySelector("#email");
	const password = document.querySelector("#password");
	const button = document.querySelector("#account");
	
	const checkMap = new Map();
	checkMap.set("userNameFlag", 0);
	checkMap.set("emailFlag", 0);
	checkMap.set("passwordFlag", 0);
	
	const userNameCheck = (event) => {
		if(!isEmpty(event.target.value)) {
			checkMap.set("userNameFlag", 1);
		} else {
			checkMap.set("userNameFlag", 0);
		}
		buttonCheck();
	};
	
	const emailCheck = (event) => {
		if(!isEmpty(event.target.value)) {
			if(!emailRegChk(event.target.value)) {
				email.classList.remove("is-autocheck-successful");
				email.classList.add("is-autocheck-errored");
			} else {
				// 이메일 중복체크
				const data = { "email":event.target.value };
				
				$.ajax({
					url : contextPath + "/sign/emailCheck",
					data : data,
					type : "POST",
					dataType : "json",
					success : function(jRes) {
						if(jRes.result == 1 && jRes.success == "Y") {
							checkMap.set("emailFlag", 1);
							
							// 중복 안되어있음. 사용 가능 
							email.classList.remove("is-autocheck-errored");
							email.classList.add("is-autocheck-successful");
						} else {
							// 중복 되어있음.
							email.classList.remove("is-autocheck-successful");
							email.classList.add("is-autocheck-errored");
						}
					}
				});
			}
		} else {
			checkMap.set("emailFlag", 0);
			email.classList.remove("is-autocheck-successful");
			email.classList.remove("is-autocheck-errored");
		}
		buttonCheck();
	};
	
	const passwordCheck = (event) => {
		if(!isEmpty(event.target.value)) {
			checkMap.set("passwordFlag", 1);
		} else {
			checkMap.set("passwordFlag", 0);
		}
		buttonCheck();
	};
	
	const buttonCheck = () => {
		let checkCnt = 0;
		
		checkMap.forEach(function(value, key) {
			checkCnt += value;
		});
		
		if(checkCnt >= 3) {
			button.disabled = false;
		} else {
			button.disabled = true;
		}
	}
	
	const join = (event) => {
		const data = {"user_name":userName.value, "email":email.value, "pw":password.value };
		
		$.ajax({
			url : contextPath+"/sign/join",
			data : data,
			type : "POST",
			dataType : "json",
			success : function(jRes) {
				if(jRes.result == 1 && jRes.success == "Y") {
					// 회원가입 완료 : 페이지이동
					location.href= contextPath + "/sign/signin"
				} else {
					// 회원가입 실패
					console.log("회원가입 실패");
				}
			},
			error : function(request, status, error) {
				console.log("login() : ", request.status, "\n message : ", request.responesText, "\n Error : ", error);
			}
		});
	}
	
	userName.addEventListener("input", userNameCheck);
	email.addEventListener("input", emailCheck);
	password.addEventListener("input", passwordCheck);
	button.addEventListener("click", join);
}