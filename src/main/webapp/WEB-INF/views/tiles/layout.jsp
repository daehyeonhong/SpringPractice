<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<c:set var="path1" value="${requestScope['javax.servlet.include.context_path']}"></c:set>
<c:set var="path2" value="${requestScope['javax.servlet.forward.servlet_path']}"></c:set>
<html>

<head>
    <meta charset="UTF-8">
    <title><tiles:getAsString name="title" /></title>
    <tiles:insertAttribute name="css" />
    <tiles:insertAttribute name="script" />
</head>

<body class="wrapper">

    <tiles:insertAttribute name="header" />

    <div id="page-wrapper">
        <div class="container">
            <div class="row">
                <tiles:insertAttribute name="body" />
            </div>
        </div>
    </div>

    <div class="main_footer">
        <div class="main_footer-inner">
            <tiles:insertAttribute name="footer" />
        </div>
    </div>

</body>

</html>