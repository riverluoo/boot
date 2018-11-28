package com.riverluoo.dao.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author wangyang
 * @since 2018/11/21 9:57 PM
 */
@Document(collection = "user")
@Data
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;

    public User() {
    }

    public User(String firstName, String lastName,Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
    }
}
