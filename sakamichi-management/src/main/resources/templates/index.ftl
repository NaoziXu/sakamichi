<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sakamichi</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <#include "common/basic.ftl">
</head>
<body>
<!-- 顶部开始 -->
<div class="container">
    <div class="logo" style="height:100%;width:250px;float:left;">
        <div style="width:160px;height:inherit;margin:auto;">
            <img src="/images/sakamichi-logo1.png" onclick="javascript:location.replace(location.href);"
                 style="width:inherit;margin-top:5px;cursor:pointer;">
        </div>
    </div>
    <div class="left_open">
        <i title="隐藏或展示主菜单" class="layui-icon">&#xe668;</i>
    </div>
    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">${username}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd>
                    <a href="javascript:;">修改密码</a>
                </dd>
                <dd>
                    <a href="/logout">退出</a>
                </dd>
            </dl>
        </li>
    </ul>

</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
    <div id="side-nav" style="height:100%!important;">
        <ul id="nav">
            <li>
                <a _href="/getContent/welcome">
                    <i class="layui-icon">&#xe68e;</i>
                    <cite>首页</cite>
                </a>
            </li>

            <li>
                <a _href="javascript:;">
                    <i class="layui-icon">&#xe705;</i>
                    <cite>文章</cite>
                </a>
            </li>

            <li>
                <a _href="javascript:;">
                    <i class="layui-icon">&#xe702;</i>
                    <cite>微博</cite>
                </a>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe634;</i>
                    <cite>素材</cite>
                    <i class="layui-icon nav_right">&#xe603;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="/material/toImageMaterial">
                            <i class="layui-icon">&#xe64a;</i>
                            <cite>图片</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="/material/toImageTextMaterial">
                            <i class="layui-icon">&#xe6fc;</i>
                            <cite>音频</cite>
                        </a>
                    </li>
                </ul>
            </li>

            <li>
                <a href="javascript:;">
                    <i class="layui-icon">&#xe606;</i>
                    <cite>评论</cite>
                    <i class="layui-icon nav_right">&#xe603;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="javascript:;">
                            <i class="layui-icon">&#xe63a;</i>
                            <cite>博客评论</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="javascript:;">
                            <i class="layui-icon">&#xe609;</i>
                            <cite>主页留言</cite>
                        </a>
                    </li>
                </ul>
            </li>

            <li>
                <a _href="javascript:;">
                    <i class="layui-icon">&#xe770;</i>
                    <cite>访客</cite>
                </a>
            </li>

            <li>
                <a _href="javascript:;">
                    <i class="layui-icon">&#xe62d;</i>
                    <cite>统计分析</cite>
                </a>
            </li>

            <li>
                <a _href="javascript:;">
                    <i class="layui-icon">&#xe631;</i>
                    <cite>系统设置</cite>
                </a>
            </li>
        </ul>
    </div>
</div>
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab layui-tab-card" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="layui-this" lay-id="1">首页</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show" id="frame-content">
                <iframe src='/getContent/welcome' frameborder="0" scrolling="yes" class="x-iframe" tab-id="1"></iframe>
            </div>
        </div>
    </div>
</div>
<div class="page-content-bg"></div>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->
<!-- 底部开始 -->
<div class="footer">
    <div class="copyright">Copyright ©2019 sakamichi All Rights Reserved</div>
</div>
<!-- 底部结束 -->
<script type="text/javascript">
    $(function () {
        //触发事件
        var tab = {
            tabAdd: function (title, url, id) {
                //新增一个Tab项
                element.tabAdd('xbs_tab', {
                    title: title,
                    content: '<iframe tab-id="' + id + '" frameborder="0" src="' + url + '" scrolling="yes" class="x-iframe"></iframe>',
                    id: id
                });
            },
            tabDelete: function (othis) {
                //删除指定Tab项
                element.tabDelete('xbs_tab', '44');
                othis.addClass('layui-btn-disabled');
            },
            tabChange: function (id) {
                //切换到指定Tab项
                element.tabChange('xbs_tab', id);
            }
        };

        //左侧菜单效果
        $('.left-nav #nav li').click(function (event) {
            if ($(this).children('.sub-menu').length) {
                if ($(this).hasClass('open')) {
                    $(this).removeClass('open');
                    $(this).find('.open').removeClass('open');
                    $(this).find('.nav_right').html('&#xe603;');
                    $(this).find('.sub-menu').stop().slideUp();
                } else {
                    $(this).addClass('open');
                    $(this).siblings().find('.sub-menu').stop().slideUp();
                    $(this).siblings().find('.nav_right').html('&#xe603;');
                    $(this).siblings().removeClass('open');
                    $(this).siblings().find('.open').removeClass('open');
                    $(this).find('.nav_right').eq(0).html('&#xe61a;');
                    $(this).find('.sub-menu').eq(0).stop().slideDown();
                }
            }
            else {
                //改变颜色
                $('.left-nav #nav li').removeClass("selected-menu-li");
                $(this).addClass("selected-menu-li");
                //切换窗口
                var url = $(this).children('a').attr('_href');
                var title = $(this).find('cite').html();
                var index = $('.left-nav #nav li').index($(this)) + 1;
                for (var i = 0; i < $('.x-iframe').length; i++) {
                    if ($('.x-iframe').eq(i).attr('tab-id') == index) {
                        tab.tabChange(index);
                        event.stopPropagation();
                        return;
                    }
                }
                tab.tabAdd(title, url, index);
                tab.tabChange(index);
            }
            //将当前按钮写入缓存
            localStorage.setItem("nowMenuMain", $("#testMenu").find(".open a cite").eq(0).text());
            localStorage.setItem("nowMenuSub", $(this).find("a cite").eq(0).text());
            event.stopPropagation();
        });

    });

    // 给一级菜单添加滚动条
    $("#side-nav").mCustomScrollbar("destroy");
    $("#side-nav").mCustomScrollbar({
        theme: "inset",
        contentTouchScroll: true,
        mouseWheelPixels: 400,
        autoHideScrollbar: true,
        advanced: {
            updateOnContentResize: true,
            updateOnBrowserResize: true,
            autoScrollOnFocus: false
        }
    });

</script>
</body>
</html>