package com.pyzq.website.service;

import com.pyzq.website.entity.User;
import com.pyzq.website.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.selectList(null);
    }
}
