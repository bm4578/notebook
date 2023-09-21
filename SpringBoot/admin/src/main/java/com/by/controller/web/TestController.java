package com.by.controller.web;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.by.entity.Test;
import com.by.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Test)表控制层
 *
 * @author 白也
 * @since 2023-09-20 17:48:56
 */
@RestController
@RequestMapping("test")
public class TestController {
    /**
     * 服务对象
     */
    @Resource
    private TestService testService;



    /**
     * 查询所有
     *
     * @return 数据
     */
    @GetMapping
    public List<Test> getAll() {
        return this.testService.list();
    }

    /**
     * 分页查询所有数据
     *
     * @param pageNum  页数
     * @param pageSize 分页大小
     * @return 数据
     */
    @GetMapping("/{pageNum}/{pageSize}")
    public PageInfo<Test> selectPageAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        // 开始分页
        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<Test> classQueryWrapper = new QueryWrapper<>();
        classQueryWrapper.select().orderByDesc("id");
        return new PageInfo<>(this.testService.list(classQueryWrapper));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Test selectOne(@PathVariable Serializable id) {
        return this.testService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param test 实体对象
     * @return 新增结果
     */
    @PostMapping
    public boolean insert(Test test) {
        return this.testService.save(test);
    }

    /**
     * 修改数据
     *
     * @param test 实体对象
     * @return 修改结果
     */
    @PutMapping
    public boolean update(Test test) {
        return this.testService.updateById(test);
    }

    /**
     * 删除数据
     *
     * @param id 主键结合
     * @return 删除结果
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return this.testService.removeById(id);
    }
}

