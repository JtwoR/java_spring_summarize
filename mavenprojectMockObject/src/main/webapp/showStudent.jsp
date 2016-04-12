<%-- 
    Document   : showStudent
    Created on : 2016-4-8, 10:54:08
    Author     : NIIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>showStudent</title>
        <style>
            table, th, td{
                border: 1px solid black;
            }
            table{
                width: 100%;
            }
        </style>
        
    </head>
    <body>
        <h1>showStudent Page</h1><hr/>
        
        <form action="StudentDervletServlet" method="post">
            <table id="Details">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Adress</th>
                </tr>
                <c:forEach items="${requestScope.students}" var="student">
                    <tr>
                        <td><c:out value="${student.id}"/></td>
                        <td><c:out value="${student.name}"/></td>
                        <td><c:out value="${student.address}"/></td>
                    </tr>
                </c:forEach>
            </table>
            
            <input type="submit" value="Show_Data"/>
        </form>
        
        
        
    </body>
</html>
