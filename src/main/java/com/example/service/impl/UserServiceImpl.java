package com.example.service.impl;

import com.example.been.User;
import com.example.dao.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PVer on 2017/4/19.
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }
}
