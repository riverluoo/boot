package com.riverluoo.dao.repository;

import com.riverluoo.dao.entity.Fish;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author wangyang
 * @since 2018/11/23 2:03 PM
 */
public interface FishRepository extends MongoRepository<Fish, String> {
}
