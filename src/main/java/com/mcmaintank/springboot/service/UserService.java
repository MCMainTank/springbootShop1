package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface UserService {

    public void deleteUser(Long userId);

    public int createUser(User user);

    public String getPassword(String username);

    public User getUser(Long userId);

    public List<User> getAllUser();

    public User getUserByName(String username);

    public int topUpUserFund(String name, BigDecimal fund);

    public String hashString(String hash);

}
