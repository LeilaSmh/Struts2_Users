<%-- 
    Document   : register
    Created on : 9 déc. 2017, 21:45:12
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
 <s:form action="saveOrUpdateUser">
     
		<s:textfield name="login" label="LOGIN  " />
                <s:password name="password" label="Password"/>
                <s:submit value="ADD" align="center"/>
    
</s:form>

    </body>
</html>
