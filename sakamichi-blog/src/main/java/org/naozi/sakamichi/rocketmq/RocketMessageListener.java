package org.naozi.sakamichi.rocketmq;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;

import java.util.Date;
import java.util.List;

public class RocketMessageListener implements MessageListenerConcurrently {

    private long startTime = new Date().getTime();

    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> messageList, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        for(MessageExt messageExt : messageList){
            String key = null;
            String content = null;
            try{
                long messageTime = messageExt.getBornTimestamp();
                if(messageTime >= startTime){
                    key = messageExt.getKeys();
                    content = new String(messageExt.getBody(),"UTF-8");
                    dealMessage(content);
                }
            } catch (Exception e){
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }

    private void dealMessage(String content){
        System.out.println("receive rocket message:" + content);
    }
}