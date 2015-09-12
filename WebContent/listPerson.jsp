<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生信息列表</title>
</head>
<%!int nNumber = 0;%>
<body>
	<table>
		<th bordercolor="#ffbbdd">
		<td>序号</td>
		<td>姓名</td>
		<td>联系方式</td>
		<td>住址</td>
		<td>身份证</td>
		</th>
		<tr>
			<s:iterator value="#request.stusList" status="status">
				<tr bordercolor="#bbaacc">
					<s:property value="<%=nNumber++%>" />
					<s:property value="name" />
					<s:property value="phoneNumber" />
					<s:property value="address" />
					<s:property value="id" />
				</tr>
			</s:iterator>
		</tr>
		<tfoot>
		<a href="/addPerson.html" value="添加学生信息"></a>
		</tfoot>
	</table>
</body>
</html>