'use strict';
const loginBtn = document.querySelector('#submitBtn');

function handleSubmit(event) {
    event.preventDefault();
    const form = document.querySelector('.user');
    form.submit();
}

function clickLoginBtn(loginBtn) {
    loginBtn.addEventListener('click', handleSubmit);
}

function init() {
    clickLoginBtn(loginBtn);
}

init();