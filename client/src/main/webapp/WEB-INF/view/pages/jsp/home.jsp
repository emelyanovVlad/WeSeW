<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/view/pages/dir/page.jspf" %>
<%@ include file="/WEB-INF/view/pages/dir/libs.jspf" %>
<html>
<head>
    <c:set var="title" value="Home | WeSeW"/>
    <title>${title}</title>
    <ctag:head/>
</head>
<body>
<div class="header">
    <div class="content-container">
        <div class="menu not-alone">
            <div class="menubar">
                <a class="active">Home</a>
                <a>gallery</a>
            </div>
        </div>
        <div class="logo not-alone">
            <img src="/clientlibs/img/logo.png">
        </div>
    </div>
</div>
</body>
</html>