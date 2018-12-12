<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="user-scalable=no,width=device-width,initial-scale=1,maximum-scale=1">
	<title>前后端分离</title>
	<link rel="stylesheet" type="text/css" href="/css/common.css">
	<link rel="stylesheet" type="text/css" href="/css/login.css">
	<script src="/js/jquery-1.10.2.js"></script>
</head>
<body>
	<div class="login_cont">
		<div class="login_nav">
			<div class="nav_slider">
				<a href="#" class="signup focus">注册</a>
				<a href="#" class="signin">登录</a>
			</div>
		</div>
		<form action="/email/regist">
			<div class="input_signup active">
				<input class="input" id="user_name" name="mailUsername" type="text" aria-label="用户名（包含字母／数字／下划线" placeholder="用户名">
				<div class="hint">请填写符合格式的用户名</div>
				<input class="input" id="password" name="mailPassword" type="password" aria-label="密码" placeholder="密码（不少于 6 位）">
				<div class="hint">请填写符合格式的密码</div>
				<input class="input" id="repassword" type="password" aria-label="密码" placeholder="再次输入密码">
				<div class="hint">请再次输入密码</div>
				<input type="submit" id="submit" class="button" name="button" value="注册">
			</div>
		</form>
		<form action="/User/login">
			<div class="input_signin">
				<input class="input" id="login_user_name" name="mailUsername" type="text" aria-label="用户名" placeholder="用户名">
				<div class="hint">请输入用户名</div>
				<input class="input" id="login_password" name="mailPassword" type="password" aria-label="密码" placeholder="密码">
				<div class="hint">请输入密码</div>
				<input type="submit" id="button" class="button" name="button" value="登录">
				<div class="forget">
					<a href="forget.html">忘记密码？</a>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript" src="/js/login.js"></script>
	<script type="text/javascript" src="/js/form.js"></script>
	<script type="text/javascript" src="/js/config.js"></script>
	<script type="text/javascript" src="/js/login_ajax.js"></script>
</body>
</html>