package cn.riverluoo;

import cn.riverluoo.activemq.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableJms
public class Application {

    @Autowired
    Client client;

    @PostConstruct
    public void init() {

        for (int i = 0; i < 10; i++) {
            client.send("发送消息----我吃饱了-----");
        }
        System.out.println("发送消息完毕");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
