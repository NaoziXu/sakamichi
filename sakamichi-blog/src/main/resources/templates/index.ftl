<!DOCTYPE html>
<html class="no-js lt-ie9 lt-ie8 lt-ie7">
<head>

    <title>sakamichi-Naozi</title>

    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>

    <!-- CSS | bootstrap -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <!-- CSS | font-awesome -->
    <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css"/>
    <!-- CSS | animate -->
    <link rel="stylesheet" type="text/css" href="css/animate.min.css"/>
    <!-- CSS | Normalize -->
    <link rel="stylesheet" type="text/css" href="css/jquery.mCustomScrollbar.css"/>
    <!-- CSS | Colors -->
    <link rel="stylesheet" type="text/css" href="css/colors/DarkBlue.css" id="colors-style"/>
    <link rel="stylesheet" type="text/css" href="css/switcher.css"/>
    <!-- CSS | Style -->
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <!-- CSS | prettyPhoto -->
    <link rel="stylesheet" type="text/css" href="css/prettyPhoto.css"/>
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="images/favicon/favicon.ico">
    <!-- CSS |  -->

    <style>
        @media only screen and (max-width: 991px) {
            .resp-vtabs .resp-tabs-container {
                margin-left: 13px;
            }
        }

        @media only screen and (min-width: 800px) and (max-width: 991px) {
            .resp-vtabs .resp-tabs-container {
                margin-left: 13px;
                width: 89%;
            }
        }


    </style>
</head>

<body>
<!-- Laoding page -->
<div id="preloader">
    <div id="spinner"></div>
</div>

<!-- .slideshow -->
<ul class="cb-slideshow" id="cb_slideshow" style="display:block;">
    <li><span>Image 01</span>
        <div></div>
    </li>
    <li><span>Image 02</span>
        <div></div>
    </li>
    <li><span>Image 03</span>
        <div></div>
    </li>
    <li><span>Image 04</span>
        <div></div>
    </li>
    <li><span>Image 05</span>
        <div></div>
    </li>
    <li><span>Image 06</span>
        <div></div>
    </li>
</ul>
<!-- /.slideshow -->

