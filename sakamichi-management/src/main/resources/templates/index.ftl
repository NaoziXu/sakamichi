<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>sakamichi-Management;</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link rel="shortcut icon" href="${basePath}/lib/favicon/favicon.ico" type="image/x-icon" />
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="${basePath}/css/x-admin.css" media="all">
    </head>
    <body>
        <div class="layui-layout layui-layout-admin">
            <!-- 右上角菜单 -->
            <div class="layui-header header header-demo">
                <div class="layui-main">
                    <a class="logo" href="javascript:;">
                        SAKAMICHI
                    </a>
                    <ul class="layui-nav" lay-filter="">
                      <li class="layui-nav-item">
                        <a href="javascript:;">admin</a>
                        <dl class="layui-nav-child"> <!-- 二级菜单 -->
                          <dd><a href="">个人信息</a></dd>
                          <dd><a href="">切换帐号</a></dd>
                          <dd><a href="${basePath}/logout">退出</a></dd>
                        </dl>
                      </li>
                    </ul>
                </div>
            </div>
            <!-- 一级菜单 -->
            <div class="layui-side layui-bg-black x-side">
                <div class="layui-side-scroll">
                    <ul id="main-menu" class="layui-nav layui-nav-tree site-demo-nav" lay-filter="side">
                        <li class="layui-nav-item">
                            <a _href="${basePath}/getContent/welcome" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe62d;</i><cite>首页</cite>
                            </a>
                        </li>

                        <li class="layui-nav-item">
                            <a class="javascript:;" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe642;</i><cite>文章管理</cite>
                            </a>
                            <dl class="layui-nav-child">
                            </dl>
                        </li>

                        <li class="layui-nav-item">
                            <a class="javascript:;" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe634;</i><cite>素材管理</cite>
                            </a>
                            <dl class="layui-nav-child">
                                <dd>
                                    <a href="javascript:;" _href="${basePath}/material/toImageMaterial">
                                        <cite>图片</cite>
                                    </a>
                                </dd>
                                <dd>
                                    <a href="javascript:;" _href="${basePath}/material/toImageTextMaterial">
                                        <cite>图文</cite>
                                    </a>
                                </dd>
                                <dd>
                                    <a href="javascript:;" _href="${basePath}/material/toArticleMaterial">
                                        <cite>文章</cite>
                                    </a>
                                </dd>
                            </dl>
                        </li>

                        <li class="layui-nav-item">
                            <a class="javascript:;" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe630;</i><cite>标签管理</cite>
                            </a>
                            <dl class="layui-nav-child">
                            </dl>
                        </li>

                        <li class="layui-nav-item">
                            <a class="javascript:;" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe606;</i><cite>评论管理</cite>
                            </a>
                            <dl class="layui-nav-child">
                                <dd class="">
                                    <a href="javascript:;" _href="">
                                        <cite>评论列表</cite>
                                    </a>
                                </dd>
                                <dd class="">
                                    <a href="javascript:;" _href="">
                                        <cite>意见反馈</cite>
                                    </a>
                                </dd>
                            </dl>
                        </li>

                        <li class="layui-nav-item">
                            <a class="javascript:;" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>访客管理</cite>
                            </a>
                            <dl class="layui-nav-child">
                            </dl>
                        </li>

                        <li class="layui-nav-item">
                            <a class="javascript:;" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe629;</i><cite>系统统计</cite>
                            </a>
                            <dl class="layui-nav-child">
                            </dl>
                        </li>

                        <li class="layui-nav-item">
                            <a class="javascript:;" href="javascript:;">
                                <i class="layui-icon" style="top: 3px;">&#xe614;</i><cite>系统设置</cite>
                            </a>
                            <dl class="layui-nav-child">
                            </dl>
                        </li>

                    </ul>
                </div>
            </div>
            <!-- 主窗体 -->
            <div class="layui-tab layui-tab-card site-demo-title x-main" lay-filter="x-tab" lay-allowclose="true">
                <div class="x-slide_left"></div>
                <ul class="layui-tab-title">
                    <li class="layui-this">首页</li>
                </ul>
                <div class="layui-tab-content site-demo site-demo-body">
                    <div class="layui-tab-item layui-show">
                        <iframe frameborder="0" src="${basePath}/getContent/welcome" class="x-iframe"></iframe>
                    </div>
                </div>
            </div>
            <div class="site-mobile-shade">
            </div>
        </div>
        <script src="${basePath}/js/jquery.min.js"></script>
        <script src="${basePath}/lib/layui/layui.js" charset="utf-8"></script>
        <script src="${basePath}/js/x-admin.js"></script>
        <script type="text/javascript">
        </script>
    </body>
</html>