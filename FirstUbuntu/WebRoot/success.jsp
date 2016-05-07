<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录成功</title>
  </head>
  
  <body>
    <script type="text/javascript " language = "JavaScript">
		document.setcolor = "blue";
	</script>
	<s:property value="user.name"/>
	<s:property value="info"/><br/>
	<!-- 您好：<s:property value="#session.user.name"/> -->
	<!-- 您好：<%//=session.getAttribute("user.name") %>  -->
	登录成功
  </body>
</html>