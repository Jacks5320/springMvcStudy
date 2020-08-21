package com.demo2.controller;

import com.demo2.domain.Account;
import com.demo2.domain.CollDemo;
import com.demo2.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定演示 demo
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //   普通类型参数绑定
    @GetMapping("/ordinary")
    public String param(String username, Integer age) {
        System.out.println("<== 基本类型与String类型绑定成功 ==>");
        System.out.println("姓名：" + username);
        System.out.println("年龄：" + age);
        return "success";
    }

    //  引用类型和 JavaBean 类型数据绑定
    @PostMapping("/beanBind1")
    public String beanBind1(User user) {
        System.out.println("<== 引用类型1绑定成功 ==>");
        System.out.println("姓名：" + user.getName());
        System.out.println("年龄：" + user.getAge());
        return "success";
    }

    //  引用类型中包含引用类型，套娃操作
    @GetMapping("/beanBind2")
    public String beanBind2(Account account) {
        System.out.println("<== 引用类型2绑定成功 ==>");
        System.out.println("账户：" + account.getUsername());
        System.out.println("用户信息：" + account.getUser());
        return "success";
    }
    //  绑定集合类型
    @PostMapping("/collectionBind")
    public String collectionBind1(CollDemo cl) {
        System.out.println("<== 集合类型绑定成功 ==>");
        System.out.println(cl);
        return "success";
    }
}
