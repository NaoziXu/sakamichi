package org.naozi.sakamichi.config.interceptor;

import org.naozi.sakamichi.system.interceptor.CommonRenderVariableInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lenovo on 2017/8/8.
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加用户视图跳转拦截
        registry.addInterceptor(new CommonRenderVariableInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
