package com.demo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 常用注解演示：@RequestAttribute
 *      作用：用于访问先前创建的预先存在的请求属性。
 */

@Controller
@RequestMapping("/demo5")
public class Demo5Controller4 {

    //  预先保存请求参数
    @ModelAttribute
    public void testRequestAttributeSave(HttpServletRequest request){
        System.out.println("<== testRequestAttributeSave 方法执行了 ==>");
        request.setAttribute("msg","康康怎么回事儿。");
    }
    //  获取预先保存的请求参数
    @GetMapping("/testRequestAttribute")
    public void testRequestAttribute(@RequestAttribute("msg") String msg){
        System.out.println("\n<== testRequestAttributeSave 方法执行了 ==>");
        System.out.println("预先存在的属性=" + msg);
    }
}
