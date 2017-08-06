<!-- .contact -->
<div id="contact" class="content_2">

    <h1 class="h-bloc">找我聊聊 - 联系</h1>


    <div class="row">

        <div class="col-lg-12">
            <div id="map"></div>
        </div>

        <div class="col-lg-12">
            <div class="row" id="contact-user">
                <div class="col-md-5">
                    <div class="contact-info">
                        <!--<h3 class="main-heading"><span>Contact info</span></h3>-->

                        <div class="title_content" style="float: none;">
                            <div class="text_content">方便的联系方式</div>
                            <div class="clear"></div>
                        </div>

                        <ul>
                            <li><span class="span-info"><i
                                    class="glyphicon glyphicon-map-marker"></i> 面基:</span>
                                北京·中关村<br/><br/></li>
                            <li><span class="span-info"><i
                                    class="glyphicon glyphicon-envelope"></i> Email:</span>
                                xu_bohan@126.com
                            </li>
                            <li><span class="span-info"><i
                                    class="glyphicon glyphicon-globe"></i> 个站:</span>
                                here
                            </li>
                            <li><span class="span-info"><i
                                    class="glyphicon glyphicon-comment"></i> QQ:</span>
                                120970275
                            </li>
                            <li><span class="span-info"><i
                                    class="glyphicon glyphicon-thumbs-up"></i> 微信:</span>
                                xubohanmeinaozi
                            </li>
                            <li><span class="span-info"><i
                                    class="glyphicon glyphicon-unchecked"></i> 订阅号:</span>
                                Naozi_youdianzhi
                            </li>
                        </ul>
                    </div>
                    <!-- /Contact Info -->
                    <div class="clear"></div>

                    <!--<h3 class="main-heading" style="margin-left: 22px;"><span>Follow me</span></h3>-->

                    <div class="title_content tiltle_contacts" style="float: none;">
                        <div class="text_content">一些账号</div>
                        <div class="clear"></div>
                    </div>


                    <div id="profile_social">
                        <ul>
                            <li><span class="span-info">新浪微博:</span>
                                http://weibo.com/3119742665
                            </li>
                            <li><span class="span-info">微信订阅号:</span>
                                Naozi_youdianzhi
                            </li>
                            <li><span class="span-info">战网:</span>
                                脑纸#5811
                            </li>
                            <li><span class="span-info">OSC码云:</span>
                                https://git.oschina.net/Xbh
                            </li>
                            <li><span class="span-info">Github:</span>
                                https://github.com/NaoziXu
                            </li>
                            <li><span class="span-info">斗鱼:</span>
                                http://www.douyu.com/Naozi
                            </li>
                        </ul>
                        <div class="clear"></div>
                    </div>


                </div>

                <div class="col-md-7">
                    <!-- Contact Form -->
                    <div class="title_content" style="float: none;">
                        <div class="text_content">给我留言</div>
                        <div class="clear"></div>
                    </div>

                    <div class="contact-form">
                        <!--<h3 class="main-heading"><span>Let's keep in touch</span></h3>-->


                        <div id="contact-status"></div>

                        <form action="" id="contactform">
                            <p class="form-group" id="contact-name">
                                <label for="name">称呼</label>
                                <input type="text" name="name"
                                       class="form-control name-contact"
                                       id="inputSuccess" placeholder="Name..."/>
                            </p>
                            <p class="form-group" id="contact-email">
                                <label for="email">邮件</label>
                                <input type="text" name="email"
                                       class="form-control email-contact"
                                       id="inputSuccess" placeholder="Email..."/>
                            </p>

                            <p class="form-group" id="contact-message">
                                <label for="message">想说的话</label>
                                <textarea name="message" cols="88" rows="6"
                                          class="form-control message-contact"
                                          id="inputError"
                                          placeholder="Message..."></textarea>
                            </p>
                            <input type="reset" name="reset" value="清空"
                                   class="reset">
                            <!-- <input type="submit" name="submit" value="SEND MESSAGE" class="submit">-->

                            <section class="button-demo"
                                     style="display: inline-block;">
                                <button class="ladda-button submit send_email"
                                        name="submit" data-color="green"
                                        data-style="expand-left"
                                        style="width:120px;">发送
                                </button>
                            </section>

                        </form>
                    </div>
                    <!-- /Contact Form -->
                </div>
            </div>
        </div>


    </div>
</div>
<!-- End .contact -->
<script type="text/javascript">
    initMap();
    function initMap() {
        // set a map
        var map = new BMap.Map("map");
        var point = new BMap.Point(116.319819,39.985477);
        // set a marker
        var marker = new BMap.Marker(point);
        marker.setTitle("互联网金融中心");
        map.addOverlay(marker);
        map.centerAndZoom(point, 20);
    }
</script>