package com.demo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * 常用注解演示：@SessionAttribute
 *      作用：用于获取全局的 session 属性。
 */

@Controller
@RequestMapping("/demo5")
public class Demo5Controller3 {
    @GetMapping("/testSessionAttribute")
    public void testSessionAttribute(@SessionAttribute("msg") String msg){
        System.out.println("隔壁的 session 值=" + msg);
    }
}
