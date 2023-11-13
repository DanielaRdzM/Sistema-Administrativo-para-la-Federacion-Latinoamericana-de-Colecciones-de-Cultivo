<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="es" manifest="felacc.appcache">
    
    <!-- INICIA HEAD -->
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Agregar colecciones</title>
	<link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
        <link rel="stylesheet" type="text/css" href="style/estilosSA.css">
    </head>

    <!-- TERMINA HEAD -->

    <!-- INICIA BODY -->
	
    <body>
        
        <!-- Seccion para dar de alta socios -->

        <section class="form-admin">
            <h4>Alta de colecciones</h4>
            <p>Ingresa los datos de las colecciones a registra.</p>
            <br>
            
            <form action="colecciones" method="post">
                <input type="hidden" name="op" value="agregarc">
                <input class="controls" type="number" name="id" placeholder="ID de la coleccion">
                <input class="controls" type="text" name="pais" placeholder="País al que pertenece">
                <input class="controls" type="text" name="coleccion" placeholder="Nombre de la coleccion">
                <input class="controls" type="text" name="acronimo" placeholder="Acronimo">
                <input class="controls" type="text" name="instituto" placeholder="Insitución a la que pertenece">
                <input class="controls" type="text" name="direccion" placeholder="Dirección">
                <input class="controls" type="tel" name="telefono" placeholder="Teléfono">
                <input class="controls" type="text" name="curador" placeholder="Curador">
                <input class="controls" type="email" name="email" placeholder="Email">
                <input class="controls" type="text" name="tipo_de_microorganismo" placeholder="Tipo de microorganismo">
                <input class="controls" type="text" name="tipo_de_coleccion" placeholder="Tipo de colección">
                
                <input class="botons" type="submit" value="Agregar">
                
                <a href="menuOpcionesColecciones.jsp"><input class="botons" type="button" value="Regresar al menú"></a>
            </form>
            
        </section>

    </body>
    
	<!-- TERMINA BODY -->

</html>