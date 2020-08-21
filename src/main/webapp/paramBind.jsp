<%--
演示请求参数绑定
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数绑定</title>
</head>
<body>
<div>
    <%--普通类型与String类型绑定--%>
    <a href="user/ordinary?username=小明&age=13">普通类型绑定</a>
    <br/>
    <h3><----------华丽的分割线--></h3>
    <br/>
    <%--引用类型和 bean 类型绑定--%>
    <form action="user/beanBind1" method="post">
        姓名：<input type="text" name="name">
        年龄：<input type="text" name="age">
        <input type="submit" value="bean类型绑定">
    </form>
    <br/>
    <h3><----------华丽的分割线--></h3>
    <br/>
    <%-- 引用类型用包含引用类型 --%>
    <form action="user/beanBind2" method="get">
        账户：<input type="text" name="username">
        姓名：<input type="text" name="user.name">
        年龄：<input type="text" name="user.age">
        <input type="submit" value="bean类型中包含bean类型">
    </form>
    <br/>
    <h3><----------华丽的分割线--></h3>
    <br/>
    <form action="user/collectionBind" method="post" style="border: 1px red solid;">
        <%--String类型的list--%>
        <div style="border: 1px orange solid;">
            <p>String类型的list</p>
            StringList1:<input type="text" name="list[0]">
            StringList2:<input type="text" name="list[1]">
        </div>
        <%--Account类型的 list--%>
        <div style="border: 1px orange solid;">
            <p>Account类型的 list</p>
            账户1：<input type="text" name="userList[0].username">
            姓名1：<input type="text" name="userList[0].user.name">
            年龄1：<input type="text" name="userList[0].user.age"><br/>
            账户2：<input type="text" name="userList[1].username">
            姓名2：<input type="text" name="userList[1].user.name">
            年龄2：<input type="text" name="userList[1].user.age"><br/>
        </div>
        <%--String类型的map--%>
        <div style="border: 1px orange solid;">
            <p>String类型的map</p>
            stringMap1：<input type="text" name="map['s1']"><br/>
            stringMap2：<input type="text" name="map['s2']"><br/>
            <p>Account类型的map</p>
            Map1账户：<input type="text" name="userMap['a1'].username"><br/>
            Map1姓名：<input type="text" name="userMap['a1'].user.name"><br/>
            Map1年龄：<input type="text" name="userMap['a1'].user.age"><br/>
            Map2账户：<input type="text" name="userMap['a2'].username"><br/>
            Map2姓名：<input type="text" name="userMap['a2'].user.name"><br/>
            Map2年龄：<input type="text" name="userMap['a2'].user.age"><br/>
        </div>
        <br/>
        <br/>
        <input type="submit" value="封装集合类型">
    </form>
</div>
</body>
</html>
