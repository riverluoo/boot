package com.riverluoo.service;

import com.riverluoo.dao.entity.User;
import com.riverluoo.dao.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @since 2018/11/21 10:05 PM
 */
@Service
public class UserService {

    @Resource
    private UserRepository repository;


    public void save(User user) {
        repository.save(user);
    }

    public Object findAll() {
        return repository.findAll();
    }
}
