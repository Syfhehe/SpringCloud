package com.didispace.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeClientHystrix implements ComputeClientServiceB {

    @Override
    public String subtraction(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return "-9999";
    }

}