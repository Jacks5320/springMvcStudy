<%--

设置 isELIgnored="false" 可以使用 EL 表达式获取 request 域属性。

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>操作成功页面</title>
    <style>
        h3 {
            text-align: center;
        }

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


<div class="out">
    <h3>操作成功跳转的页面</h3>
    <h3>下面的数据是其他模块的内容，如果当前测试模块没有用到没有数据渲染，请忽视！</h3>
    <div class="out">
        <p>demo6 中的数据渲染</p>
        <div class="out">
            <p>书名：${book.name}</p>
            <p>作者：${book.author}</p>
            <p>版本：${book.version}</p>
        </div>
    </div>
</div>

</body>
</html>
