<%-- 
    Document   : Liste
    Created on : 9 déc. 2017, 22:30:53
    Author     : elhaddadmohamed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
        <title>JSP Page</title>
    </head>
    <body>
       <table>
		<tr>    <th>LOGIN</th>
			<th>PASSWORD</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="userList">
                    <tr>    <td><s:property value="login" /></td>
				<td><s:property value="password" /></td>
				<td>
                                    <s:url id="editURL" action="editUser">
				 <s:param name="login" value="%{login}"></s:param>
				</s:url> <s:a href="%{editURL}">Update</s:a>
                                </td>
				<td><s:url id="deleteURL" action="deleteUser">
					<s:param name="login" value="%{login}"></s:param>
				</s:url> <s:a href="%{deleteURL}">Delete</s:a>
                                </td>
			</tr>
		</s:iterator>
	</table>
    </body>
</html>