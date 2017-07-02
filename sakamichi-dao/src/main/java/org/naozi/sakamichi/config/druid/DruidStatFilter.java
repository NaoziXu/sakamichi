package org.naozi.sakamichi.config.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by Naozi on 2017/6/30.
 */
@WebFilter(
    filterName="druidWebStatFilter",
    urlPatterns="/*",
    initParams={
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
    }
)
public class DruidStatFilter extends WebStatFilter{
}
