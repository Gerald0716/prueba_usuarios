
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="Cuadro">
            <h1 id="titulo">Registro de usuario</h1><br>
        <form action="ProcesaServlet" method="post">
        
    
        <label>Nombre:</label>
        <input type="text" name="nombre" class="entrada">
        <br>
        <label id="subtitulo">Apellido:</label>
        <input type="text" name="apellido" class="entrada">
        <br>
        <label id="subtitulo">Email:</label>
        <input type="text" name="email" class="entrada">
        <br>
        <label id="subtitulo">Teléfono:</label>
        <input type="text" name="telefono" class="entrada">
        <br>
        <label id="subtitulo">Ciudad:</label>
        <input type="text" name="ciudad" class="entrada">
        <br>
        <label id="subtitulo">País:</label>
        <input type="text" name="pais" class="entrada">
        <br><br>
        <input type="submit" value="Enviar" id="boton">
        </form>
        </div>
    </body>
</html>
