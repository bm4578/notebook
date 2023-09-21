package com.by.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * (Test)表实体类
 *
 * @author 白也
 * @since 2023-09-20 17:48:56
 */
@SuppressWarnings("serial")
@Data
public class Test extends Model<Test> {
    //配置自增
    @TableId(type = IdType.AUTO)

    private Integer id;

    private String name;

    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

