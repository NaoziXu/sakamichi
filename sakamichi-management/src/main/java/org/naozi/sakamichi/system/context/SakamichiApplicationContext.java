package org.naozi.sakamichi.system.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 上下文
 * @author lenovo
 * @date 2017/8/8
 */
@Component
public class SakamichiApplicationContext implements ApplicationContextAware {

    private static ApplicationContext APPLICATION_CONTEXT;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        APPLICATION_CONTEXT = applicationContext;
    }

    /**
     * 获取上下文
     * @return
     */
    public ApplicationContext getApplicationContext(){
        return APPLICATION_CONTEXT;
    }

    /**
     * 按ID获取SpringBean
     * @param beanId
     * @return
     */
    public Object getBean(String beanId){
        return APPLICATION_CONTEXT.getBean(beanId);
    }
}
