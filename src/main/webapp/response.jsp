<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据响应</title>
    <style>
        .out {
            margin: 10px;
            border: 1px black solid;
            padding: 10px;
        }
    </style>
</head>
<body>
<div class="out">
    <div class="out">
        <p>控制器方法返回 String</p>
        <a href="demo6/testString">发送请求</a>
    </div>
    <div class="out">
        <p>控制器方法返回 void</p>
        <a href="demo6/testVoid">发送请求</a>
    </div>
    <div class="out">
        <p>控制器方法返回 ModelAndView</p>
        <a href="demo6/testModelAndView">发送请求</a>
    </div>
    <div class="out">
        <p>使用关键字进行转发或重定向</p>
        <a href="demo6/testKeyWord">发送请求</a>
    </div>
    <div class="out">
        <p>响应 json 数据</p>
        <button id="btn">发送 ajax 请求</button>
    </div>
</div>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    //  页面加载，绑定点击事件。
    $(function () {
        $("#btn").click(function () {
            // alert("hello btn");
            $.ajax({
                // 编写 json 格式，设置属性和值。
                url: "demo6/testJson",
                contentType: "application/json;charset=UTF-8",
                data: '{"name":"Linux从入门到入土","author":"秃头大师","version":"1"}',
                dataType: "json",
                type: "post",
                success: function (data) {
                    //data 是服务器端响应的 json 数据，进行解析
                    console.log(data);
                    console.log(data.name);
                    console.log(data.author);
                    console.log(data.version);
                }
            })
        });
    });
</script>
</body>
</html>
