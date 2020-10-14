package com.mcmaintank.springboot.service.impl;


import com.mcmaintank.springboot.mapper.UserMapper;
import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Autowired
    User user;

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public String getPassword(String username) {
        return null;
    }

    @Override
    public User getUser(Long userId) {
        userMapper.selectUserById(userId);
        return null;
    }

    @Override
    public List<User> getAllUser() {
        userMapper.selectAllUser();
        return null;
    }


}
