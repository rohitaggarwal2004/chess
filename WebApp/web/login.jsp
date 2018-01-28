<%-- 
    Document   : login
    Created on : Jan 28, 2018, 4:48:14 PM
    Author     : roaggarw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login.mvc">
            <label for ="name"> Name</label>
            <input type="text" id="name" name="name" required placeholder="myname"/>
            <label for ="password"> Password</label>
            <input type="text" id="password" name="password" required placeholder="password"/>
            <input type="submit"/>
        </form>
    </body>
</html>
