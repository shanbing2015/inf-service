package com.shanbing.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by shanbing on 2018/3/24.
 */
@RestController
public class IndexController extends BaseController{

    @RequestMapping("/")
    public String index(HttpServletRequest request){
        logger.info("IP:"+getIP(request));
        return "hello world!";
    }


}
