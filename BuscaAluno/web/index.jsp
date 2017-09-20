<%-- 
    Document   : index
    Created on : 20/09/2017, 19:34:38
    Author     : Alexandre.Torres

TODO
- Fazer o form OK
- Fazer o controller OK
- Pegar os parâmetros OK
- direcionar para a resposta OK
- Construir a inteligência de busca OK
- Refatorar a resposta para mostrar quando achou ou não OK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <form action="Controller" method="POST">
                <div class="form-group">
                    <label for="">RA</label>
                    <input type="text" name="ra" placeholder="RA do aluno">
                </div>
                <div class="form-group">
                    <input type="submit" value="Pesquizar" class="btn btn-primary">
                </div>
            </form>
        </div>
              
    </body>
</html>
