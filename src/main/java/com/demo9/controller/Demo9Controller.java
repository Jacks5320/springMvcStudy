package com.demo9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 介绍拦截器的配置及使用
 * 拦截器(interceptor)类似于 Servlet 开发中的过滤器(Filter)。
 *     - 都是用于对控制器进行预处理和后处理的。
 * 拦截器链：当一个 url 被多个拦截器所拦截，就会按照拦截顺序形成一个拦截器链。
 *     - 顺序由配置文件中配置的位置所决定，先配置的拦截器就先拦截。
 * 拦截器与过滤器的区别：
 *     - 过滤器是 servlet 规范的一部分，任何 Java Web 工程都可以使用。
 *     - 拦截器是 Spring 框架自己的，只有基于 Spring 框架的项目才能使用，(SpringMVC 是 Spring 框架的一个模块)
 *     - 过滤器在 url-pattern 中配置 /* 可以对所有访问的资源进行拦截
 *     - 拦截器在 <mvc:mapping path> 中配置 /* 只能拦截控制器方法，不能拦截静态资源的访问，如 jsp、html、css、js、image 等资源(WEB-INF外面)。
 *
 * 拦截器是基于 AOP 思想实现的，自定义拦截器需要实现 HandlerInterceptor 接口。
 *
 * 配置自定义拦截器的步骤：
 * 1 创建自定义拦截器类，实现 HandlerInterceptor 接口。
 * 2 重写拦截器中的方法，这些方法用 default 关键字修饰，有默认值，非必须实现，可以根据需要选择实现。
 * 3 在 springmvc.xml 配置文件中将自定义拦截器注入到 IoC 容器中。
 *
 */
@Controller
@RequestMapping("/demo9")
public class Demo9Controller {
    @GetMapping("/testInterceptor1")
    public String testInterceptor(@RequestParam("id") Integer id){
        System.out.println("<== testInterceptor 方法执行了 ==>");
        System.out.println("id值为：" + id);
        return "200";
    }
    @GetMapping("/testInterceptor2")
    public String testInterceptor2(@RequestParam("id") Integer id){
        System.out.println("<== testInterceptor2 方法执行了 ==>");
        System.out.println("id值为：" + id);
        return "200";
    }
}
