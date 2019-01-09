<%-- 
    Document   : deleteMember
    Created on : Sep 19, 2015, 4:29:07 PM
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
       
            <form:form method="POST" action="/WebApplication1/deletemember" modelAttribute="member">
                <table>
                    <tr>
                        <td><form:label path="id" >Id</form:label></td>
                        <td><form:input path="id" id="id"/></td>
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
