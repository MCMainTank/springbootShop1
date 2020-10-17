package com.mcmaintank.springboot.service.impl;


import com.mcmaintank.springboot.mapper.UserMapper;
import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Service("userService")
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
        User user = userMapper.selectUserById(userId);
        return user;
    }

    @Override
    public User getUserByName(String name){
        User user = userMapper.selectUserByName(name);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List <User> userList = userMapper.selectAllUser();
        return userList;
    }


}
