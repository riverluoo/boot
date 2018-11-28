package com.riverluoo.dao.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "t_user")
@Data
public class User extends Model<User> {
    /**
     * 主键ID
     */
    @TableId(value="id", type= IdType.INPUT)
    private Integer id;

    private String username;

    private String password;

    public User() {
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
