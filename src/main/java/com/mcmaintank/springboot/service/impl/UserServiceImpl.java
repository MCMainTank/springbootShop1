package com.mcmaintank.springboot.service.impl;


import com.mcmaintank.springboot.mapper.UserMapper;
import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    private static final String SALT = "G60produce3Kl";

    @Autowired
    UserMapper userMapper;


    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public int createUser(User user) {
        if (userMapper.insertUser(user)==1){
            return 1;
        }else{
            return 0;
        }


    }

    @Override
    public String getPassword(String username) {
        return userMapper.getPassword(username);
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

    @Override
    public String hashString(String hash) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md5.update(StandardCharsets.UTF_8.encode(hash + SALT));
        return String.format("%032x", new BigInteger(md5.digest()));
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
