<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解演示</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <link rel="stylesheet" href="./css/my.css">
</head>

<body>
<div class="out">
    <h3>demo5：SpringMVC 常用注解演示</h3>
    <div class="out">
        <p>测试 @RequestParam 注解</p>
        <a class="btn" href="demo5/testRequestParam?username=李四&money=40.0&age=1">发送请求</a>
    </div>
    <div class="out">
        <p>测试 @RequestHeader 注解</p>
        <a class="btn" href="demo5/testRequestHeader">发送请求</a>
    </div>
    <div class="out">
        <p>测试 @CookieValue 注解</p>
        <a class="btn" href="demo5/testCookieValue">发送请求</a>
    </div>
    <div class="out">
        <p>测试 @ModelAttribute 注解</p>
        <form action="demo5/testModelAttribute" method="post">
            <label>金额：</label><input class="ipt" type="text" name="money">
            <button class="btn" type="submit">发送请求</button>
        </form>
    </div>
    <div class="out">
        <p>测试 @SessionAttributes 与 @SessionAttribute 注解</p>
        <p>需要先发送请求后才会保存 session</p>
        <div class="out">
            <form action="demo5/testSessionSave" method="post">
                <label>姓名：</label><input class="ipt" type="text" name="name"><br/>
                <label>年龄：</label><input class="ipt" type="text" name="age"><br/>
                <label>金额：</label><input class="ipt" type="text" name="money"><br/><br/>
                <button class="btn" type="submit">发送请求，保存 session</button>
            </form>
        </div>

        <div class="out">
            <a class="btn" href="demo5/testSessionGet">获取保存的 session</a>
            <a class="btn" href="demo5/testSessionDelete">删除保存的 session</a>
            <br/>
            <br/>
            <a class="btn" href="demo5/testSessionString">保存String</a>
            <a class="btn" href="demo5/testSessionStringGet">获取String</a>
            <br/>
            <br/>
            <a class="btn" href="demo5/testSessionAttribute">获取隔壁存储的String</a>
        </div>

    </div>
    <div class="out">
        <p>测试 @RequestAttribute 注解</p>
        <a class="btn" href="demo5/testRequestAttribute">发送请求</a>
    </div>
    <div class="out">
        <p>测试 @RequestBody 和 @ResponseBody 注解</p>
        <p>返回结果需要在控制台查看</p>
        <button class="btn" id="btn">发送 ajax 请求</button>
    </div>
</div>
<script>
    //  页面加载，绑定点击事件。
    $(function () {
        $("#btn").click(function () {
            // alert("hello btn");
            $.ajax({
                // 编写 json 格式，设置属性和值。
                url: "demo5/testRequestBody",
                contentType: "application/json;charset=UTF-8",
                data: '{"name":"小李","age":"30","money":2000.0}',
                dataType: "json",
                type: "post",
                success: function (data) {
                    //data 是服务器端响应的 json 数据，进行解析
                    console.log(data);
                    console.log(data.name);
                    console.log(data.age);
                    console.log(data.money);
                }
            })
        });
    });
</script>
</body>
</html>
