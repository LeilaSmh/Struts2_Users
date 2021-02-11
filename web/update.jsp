<%-- 
    Document   : update
    Created on : 12 nov. 2018, 14:44:39
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
        <h1>Mise à jour</h1>
         <s:form action="saveOrUpdateUser">
     
             <s:textfield name="login" label="LOGIN  " readonly="true"/>
                <s:password name="password" label="Password"/>
                <s:submit value="Update" align="center"/>
    
</s:form>
    </body>
</html>
