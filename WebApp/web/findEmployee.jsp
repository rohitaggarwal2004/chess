<%-- 
    Document   : findEmployee
    Created on : Jan 28, 2018, 4:58:02 PM
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
        <h1>Find Employee</h1>

        <form action="search.mvc">
            <label for ="id"> Employee Id</label>
            <input type="text" id="id" name="id" required placeholder="@id"/>
            <input type="submit" name="Add New Emplooyee"/>
        </form>
        <%@include file="logout.jsp" %>
    </body>
</html>
