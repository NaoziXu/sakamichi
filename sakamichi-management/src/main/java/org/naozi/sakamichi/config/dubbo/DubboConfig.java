package org.naozi.sakamichi.config.dubbo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * dubbo配置文件加载
 * @author Naozi
 * @date 2017/7/2
 */
//@Configuration
@ImportResource("classpath:dubbo/dubbo-provider.xml")
public class DubboConfig {
}
