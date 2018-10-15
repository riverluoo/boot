package cn.riverluoo.activemq.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer3 {

    Test test = new Test();

    @JmsListener(destination = "test-topic")
    public void receive(String message){

        test.receive(message);

    }



}
