package com.riverluoo.dao.entity;

import org.springframework.data.annotation.Id;

/**
 * @author wangyang
 * @since 2018/11/23 1:51 PM
 */
public class Cat {

    @Id
    private String id;
    private String Name;
    private Integer age;

    public Cat( String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public Cat() {

    }
}
