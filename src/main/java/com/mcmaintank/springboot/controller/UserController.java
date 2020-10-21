package com.mcmaintank.springboot.controller;

import com.mcmaintank.springboot.model.User;
import com.mcmaintank.springboot.service.UserService;
import com.mcmaintank.springboot.service.impl.UserServiceImpl;
import com.mcmaintank.springboot.utils.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MCMainTank
 * @create 2020/10/7
 */
@Controller
//@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;

    EncryptUtil encryptUtil = new EncryptUtil();


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Welcome! Please log in.";
    }

    @RequestMapping(path = "/login")
    @ResponseBody
    public String login(/*@RequestParam(value="username",required=false) String username,
                        @RequestParam(value="password",required=false) String password
                        *//*Map<String,Object> map*/@RequestBody Map o){
        String username = (String) o.get("username");
        String password = (String) o.get("password");
//        if(!StringUtils.isEmpty(username)&&userServiceImpl.getPassword().equals(ShiroUtil.encrypt(password))){
//            //成功
//            return "loggedin";
//        }else{
//            map.put("msg","Wrong username or password!");
//            return "failed";
//        }

        if(!StringUtils.isEmpty(username)&&(userService.getPassword(username)).equals(encryptUtil.encrypt(password))){
            //成功
            String jsonString1 = "{\"kstatus\":1}";
            return jsonString1;
        }else{
//            map.put("msg","Wrong username or password!");
            System.out.println(username+password);
            String jsonString2="{\"kstatus\":0}";
            return jsonString2;

        }

    }

    @RequestMapping(value = "getUser")
    @ResponseBody
    public User checkUserInfo(@RequestParam("userId") Long userId){
        User user = userService.getUser(userId);
        return user;
    }

    @RequestMapping(value = "getUserByName")
    @ResponseBody
    public User checkUserByName(@RequestBody Map o){
        String username = (String)o.get("username");
        User user = userService.getUserByName(username);
        return user;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List <User> getAllUser(){
        List<User> userList = userService.getAllUser();
        return userList;
    }

    @RequestMapping("signin")
    @ResponseBody
    public  String signIn(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam("repass") String repass,
                          @RequestParam("userEmail") String userEmail,
                          @RequestParam("userCellphone") Long userCellphone){

        if(!StringUtils.isEmpty(username)) {
            if (userService.getUserByName(username) == null){
                if (!StringUtils.isEmpty(password) && (password).length() >= 6) {
                    if (password.equals(repass)) {
                        String patternString = "([0-9a-zA-Z._-]+@[0-9a-zA-Z_-]+[.]{1}[a-z]+)";
                        Pattern pattern = Pattern.compile(patternString);
                        Matcher matcher = pattern.matcher(userEmail);
                        if (matcher.matches()) {
                            if ((userCellphone + "").length() > 8) {
                                User user = new User();
                                user.setUserBalance(BigDecimal.ZERO);
                                user.setUserAutograph(null);
                                user.setUserCellphone(userCellphone);
                                user.setUserEmail(userEmail);
                                user.setUserLoginname(username);
                                user.setUserPassword(encryptUtil.encrypt(password));
                                if(userService.createUser(user)==1){
                                    return "Success!";
                                }else {
                                    return "Failed to create new user!";
                                }


                            } else {
                                return "Please enter a valid phone number!";
                            }
                        } else {
                            return "Please enter an valid email!";
                        }
                    } else {
                        return "Password and retyped one don't match!";
                    }
                } else {
                    return "Please enter a password!";
                }
        }else {
            return "Username taken!";
        }

        }else{
            return "Please enter a username!";
        }
//        return "username taken";
//        return "success";
    }



}
