<%-- 
    Document   : index
    Created on : 18 oct 2023, 20:58:45
    Author     : Erik
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Consulta de palabras</title>
</head>
<body>
    <h1>Consulta el significado de una palabra</h1>
    <form action="api/consulta" method="get">
        <label for="palabra">Palabra:</label><br>
        <input type="text" id="palabra" name="palabra"><br>
        <input type="submit" value="Consultar">
        <button type="submit" value="boton">enviar</button>
    </form>
    <p id="resultado"></p>

    <script>
        // Aquí iría el código JavaScript para manejar la consulta a la API y mostrar el resultado en la página.
    </script>
</body>
</html>

</html>
 // no logre encontrar la api prototype de oxford