<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拦截器通过</title>
    <link rel="stylesheet" href="../../css/my.css">
</head>
<body>
<div class="out">
    <h3>拦截器放行页面</h3>
    <div class="out">
        <p>提示信息：拦截器通过，并且响应了</p>
        <% System.out.println("<== 拦截器通过，并且响应了 ==>"); %>
    </div>
</div>
</body>
</html>
