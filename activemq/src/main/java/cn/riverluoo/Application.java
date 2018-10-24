package cn.riverluoo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Application {

//    @Resource
//    private Producer producer;
//    @Resource
//    private Client client;


//    @PostConstruct
//    public void init() {
//
//        Destination destination = new ActiveMQQueue("test-topic");
//
//        for (Integer i = 0; i <= 2000; i++) {
//            producer.sendMessage(destination, i.toString());
//        }
//
//        for (Integer i = 0; i <= 20; i++) {
//            client.send(i.toString());
//        }
//
//
//        System.out.println("消息发送完毕");
//    }



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
