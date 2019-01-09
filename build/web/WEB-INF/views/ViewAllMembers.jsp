<%-- 
    Document   : ViewAllBooks
    Created on : Sep 19, 2015, 2:31:35 PM
    Author     : linux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table style="border: 2px black">
            <thead>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Edit</th>
            <th>Delete</th>
        </thead>
        <tbody>
            <c:forEach items="${members}" var="row" >
                <tr>
                    <!--<td>ID :</td>-->                      
                    <td>${row.id}</td>
                    <!--<td>Name :</td>-->
                    <td>${row.name}</td>
                    <!--<td>Age :</td>-->
                    <td>${row.address}</td>
                    <td><a href="<c:url value="edit-${row.id}-member"/>" style="color: blue">Edit</a></td>
                    <td><a href="<c:url value="delete-${row.id}-member"/>" style="color: red">Delete</a></td>       
                </tr>

            </c:forEach>
        </tbody>
    </table>  
</body>
</html>
