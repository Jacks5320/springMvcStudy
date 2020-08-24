# SpringMVC 学习 demo

GitHub 地址：[https://github.com/Jacks5320/springMvcStudy](https://github.com/Jacks5320/springMvcStudy)

## 关于配置注意事项

在本地使用 IDEA 打开这个项目时，需要自己配置 tomcat 来部署这个项目，端口默认即可，还可以查看一下 maven 仓库路径是否正确。  
IDEA 高版本中，新项目的 maven 路径会恢复默认。

---

在测试 demo7 跨服务器上传文件时，需要自己新建一个 web 模块作为文件服务器，并且为其配置 tomcat 来部署，端口设置如下：

- http port 设置为 9090（注意与本项目区分开）
- 项目路径设置为 /fileServer
- JMX port 设置为 1100（注意与本项目区分开）

当然，你可以自己修改，但是得保证 Demo7Controller 中设置的服务器路径与文件服务器路径一致。

除此之外，还需要在文件服务器的编译文件 target 文件夹中创建一个 uploads 文件夹用于保存上传的文件，uploads 与 WEB-INF 是同级目录。

如果你在使用这些 demo 的过程中遇到一些困难，可以到对应 demo 的博客下面留言告诉我。

---

## 项目目录

demo1 ==> 入门程序

demo2 ==> request 参数绑定

demo3 ==> 自定义类型转换器

demo4 ==> 原生 Servlet API 接口使用

demo5 ==> 常用注解

demo6 ==> 数据响应与结果视图

demo7 ==> 文件上传

demo8 ==> 异常处理器

---

## 博客地址

[SpringMVC 简介及入门程序](https://blog.csdn.net/qq_44713454/article/details/108135004)

[SpringMVC 路径映射](https://blog.csdn.net/qq_44713454/article/details/108145304)

[SpringMVC 请求参数绑定](https://blog.csdn.net/qq_44713454/article/details/108146365)

[SpringMVC 自定义类型转换器](https://blog.csdn.net/qq_44713454/article/details/108158345)

[SpringMVC 使用原生 Servlet API](https://blog.csdn.net/qq_44713454/article/details/108161503)

[SpringMVC 中的注解](https://blog.csdn.net/qq_44713454/article/details/108166890)

[SpringMVC 数据响应与结果视图](https://blog.csdn.net/qq_44713454/article/details/108188261)

[SpringMVC 过滤静态资源](https://blog.csdn.net/qq_44713454/article/details/108190159)

[SpringMVC 文件上传](https://blog.csdn.net/qq_44713454/article/details/108197688)

[SpringMVC 异常处理器](https://blog.csdn.net/qq_44713454/article/details/108207683)