<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri = "/struts-tags" %>>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录界面</title>
  </head>
  <body>
  	<script type="text/javascript" language="JavaScript">
  		document.bgColor="Green";
  	</script>
     <form action="K" method="post" align = "center">
     	用户名<s:textfield name="user.name"  label = "用户名" ></s:textfield><br/>
     	密码	 <input type="password" name="user.password" align = "left"><br/>
        客户<input type="text" name="gg" align = "left"><br/>
     	<input type="submit" value="登录" align = "left"><br/>
     	使用action的属性接受参数
     	<ul>
     	<li><a href="loginAction?user.name=www&user.password=qqq">名字是www密码是qqq</a></li>
     	<li><a href="loginAction?user.name=Dick&user.password=dick">名字是Dick密码是dick</a></li>
        </ul>
        试试看有没有动了<br/>
     </form>
  </body>
</html>
