package com.demo7.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * 演示文件上传：需要提前导入 文件上传相关依赖和跨服务器上传文件相关依赖。
 */
@Controller
@RequestMapping("/demo7")
public class Demo7Controller3 {
    /*
        跨服务器上传
     */
    @PostMapping("/fileUpload3")
    public String fileUpload3(MultipartFile upload3) throws Exception {
        System.out.println("<==跨服务器 文件上传执行了==>");

        //  定义上传文件服务器路径
        String path = "http://localhost:9090/uploadserver/uploads";

        //  上传文件项
        //  获取上传文件的名称
        String filename = upload3.getOriginalFilename();
        System.out.println("文件名获取到了");
        //  文件名设置唯一
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        System.out.println("文件名：" + filename);
        //  创建客户端的对象
        Client client = Client.create();

        //  和图片服务器进行连接
        WebResource webResource = client.resource(path + "/" + filename);
        System.out.println("服务器连接了" + webResource.toString());
        //  完成文件上传
        webResource.put(upload3.getBytes());
        System.out.println("文件上传完成了");

        return "success";
    }
}
