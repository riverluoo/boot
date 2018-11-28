package com.riverluoo.test;

import com.riverluoo.dao.entity.User;
import com.riverluoo.dao.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author wangyang
 * @since 2018/11/22 9:05 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectTest {
    private static final Logger log = LoggerFactory.getLogger(SelectTest.class);

    @Resource
    private UserRepository repository;

    @Test
    public void insertTest(){

        long l = System.currentTimeMillis();
        for(Integer i=0 ; i < 20000000 ; i++){
            repository.save(new User("dora", "dora",i));
        }
        System.out.println(System.currentTimeMillis()-l);

    }
}
