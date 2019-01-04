$(function () {
    //加载弹出层
    layui.use(
        ['form', 'element'],
        function () {
            layer = layui.layer;
            element = layui.element;
        }
    );

    var tableCheck = {
        init: function () {
            $(".layui-form-checkbox").click(function (event) {
                if ($(this).hasClass('layui-form-checked')) {
                    $(this).removeClass('layui-form-checked');
                    if ($(this).hasClass('header')) {
                        $(".layui-form-checkbox").removeClass('layui-form-checked');
                    }
                } else {
                    $(this).addClass('layui-form-checked');
                    if ($(this).hasClass('header')) {
                        $(".layui-form-checkbox").addClass('layui-form-checked');
                    }
                }

            });
        },
        getData: function () {
            var obj = $(".layui-form-checked").not('.header');
            var arr = [];
            obj.each(function (index, el) {
                arr.push(obj.eq(index).attr('data-id'));
            });
            return arr;
        }
    }

    //开启表格多选
    tableCheck.init();

    $('.container .left_open i').click(function (event) {
        if ($('.left-nav').css('left') == '0px') {
            $('.left_open i').html('&#xe66b;');
            $('.left-nav').animate({left: '-250px'}, 100);
            $('.page-content').animate({left: '0px'}, 100);
            $('.page-content-bg').hide();
        } else {
            $('.left_open i').html('&#xe668;');
            $('.left-nav').animate({left: '0px'}, 100);
            $('.page-content').animate({left: '250px'}, 100);
            if ($(window).width() < 768) {
                $('.page-content-bg').show();
            }
        }

    });

    $('.page-content-bg').click(function (event) {
        $('.left-nav').animate({left: '-250px'}, 100);
        $('.page-content').animate({left: '0px'}, 100);
        $(this).hide();
    });

    $('.layui-tab-close').click(function (event) {
        $('.layui-tab-title li').eq(0).find('i').remove();
    });

});

/*弹出层*/
/*
 参数解释：
 title   标题
 url     请求的url
 id      需要操作的数据id
 w       弹出层宽度（缺省调默认值）
 h       弹出层高度（缺省调默认值）
 */
function x_admin_show(title, url, w, h) {
    if (title == null || title == '') {
        title = false;
    }
    if (url == null || url == '') {
        url = "404.html";
    }
    if (w == null || w == '') {
        w = ($(window).width() * 0.9);
    }
    if (h == null || h == '') {
        h = ($(window).height() - 50);
    }
    layer.open({
        type: 2,
        area: [w + 'px', h + 'px'],
        fix: false, //不固定
        maxmin: true,
        shadeClose: true,
        shade: 0.4,
        title: title,
        content: url
    });
}

/*关闭弹出框口*/
function x_admin_close() {
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
}


