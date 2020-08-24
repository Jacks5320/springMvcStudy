<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <link rel="stylesheet" href="./css/my.css">
</head>
<body>
<div class="out">
    <h3>demo7：文件上传功能</h3>
    <div class="out">
        <p>传统方式文件上传</p>
        <div class="out">
            <form action="demo7/fileUpload1" method="post" enctype="multipart/form-data">
                <label>选择上传文件：</label><input type="file" name="upload1">
                <button class="btn" type="submit">上传</button>
            </form>
        </div>
        <p>SpringMVC 方式文件上传</p>
        <div class="out">
            <form action="demo7/fileUpload2" method="post" enctype="multipart/form-data">
                <label>选择上传文件：</label><input type="file" name="upload2">
                <button class="btn" type="submit">上传</button>
            </form>
        </div>
        <p>跨服务器文件上传</p>
        <div class="out">
            <form action="demo7/fileUpload3" method="post" enctype="multipart/form-data">
                <label>选择上传文件：</label><input type="file" name="upload3">
                <button class="btn" type="submit">上传</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
