<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="es" manifest="felacc.appcache">
    
    <!-- INICIA HEAD -->
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Agregar socios</title>
	<link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
        <link rel="stylesheet" type="text/css" href="style/estilosSA.css">
    </head>

    <!-- TERMINA HEAD -->

    <!-- INICIA BODY -->
	
    <body>
        
        <!-- Seccion para dar de alta socios -->

        <section class="form-admin">
            <h4>Alta de usuarios</h4>
            <p>Ingresa los datos del socio a registra.</p>
            <br>
            
            <form action="socios" method="post">
                <input type="hidden" name="opcion" value="agregar">
                <input class="controls" type="number" name="id" placeholder="Número de Socio">
                <input class="controls" type="text" name="nombre" placeholder="Nombre">
                <input class="controls" type="text" name="especialidad" placeholder="Especialidad">
                <input class="controls" type="text" name="instituto" placeholder="Insituto al que pertenece">
                <input class="controls" type="text" name="pais" placeholder="País">
                <input class="controls" type="tel" name="telefono" placeholder="Teléfono">
                <input class="controls" type="email" name="email" placeholder="Email">
                <input class="controls" type="url" name="linkedin" placeholder="Linkedin (link)">
                <input class="controls" type="file" name="foto" placeholder="Foto">
                
                <input class="botons" type="submit" value="Agregar">
                
                <a href="menuOpciones.jsp"><input class="botons" type="button" value="Regresar al menú"></a>
            </form>
            
        </section>

    </body>
    
	<!-- TERMINA BODY -->

</html>