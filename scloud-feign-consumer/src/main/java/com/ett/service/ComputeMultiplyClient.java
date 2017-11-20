package com.ett.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="compute-service-a",fallback = ComputeMultiplyClientHystrix.class)
public interface ComputeMultiplyClient {

    @RequestMapping(method = RequestMethod.GET, value = "/multiply")
    Integer multiply(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
