package org.naozi.sakamichi.config.rocketmq;

import com.alibaba.rocketmq.client.exception.MQClientException;
import org.naozi.sakamichi.rocketmq.RocketMqConsumer;
import org.naozi.sakamichi.rocketmq.producer.RocketMqProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mq相关，暂不启动
 * @author Naozi
 * @date 2017/7/2
 */
//@Configuration
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
    public RocketMqProducer rocketMqProducer() throws MQClientException {
        RocketMqProducer rocketMqProducer = new RocketMqProducer(group,topic,namesrvAddr);
        rocketMqProducer.init();
        System.out.println("RocketMq Producer Started.");
        return rocketMqProducer;
    }

    @Bean
    public RocketMqConsumer rocketMqConsumer(){
        RocketMqConsumer rocketMqConsumer = new RocketMqConsumer(group,topic,consumerTag,namesrvAddr);
        rocketMqConsumer.init();
        System.out.println("RocketMq Consumer Started.");
        return rocketMqConsumer;
    }

}
