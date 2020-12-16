package com.example.cloud.democlient.controller;

import com.example.cloud.democlient.facade.ProviderFacade;
import com.example.cloud.democlient.facade.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController implements ProviderFacade {

    @Value("${testP:qqqqq}")
    private String testP;

    @Override
    public String test(User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        return "～～THIS IS provider DEMO～test～,获取配置testP=" + testP;
    }

    @Override
    public String getTest(){
        return "～～THIS IS provider DEMO～getTest～";
    }

}
