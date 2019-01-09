<%-- 
    Document   : addBook
    Created on : Sep 19, 2015, 1:34:51 PM
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
        <form:form method="POST" action="/WebApplication1/addBook" modelAttribute="book">
            <table>
                <tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id" /></td>
                </tr>
                <tr>
                    <td><form:label path="title">Title</form:label></td>
                    <td><form:input path="title" /></td>
                </tr>
                <tr>
                    <td><form:label path="author">Author</form:label></td>
                    <td><form:input path="author" /></td>
                </tr>

                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </form:form>
        </table>
    </body>
</html>
