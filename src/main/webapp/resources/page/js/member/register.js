'use strict';
const submitBtn = document.querySelector('#submitBtn');

function handleSubmit(event) {
    event.preventDefault();
    const userForm = document.querySelector('.user');
    userForm.submit();
}

function clickSubmitBtn(submitBtn) {
    submitBtn.addEventListener('click', handleSubmit);
}

function init() {
    clickSubmitBtn(submitBtn);
}

init();