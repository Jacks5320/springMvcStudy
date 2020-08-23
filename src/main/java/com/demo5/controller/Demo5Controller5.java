package com.demo5.controller;

import com.demo5.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 常用注解演示：@RequestBody 和     @ResponseBody
 * 作用：
 * - @RequestBody 将请求体封装成一个对象传入控制器类方法中。
 * - @ResponseBody 将返回值封装到响应体里面。
 *
 * 需要 json 支持的相关依赖
 */

@Controller
@RequestMapping("/demo5")
//@RestController  // 等价于 @RequestMapping 和 @ResponseBody  两个注解的组合
public class Demo5Controller5 {

    @PostMapping("/testRequestBody")
    @ResponseBody
    public User testRequestBody(@RequestBody User user) {
        System.out.println("<== testRequestBody 方法执行了 ==>");
        System.out.println("请求体：" + user);
        user.setMoney(user.getMoney() - 100.0);
        return user;
    }
}
