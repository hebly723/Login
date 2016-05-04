<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录界面</title>
  </head>
  <body>
  	<script type="text/javascript" language="JavaScript">
  		document.bgColor="Green";
  	</script>
     <form action="loginAction" method="post" align = "center">
     	用户名<input type="text" name="name" align = "left"><br/>
     	密码	 <input type="password" name="password" align = "left"><br/>
     	<input type="submit" value="登录" align = "left"><br/>
     	使用action的属性接受参数
     	<ul>
     	<li><a href="loginAction?name=www&password=qqq">名字是www密码是qqq</a></li>
     	<li><a href="loginAction?name=Dick&password=dick">名字是Dick密码是dick</a></li>
        </ul>
     </form>
  </body>
</html>
