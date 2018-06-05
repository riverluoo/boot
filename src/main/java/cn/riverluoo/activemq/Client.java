package cn.riverluoo.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: wangyang
 * @since: 下午9:31 2018/6/5
 */
@Component
public class Client {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message) {
        jmsTemplate.convertAndSend("aa", message);
    }
}
