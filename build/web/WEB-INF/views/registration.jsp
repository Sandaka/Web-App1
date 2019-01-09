<%-- 
    Document   : registration
    Created on : Sep 19, 2015, 12:18:52 PM
    Author     : linux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Register</h1>
        <form:form method="POST" action="/WebApplication1/new" modelAttribute="member">
   <table>
    <tr>
        <td><form:label path="id">Id</form:label></td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="address">Age</form:label></td>
        <td><form:input path="address" /></td>
    </tr>
   
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
    </body>
</html>
