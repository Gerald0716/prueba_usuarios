<%@page import="modelo.registro"%>
<%
    registro item = (registro)request.getAttribute("miregistro");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="CSS/estilo.css" rel="stylesheet" type="text/css"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        
        <div id="Cuadrodos">
            <h1>Registro exitoso</h1>
            <p>El nuevo usuario registrado es</p><br>
        <ul>
            <li>Nombre: <%= item.getNombre() %> </li>
            <li>Apellido: <%= item.getApellido() %> </li>
            <li>Email: <%= item.getEmail() %> </li>
            <li>Teléfono:<%= item.getTelefono() %> </li>
            <li>Ciudad: <%= item.getCiudad() %> </li>
            <li>País: <%= item.getPais() %> </li>
           
            <div id="link">
        </ul>
        <a href="index.jsp">Registrar nuevo usuario</a>
            </div>
        </div>
    </body>
</html>
