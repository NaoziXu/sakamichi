package org.naozi.sakamichi.rocketmq.producer;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.client.producer.SendStatus;
import com.alibaba.rocketmq.common.message.Message;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.Charset;


/**
 * @author Naozi
 */
public class RocketMqProducer {

    private DefaultMQProducer defaultMQProducer;

    private String namesrvAddr;
    private String group;
    private String topic;

    /**
     * rocketmq生产端构造器
     * @param group 一组生产-消费关系的标识
     * @param topic 该组中某个消息业务的标识
     * @param namesrvAddr 注册中心地址
     */
    public RocketMqProducer(String group, String topic, String namesrvAddr) {
        this.group = group;
        this.topic = topic;
        this.namesrvAddr = namesrvAddr;
    }

    /**
     * 初始化生产端
     */
    public void init() {
        defaultMQProducer = new DefaultMQProducer(group);
        defaultMQProducer.setNamesrvAddr(namesrvAddr);
        defaultMQProducer.setVipChannelEnabled(false);
        try{
            defaultMQProducer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭生产端
     */
    public void destroy() {
        defaultMQProducer.shutdown();
    }

    /**
     * 发送消息
     * @param content 内容
     * @param tags 该消息业务的不同子业务标识
     * @param key 消息的唯一标识
     * @return
     */
    public Boolean sendMessage(String tags, String content, String key) {
        try {
            Message msg = new Message(topic, content.getBytes(Charset.forName("UTF-8")));
            if (StringUtils.isNotBlank(key)) {
                msg.setKeys(key);
            }
            msg.setTags(tags);
            SendResult sendResult = defaultMQProducer.send(msg);
            SendStatus sendStatus = sendResult.getSendStatus();
            if (sendStatus == SendStatus.SEND_OK) {
//                System.out.println("send message success : " + key);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



}
