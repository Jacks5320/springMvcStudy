package com.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * 演示 servlet 原生 API 接口
 * <p>
 * 步骤：
 * 1 引入 servlet API 相关依赖
 * 2 控制器方法中声明 HttpServletRequest 和 HttpServletResponse 两个对象
 * 3 使用两个对象完成相关操作
 */

@Controller
@RequestMapping("/servlet")
public class ServletApiController {

    @GetMapping("/api")
    public void testServlet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("<== 原生 Servlet 接口测试方法执行了 ==>");
        System.out.println("完整的 URL =" + request.getRequestURL());
        System.out.println("IP = " + request.getLocalAddr());
        System.out.println("主机名：" + request.getLocalName());
        //  获取请求头信息
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + "=" + value);
        }
        //  请求转发
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //  重定向
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}
