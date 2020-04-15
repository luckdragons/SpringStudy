package com.mystudy.controller;

import com.mystudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
  public Object search(){
      return userService.queryAll();
  }
}
