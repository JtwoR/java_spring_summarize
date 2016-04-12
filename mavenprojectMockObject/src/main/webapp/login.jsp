<%-- 
    Document   : login
    Created on : 2016-4-8, 10:15:25
    Author     : NIIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <h1>Login Page</h1><hr/>
        
        <form action="IndexServlet" method="post">
            
            username : <input type="text" name="username"/><br/>
            
            <input type="submit" value="login"/>
            
        </form>
            
    </body>
</html>
