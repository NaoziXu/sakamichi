<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>sakamichi-management</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${basePath}/css/x-admin.css" media="all">
</head>
<body>
<div class="x-body">
    <blockquote class="layui-elem-quote news_search">
        <div class="layui-inline">
            <a class="layui-btn layui-btn-danger" onclick="batchDelete();">批量删除</a>
        </div>
        <div class="layui-inline">
            <a class="layui-btn layui-btn-normal" onclick="addNew();">新增</a>
        </div>
        <div class="layui-col-md12 x-so" style="width:auto;float:right;">
            <input type="text" id="search" name="search" placeholder="按标题进行检索..."
                   autocomplete="off" class="layui-input">
        </div>
    </blockquote>
    <div class="main-content">
        <div class="layui-row layui-col-space10">
            <div class="layui-col-md3">
                <div class="grid-demo grid-demo-bg1">3/12</div>
            </div>
            <div class="layui-col-md3">
                <div class="grid-demo grid-demo-bg1">3/12</div>
            </div>
            <div class="layui-col-md3">
                <div class="grid-demo grid-demo-bg1">3/12</div>
            </div>
            <div class="layui-col-md3">
                <div class="grid-demo grid-demo-bg1">3/12</div>
            </div>
        </div>
    </div>
</div>
<script src="${basePath}/lib/layui/layui.js" charset="utf-8"></script>
<script src="${basePath}/js/x-admin.js"></script>
<script type="text/javascript">
    $(function() {

    });

    function addNew(){

    }

    function update() {

    }

    function singleDelete() {

    }

    function batchDelete(){

    }
</script>
</body>
</html>