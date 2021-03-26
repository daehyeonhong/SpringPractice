<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>
        <tiles:getAsString name="title" />
    </title>
    <tiles:insertAttribute name="css" />
    <tiles:insertAttribute name="script" />
</head>

<body id="page-top">

    <div id="wrapper">
        <tiles:insertAttribute name="sidebar" />
        <div id="content-wrapper" class="d-flex flex-column">
            <div id="content">
                <tiles:insertAttribute name="toolbar" />
                <tiles:insertAttribute name="body" />
            </div>
            <tiles:insertAttribute name="footer" />
        </div>
    </div>
    <tiles:insertAttribute name="button" />
    <tiles:insertAttribute name="logoutModal" />

</body>

</html>