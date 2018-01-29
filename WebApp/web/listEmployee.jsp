<%-- 
    Document   : listEmployee.jsp
    Created on : Jan 29, 2018, 12:31:46 PM
    Author     : roaggarw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.id}</td>
                    <td><c:out value="${employee.name}" /></td>
                    <td><fmt:formatDate value="${employee.password}"  /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
