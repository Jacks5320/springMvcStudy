<%--
演示请求参数绑定
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数绑定</title>
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
        <p>普通类型与String类型参数绑定</p>
        <a href="user/ordinary?username=小明&age=13">普通类型绑定</a>
    </div>
    <div class="out">
        <p>引用类型与bean类型参数绑定</p>
        <form action="user/beanBind1" method="post">
            <span>姓名：</span><input type="text" name="name">
            <span>年龄：</span><input type="text" name="age">
            <input type="submit" value="bean类型绑定">
        </form>
    </div>
    <div class="out">
        <p>bean类型中包含bean类型参数绑定</p>
        <form action="user/beanBind2" method="get">
            <span>账户：</span><input type="text" name="username">
            <span>姓名：</span><input type="text" name="user.name">
            <span>年龄：</span><input type="text" name="user.age">
            <input type="submit" value="bean类型中包含bean类型">
        </form>
    </div>
    <div class="out">
        <p>集合类型参数绑定</p>
        <form action="user/collectionBind" method="post">
            <div class="out">
                <p>String类型的list</p>
                <span>StringList1：</span><input type="text" name="list[0]">
                <span>StringList2：</span><input type="text" name="list[1]">
            </div>
            <div class="out">
                <p>Account类型的 list</p>
                <span>账户1：</span><input type="text" name="userList[0].username">
                <span>姓名1：</span><input type="text" name="userList[0].user.name">
                <span>年龄1：</span><input type="text" name="userList[0].user.age"><br/>
                <span>账户2：</span><input type="text" name="userList[1].username">
                <span>姓名2：</span><input type="text" name="userList[1].user.name">
                <span>年龄2：</span><input type="text" name="userList[1].user.age"><br/>
            </div>
            <div class="out">
                <p>String类型的map</p>
                <span>stringMap1：</span><input type="text" name="map['s1']"><br/>
                <span>stringMap2：</span><input type="text" name="map['s2']"><br/>
            </div>
            <div class="out">
                <p>Account类型的map</p>
                <span>Map1账户：</span><input type="text" name="userMap['a1'].username"><br/>
                <span>Map1姓名：</span><input type="text" name="userMap['a1'].user.name"><br/>
                <span>Map1年龄：</span><input type="text" name="userMap['a1'].user.age"><br/>
                <span>Map2账户：</span><input type="text" name="userMap['a2'].username"><br/>
                <span>Map2姓名：</span><input type="text" name="userMap['a2'].user.name"><br/>
                <span>Map2年龄：</span><input type="text" name="userMap['a2'].user.age"><br/>
            </div>
            <br/>
            <input type="submit" value="封装集合类型">
        </form>
    </div>
</div>
</body>
</html>
