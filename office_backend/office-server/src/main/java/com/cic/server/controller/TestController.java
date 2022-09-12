package com.cic.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author zfr
 * @version 1.0
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/employee/basic/test")
    public String test2(){
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/test")
    public String test3(){
        return "/employee/advanced/test";
    }
}
