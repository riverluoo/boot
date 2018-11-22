package com.riverluoo.test;

import com.riverluoo.dao.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @since 2018/11/22 9:05 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectTest {

    @Resource
    private UserRepository repository;

    @Test
    public void insertTest(){

        for(int i=0 ; i < 200000 ; i++){
            String s= "{name:'xiao'+i,age:i}";
            repository.save();
        }

    }
}
