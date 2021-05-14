package com.example.tinyblog.service;


import com.example.tinyblog.pojo.User;

/**
 * @author cc_ff
 * @creat 2021-05-13
 * @Description
 */
public interface UserService {
    User longin (String username, String password);
}
