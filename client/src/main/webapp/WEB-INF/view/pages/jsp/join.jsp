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
                <a href="/join" class="active">join</a>
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
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input id="joinPass" name="password" type="password">
                        </div>
                        <div class="form-group">
                            <label>First name</label>
                            <input id="joinFname" name="firstName" type="text">
                        </div>
                        <div class="form-group">
                            <label>Last name</label>
                            <input id="joinLname" name="lastName" type="text">
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
                <form class="form-custom" method="POST">
                    <fieldset>
                        <legend>Sign in</legend>
                        <div class="form-group">
                            <label>Email</label>
                            <input type="text">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password">
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