package com.riverluoo.dao.repository;

import com.riverluoo.dao.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author wangyang
 * @since 2018/11/21 10:03 PM
 */
public interface UserRepository extends MongoRepository<User, String> {

    User findByFirstName(String firstName);

    List<User> findByLastName(String lastName);
}
