package com.example.cloud.democlient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="demo-provider",path="provider")
public interface EchoService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test();

    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    String getTest();

}
