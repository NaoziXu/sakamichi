package org.naozi.sakamichi.rocketmq;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;

/**
 * @author Naozi
 */
public class RocketMqConsumer {

    private DefaultMQPushConsumer defaultMQPushConsumer;

    private String namesrvAddr;
    private String group;
    private String topic;
    private String tags;

    /**
     * rocketmq消费方构造器
     * @param group 一组生产-消费关系的标识
     * @param topic 该组中某个消息业务的标识
     * @param tags 该消息业务的不同子业务标识
     * @param namesrvAddr 注册中心地址
     */
    public RocketMqConsumer(String group, String topic, String tags, String namesrvAddr) {
        this.group = group;
        this.topic = topic;
        this.tags = tags;
        this.namesrvAddr = namesrvAddr;
    }

    /**
     * 初始化消费方
     */
    public void init() {
        defaultMQPushConsumer = new DefaultMQPushConsumer();
        /*
         * 设置消费模式:广播/集群
         * 此处注意rocket的topic和jms的topic概念上有所区别
         * 广播:任一consumer均收到producer的消息
         * 集群:以producer的消息推送为任务由各个consumer分担消费
         */
        defaultMQPushConsumer.setMessageModel(MessageModel.BROADCASTING);
//        defaultMQPushConsumer.setMessageModel(MessageModel.CLUSTERING);
        defaultMQPushConsumer.setConsumerGroup(group);
        defaultMQPushConsumer.setVipChannelEnabled(false);
        defaultMQPushConsumer.setNamesrvAddr(namesrvAddr);
        defaultMQPushConsumer.registerMessageListener(new RocketMessageListener());
        try {
            defaultMQPushConsumer.subscribe(topic, tags);
            defaultMQPushConsumer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
            return;
        }
    }

    /**
     * 关闭消费方
     */
    public void destory() {
        if (defaultMQPushConsumer != null) {
            defaultMQPushConsumer.shutdown();
        }
    }

}
