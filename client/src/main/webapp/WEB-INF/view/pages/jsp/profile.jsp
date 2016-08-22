<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/view/pages/dir/page.jspf" %>
<%@ include file="/WEB-INF/view/pages/dir/libs.jspf" %>
<html>
<head>
    <c:set var="title" value="Profile | WeSeW"/>
    <title>${title}</title>
    <ctag:head/>
</head>
<body>
<div class="header">
    <div class="content-container">
        <div class="menu not-alone">
            <div class="menubar">
                <a>Home</a>
                <a>gallery</a>
                <ctag:join active="true"/>
            </div>
        </div>
        <div class="logo not-alone">
            <img src="/clientlibs/img/logo.png">
        </div>
    </div>
</div>
<section class="content-area">
    <div class="profile middle-area">
        <div class="profile-data">
            <div class="profile-personal not-alone half-area">
                <div class="row-data">
                    <div class="title"><span>Email</span></div>
                    <span class="content">${dataObj.email}</span>
                </div>
                <div class="row-data">
                    <div class="title"><span>Full name</span></div>
                    <span class="content">${dataObj.firstName}&nbsp;${dataObj.lastName}</span>
                </div>
                <div class="row-data">
                    <div class="title"><span>Born at</span></div>
                    <span class="content">${dataObj.birthDate}</span>
                </div>
                <div class="row-data">
                    <div class="title"><span>You are</span></div>
                    <span class="content">${dataObj.gender}</span>
                </div>
                <div class="row-data">
                    <div class="title"><span>Mobile number</span></div>
                    <span class="content">${dataObj.cellNumber}</span>
                </div>
                <div class="row-data">
                    <div class="title"><span>Living at</span></div>
                    <span class="content">${dataObj.country}, ${dataObj.address}</span>
                </div>
                <div class="row-data">
                    <div class="title"><span>Logged as</span></div>
                    <span class="content">${dataObj.userRole}</span>
                </div>
            </div>
            <div class="profile-avatar not-alone half-area">
                <img src="/clientlibs/img/photo.jpg">

            </div>
        </div>
    </div>
</section>
</body>
</html>