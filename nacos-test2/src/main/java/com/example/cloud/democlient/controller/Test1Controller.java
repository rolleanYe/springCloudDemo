package com.example.cloud.democlient.controller;

import com.example.cloud.democlient.facade.Test1Facade;
import com.example.cloud.democlient.facade.Test2Facade;
import com.example.cloud.democlient.facade.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test1")
public class Test1Controller {

    @Autowired
    Test1Facade test1Facade;

    @Value("${com:default}")
    private String com;

    @Value("${test:default}")
    private String test;

    public String t1(User user) {
        return user.toString();
    }
    @RequestMapping(value = "/gt")
    public String gt() {
       return test1Facade.gt();
    }

}
