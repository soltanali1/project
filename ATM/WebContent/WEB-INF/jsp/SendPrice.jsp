<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>

<head>
    <title>ارسال مبلغ</title>

    <meta charset="UTF-8">
    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.11.0.js"></script>
</head>
<body style="background-color: whitesmoke">
<header>
    <div style="width: 100%;height: 200px;overflow: hidden;">
        <img src="${pageContext.request.contextPath}/static/image/105666394.jpg" style="width: 100%;">
    </div>
</header>
<!-- Navbar Begin -->
<nav class="navbar navbar-default no-margin">
    <div class="container-fluid">
        <div class="navbar-header navbar-right">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right" style="margin: 0 20px ;">

                <li class=""><a href="#">انتقال وجه</a></li>
                <li class=""><a href="#">برداشت وجه</a></li>

                <li class=""><a href="#">ضصخانه</a></li>
            </ul>
            <ul class="nav navbar-nav">
                <li class=""><a href="#" title="ورود"><span class="glyphicon glyphicon-log-in"></span></a></li>
            </ul>
        </div>
    </div>
</nav><!-- Navbar End -->
<div class="container rtl">
    <div style="width: 100%;">
        <div class="text-center" style="width: 45%;margin:2% auto;padding: 20px; border: 3px solid dimgrey;background-color: #dddddd ">
            <h2>ارسال وجه</h2>
            <form action="/ATM/SendPrice" method="post">
                <div class="form-group" style="width: 20%; margin: 0 auto;">
                    <label for="fee">مبلغ درخواستی</label>
                    <input id="fee" type="text" name="Price" class="form-control" placeholder=" تومان" >
                </div>
                <div class="form-group">
                    <input  type="text" name="CardId" class="form-control" placeholder="شماره کارت عضو شبکه شتاب" required >
                </div>
                <input type="submit" class="btn btn-success" value="ارسال">
            </form>
        </div>
    </div>
</div>



</body>
</html>