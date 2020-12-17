package com.example.cloud.democlient.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "test1")
public interface Test1Facade {

    String serverPath = "/test1/";

    @RequestMapping(value = serverPath+"/test1/t1", method = RequestMethod.POST)
    String t1(@RequestBody User user);

    @RequestMapping(value = serverPath+"/test1/gt", method = RequestMethod.GET)
    String gt();

}
