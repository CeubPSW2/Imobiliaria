<%-- 
    Document   : Resultado
    Created on : 20/09/2017, 19:47:29
    Author     : Alexandre.Torres
--%>

<%@page import="model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Aluno a = (Aluno)request.getAttribute("aluno");
            if (a != null){
        %>
            <p>RA: <%= a.getRa() %></p>
            <p>Nome: <%= a.getNome()%></p>
        <%} else {%>
            <p>Aluno não encontrado</p>
        <%}%>
    </body>
</html>
