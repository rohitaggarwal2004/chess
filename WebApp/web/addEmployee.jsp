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
         <a href="mainpage.mvc">Main Page</a> <br>
        <form action="saveEmployee.mvc">
            <h1>Add New Employee</h1>
            <label for ="id"> Employee Id</label>
            <input type="text" id="id" name="id" required placeholder="@id"/>
            <label for ="name"> New Employee Name </label>
            <input type="text" id="name" name="name" required placeholder="myname"/>
            <label for ="password"> Password</label>
            <input type="text" id="password" name="password" required placeholder="password"/>
            <input type="submit" name="Add New Emplooyee"/>
        </form>
        <%@include file="logout.jsp" %>
    </body>
</html>
