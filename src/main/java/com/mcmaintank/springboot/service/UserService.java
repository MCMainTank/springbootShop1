package com.mcmaintank.springboot.service;

import com.mcmaintank.springboot.model.User;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
public interface UserService {

    public void deleteUser(Long id);

    public User createUser(User user);

    public String getPassword(Long id);


}
