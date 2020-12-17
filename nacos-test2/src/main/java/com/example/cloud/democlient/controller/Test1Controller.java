package com.example.cloud.democlient.controller;

import com.example.cloud.democlient.facade.Test1Service;
import com.example.cloud.democlient.facade.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test1")
public class Test1Controller {

    @Autowired
    Test1Service test1Service;

    @Value("${com:default}")
    private String com;

    @Value("${test:default}")
    private String test;

    public String t1(User user) {
        return user.toString();
    }

    @RequestMapping(value = "/gt")
    public String gt() {
        User user = new User();
        user.setName("我是谁");
        user = test1Service.t1(user);
        System.out.println(user);

        return test1Service.gt();
    }

}
