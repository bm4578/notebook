package com.by.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import com.by.entity.Test;

/**
 * (Test)表数据库访问层
 *
 * @author 白也
 * @since 2023-09-20 17:48:57
 */

@Mapper
public interface TestMapper extends BaseMapper<Test> {

}

