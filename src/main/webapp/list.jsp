<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<center>
	<form action="list.do" method="post">
		书名：<input type="text" name="bname" value="${bname}">
		<input type="submit" name="搜索">
	</form>
		<table>
			<tr>
				<th>编号</th>
				<th>编号</th>
				<th>书名</th>
				<th>类型</th>
				<th>手机号</th>
				<th>作者</th>
				<th>受欢迎程度</th>
				<th>操作</th>
			</tr>
			<c:forEach  items="${page.list}"  var="b">
				<tr align="center">
					<td>${b.bid}</td>
					<td>${b.bid}</td>
					<td>${b.bname}</td>
					<td>${b.type}</td>
					<td>${b.phone}</td>
					<td>${b.author}</td>
					<td>${b.popular}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10">
					<a href="list.do?pageNum=1&bname=${bname} ">首页</a>
					<a href="list.do?pageNum=${page.pageNum-1<0?1:page.pageNum-1}&bname=${bname}">上一页</a>
					<a href="list.do?pageNum=${page.pageNum+1>page.pages?page.pages:page.pageNum+1}&bname=${bname}">下一页</a>
					<a href="list.do?pageNum=${page.pages}&bname=${bname}">尾页</a> 
				</td>
			</tr>
		</table>
	</center>
</body>
</html>