package com.didispace.web;

import com.didispace.service.ComputeClientServiceA;
import com.didispace.service.ComputeClientServiceB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClientServiceA computeClientSvcA;
    
    @Autowired
    ComputeClientServiceB computeClientSvcB;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeClientSvcA.add(10, 20);
    }
    
    @RequestMapping(value = "/subtraction", method = RequestMethod.GET)
    public String subtraction() {
        return computeClientSvcB.subtraction(10, 20);
    }

    
}