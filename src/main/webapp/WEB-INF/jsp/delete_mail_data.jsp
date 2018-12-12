<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<div class="demoTable">
    搜索ID：
    <div class="layui-inline">
        <input class="layui-input" name="id" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>
<table class="layui-hide" id="test" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">删除</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">没啥用</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
    </div>

</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <%--<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>--%>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script src="/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#test'
            , url: '/test/table/demo1?flag=4'
            , title: '邮件数据表'
            , toolbar: '#toolbarDemo'
            , cols: [[
                {type: 'checkbox', fixed: 'left'}
                , {field: 'emailid', title: 'ID', width: 80, fixed: 'left', unresize: true, sort: true}
                , {field: 'receivercode', title: '收件人', width: 200, edit: 'text'}
                , {field: 'title', title: '主题', edit: 'text'}
                , {field: 'senddate', title: '时间', width: 270}
                , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 200}
            ]]
            , page: true
            , id: 'testReload'
        });

        //头工具栏事件
        table.on('toolbar(test)', function (obj) {
            var checkStatus = table.checkStatus(obj.config.id);
            switch (obj.event) {
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：' + data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选' : '未全选');
                    break;
            }
        });

        //监听行工具事件
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            //console.log(obj)
            if (obj.event === 'detail') {
                window.location.href="/See/mail?emailid="+data.emailid;

                /*layer.msg('查看操作');*/
            }
            else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    obj.del();
                    layer.close(index);
                });
            } else if (obj.event === 'edit') {
                layer.prompt({
                    formType: 2
                    , value: data.emailid
                }, function (value, index) {
                    obj.update({
                        emailid: value
                    });
                    layer.close(index);
                });
            }
        });
        var $ = layui.$;

        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            var demoReload = $('#demoReload');
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                , where: {
                    emailid: demoReload.val()
                }
            });
        });
    });
</script>


</body>
</html>