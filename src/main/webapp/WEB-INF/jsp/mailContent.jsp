<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.1.3.css">
    <link rel="stylesheet" href="">
</head>

<body style="" class="bg-info">
<div class="py-5 bg-info">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-body">
                        <h3 class="card-title text-center ">&nbsp;${emailbox.title}</h3>
                        <h5 class="my-2 text-muted text-left text-secondary">发件人:<span class="card-subtitle">${emailbox.sendercode}</span></h5>
                        <p class="card-text">
                            ${emailbox.content}
                        <hr class="layui-bg-green">
                        <c:forEach var="item" items="${enclosure}" varStatus="status">
                            下载附件：
                            <a href="/down/load?fileName=${item}">${item}</a>
                        </c:forEach>
                        </p>
                        <a href="#" class="card-link" id="receive">回复</a>
                        <a href="#" class="card-link" id="delete">删除</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>