package org.naozi.sakamichi.config.druid;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * Created by Naozi on 2017/6/30.
 */
@SuppressWarnings("serial")
@WebServlet(
    urlPatterns = "/druid/*",
    initParams = {
        @WebInitParam(name="allow",value="127.0.0.1"),// ip whitelist
        @WebInitParam(name="deny",value=""),// ip blacklist
        @WebInitParam(name="loginUsername",value="naozi"),// user
        @WebInitParam(name="loginPassword",value="lrmmsnlx"),// password
        @WebInitParam(name="resetEnable",value="true")// reset all
    }
)
public class DruidStatViewServlet extends StatViewServlet{

}