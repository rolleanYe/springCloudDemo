package com.example.cloud.democlient.controller;

import com.example.cloud.democlient.facade.ProviderFacade;
import com.example.cloud.democlient.facade.User;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class DemoController implements ProviderFacade {

    @Value("${com:default}")
    private String com;

    @Value("${test:default}")
    private String test;

    @Override
    public String test(User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        return "～～THIS IS provider DEMO～test～,获取配置testP=";
    }

    @Override
    public String getTest(){
        Map<String,String> result = new HashMap<>();
        result.put("com",com);
        result.put("test",test);
        return result.toString();
    }

}
