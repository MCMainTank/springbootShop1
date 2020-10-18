package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.UserService;
import com.mcmaintank.springboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Welcome! Please log in.";
    }

    @PostMapping(path = "login")
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
    @ResponseBody
    public User checkUserInfo(){
        User user = userService.getUser(100001L);
        return user;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List <User> getAllUser(){
        List<User> userList = userService.getAllUser();
        return userList;
    }



}
