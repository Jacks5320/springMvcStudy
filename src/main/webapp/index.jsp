<%--演示入门程序--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>
        a {
            display: inline-block;
            padding: 15px 25px;
            font-size: 24px;
            cursor: pointer;
            text-align: center;
            text-decoration: none;
            outline: none;
            color: #fff;
            background-color: #4CAF50;
            border: none;
            border-radius: 15px;
            box-shadow: 0 9px #999;
        }
    </style>
</head>
<body>
<div>
    <a href="user/hello">入门程序</a>
    <br/>
    <br/>
    <a href="paramBind.jsp">请求参数绑定演示</a>
    <br/>
    <br/>
    <a href="stringToDate.jsp">自定义类型转换器演示</a>
    <br/>
    <br/>
    <a href="servletApi.jsp">原生 Servlet Api 演示</a>
    <br/>
    <br/>
    <a href="annotation.jsp">常用注解演示</a>
    <br/>
    <br/>
    <a href="response.jsp">数据响应与结果视图演示</a>
    <br/>
    <br/>
    <a href="fileUpload.jsp">文件上传演示</a>
    <br/>
    <br/>
    <a href="demo8/testMyException">异常处理器演示</a>
</div>
</body>
</html>
