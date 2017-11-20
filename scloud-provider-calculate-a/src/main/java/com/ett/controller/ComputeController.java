package com.ett.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/multiply" ,method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "multiplyFallback")
    public Integer multiply(@RequestParam Integer a, @RequestParam Integer b) {
        logger.info("/multiply, host:");
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/multiply, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        Integer r = a * b;
        logger.info("/multiply, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }

    public Integer multiplyFallback( Integer a,  Integer b) {
        return -1;
    }
}