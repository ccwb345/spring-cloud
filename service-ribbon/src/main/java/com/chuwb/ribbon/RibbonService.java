package com.chuwb.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chuwenbin123 on 2019/3/4.
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * @HystrixCommand注解对该方法开启熔断器功能
     * 并指定了fallbackMethod熔断方法
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
