package com.mcmaintank.springboot.service.impl;


import com.mcmaintank.springboot.mapper.UserMapper;
import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public String getPassword(Long id) {
        return null;
    }


}
