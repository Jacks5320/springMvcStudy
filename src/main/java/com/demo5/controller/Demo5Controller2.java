package com.demo5.controller;

import com.demo5.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 常用注解演示：@SessionAttributes
 *      作用：用于在请求之间的HTTP Servlet会话中临时存储模型属性。
 */

@Controller
@RequestMapping("/demo5")
@SessionAttributes({"user","msg"})
public class Demo5Controller2 {
    //  存储 session
    @PostMapping("/testSessionSave")
    public void testSessionSave(User user,Model model){
        System.out.println("<== testSessionSave 方法执行了 ==>");
        model.addAttribute("user",user);
        System.out.println(user);
    }
    //  获取 session
    @GetMapping("/testSessionGet")
    public void testSessionGet(Model model) {
        System.out.println("<== testSessionGet 方法执行了 ==>");
        System.out.println("session中的user：" + model.getAttribute("user"));
    }
    //  删除 session
    @GetMapping("/testSessionDelete")
    public void testSessionDelete(SessionStatus status){
        System.out.println("<== testSessionDelete 方法执行了 ==>");
        status.setComplete();
    }

    /*
        演示 String 类型
     */
    @GetMapping("/testSessionString")
    public void testSessionString(Model model){
        System.out.println("<== testSessionString 方法执行了 ==>");
        model.addAttribute("msg","嗨呀，就这？");
    }

    @GetMapping("/testSessionStringGet")
    public void testSessionStringGet(Model model){
        System.out.println("<== testSessionStringGet 方法执行了 ==>");
        System.out.println("msg=" + model.getAttribute("msg"));
    }
}
