<%-- 
    Document   : AddEmployee
    Created on : Jan 28, 2018, 3:51:11 PM
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
        <form>

            <h1>Add New Employee</h1>
            <label for ="name"> New Employee Name </label>
            <input type="text" id="name" name="name" required placeholder="myname"/>
            <label for ="password"> Password</label>
            <input type="text" id="password" name="password" required placeholder="password"/>
            <input type="submit" name="Add New Emplooyee"/>
        </form>
    </body>
</html>
