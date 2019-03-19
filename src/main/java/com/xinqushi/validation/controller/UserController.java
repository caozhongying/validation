package com.xinqushi.validation.controller;

import com.xinqushi.validation.pojo.User;
//import com.xinqushi.validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class UserController {

//    @Autowired
//    private UserService userService;

    @RequestMapping("/validation")
    @ResponseBody
    public String testValidation(@Valid User user){
       return user.toString();
    }
}
