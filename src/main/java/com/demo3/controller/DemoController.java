package com.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 自定义类型转换器
 * 步骤：
 *      1 定义类型转换器类和方法，类要实现 Converter<S,T> 接口，S 表示传入类型，T 表示要转换的类型
 *      2 在 springmvc.xml 中
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/stringToDate")
    public String stringToDate(Date date) {
        System.out.println("<== 自定义类型转换器执行了 ==>");
        System.out.println("时间：" + date);
        return "success";
    }
}
