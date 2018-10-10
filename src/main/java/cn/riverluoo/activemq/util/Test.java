package cn.riverluoo.activemq.util;

import cn.riverluoo.activemq.topic.Consumer4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;
import java.util.Objects;

public class Test {

    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer4.class);

    public void receive(String message) {

        if (Objects.equals("0", message)) {
            LOGGER.info("开始时间:{}", System.currentTimeMillis());
        }

        LOGGER.info("消费者:{}", message);
        String name = Thread.currentThread().getName();

        if (Objects.equals("2000", message)) {
            LOGGER.info("结束时间:{}", System.currentTimeMillis());
        }


    }
}
