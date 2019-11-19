package com.example.springbootswagger2.controller;

import com.example.springbootswagger2.mapper.DataBaseDataMapper;
import com.example.springbootswagger2.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import oracle.jdbc.proxy.annotation.Post;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(value = "DBDataProviderRestController")
@RestController
public class DBDataProviderRestController {

    @Autowired
    private DataBaseDataMapper dataBaseDataMapper;

    @ApiOperation(value = "数据查询接口",notes = "传入一个自定义的SQL，来查询指定的数据集")
    @GetMapping(value = "/queryForList/{sql}")
    public List<Map<String,Object>> queryForList(@PathVariable(value = "sql") String sql){
        return dataBaseDataMapper.queryForList(sql);
    }

    @GetMapping(value = "/deleteData/{}")
    public Integer deleteData(String sql){
        return dataBaseDataMapper.delete(sql);
    }

    @GetMapping(value = "/updateData/{}")
    public Integer updateData(String sql){
        return dataBaseDataMapper.update(sql);
    }

    @GetMapping(value = "/insertData/{}")
    public Integer insertData(String sql){
        return dataBaseDataMapper.insert(sql);
    }

}
