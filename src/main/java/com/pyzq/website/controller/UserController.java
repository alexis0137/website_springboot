package com.pyzq.website.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pyzq.website.common.Result;
import com.pyzq.website.entity.User;
import com.pyzq.website.mapper.UserMapper;
import com.pyzq.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public Result<?> findAll() {
        return Result.success(userService.findAll());
    }

//    @PostMapping
//    public Result<?> save(@RequestBody User user) {
//        if (user.getPassword() == null) {
//            user.setPassword("123456");
//        }
//        userMapper.insert(user);
//        return Result.success();
//    }
}
