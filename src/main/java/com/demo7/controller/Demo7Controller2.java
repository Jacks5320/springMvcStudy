package com.demo7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * 演示文件上传：需要提前导入 文件上传的依赖
 */
@Controller
@RequestMapping("/demo7")
public class Demo7Controller2 {
    /*
        SpringMVC 方式上传文件
            使用 MultipartFile 上传文件
            原理分析：
                前端发送请求 --> 前端控制器 --> 调用文件解析器 --> 返回结果给前端控制器 -->
                前端控制器将解析结果绑定给 controller 方法的参数 --> controller 返回结果给前端控制器 --> 响应页面
            注意：
                1 需要配置文件解析器 CommonsMultipartResolver
                2 这里相当于是将 请求参数绑定到 控制器方法的参数，
                    所以要求 input 标签的 name=upload2 值要与这里的参数声明 upload2 保持一致。
                    当然也可以使用相关注解进行关联，但不是这个 demo 的讨论范畴。
     */
    @PostMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload2) throws Exception {
        //  指定文件保存路径
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        System.out.println(path);
        //  判断路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //  获取上传文件的名称
        String filename = upload2.getOriginalFilename();
        //  文件名设置唯一
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        //  完成文件上传，MultipartFile 自己会去解析 request ，然后将结果还给 前端控制器
        upload2.transferTo(new File(path, filename));
        return "success";
    }
}
