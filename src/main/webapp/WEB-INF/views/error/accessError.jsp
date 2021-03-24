<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container-fluid">
    <div class="text-center">
        <div class="error mx-auto" data-text="AccessError">AccessError</div>
        <p class="lead text-gray-800 mb-5">${SPRING_SECURITY_404_EXCEPTION.getMessage()}</p>
        <p class="text-gray-500 mb-0">${errorMessage}</p>
        <a href="/">&larr; Back to Dashboard</a>
    </div>
</div>