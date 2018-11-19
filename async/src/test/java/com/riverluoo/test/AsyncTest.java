package com.riverluoo.test;

import com.riverluoo.async.AsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author wangyang
 * @projectName SpringBoot
 * @description:
 * @sence 2018/11/19 8:41 PM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTest {

    private static final Logger log = LoggerFactory.getLogger(AsyncTest.class);
    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void testAsync() throws InterruptedException, ExecutionException {
        asyncTask.dealNoReturnTask();

        Future<String> f = asyncTask.dealHaveReturnTask(6);

        log.info("主线程执行结束");
        log.info(f.get());
        assertThat(f.get(), is("success:" + 6));
    }

}
