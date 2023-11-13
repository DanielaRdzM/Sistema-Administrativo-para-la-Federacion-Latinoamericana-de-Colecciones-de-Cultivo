<%@page language="java"  contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="es" manifest="felacc.appcache">
    
    <!-- INICIA HEAD -->
    
    <head>
	<title>Actualizar socios</title>
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
            
            <form action="socios" method="post">
                <c:set var="socios" value="${socio}"></c:set>
		<input type="hidden" name="opcion" value="actualizar">
		<input type="hidden" name="id" value="${socios.id}">
		<input class="controls" type="number" name="id" value="${socios.id}" placeholder="Número de Socio">
                <input class="controls" type="text" name="nombre" value="${socios.nombre}" placeholder="Nombre">
                <input class="controls" type="text" name="especialidad" value="${socios.especialidad}" placeholder="Especialidad">
                <input class="controls" type="text" name="instituto" value="${socios.instituto}" placeholder="Instituto">
                <input class="controls" type="text" name="pais" value="${socios.pais}" placeholder="País">
                <input class="controls" type="tel" name="telefono" value="${socios.telefono}" placeholder="Teléfono">
                <input class="controls" type="email" name="email" value="${socios.email}" placeholder="Email">
                <input class="controls" type="url" name="linkedin" value="${socios.linkedin}" placeholder="LinkedIn">
                <input class="controls" type="text" name="foto" value="${socios.foto}" placeholder="Foto">
		
		<input class="botons" type="submit" value="Actualizar">
                
                <a href="menuOpciones.jsp"><input class="botons" type="button" value="Regresar al menú"></a>
            </form>
                
        </section>
               
    </body>
    
	<!-- TERMINA BODY -->

</html>