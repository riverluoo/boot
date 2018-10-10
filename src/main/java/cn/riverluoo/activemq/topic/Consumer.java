package cn.riverluoo.activemq.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class Consumer {

    private static int corePoolSize = Runtime.getRuntime().availableProcessors();
    //调整队列数
//    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 14, 10l, TimeUnit.SECONDS,
//            new LinkedBlockingQueue<Runnable>(10000));

    ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 14, 200, TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<Runnable>(20));

    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer.class);


    //@JmsListener(destination = "test-topic")
    public void receive(String message) {

        MyTask myTask = new MyTask(message);
        executor.execute(myTask);
        System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" +
                executor.getQueue().size() + "，已执行完别的任务数目：" + executor.getCompletedTaskCount());


//        if(Objects.equals("0",message)){
//            LOGGER.info("开始时间:{}", System.currentTimeMillis());
//        }
//
//        Runnable task = new Runnable() {
//
//            @Override
//            public void run() {
//                LOGGER.info("消费者1:{}", message);
//                String name = Thread.currentThread().getName();
//                LOGGER.info("线程类:{}", name);
//                LOGGER.info("时间:{}", LocalTime.now());
//            }
//        };
//
//        if(Objects.equals("2000",message)){
//            LOGGER.info("结束时间:{}", System.currentTimeMillis());
//        }
//
//        executor.execute(task);

    }

    class MyTask implements Runnable {

        private String msg;

        public MyTask(String msg) {
            this.msg = msg;
        }

        @Override
        public void run() {
            if (Objects.equals("0", msg)) {
                LOGGER.info("开始时间:{}", System.currentTimeMillis());
            }
            LOGGER.info("消费者1:{}", msg);
            String name = Thread.currentThread().getName();
            LOGGER.info("线程类:{}", name);
            LOGGER.info("时间:{}", LocalTime.now());

            if (Objects.equals("2000", msg)) {
                LOGGER.info("结束时间:{}", System.currentTimeMillis());
            }

        }
    }
}
