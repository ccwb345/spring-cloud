package com.chuwb.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chuwenbin123 on 2019/3/4.
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return ribbonService.hiService(name);
    }
}
