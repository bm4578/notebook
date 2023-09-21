package com.by.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.by.mapper.TestMapper;
import com.by.entity.Test;
import com.by.service.TestService;
import org.springframework.stereotype.Service;

/**
 * (Test)表服务实现类
 *
 * @author 白也
 * @since 2023-09-20 17:48:56
 */
@Service("testService")
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}

