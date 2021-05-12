package com.example.tinyblog.service;

import org.apache.catalina.User;

/**
 * @author cc_ff
 * @creat 2021-05-13
 * @Description
 */
public interface UserService {
    User longin (String username, String password);
}
