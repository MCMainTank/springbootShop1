package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.User;

import java.util.List;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface UserService {

    public void deleteUser(Long userId);

    public User createUser(User user);

    public String getPassword(String username);

    public User getUser(Long userId);

    public List<User> getAllUser();

}
