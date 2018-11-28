package com.riverluoo.dao.repository;

import com.riverluoo.dao.entity.Cat;
import com.riverluoo.dao.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author wangyang
 * @since 2018/11/23 1:57 PM
 */
public interface CatRepository extends MongoRepository<Cat, String> {



}
