package com.ett.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeMultiplyClientHystrix implements ComputeMultiplyClient {
    @Override
    public Integer multiply(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
