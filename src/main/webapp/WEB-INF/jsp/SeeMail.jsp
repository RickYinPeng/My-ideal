<%--
  Created by IntelliJ IDEA.
  User: 鹏鹏
  Date: 2018/10/24
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <script src="/layui/layui.js" charset="utf-8"></script>
</head>
<body>

    <h3>邮件主题：${emailbox.title}</h3>
    发件人：${emailbox.sendercode}<br/>
    发件日期：${emailbox.senddate}<br/>
    <hr class="layui-bg-green">
    ${emailbox.content}
    <hr class="layui-bg-green">
    <c:forEach var="item" items="${enclosure}" varStatus="status">
        下载附件：
        <a href="/down/load?fileName=${item}">${item}</a>
    </c:forEach>
</body>
</html>
