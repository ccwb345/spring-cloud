package com.chuwb.feign;

import org.springframework.stereotype.Component;

/**
 * Created by chuwenbin123 on 2019/3/4.
 */
@Component
public class SchedualServiceHiHystric implements FeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name + ",is error!";
    }
}
