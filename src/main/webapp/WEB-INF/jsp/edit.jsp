<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div class="layui-tab" >
    <ul class="layui-tab-title layui-bg-gray">
        <li class="layui-this">普通邮件</li>
        <li>群邮件</li>
        <li>贺卡</li>
        <li>明信片</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
            <form class="layui-form" action="/email/send"  method="post">
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn"  lay-submit lay-filter="formDemo"><i class="layui-icon">&#xe609;</i> 发送</button>
                        <button class="layui-btn" lay-submit lay-filter="demo2"><i class="layui-icon">&#xe60e;</i> 定时发送</button>
                        <button class="layui-btn" lay-submit lay-filter="demo3"><i class="layui-icon">&#xe655;</i> 存草稿</button>
                        <button class="layui-btn" lay-submit lay-filter="demo4"><i class="layui-icon">&#x1006;</i> 关闭</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
                <div class="layui-form-item" >
                    <label class="layui-form-label">收件人</label>
                    <div class="layui-input-block">
                        <input type="text" name="receivercode" lay-verify="title" autocomplete="off" placeholder="请输入收件人地址" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">主题</label>
                    <div class="layui-input-block">
                        <input type="text"  name="title" lay-verify="required" placeholder="请输入邮件主题" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">正文</label>
                    <div class="layui-input-block">
                        <textarea id="demo" name="content" style="display: none;"></textarea>
                    </div>
                </div>
            </form>
        </div>
        <div class="layui-tab-item">内容2</div>
        <div class="layui-tab-item">内容3</div>
        <div class="layui-tab-item">内容4</div>
    </div>
</div>
<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['element','layedit','form'], function(){
        var element = layui.element;
        var layedit = layui.layedit;
        var form = layui.form;

        //上传图片,必须放在 创建一个编辑器前面
        layedit.set({
            uploadImage: {
                url: '/uploadimage' //接口url
                ,type: 'post' //默认post
            }
        });
        layedit.build('demo',{
            height: 220
        }); //建立编辑器
        //…
    });
</script>

</body>
</html>
