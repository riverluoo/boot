package cn.riverluoo.activemq.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

@Component
public class Producer {

    // 该方式可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    @Autowired
    private JmsTemplate jmsTemplate;


    public void sendMessage(Destination destination, String message){
        jmsTemplate.convertAndSend(destination, message);
    }
}