<!-- .wrapper -->
<div class="wrapper">

    <!--- .Content -->
    <section class="tab-content">
        <div class="container">

            <div class="row">

                <div class="col-md-12">

                    <div class="row">

                        <div class="col-md-3 widget-profil">
                            <div class="row">

                                <!-- Profile Image -->
                                <div class="col-lg-12 col-md-12 col-sm-3 col-xs-12 ">

                                    <!-- style for simple image profile -->
                                    <div class="circle-img" id="pic_prof_2"></div>

                                </div>
                                <!-- End Profile Image -->

                                <div class="col-lg-12 col-md-12 col-sm-9 col-xs-12">


                                    <!-- Profile info -->
                                    <div id="profile_info">
                                        <h1 id="name" class="transition-02">脑纸 xu</h1>
                                        <h4 class="line">一个迷茫的码农</h4>
                                        <h6><span class="fa fa-map-marker"></span> 北京·中关村</h6>
                                    </div>
                                    <!-- End Profile info -->


                                    <!-- Profile Description -->
                                    <div id="profile_desc">
                                        <p>
                                            曾经想要要怒刚一切，把沿路的感想都活出个答案。
                                        </p>
                                        <p>
                                            现在只想把写代码这一件事情做好。
                                        </p>
                                    </div>
                                    <!-- End Profile Description -->


                                    <!-- some text -->
                                    <div id="profile_social">
                                        <h6>不定期更换的单曲循环</h6>
                                        <iframe frameborder="no" border="0" marginwidth="0" marginheight="0" width=100% height=86
                                                src="//music.163.com/outchain/player?type=2&id=461525011&auto=1&height=66"></iframe>
                                    </div>
                                    <!-- End text -->


                                </div>

                            </div>
                        </div>

                        <div class="col-md-9 flexy_content" style="padding-left: 0;padding-right: 0;">

                            <!-- verticalTab menu -->
                            <div id="verticalTab">

                                <ul class="resp-tabs-list">
                                    <li class="tabs-profile hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5a profile"
                                        data-tab-name="profile">
                                        <span class="tite-list">profile</span>
                                        <i class="fa fa-user icon_menu icon_menu_active"></i>
                                    </li>

                                    <li class="tabs-resume hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5a"
                                        data-tab-name="resume">
                                        <span class="tite-list">resume</span>
                                        <i class="fa fa-tasks icon_menu"></i>
                                    </li>

                                    <li class="tabs-portfolio hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5a"
                                        data-tab-name="portfolio">
                                        <span class="tite-list">portfolio</span>
                                        <i class="fa fa-briefcase icon_menu"></i>
                                    </li>

                                    <li class="tabs-blog hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5a"
                                        data-tab-name="blog">
                                        <span class="tite-list">blog</span>
                                        <i class="fa fa-bullhorn icon_menu"></i>
                                    </li>

                                    <li class="tabs-contact hi-icon-wrap hi-icon-effect-5 hi-icon-effect-5a"
                                        data-tab-name="contact" style="margin-bottom: 48px !important;">
                                        <span class="tite-list">contact</span>
                                        <i class="fa fa-envelope icon_menu"></i>
                                    </li>

                                    <a href="#" id="print"><i class="fa fa-print icon_print"></i> </a>
                                    <a href="#" id="downlowd"><i class="fa fa-download icon_print"></i> </a>
                                </ul>
                                <!-- /resp-tabs-list -->


                                <!-- resp-tabs-container -->
                                <div id="resp-tabs-container" class="resp-tabs-container">

                                </div>
                                <!-- End #resp-tabs-container -->

                            </div><!-- End verticalTab -->

                        </div><!-- End flexy_content -->


                    </div><!-- End row -->

                </div><!-- End col-md-12 -->

            </div><!-- End row -->

        </div><!-- End container -->

    </section>
    <!-- End Content -->

</div>
<!-- End wrapper -->

