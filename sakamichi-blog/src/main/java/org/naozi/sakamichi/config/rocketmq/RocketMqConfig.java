package org.naozi.sakamichi.config.rocketmq;

import org.naozi.sakamichi.rocketmq.RocketMqConsumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Naozi on 2017/7/2.
 */
@Configuration
public class RocketMqConfig {
    @Value("${rocketmq.namesrvAddr}")
    private String namesrvAddr;
    @Value("${rocketmq.group}")
    private String group;
    @Value("${rocketmq.topic}")
    private String topic;
    @Value("${rokectmq.tag}")
    private String consumerTag;

    @Bean
    public RocketMqConsumer rocketMqConsumer(){
        RocketMqConsumer rocketMqConsumer = new RocketMqConsumer(group,topic,consumerTag,namesrvAddr);
        rocketMqConsumer.init();
        System.out.println("RocketMq Consumer Started.");
        return rocketMqConsumer;
    }

}
