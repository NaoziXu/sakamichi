<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sakamichi管理后台</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <#include "common/basic.ftl">
    <script type="text/javascript" src="/js/sha256.js"></script>
    <script type="text/javascript" src="/plugin/backCanvas/backCanvas.js"></script>
    <script type="text/javascript" src="/plugin/backStretch/jquery.backstretch.min.js"></script>
</head>
<body>
<canvas id="backCanvasContent" style="position:absolute;top:0;bottom:0;left:0;right:0;z-index:-1;"></canvas>
<div class="logo" style="text-align:center;margin-top:100px;height:100px;">
    <img id="logo" src="/images/sakamichi-logo.png" style="vertical-align:middle;display:none;">
</div>
<div class="login" id="loginForm" style="display:none;">
    <div class="message">Sakamichi 管理后台</div>
    <div id="darkbannerwrap"></div>
    <form method="post" action="/userLogin" class="layui-form" style="margin-top:25px;">
        <input id="username" name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input">
        <hr class="hr15" style="background:none;">
        <input id="password" name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
        <hr class="hr15" style="background:none;">
        <input id="login" value="登录" lay-submit lay-filter="login" type="submit"
               style="width:100%;padding:10px;font-size:15px;margin-top:62px;opacity:0.9;">
        <hr class="hr20" style="background:none;">
    </form>
</div>

<script type="text/javascript">
    $(function () {
        // 界面渐入
        $("#loginForm").fadeIn(700,function(){
            $("#logo").fadeIn(1000);
        });
        // 添加动态画布
        addCanvas("backCanvasContent");
        // 添加幻灯片背景
        $.backstretch(
            [
                "/images/bg-1.jpg", "/images/bg-2.jpg", "/images/bg-3.jpg", "/images/bg-4.jpg",
                "/images/bg-5.jpg", "/images/bg-6.jpg", "/images/bg-7.jpg", "/images/bg.png"
            ],
            {
                fade: 1000,
                duration: 8000
            }
        );
        // 添加表单模块
        layui.use('form', function () {
            var form = layui.form;
            form.on('submit(login)', function (data) {
                // 登录身份验证
                sendLogin();
                // 阻止页面表单提交
                return false;
            });
        });
    });

    // 登录身份验证
    function sendLogin() {
        $.post(
            "/userLogin",
            {
                username: $("#username").val(),
                password: sha256_digest($("#password").val())
            },
            function (data) {
                var status = data.status;
                console.log(data);
                if (status === '0') {
                    // 根据验证结果进行页面跳转
                    window.top.location.href = "/index";
                }
                else {
                    layer.msg(data.message);
                }
            }
        );
    }
</script>

</body>
</html>