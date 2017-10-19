package com.example.mybatis.controller;

import com.example.mybatis.domain.Result;
import com.example.mybatis.domain.User;
import com.example.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisUserController {

    private final UserMapper userMapper;

    @Autowired
    public MybatisUserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @RequestMapping("/")
    public Result<List<User>> findAll() {
        List<User> all = userMapper.findAll();
        return new Result<>(all);
    }

}
