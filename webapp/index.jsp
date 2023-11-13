<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="es" manifest="felacc.appcache">
    
    <!-- INICIA HEAD -->
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Felacc</title>
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
			
            <section class="col-9 col-m-9 sec">
                
                <h3>Sistema Administrativo Felacc</h3>
                <!-- Boton para iniciar sesión como administrador -->
                <p>Página exclusiva para los administradores del sitio web</p>
                <p>Aquí podras gestionar la información de los socios y las coleccione microbianas pertenecientes a la Felacc, relizando acciones como: </p>
                <ul>
                    <li>Alta de socios y colecciones.</li>
                    <li>Actualización de datos y colecciones.</li>
                    <li>Baja de socios y colecciones. </li>
                </ul>
                <br>
                <a href="login.jsp"><input type="button" value="Iniciar sesión" class="boton-login"></a>  
            </section>
            

            <!-- TERMINA SECTION -->

            <!-- INICIA ASIDE -->
			
            <aside class="col-3 col-m-12 asi">
                <br>
                <span class="titblue"> Contacto </span><br><br>
		<span class="titng"> efelacc@gmail.com  </span><br>
                <span> Comisión Directiva Felacc </span><br> <br><br>
		<span class="titblue"> Colaboración </span><br>
		<br>
                
                <div class="logos1">
                    <a href="http://cdbb.cinvestav.mx/" target="_blank"><img id="lg1" src="images/LogoCinv2.png" title="Centro de Investigación y de Estudios Avanzados del I.P.N."></a><br><br>
                    <img id="lg3" src="images/LgF.png" title="Federacción Latinoaméricana de Colecciones de Cultivos. "> <br><br>
                    <a href="http://www.cua.uam.mx/" target="_blank"><img id="lg2" src="images/LogoUamC2.png" title="Universidad Autónoma Metropolitana- Cuajimalpa. "></a><br><br>
		</div>
			
		<br> 
			
		<span class="titblue">Sitios de Interés </span><br><br>

		<div class="logos1">
                    <a href="http://www.wfcc.info/collections/networks/" target="_blank"><img id="lg4" src="images/WFCC.png" title="World Federation for Culture Collections "></a> <br><br>
                    <a href="http://www.wdcm.org/" target="_blank"><img id="lg5" src="images/WDCM.png" title="World Data Centre for Microorgannisms "></a> <br><br>
		</div>
			
            </aside>

            <!-- TERMINA ASIDE -->
 
        </div> 

	<!-- INICIA FOOTER -->

	<footer>
            Copyright © 2016. <br>CINVESTAV-IPN, UAM-Cuajimalpa.<br>
            <ul>
                <li>Colección Nacional de Cepas Microbianas y Cultivos Celulares, Centro de Investigación y de Estudios Avanzados del I.P.N., (CINVESTAV-I.P.N.), México.</li>
                <li> Cuerpo Académico "Interacción y Sociedad" y Grupo de Investigación "Sociedad Digital", Universidad Autónoma Metropolitana, Unidad Cuajimalpa, México. </li>
            </ul>
	</footer>

	<!-- TERMINA FOOTER -->
        

	</body>
        
	<!-- TERMINA BODY -->

</html>