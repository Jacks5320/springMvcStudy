<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解演示</title>
    <style>
        .out {
            margin: 10px;
            border: 1px black solid;
            padding: 10px;
        }

        p {
            color: coral;
        }
    </style>
</head>
<body>
<div>
    <div class="out">
        <a href="demo5/testRequestParam?username=李四&money=40.0&age=1">测试 @RequestParam 注解</a>
    </div>
    <div class="out">
        <a href="demo5/testRequestHeader">测试 @RequestHeader 注解</a>
    </div>
    <div class="out">
        <a href="demo5/testCookieValue">测试 @CookieValue 注解</a>
    </div>
    <div class="out">
        <form action="demo5/testModelAttribute" method="post">
            <span>金额：</span><input type="text" name="money">
            <input type="submit" value="测试 @ModelAttribute 注解">
        </form>
    </div>
    <div class="out">
        <form action="demo5/testSessionSave" method="post">
            <span>金额：</span><input type="text" name="money">
            <input type="submit" value="测试 @SessionAttributes 注解">
        </form>
        <br/>
        <br/>
        <a href="demo5/testSessionGet">获取保存的 session</a>
        <br/>
        <br/>
        <a href="demo5/testSessionDelete">删除保存的 session</a>
        <br/>
        <br/>
        <a href="demo5/testSessionString">保存String</a>
        <br/>
        <br/>
        <a href="demo5/testSessionStringGet">获取String</a>
        <br/>
        <br/>
        <a href="demo5/testSessionAttribute">获取隔壁存储的String</a>
    </div>
    <div class="out">
        <a href="demo5/testRequestAttribute">测试 RequestAttribute 注解</a>
    </div>
</div>
</body>
</html>
