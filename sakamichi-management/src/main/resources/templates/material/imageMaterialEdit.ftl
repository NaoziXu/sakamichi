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
    <link rel="stylesheet" href="${bathPath}/css/x-admin.css" media="all">
</head>

<body>
<div class="x-body">
    <form class="layui-form">
        <input type="hidden" id="materialId" value="${materialId}"/>
        <div class="layui-form-item">
            <label for="cname" class="layui-form-label">
                图片名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="cname" name="cname" required="" lay-verify="required"
                       autocomplete="off"  value="1" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="curl" class="layui-form-label">
                图片地址
            </label>
            <div class="layui-input-inline">
                <input type="text" id="curl" name="curl" required="" lay-verify="required"
                       autocomplete="off"  value="1" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="cimage" class="layui-form-label">
                图片
            </label>
            <div class="layui-input-inline">
                <input type="file" id="cimage" name="cimage" required="" lay-verify="required"
                       autocomplete="off"  value="1" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label for="L_repass" class="layui-form-label">
            </label>
            <button  class="layui-btn" lay-filter="save" lay-submit="">
                提交
            </button>
        </div>
    </form>
</div>
<script src="${bathPath}/js/jquery.min.js"></script>
<script src="${bathPath}/lib/layui/layui.js" charset="utf-8"></script>
<script src="${bathPath}/js/x-layui.js" charset="utf-8"></script>
<script type="text/javascript">
    $(function() {
        var materialId = $("#materialId").val();
        if(materialId != null && materialId != "0"){

        }
    });

    function getMaterialAndFill(){

    }

    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form();
        var layer = layui.layer;


        //监听提交
        form.on('submit(save)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("保存成功", {icon: 6},function () {
                var index = parent.layer.getFrameIndex(window.name);
                parent.layer.close(index);
            });
            return false;
        });


    });
</script>
</body>

</html>