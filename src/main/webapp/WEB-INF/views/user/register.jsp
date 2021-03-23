<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="card o-hidden border-0 shadow-lg my-5">
    <div class="card-body p-0">
        <div class="row">
            <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
            <div class="col-lg-7">
                <div class="p-5">
                    <div class="text-center">
                        <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                    </div>
                    <form class="user" method="post" action="/member/register">
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="text" class="form-control form-control-user" id="memberId" name="memberId" placeholder="MemberID">
                            </div>
                            <div class="col-sm-6">
                                <a href="login.html" class="btn btn-primary btn-user btn-block">
                                    checkID
                                </a>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="password" class="form-control form-control-user" id="memberPassword" name="memberPassword" placeholder="memberPassword">
                            </div>
                            <div class="col-sm-6">
                                <input type="password" class="form-control form-control-user" id="checkMemberPassword" name="checkMemberPassword" placeholder="checkMemberPassword">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="text" class="form-control form-control-user" id="memberName" name="memberName" placeholder="MemberName">
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control form-control-user" id="memberNickname" name="memberNickname" placeholder="MemberNickname">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="date" class="form-control form-control-user" id="birthDate" name="birthDate" placeholder="BirthDate">
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control form-control-user" id="memberEmail" name="memberEmail" placeholder="MemberEmail">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="text" class="form-control form-control-user" id="memberPhone" name="memberPhone" placeholder="memberPhone">
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control form-control-user" id="license" name="license" placeholder="license">
                            </div>
                        </div>
                        <a href="login.html" id="submitBtn" class="btn btn-primary btn-user btn-block">
                            Register Account
                        </a>
                        <hr>
                        <a href="index.html" class="btn btn-google btn-user btn-block">
                            <i class="fab fa-google fa-fw"></i> Register with Google
                        </a>
                        <a href="index.html" class="btn btn-facebook btn-user btn-block">
                            <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                        </a>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    </form>
                    <hr>
                    <div class="text-center">
                        <a class="small" href="forgot-password.html">Forgot Password?</a>
                    </div>
                    <div class="text-center">
                        <a class="small" href="login.html">Already have an account? Login!</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" defer src="/resources/page/js/member/register.js"></script>