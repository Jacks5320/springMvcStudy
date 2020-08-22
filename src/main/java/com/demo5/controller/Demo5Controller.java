package com.demo5.controller;

import com.demo5.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 常用注解演示：@RequestParam、@RequestHeader、@ModelAttribute
 */

@Controller
@RequestMapping("/demo5")
public class Demo5Controller {
    /*
        @RequestParam
            作用：将Servlet请求参数（即查询参数或表单数据）绑定到控制器中的方法参数。
     */
    @GetMapping("/testRequestParam")
    public void testRequestParam(@RequestParam(name = "username", defaultValue = "张三") String name,
                                 @RequestParam Integer age,
                                 @RequestParam Double money) {
        System.out.println("<== testRequestParam 方法执行了 ==>");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("金额：" + money);
    }

    /*
        @RequestHeader
            作用：将请求头信息绑定到控制器中的方法参数。
     */
    @GetMapping("/testRequestHeader")
    public void testRequestHeader(@RequestHeader(name = "User-Agent") String UserAgent) {
        System.out.println("<== testRequestHeader 方法执行了 ==>");
        System.out.println("User-Agent=" + UserAgent);
    }

    /*
        @CookieValue
            作用：将HTTP cookie的值绑定到控制器中的方法参数。
     */
    @GetMapping("/testCookieValue")
    public void testCookieValue(@CookieValue("JSESSIONID") String JSESSIONID) {
        System.out.println("<== testCookieValue 方法执行了 ==>");
        System.out.println("JSESSIONID=" + JSESSIONID);
    }

    /*
        @ModelAttribute
            作用：请求参数名称与实体类属性进行匹配。
     */
    //  有返回值，直接返回对象
    //@ModelAttribute(name = "aaa")
    //public Object testModel1(){
    //    //  模拟从数据库中查询数据
    //    User user = new User();
    //    user.setName("阿华");
    //    user.setAge(10);
    //    user.setMoney(1000.0);
    //    System.out.println("模拟查询到的值：" + user);
    //    return user;
    //}
    //  没有返回值，存入到 Map<String,Object> 集合
    @ModelAttribute
    public void testModel2(Map<String,Object> map){
        User user = new User();
        user.setName("优优");
        user.setAge(13);
        user.setMoney(1000.0);
        System.out.println("模拟查询的值：" + user);
        map.put("aaa",user);
    }

    @PostMapping("/testModelAttribute")
    public void testModelAttribute(@ModelAttribute("aaa") User aaa) {
        System.out.println("<== testModelAttribute 方法执行了 ==>");
        System.out.println("更新后的值：" + aaa);
    }

}
