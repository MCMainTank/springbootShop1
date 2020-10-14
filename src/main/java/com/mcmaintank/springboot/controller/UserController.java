package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @Autowired
    User user;


    @PostMapping(path = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map){

//        if(!StringUtils.isEmpty(username)&&userServiceImpl.getPassword().equals(ShiroUtil.encrypt(password))){
//            //成功
//            return "loggedin";
//        }else{
//            map.put("msg","Wrong username or password!");
//            return "failed";
//        }

        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            //成功
            return "loggedin";
        }else{
            map.put("msg","Wrong username or password!");
            return "failed";
        }

    }

    @RequestMapping(value = "getUser")
    public User checkUserInfo(){
        User user = userServiceImpl.getUser();
        return user;
    }



}
