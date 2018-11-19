package com.riverluoo.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author wangyang
 * @projectName SpringBoot
 * @description:
 * @sence 2018/11/19 8:23 PM
 */
@Component
public class AsyncTask {

    private static final Logger logger = LoggerFactory.getLogger(AsyncTask.class);


    @Async
    public void dealNoReturnTask() {
        logger.info("返回值为void的异步调用开始: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("返回值为void的异步调用结束: " + Thread.currentThread().getName());
    }

    @Async
    public Future<String> dealHaveReturnTask(int i) {
        logger.info("参数:" + i);
        Future<String> future;
        try {
            Thread.sleep(1000 * i);
            future = new AsyncResult<String>("success:" + i);
        } catch (InterruptedException e) {
            future = new AsyncResult<String>("error");
        }
        return future;
    }

}
