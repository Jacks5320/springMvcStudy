package com.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* @Description 入门程序
*
* @Author Jacks丶
* @Version 1.0
* @Date 2020-08-21
**/
@Controller
@RequestMapping("/user")
public class HelloController {
    /*
        路径映射：
        prefix + success + suffix
     */
    @GetMapping("/hello")
    public String hello(){
        System.out.println("<== 方法执行了 ==>");
        return "success";
    }
}
