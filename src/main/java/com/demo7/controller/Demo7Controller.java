package com.demo7.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * 演示文件上传：需要提前导入 文件上传的依赖
 */
@Controller
@RequestMapping("/demo7")
public class Demo7Controller {
    /*
        传统 servlet 使用 common-fileupload 方式上传文件：
            Servlet 中文 API 文档：https://www.cnblogs.com/haimishasha/p/5609261.html#autoid-3-3-0
        注意：如果配置了文件解析器后就会使用 springmvc 的解析器 CommonsMultipartResolver 进行解析，
                就不能再使用 ServletFileUpload 解析 request 了，因为已经被解析过了，再次解析结果就为 null。
                测试 这个 demo 的时候，记得将 springmvc 中配置的文件解析器注释掉
     */
    @PostMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("<==文件上传执行了==>");
        //  使用 fileUpload 组件完成文件上传
        //  指定上传位置位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //String path = "E:/uploads/";
        //  控制台查看保存路径
        System.out.println(path);

        //  判断路径是否存在，不存在就创建一个
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        //  解析 request 对象
        //  磁盘文件项对象工厂，可以创建文件上传核心组件ServletFileUpload对象
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //  用工厂创建文件上传核心组件ServletFileUpload对象
        ServletFileUpload upload = new ServletFileUpload(factory);
        //  解析 request，获取表单列表
        List<FileItem> items = upload.parseRequest(request);
        //System.out.println(items);
        //  遍历表单项
        for (FileItem item : items) {
            //  判断当前 item 对象是否是上传文件项
            //  item.isFormField() 为 false 就表示上传文件项，为 true 就是普通表单项
            //  这里只处理了 文件上传项
            if (!item.isFormField()) {
                //  获取上传文件的名称
                String filename = item.getName();
                //  文件名设置唯一，使用 UUID
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename = uuid + "_" + filename;
                System.out.println("文件名：" + filename);
                //  保存文件到指定路径
                item.write(new File(path, filename));
                //  删除临时文件，缓存的文件
                item.delete();
            }
        }
        return "success";
    }
}
