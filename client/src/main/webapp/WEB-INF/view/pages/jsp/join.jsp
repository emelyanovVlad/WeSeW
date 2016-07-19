<%@ page pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/view/pages/dir/page.jspf" %>
<%@ include file="/WEB-INF/view/pages/dir/libs.jspf" %>
<html>
<head>
    <c:set var="title" value="Join Us | WeSeW"/>
    <title>${title}</title>
    <ctag:head/>
</head>
<body>
<div class="header">
    <div class="content-container">
        <div class="menu not-alone">
            <div class="menubar">
                <a href="/home">Home</a>
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
    <div class="middle-area">
        <div class="half-area not-alone">
            <div class="form">
                <form class="form-custom" action="/join" method="POST">
                    <fieldset>
                        <legend>Join us</legend>
                        <div class="form-group">
                            <label for="joinEmail">Email</label>
                            <input id="joinEmail" name="email" type="text">
                            <ctag:err key="email"/>
                        </div>
                        <div class="form-group">
                            <label for="joinPass">Password</label>
                            <input id="joinPass" name="password" type="password">
                            <ctag:err key="password"/>
                        </div>
                        <div class="form-group">
                            <label for="joinFname">First name</label>
                            <input id="joinFname" name="firstName" type="text">
                            <ctag:err key="firstName"/>
                        </div>
                        <div class="form-group">
                            <label for="joinLname">Last name</label>
                            <input id="joinLname" name="lastName" type="text">
                            <ctag:err key="lastName"/>
                        </div>
                        <div class="form-group">
                            <input class="btn btn-success" type="submit" value="Join">
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>

        <div class="half-area not-alone">
            <div class="form">
                <form class="form-custom" action="/signin" method="POST">
                    <fieldset>
                        <legend>Sign in</legend>
                        <div class="form-group">
                            <label for="signEmail">Email</label>
                            <input id="signEmail" name="email" type="text">
                            <ctag:err key="email"/>
                        </div>
                        <div class="form-group">
                            <label for="signPass">Password</label>
                            <input id="signPass" name="password" type="password">
                            <ctag:err key="password"/>
                        </div>
                        <div class="form-group">
                            <input class="btn btn-info" type="submit" value="Sign in">
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>