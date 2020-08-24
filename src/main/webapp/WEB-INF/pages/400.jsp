<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拦截器转发页面</title>
    <link rel="stylesheet" href="../../css/my.css">
</head>
<body>
<div class="out">
    <h3>拦截器跳转页面</h3>
    <div class="out">
        <p>提示信息：您的参数不符合要求，请重写输入。</p>
        <% System.out.println("<== 拦截器拦截，并响应了 ==>"); %>
    </div>
</div>
</body>
</html>
