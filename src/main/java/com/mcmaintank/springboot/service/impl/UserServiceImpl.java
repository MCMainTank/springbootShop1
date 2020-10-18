package com.mcmaintank.springboot.service.impl;


import com.mcmaintank.springboot.mapper.UserMapper;
import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Service("userService")
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
    public String getPassword(String username) {
        return null;
    }

    @Override
    public User getUser(Long userId) {
        User user = userMapper.selectUserById(userId);
        return user;
//        return null;
    }

    @Override
    public User getUserByName(String username){
        User user = userMapper.selectUserByName(username);
        return user;
//        return null;
    }


//    This is a function available for debugging phase.
    @Override
    public int topUpUserFund(String name, BigDecimal fund) {
        User user= userMapper.selectUserByName(name);
        user.setUserBalance(user.getUserBalance().add(fund));
        return 0;
    }

    @Override
    public List<User> getAllUser() {
        List <User> userList = userMapper.selectAllUser();
        return userList;
//        return null;
    }


}
