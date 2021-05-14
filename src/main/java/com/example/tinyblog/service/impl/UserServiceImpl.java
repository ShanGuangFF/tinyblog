package com.example.tinyblog.service.impl;

import com.example.tinyblog.mapper.UserMapper;
import com.example.tinyblog.pojo.User;
import com.example.tinyblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cc_ff
 * @creat 2021-05-13
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User longin(String username, String password) {
        User user = userMapper.findByUsernameAndPassword(username, password);
        return user;
    }
}
