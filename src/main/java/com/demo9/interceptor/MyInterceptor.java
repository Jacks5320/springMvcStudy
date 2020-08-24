package com.demo9.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器，定义好后，需要到配置文件中 注入到 IoC
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 预处理方法，controller 方法被执行前执行。
     * @param request 请求
     * @param response 响应
     * @param handler 控制器
     * @return 是否拦截，false 拦截，true 放行
     * @throws Exception 拦截处理时产生的异常
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("<== pre执行了 1111==>");
        String id = request.getParameter("id");
        //  没有传值拦截
        if (id == null){
            //  转发到错误页面，可选处理方法
            request.getRequestDispatcher("/WEB-INF/pages/400.jsp").forward(request,response);
            return false;
        }
        //  判断是否只包含数字，正则表达式判断。
        //  如果只包含数字，就放行，否则就拦截
        if (!id.matches("\\d+")){
            request.getRequestDispatcher("/WEB-INF/pages/400.jsp").forward(request,response);
            return false;
        }
        return true;
    }

    /**
     * 后处理方法，controller 方法执行后才执行
     * @param request 请求
     * @param response 响应
     * @param handler 控制器
     * @param modelAndView 响应处理对象
     * @throws Exception 产生的异常
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("<== post执行了 1111==>");
    }

    /**
     * 最终处理，请求结束后执行
     * @param request 请求
     * @param response 响应
     * @param handler 控制器
     * @param ex 异常
     * @throws Exception 抛给前端处理器
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("<== after执行了 1111==>");
    }
}
