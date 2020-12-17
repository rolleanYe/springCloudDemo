package com.example.cloud.democlient.facade;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="demo-provider",path="provider")
@RequestMapping(value = "/")
public interface ProviderFacade {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    String test(@RequestBody User user);

    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    String getTest();

}
