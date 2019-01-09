<%-- 
    Document   : addBook2
    Created on : Dec 26, 2018, 6:45:41 PM
    Author     : mycomputer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book2</title>
    </head>
    <body>
        <form method="POST" action="/WebApplication1/addBook2">
            <table>
                <tr>
                    <td><label path="id">Id</label></td>
                    <td><input name="id" /></td>
                </tr>
                <tr>
                    <td><label path="title">Title</label></td>
                    <td><input name="title" /></td>
                </tr>
                <tr>
                    <td><label path="author">Author</label></td>
                    <td><input name="author" /></td>
                </tr>

                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </form>
    </body>
</html>
