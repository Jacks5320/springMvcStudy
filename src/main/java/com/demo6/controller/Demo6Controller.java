package com.demo6.controller;

import com.demo6.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 数据响应 与 结果视图
 */
@Controller
@RequestMapping("/demo6")
public class Demo6Controller {
    /*
        方法返回值为 String 类型：
            如果控制器方法的返回值是一个 String 类型，
            springmvc 会根据配置的视图解析器的路径去匹配资源。
            如果需要返还给前端作数据渲染，可以使用 Model 的实现类来存储。
            Model 的实现类直接或间接继承了 Map 集合，可以点开源码看看。
     */
    @GetMapping("/testString")
    public String testString(Model model) {
        System.out.println("<== testString 方法执行了 ==>");
        //  返还 pojo 类
        Book book = new Book();
        book.setName("SpringMVC从入门到转行");
        book.setAuthor("劝退大师");
        book.setVersion(1);
        //  model 对象，将返回属性存入到 model 对象中，
        //  进而存到 request 域转发给页面，
        //  页面可以使用返回值渲染页面。
        model.addAttribute("book", book);
        return "success";
    }

    /*
        方法返回值为 void
            访问 `http://localhost:8080/demo/demo6/testVoid` 时( demo 是我的项目路径)
            默认情况会映射到 `/demo/WEB-INF/pages/demo6/testVoid.jsp` 这个资源。
            拼接的是：项目路径/视图解析器配置的路径/请求路径.视图解析器配置的视图类型，
                    也就是我这里的 /demo + /WEB-INF/pages/ + /demo6/testVoid.jsp
            如果这个资源不存在，页面就会报 404
            如果希望处理这种情况，可以使用以下方法
                使用原生 Servlet 的 HttpServletRequest 和 HttpServletResponse 接口进行如下操作
                    请求转发：request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
                    重定向：response.sendRedirect(request.getContextPath() + "/index.jsp");
                    直接响应页面


     */
    @GetMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("<== testVoid 方法执行了 ==>");
        //  请求转发，请求转发一次请求，不需要编写项目的名称
        //  手动转发，springmvc 就不会再提供视图解析器了，需要手动补全资源路径
        //  request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        //  请求重定向，重定向是重新发送一个请求。
        //  前端发送的请求不能直接访问 WEB-INF 文件夹下的资源，所以这里直接重定向到 index.jsp 页面
        //response.sendRedirect("/demo/index.jsp");
        //  也可以使用 request.getContextPath() 来获取项目路径
        //response.sendRedirect(request.getContextPath() + "/index.jsp");

        //  直接响应页面，使用输出流响应页面
        response.setContentType("text/html;charset=utf-8");  //  设置响应类型
        response.getWriter().println("操作成功了");
    }

    /*
        方法返回值为 ModelAndView 对象
            ModelAndView 对象可以存储数据，进而 存入到 request 域对象中。
     */
    @GetMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        //  创建 ModelAndView 对象
        ModelAndView modelAndView = new ModelAndView();
        //  创建 pojo 对象
        Book book = new Book();
        book.setName("MySQL从删库到跑路");
        book.setAuthor("跑路大师");
        book.setVersion(1);
        //  使用 ModelAndView 对象以 key-value 的方式存储 pojo 对象
        modelAndView.addObject("book",book);
        //  跳转页面，可以使用 视图解析器 进行解析，然后跳转
        //  String 类型返回值的方法底层也会使用 ModelAndView 对象来调用视图解析器
        modelAndView.setViewName("success");
        return modelAndView;
    }
    /*
        使用关键字进行转发或重定向
            转发关键字：forward
            重定向关键字：redirect
     */
    @GetMapping("/testKeyWord")
    public String testKeyWord(){
        //  请求转发
        //return "forward:/WEB-INF/pages/success.jsp";
        //  重定向：不能直接访问 WEB-INF 中的资源
        //  不需要再加项目路径
        return "redirect:/index.jsp";
    }

    /*
        使用 json 格式进行数据响应
            使用 @RequestBody 获取请求体
            使用 @ResponseBody 处理响应体
     */
    @PostMapping("/testJson")
    @ResponseBody
    public Book testJson(@RequestBody Book book){
        book.setVersion(2);
        return book;
    }
}
