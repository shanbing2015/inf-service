package com.shanbing.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by shanbing on 2018/3/24.
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController{

    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        return "TestController test,"+ new Date().toString();
    }

    @RequestMapping("/test1")
    public String test1(HttpServletRequest request){
        return "TestController test1,"+ new Date().toString();
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest request){
        return "TestController test2,"+ new Date().toString();
    }

    @PostMapping("/test3")
    public String test3(HttpServletRequest request){
        return "TestController test3,"+ new Date().toString();
    }

}
