package com.example.cloud.democlient.controller;

import com.example.cloud.democlient.facade.Test1Facade;
import com.example.cloud.democlient.facade.User;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class Test1Controller implements Test1Facade {

    @Value("${com:default}")
    private String com;

    @Value("${test:default}")
    private String test;

    @Override
    public User t1(User user) {
        user.setAge("9999");
        return user;
    }

    @Override
    public String gt() {
        Map<String,String> result = new HashMap<>();
        result.put("com",com);
        result.put("test",test);
        return "test1"+result.toString();
    }
}
