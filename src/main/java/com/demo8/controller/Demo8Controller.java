package com.demo8.controller;

import com.demo8.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 异常处理 demo 演示
 * 在 springmvc 中，浏览器发送一次 CRUD 请求时会经过：
 *      前端控制器、controller层、service层、dao层，最终到达数据库，然后在原路返回。
 *      过程中产生的异常会自动向上抛，最终抛给浏览器显示。
 *      这样的服务，用户体验极差，所以需要进行异常处理。
 * 配置步骤：
 *       1 编写自定义异常类
 *       2 编写异常处理器类
 *       3 在 springmvc.xml 中配置异常处理器
 */

@Controller
@RequestMapping("/demo8")
public class Demo8Controller {
    @GetMapping("/testMyException")
    public String testMyException() throws MyException {
        System.out.println("<== testMyException 方法执行了 ==>");
        try {
            int a = 10/0;
        }catch (Exception e){
            //  打印错误信息
            e.printStackTrace();
            //  抛出自定义异常
            throw new MyException("出现了异常，这是异常的描述信息");
        }
        return "success";
    }
}
