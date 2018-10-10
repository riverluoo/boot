package cn.riverluoo.activemq.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Objects;

@Component
public class Consumer2 {

    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer2.class);

   // @JmsListener(destination = "test-topic")
   // @SendTo("return-1")
    public void receive(String message) {

        if (Objects.equals("0", message)) {
            LOGGER.info("开始时间:{}", System.currentTimeMillis());
        }

        LOGGER.info("消费者2:{}", message);
        String name = Thread.currentThread().getName();


        if (Objects.equals("2000", message)) {
            LOGGER.info("结束时间:{}", System.currentTimeMillis());
        }
       // return message;


    }

  //  @JmsListener(destination = "test-topic")
    //@SendTo("return-2")
    public String receive2(String message) {

        if (Objects.equals("0", message)) {
            LOGGER.info("开始时间:{}", System.currentTimeMillis());
        }

        LOGGER.info("消费者5:{}", message);
        String name = Thread.currentThread().getName();
        LOGGER.info("线程类:{}", name);
        LOGGER.info("时间:{}", LocalTime.now());

        if (Objects.equals("1000", message)) {
            LOGGER.info("结束时间:{}", System.currentTimeMillis());
        }


        return message;
    }

 //   @JmsListener(destination = "test-topic")
    @SendTo("return-3")
    public String receive3(String message) {

//        if (Objects.equals("0", message)) {
//            LOGGER.info("开始时间:{}", System.currentTimeMillis());
//        }
//
//        LOGGER.info("消费者6:{}", message);
//        String name = Thread.currentThread().getName();
//        LOGGER.info("线程类:{}", name);
//        LOGGER.info("时间:{}", LocalTime.now());
//
//        if (Objects.equals("1000", message)) {
//            LOGGER.info("结束时间:{}", System.currentTimeMillis());
//        }

        return message;

    }

 //   @JmsListener(destination = "test-topic")
    @SendTo("return-4")
    public String receive4(String message) {

//        if (Objects.equals("0", message)) {
//            LOGGER.info("开始时间:{}", System.currentTimeMillis());
//        }
//
//        LOGGER.info("消费者7:{}", message);
//        String name = Thread.currentThread().getName();
//        LOGGER.info("线程类:{}", name);
//        LOGGER.info("时间:{}", LocalTime.now());
//
//        if (Objects.equals("1000", message)) {
//            LOGGER.info("结束时间:{}", System.currentTimeMillis());
//        }

        return message;

    }

  //  @JmsListener(destination = "test-topic")
    @SendTo("return-5")
    public String receive5(String message) {

//        if (Objects.equals("0", message)) {
//            LOGGER.info("开始时间:{}", System.currentTimeMillis());
//        }
//
//        LOGGER.info("消费者8:{}", message);
//        String name = Thread.currentThread().getName();
//        LOGGER.info("线程类:{}", name);
//        LOGGER.info("时间:{}", LocalTime.now());
//
//        if (Objects.equals("1000", message)) {
//            LOGGER.info("结束时间:{}", System.currentTimeMillis());
//        }

        return message;

    }

}
