package com.example.cloud.democlient.controller;

import com.example.cloud.democlient.facade.Test2Facade;
import com.example.cloud.democlient.facade.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class Test2Controller implements Test2Facade {

    @Value("${com:default}")
    private String com;

    @Value("${test:default}")
    private String test;

    @Override
    public String t1(User user) {
        return user.toString();
    }

    @Override
    public String gt() {
        Map<String,String> result = new HashMap<>();
        result.put("com",com);
        result.put("test",test);
        return "test1"+result.toString();
    }

}
