package mq;


import cn.riverluoo.Application;
import cn.riverluoo.activemq.ptp.Client;
import cn.riverluoo.activemq.topic.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringbootJmsApplicationTest {


    @Resource
    private Producer producer;
    @Resource
    private Client client;

    @Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQQueue("test-topic");

        for(Integer i=0; i<=2000; i++){
            producer.sendMessage(destination, i.toString());
        }

        System.out.println("消息发送完毕");

        Thread.sleep(20000);
    }

    @Test
    public void pipTest() throws InterruptedException {

        for(Integer i=0; i<=20; i++){
            client.send( i.toString());
        }

        System.out.println("消息发送完毕");
    }

}
