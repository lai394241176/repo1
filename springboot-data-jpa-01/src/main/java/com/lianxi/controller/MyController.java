package com.lianxi.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.lianxi.entity.User01;
import com.lianxi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@Controller
public class MyController {
    @Autowired
    UserRepository userRepository01;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User01 helloWord(@PathVariable("id") Integer id){
        //User01 one =
        //System.out.println(one);
        User01 one = userRepository01.getOne(id);
        System.out.println("111111");
        System.out.println("2455");
        return  one;
    }
}
