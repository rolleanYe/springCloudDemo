package com.example.cloud.democlient.controller;

import com.example.cloud.democlient.client.EchoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Api(tags = "测试demo")
@RequestMapping(value = "/")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EchoService echoService;

    @ApiOperation(value = "test", notes = "hello测试 test api")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){

        String result = restTemplate.getForObject("http://demo-provider/provider/test",String.class);

        String result2 = echoService.getTest();

        return "～～THIS IS DEMO CLIENT～test～\n" + result +"\n"+ result2;
    }

    @ApiOperation(value = "getTest", notes = "hello测试 getTest api")
    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    public String getTest(){

        return "～～THIS IS DEMO CLIENT～getTest～";
    }

    @ApiOperation(value = "getName", notes = "hello测试 getName api")
    @ApiImplicitParam(name = "name",value = "输入的名字" ,required = true, dataType = "string" ,paramType = "body")
    @RequestMapping(value = "/getName", method = RequestMethod.POST)
    public String getName(@RequestBody String name){

        return "hello : " + name;
    }

}