<!-- Switcher -->
<div id="custumize-style">
    <h2 style="display:none;">Style Selector<a href="#" class="switcher"><i class="fa fa-cogs icon-switcher"></i></a></h2>
    <div style="display:none;">
        <h3>Theme Color</h3>
        <ul class="colors-style" id="color1">

            <li><a href="#" class="gray"></a></li>
            <li><a href="#" class="green"></a></li>
            <li><a href="#" class="blue"></a></li>
            <li><a href="#" class="red"></a></li>
            <li><a href="#" class="yellow"></a></li>

            <li><a href="#" class="DarkBlue"></a></li>
            <li><a href="#" class="orange"></a></li>
            <li><a href="#" class="rose"></a></li>
            <li><a href="#" class="lightseagreen"></a></li>
            <li><a href="#" class="darkolivegreen"></a></li>

        </ul>
    </div>
    <div>

    <#--<h3 class="layouts">Profile Image</h3>-->
        <div id="show" style="display:none;">
            <div class="clean-check">
                <input type="radio" id="r1" name="style_profile" value="style_profile_1"/>
                <label for="r1"><span></span>Rotating image</label>
                <input type="radio" id="r2" name="style_profile" value="style_profile_2" checked="checked"/>
                <label for="r2"><span></span>Fixed image</label>
            </div>
        </div>



    <#--<h3 class="layouts">Page Builder</h3>-->
    <#--<div id="show">-->
    <#--<div class="clean-check" style="padding-left: 30px;">-->

    <#--<input type="radio" id="pb1" name="page_builder" value="http://demo.flexy-codes.com/FlexyVcard"  checked />-->
    <#--<label for="pb1"><span></span>Style 1</label>-->

    <#--<input type="radio" id="pb2" name="page_builder" value="http://demo.flexy-codes.com/FlexyVcard/page-builder-2.php"  />-->
    <#--<label for="pb2"><span></span>Style 2</label>-->

    <#--<input type="radio" id="pb3" name="page_builder" value="http://demo.flexy-codes.com/FlexyVcard/page-builder-3.php"  />-->
    <#--<label for="pb3"><span></span>Style 3</label>-->

    <#--<input type="radio" id="pb4" name="page_builder" value="http://demo.flexy-codes.com/FlexyVcard/page-builder-4.php"  />-->
    <#--<label for="pb4"><span></span>Style 4</label>-->
    <#--</div>-->
    <#--</div>-->

    <#--<h3 class="layouts">Page Animation</h3>-->
        <div id="show" style="display:none;">

            <select name="one" class="dropdown-select">
                <optgroup label="Bouncing Entrances">
                    <option value="bounceIn" selected>bounceIn</option>
                    <option value="bounceInDown">bounceInDown</option>
                    <option value="bounceInLeft">bounceInLeft</option>
                    <option value="bounceInRight">bounceInRight</option>
                    <option value="bounceInUp">bounceInUp</option>
                </optgroup>

                <optgroup label="Fading Entrances">
                    <option value="fadeIn">fadeIn</option>
                    <option value="fadeInDown">fadeInDown</option>
                    <option value="fadeInLeft">fadeInLeft</option>
                    <option value="fadeInRight">fadeInRight</option>
                    <option value="fadeInUp">fadeInUp</option>
                </optgroup>
            </select>

        </div>

        <h3 class="layouts" style="padding-top:5px">Background Style</h3>
        <div id="show">

            <div class="clean-check">

                <input type="radio" id="s2" name="layout" value="bg_slider" checked="checked"/>
                <label for="s2"><span></span>Slider</label>

                <input type="radio" id="s1" name="layout" value="bg_color"/>
                <label for="s1"><span></span>Color</label>

            </div>

        </div>

    </div>

    <div>
        <h3>Background Color</h3>
        <ul class="colors-style bgsolid" id="bgsolid">
            <li><a href="#" class="gray-bg"></a></li>
            <li><a href="#" class="green-bg"></a></li>
            <li><a href="#" class="blue-bg"></a></li>
            <li><a href="#" class="red-bg"></a></li>
            <li><a href="#" class="yellow-bg"></a></li>
        </ul>
    </div>

    <div>
        <h3>Background Image</h3>
        <ul class="colors-style bg" id="bg">
            <li><a href="#" class="bg1"></a></li>
            <li><a href="#" class="bg2"></a></li>
            <li><a href="#" class="bg3"></a></li>
            <li><a href="#" class="bg4"></a></li>
            <li><a href="#" class="bg5"></a></li>
        </ul>
    </div>

    <div id="button-reset"><a href="#" class="button color blue boxed">Reset</a></div>
</div>
<!-- End Switcher -->


<!-- jquery | jQuery 1.11.0 -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- Js | bootstrap -->
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!-- Js | jquery.cycle -->
<script type="text/javascript" src="js/jquery.cycle2.min.js"></script>
<!-- jquery | rotate and portfolio -->
<script type="text/javascript" src="js/jquery.mixitup.min.js"></script>
<!-- Js | easyResponsiveTabs -->
<script type="text/javascript" src="js/easyResponsiveTabs.min.js"></script>
<!-- Js | jquery.cookie -->
<script type="text/javascript" src="js/jsSwitcher/jquery.cookie.js"></script>
<!-- Js | switcher -->
<script type="text/javascript" src="js/jsSwitcher/switcher.js"></script>
<!-- Js | mCustomScrollbar -->
<script type="text/javascript" src="js/jquery.mCustomScrollbar.concat.min.js"></script>
<!-- jquery | prettyPhoto -->
<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
<!-- Js | BaiduMap -->
<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.4"></script>
<!-- Js | Js -->
<script type="text/javascript">
    var bathPath = "${bathPath}" + "${request.contextPath}";
</script>
<script type="text/javascript" src="js/main.js"></script>
</body>
</html>