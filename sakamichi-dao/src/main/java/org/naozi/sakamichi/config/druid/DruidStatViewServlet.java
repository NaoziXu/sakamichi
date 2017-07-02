package org.naozi.sakamichi.config.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by Naozi on 2017/6/30.
 */
@SuppressWarnings("serial")
@WebServlet(
    urlPatterns = "/druid",
    initParams = {
        @WebInitParam(name="allow",value="127.0.0.1"),
        @WebInitParam(name="deny",value=""),
        @WebInitParam(name="loginUsername",value="naozi"),
        @WebInitParam(name="loginPassword",value="lrmmsnlx"),
        @WebInitParam(name="resetEnable",value="true")
    }
)
public class DruidStatViewServlet extends StatViewServlet {
}