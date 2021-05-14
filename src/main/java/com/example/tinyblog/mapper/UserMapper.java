package com.example.tinyblog.mapper;


import com.example.tinyblog.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cc_ff
 * @creat 2021-05-13
 * @Description
 */
public interface UserMapper extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
