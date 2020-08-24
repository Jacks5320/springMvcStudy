package com.demo8.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 编写了 自定义异常类以后，需要编写异常处理器。
 * 要求实现 HandlerExceptionResolver 接口，并且重写 resolveException 方法
 * 除此之外，还需要在 springmvc.xml 中配置异常处理器。
 */

public class MyExceptionResolver implements HandlerExceptionResolver {
    /**
     * 异常处理业务逻辑
     *
     * @param httpServletRequest  请求
     * @param httpServletResponse 响应
     * @param o                   当前处理器对象
     * @param e                   当前捕获异常
     * @return ModelAndView
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o,
                                         Exception e) {
        MyException myException = null;
        //  判断是否为自定义异常，instanceof 关键字，比较类型
        if (e instanceof MyException) {
            myException = (MyException) e;
        } else {
            //  如果不是 自定义异常抛出的异常，说明系统存在未处理的异常。
            //  可以将提示信息设置为自定义信息，告诉程序员该维护了系统了。
            e = new MyException("系统正在维护。。。");
        }
        //  创建 ModelAndView 对象
        ModelAndView modelAndView = new ModelAndView();
        //  添加异常信息到 ModelMap 中，进而存入 request 域中
        //  可以在跳转页面中使用 EL 表达式获取到属性。
        modelAndView.addObject("errorMsg", e.getMessage());
        //  跳转的页面，跳转到 error 页面
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
