<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拦截器演示页面</title>
    <link rel="stylesheet" href="css/my.css">
</head>
<body>
<div class="out">
    <h3>拦截器演示页面</h3>
    <div class="out">
        <p>可以输入纯数字或带非数字字符串进行测试</p>
        <div class="out">
            <p>有拦截器拦截</p>
            <form action="demo9/testInterceptor1">
                <label>id：</label><input class="ipt" type="text" name="id">
                <input class="btn" type="submit" value="提交">
            </form>
        </div>
        <div class="out">
            <p>没有拦截器拦截</p>
            <form action="demo9/testInterceptor2">
                <label>id：</label><input class="ipt" type="text" name="id">
                <input class="btn" type="submit" value="提交">
            </form>
        </div>
    </div>
</div>
</body>
</html>
