<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户登录</title>
    <!-- Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style>
        /*web background*/
        .container{
            display:table;
            height:100%;
        }
        .row{
            display: table-cell;
            vertical-align: middle;
        }
        /* centered columns styles */
        .row-centered {
            text-align:center;
        }
        .col-centered {
            display:inline-block;
            float:none;
            text-align:left;
            margin-right:-4px;
        }
        .btn{
            text-align: center;
            vertical-align: center;
        }
    </style>


</head>
<body>
<div class="container">
    <div class="row row-centered">
        <div class="well col-md-4 col-centered" >
            <h1>欢迎登录</h1>
            <form:form  method="post" role="form" action="/exam/login/loginValidate">

                <div class="alert alert-danger col-md-12 " id="errorMessage">错误！请进行一些更改。</div>

                <div class="input-group col-md-10 col-md-offset-1 input-group-md">
                    <span class="input-group-addon" ><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span>
                    <input type="text" class="form-control" id="userName" name="userName" AUTOCOMPLETE="off" placeholder="请输入用户ID"/>
                </div>
                <br/>
                <div class="input-group col-md-10 col-md-offset-1 input-group-md">
                    <span class="input-group-addon" ><i class="glyphicon glyphicon-lock"></i></span>
                    <input type="password" class="form-control" id="password" name="passWord" AUTOCOMPLETE="off" placeholder="请输入密码"/>
                </div>
                <br/>
                <div class="col-md-6 col-md-offset-3">
                    <button type="button" id="loginButton" class="btn btn-success">登录</button>
                    <button type="reset" class="btn btn-default" >重置</button>
                </div>

            </form:form>
        </div>
    </div>
</div>


<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="../resource/script/user.js" type="text/javascript"></script>
</body>

<script>
    $(function () {
        $("#loginButton").click(function () {
            userName=$("#userName").val();
            passWord=$("#password").val();
            user.HANDLEUSER(userName,passWord);
        });
        $("#errorMessage").hide();
    });



</script>
</html>
