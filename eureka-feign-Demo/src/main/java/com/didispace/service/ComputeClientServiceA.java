package com.didispace.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-A")
public interface ComputeClientServiceA {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}