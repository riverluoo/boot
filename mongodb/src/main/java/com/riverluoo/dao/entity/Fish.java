package com.riverluoo.dao.entity;

import org.springframework.data.annotation.Id;

/**
 * @author wangyang
 * @since 2018/11/23 1:59 PM
 */
public class Fish {
    @Id
    private String id;
    private String Name;
    private Integer age;

    public Fish( String name, Integer age) {
        Name = name;
        this.age = age;
    }

    public Fish() {

    }
}
