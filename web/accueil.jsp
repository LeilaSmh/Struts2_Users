<%-- 
    Document   : accueil
    Created on : 12 nov. 2018, 14:50:05
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
        <h1>GESTION DES UTILISATEURS</h1>
         <s:form action="saveOrUpdateUser">
                <s:textfield name="login" label="LOGIN  " />
                <s:password name="password" label="Password"/>
                <s:submit value="ADD" align="center"/>
        </s:form>
       <s:if test="%{userList.size()>0}">
        <table class="affichage">
	<tr>    <th>LOGIN</th> <th>PASSWORD</th><th>Edit</th><th>Delete</th>
	</tr>
		<s:iterator value="userList">
                    <tr>    
                        <td><s:property value="login" /></td>
			    <td><s:property value="password" /></td>
			<td>
                          <s:url id="editURL" action="editUser">
			    <s:param name="login" value="%{login}"></s:param>
			  </s:url> 
                            <s:a href="%{editURL}">Update</s:a>
                          </td>
			<td>
                        <s:url id="deleteURL" action="deleteUser">
			    <s:param name="login" value="%{login}"></s:param>
			</s:url> 
                        <s:a href="%{deleteURL}">Delete</s:a>
                                </td>
			</tr>
		</s:iterator>
                        	</s:if>
	</table>

    </body>
</html>
