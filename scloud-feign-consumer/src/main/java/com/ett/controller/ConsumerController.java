package com.ett.controller;

import com.ett.service.ComputeAddClient;
import com.ett.service.ComputeMultiplyClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ComputeMultiplyClient computeMultiplyClient;

    @Autowired
    ComputeAddClient computeAddClient;

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "multiplyFallback")
    public Integer multiply(@RequestParam Integer a, @RequestParam Integer b) {
         return computeMultiplyClient.multiply(a,b);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "addFallback")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return computeAddClient.add(a,b);
    }

    public Integer multiplyFallback( Integer a,  Integer b) {
        return -1;
    }
    public Integer addFallback( Integer a,  Integer b) {
        return -1;
    }

}
