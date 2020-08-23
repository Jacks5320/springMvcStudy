<%--
演示请求参数绑定
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数绑定</title>
    <link rel="stylesheet" href="./css/my.css">
</head>
<body>
<div class="out">
    <h3>demo2：请求参数绑定演示</h3>
    <div class="out">
        <p>普通类型与String类型参数绑定</p>
        <a class="btn" href="user/ordinary?username=小明&age=13">普通类型绑定</a>
    </div>
    <div class="out">
        <p>引用类型与bean类型参数绑定</p>
        <form action="user/beanBind1" method="post">
            <label>姓名：</label><input class="ipt" type="text" name="name"><br/>
            <label>年龄：</label><input class="ipt" type="text" name="age"><br/><br/>
            <input class="btn" type="submit" value="bean类型绑定">
        </form>
    </div>
    <div class="out">
        <p>bean类型中包含bean类型参数绑定</p>
        <form action="user/beanBind2" method="get">
            <label>账户：</label><input class="ipt" type="text" name="username"><br/>
            <label>姓名：</label><input class="ipt" type="text" name="user.name"><br/>
            <label>年龄：</label><input class="ipt" type="text" name="user.age"><br/><br/>
            <input class="btn" type="submit" value="bean类型中包含bean类型">
        </form>
    </div>
    <div class="out">
        <p>集合类型参数绑定</p>
        <form action="user/collectionBind" method="post">
            <div class="out">
                <p>String类型的list</p>
                <label>StringList1：</label><input class="ipt" type="text" name="list[0]"><br/>
                <label>StringList2：</label><input class="ipt" type="text" name="list[1]"><br/>
            </div>
            <div class="out">
                <p>Account类型的 list</p>
                <label>账户1：</label><input class="ipt" type="text" name="userList[0].username"><br/>
                <label>姓名1：</label><input class="ipt" type="text" name="userList[0].user.name"><br/>
                <label>年龄1：</label><input class="ipt" type="text" name="userList[0].user.age"><br/>
                <label>账户2：</label><input class="ipt" type="text" name="userList[1].username"><br/>
                <label>姓名2：</label><input class="ipt" type="text" name="userList[1].user.name"><br/>
                <label>年龄2：</label><input class="ipt" type="text" name="userList[1].user.age">
            </div>
            <div class="out">
                <p>String类型的map</p>
                <label>stringMap1：</label><input class="ipt" type="text" name="map['s1']"><br/>
                <label>stringMap2：</label><input class="ipt" type="text" name="map['s2']">
            </div>
            <div class="out">
                <p>Account类型的map</p>
                <label>Map1账户：</label><input class="ipt" type="text" name="userMap['a1'].username"><br/>
                <label>Map1姓名：</label><input class="ipt" type="text" name="userMap['a1'].user.name"><br/>
                <label>Map1年龄：</label><input class="ipt" type="text" name="userMap['a1'].user.age"><br/>
                <label>Map2账户：</label><input class="ipt" type="text" name="userMap['a2'].username"><br/>
                <label>Map2姓名：</label><input class="ipt" type="text" name="userMap['a2'].user.name"><br/>
                <label>Map2年龄：</label><input class="ipt" type="text" name="userMap['a2'].user.age">
            </div>
            <br/>
            <input class="btn" type="submit" value="封装集合类型">
        </form>
    </div>
</div>
</body>
</html>
