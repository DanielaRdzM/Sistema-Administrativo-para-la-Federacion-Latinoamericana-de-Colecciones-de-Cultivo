<%@page language="java"  contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="es" manifest="felacc.appcache">
    
    <!-- INICIA HEAD -->
    
    <head>
	<title>Actualizar Colecciones</title>
	<link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
        <link rel="stylesheet" type="text/css" href="style/estilosSA.css">
    </head>

    <!-- TERMINA HEAD -->

    <!-- INICIA BODY -->
	
    <body>
        
        <!-- Seccion para dar de alta socios -->

        <section  class="form-admin">
            <h4>Actualización de datos</h4>
            <p>Modifica los campos que desee actualizar.</p>
            <br>
            
            <form action="colecciones" method="post">
                <c:set var="colecciones" value="${colecciones}"></c:set>
		<input type="hidden" name="op" value="actualizarc">
		<input type="hidden" name="id" value="${colecciones.id}">
		<input class="controls" type="number" name="id" value="${colecciones.id}" placeholder="ID. de la colección">
                <input class="controls" type="text" name="pais" value="${colecciones.pais}" placeholder="Pais">
                <input class="controls" type="text" name="coleccion" value="${colecciones.coleccion}" placeholder="Coleccion">
                <input class="controls" type="text" name="acronimo" value="${colecciones.acronimo}" placeholder="Acronimo">
                <input class="controls" type="text" name="instituto" value="${colecciones.instituto}" placeholder="Instituto">
                <input class="controls" type="text" name="direccion" value="${colecciones.direccion}" placeholder="Dirección">
                <input class="controls" type="tel" name="telefono" value="${colecciones.telefono}" placeholder="Teléfono">
                <input class="controls" type="text" name="curador" value="${colecciones.curador}" placeholder="Curador">
                <input class="controls" type="email" name="email" value="${colecciones.email}" placeholder="Email">
                <input class="controls" type="text" name="tipo_de_microorganismo" value="${colecciones.tipo_de_microorganismo}" placeholder="Tipo de microorganismo">
                <input class="controls" type="text" name="tipo_de_coleccion" value="${colecciones.tipo_de_coleccion}" placeholder="Tipo de colección">
       
		<input class="botons" type="submit" value="Actualizar">
                
                <a href="menuOpcionesColecciones.jsp"><input class="botons" type="button" value="Regresar al menú"></a>
            </form>
                
        </section>
               
    </body>
    
	<!-- TERMINA BODY -->

</html>