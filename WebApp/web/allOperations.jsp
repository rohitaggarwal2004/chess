<%-- 
    Document   : allOperations
    Created on : Jan 28, 2018, 4:41:31 PM
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
        <h1>Hello World!</h1>
        <a href="mainpage.mvc">Main Page</a> <br>
        <form> 
            <a href="addEmployee.mvc">Add Employee</a> <br>
            <a href="deleteEmployee.mvc">Delete Employee</a> <br>
            <a href="findEmployee.mvc">Find Employee</a><br>
            <a href="listEmployee.mvc">List Employee</a><br>
        </form>    
        <%@include file="logout.jsp" %>
    </body>
</html>
