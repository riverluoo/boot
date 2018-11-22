package com.riverluoo.test;

import com.riverluoo.dao.entity.User;
import com.riverluoo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @since 2018/11/21 10:09 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbTest {

    private static final Logger log = LoggerFactory.getLogger(MongodbTest.class);


    @Resource
    private UserService userService;

    @Test
    public void save(){
        userService.save(new User("dora", "dora"));
        userService.save(new User("jurry", "jurry"));
    }

    @Test
    public void selectAll(){
        Object all = userService.findAll();
        log.info("结果"+all);
    }

    @Test
    public void find(){
        User dora = userService.findByName("dora");
        log.info("查询结果"+dora);
    }

    @Test
    public void deleteAll(){
        userService.deleteAll();

    }
}
