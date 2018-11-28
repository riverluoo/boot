package com.riverluoo.test;

import com.riverluoo.dao.entity.Cat;
import com.riverluoo.dao.entity.Fish;
import com.riverluoo.dao.entity.User;
import com.riverluoo.dao.repository.CatRepository;
import com.riverluoo.dao.repository.FishRepository;
import com.riverluoo.dao.repository.UserRepository;
import com.riverluoo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Resource
    private CatRepository repository;
    @Resource
    private FishRepository fishRepository;

    @Test
    public void save(){

        long l = System.currentTimeMillis();
        for(Integer i=0 ; i < 20000000 ; i++){
            userService.save(new User("jurry", "jurry",i));
        }
        System.out.println(System.currentTimeMillis()-l);
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

    @Test
    public void insert2(){
        long l = System.currentTimeMillis();
        for(Integer i=0 ; i < 20000000 ; i++){
            System.out.println(i);
            Fish jurry = new Fish("luly", i);
            fishRepository.save(jurry);
        }
        System.out.println(System.currentTimeMillis()-l);
    }

    @Test
    public void insert3(){
        long l = System.currentTimeMillis();
        for(Integer i=0 ; i < 20000000 ; i++){
            System.out.println(i);
            Fish jurry = new Fish("Chice", i);
            fishRepository.save(jurry);
        }
        System.out.println(System.currentTimeMillis()-l);
    }
    @Test
    public void insert4(){
        long l = System.currentTimeMillis();
        for(Integer i=0 ; i < 20000000 ; i++){
            System.out.println(i);
            Fish jurry = new Fish(" Cllr", i);
            fishRepository.save(jurry);
        }
        System.out.println(System.currentTimeMillis()-l);
    }

    @Test
    public void insert5(){
        long l = System.currentTimeMillis();
        for(Integer i=0 ; i < 20000000 ; i++){
            System.out.println(i);
            Fish jurry = new Fish("toyo", i);
            fishRepository.save(jurry);
        }
        System.out.println(System.currentTimeMillis()-l);
    }
}
