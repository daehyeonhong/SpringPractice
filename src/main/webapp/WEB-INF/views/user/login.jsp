<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="card o-hidden border-0 shadow-lg my-5">
    <div class="card-body p-0">
        <div class="row">
            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
            <div class="col-lg-6">
                <div class="p-5">
                    <div class="text-center">
                        <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                    </div>
                    <form class="user" role="form" method="post" action="/login">
                        <div class="form-group">
                            <input type="text" class="form-control form-control-user" id="userId" name="userId" aria-describedby="emailHelp" placeholder="ID" autofocus="autofocus" />
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control form-control-user" id="userPassword" name="userPassword" placeholder="Password" />
                        </div>
                        <a href="index.html" id="submitBtn" class="btn btn-primary btn-user btn-block">
                            Login
                        </a>
                        <hr>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    </form>
                    <hr>
                    <div class="text-center">
                        <a class="small" href="forgot-password.html">Forgot Password?</a>
                    </div>
                    <div class="text-center">
                        <a class="small" href="register.html">Create an Account!</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" defer src="/resources/page/js/member/login.js"></script>