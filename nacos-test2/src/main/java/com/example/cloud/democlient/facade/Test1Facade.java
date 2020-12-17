package com.example.cloud.democlient.facade;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/test11")
public interface Test1Facade {

    @RequestMapping(value = "/t1", method = RequestMethod.POST)
    User t1(@RequestBody User user);

    @RequestMapping(value = "/gt", method = RequestMethod.GET)
    String gt();

}
