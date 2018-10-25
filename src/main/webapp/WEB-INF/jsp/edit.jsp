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
                    <label class="layui-form-label">附件</label>
                    <div class="layui-input-block">
                        <div class="layui-upload">

                            <button type="button" class="layui-btn layui-btn-normal" id="testList">选择多文件</button>
                            <button type="button" class="layui-btn" id="testListAction">开始上传</button>
                            <div class="layui-upload-list">
                                <table class="layui-table">
                                    <thead>
                                    <tr><th>文件名</th>
                                        <th>大小</th>
                                        <th>状态</th>
                                        <th>操作</th>
                                    </tr></thead>
                                    <tbody id="demoList"></tbody>
                                </table>
                            </div>

                        </div>
                        <input type="hidden" id="enclosureID" name="enclosure" lay-verify="required" placeholder="邮件附件内容" autocomplete="off" class="layui-input"/>

                    </div>
   <%--                 <div class="layui-input-block">
                        <input type="text"  name="enclosure" lay-verify="required" placeholder="邮件附件" autocomplete="off" class="layui-input">
                    </div>--%>
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
    layui.use(['element','layedit','form','upload'], function(){
        var element = layui.element;
        var layedit = layui.layedit;
        var form = layui.form;

        var $ = layui.jquery
            ,upload = layui.upload;

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


        //多文件列表示例
        var demoListView = $('#demoList')
            ,uploadListIns = upload.render({
            elem: '#testList'
            ,url: '/upload/File'
            ,accept: 'file'
            ,multiple: true
            ,auto: false
            ,bindAction: '#testListAction'
            ,choose: function(obj){
                var files = this.files = obj.pushFile(); //将每次选择的文件追加到文件队列
                //读取本地文件
                obj.preview(function(index, file, result){
                    var tr = $(['<tr id="upload-'+ index +'">'
                        ,'<td>'+ file.name +'</td>'
                        ,'<td>'+ (file.size/1014).toFixed(1) +'kb</td>'
                        ,'<td>等待上传</td>'
                        ,'<td>'
                        ,'<button class="layui-btn layui-btn-xs demo-reload layui-hide">重传</button>'
                        ,'<button class="layui-btn layui-btn-xs layui-btn-danger demo-delete">删除</button>'
                        ,'</td>'
                        ,'</tr>'].join(''));

                    //单个重传
                    tr.find('.demo-reload').on('click', function(){
                        obj.upload(index, file);
                    });

                    //删除
                    tr.find('.demo-delete').on('click', function(){
                        delete files[index]; //删除对应的文件
                        tr.remove();
                        uploadListIns.config.elem.next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选
                    });

                    demoListView.append(tr);
                });
            }
            ,done: function(res, index, upload){
                if(res.code == 0){ //上传成功
                    //将页面中隐藏表单的值改为后台传来的数据src
                    $('#enclosureID').val(res.data.src+",");
                    alert("res.data.src"+res.data.src);
                    var tr = demoListView.find('tr#upload-'+ index)
                        ,tds = tr.children();
                    tds.eq(2).html('<span style="color: #5FB878;">上传成功</span>');
                    tds.eq(3).html(''); //清空操作
                    return delete this.files[index]; //删除文件队列已经上传成功的文件
                }
                this.error(index, upload);
            }
            ,error: function(index, upload){
                var tr = demoListView.find('tr#upload-'+ index)
                    ,tds = tr.children();
                tds.eq(2).html('<span style="color: #FF5722;">上传失败</span>');
                tds.eq(3).find('.demo-reload').removeClass('layui-hide'); //显示重传
            }
        });

    });

</script>

</body>
</html>
