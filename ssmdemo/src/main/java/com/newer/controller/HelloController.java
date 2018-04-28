package com.newer.controller;

import com.newer.pojo.User;
import com.newer.service.StudentService;
import com.newer.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello方法被执行");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username,String password){
        List<User>list=studentService.findAll1();
        password=MD5.getMD5(password);
        Boolean flag=false;
       for (User user:list){
           if (user.getUserName().equals(username)&&user.getPassword().equals(password)){
               flag=true;
           }
       }
      if (flag==true){
           return "index";
      }else{
           return "hello";
      }
    }
}
