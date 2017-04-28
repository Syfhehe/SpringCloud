package com.didispace.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-B", fallback = ComputeClientHystrix.class)
public interface ComputeClientServiceB {

    @RequestMapping(method = RequestMethod.GET, value = "/subtraction")
    String subtraction(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}