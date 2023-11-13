<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="es" manifest="felacc.appcache">
    
    <!-- INICIA HEAD -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login Administrativo</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="keywords" content="Felacc, Colecciones, Cultivos, Microbianos, Microorganismos, Bacterias, Hongos"> 
	<meta name="description" content="Federación Latinoamericana de Colecciones de Cultivos"> 
	<meta http-equiv="Expires" content="0">
	<meta http-equiv="Last-Modified" content="0">
	<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate">
	<meta http-equiv="Pragma" content="no-cache">
	<meta id="MetaCopyright" name="COPYRIGHT" content="Copyright 2016 © CINVESTAV-I.P.N., UAM-Cuajimalpa.">
	<link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
	<link rel="stylesheet" type="text/css" href="style/stx.css">
	<script type="text/javascript" src="script/scripfun.js"></script>
	<script type="text/javascript" src="script/details-shim.min.js"></script>
	<link rel="stylesheet" type="text/css" href="style/details-shim.min.css">
	<!-- Link para poner el icono de la lupa en el buscador -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" 
	integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous"
	referrerpolicy="no-referrer"/>
    </head>

    <!-- TERMINA HEAD -->

    <!-- INICIA BODY -->
	
    <body>
        
        <div class="row">
        
        <!-- INICIA HEADER -->
                
        <header class="col-12 col-m-12 lg"> </header>
                
        <!-- TERMINA HEADER -->
                
        <!-- INICIA SECTION -->
                
        <section>
                    
            <!-- INICIA FORM -->
                    
            <form class="formulario" action="/login" method="post">
                <input type="hidden" name="opcion" value="iniciarSesion">
                <br><br>
                <h1 class="login">Ingresa como Administrador</h1>
                <div class="contenedor">
                    <!-- Campo usuario -->
                    <div class="input-contenedor">
                        <i class="fas fa-user icon"></i>
                        <input class="text" type="text" name="email" placeholder="Usuario" required>
                    </div>
                    <!-- Campo contraseña-->
                    <div class="input-contenedor">
			<i class="fas fa-key icon"></i>
                        <input class="password" type="password" name="password" placeholder="Contraseña" required>
                    </div>

                    <!-- Boton para enviar datos-->
                        
                    <input type="submit" value="Iniciar sesión" class="button-login">
			
                </div>
                        
            </form>

            <!-- TERMINA FORM -->

            </section>

            <!-- TERMINA SECTION -->

    </body>
        
    <!-- TERMINA BODY -->

</html>