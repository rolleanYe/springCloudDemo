package com.example.cloud.democlient.facade;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "test1",path = "test1")
public interface Test1Service extends Test1Facade{
}
