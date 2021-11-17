package com.lpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lpf.service.userService;
import com.lpf.dto.userDto;

@Controller
@RequestMapping("/get")
public class userController {
   
   @Autowired
   private userService userService;
   private userDto userDto;
	
   @GetMapping("/user")
   @ResponseBody
   public userDto user(Integer id){
       return userService.getUserInfo(id);
   }
}
