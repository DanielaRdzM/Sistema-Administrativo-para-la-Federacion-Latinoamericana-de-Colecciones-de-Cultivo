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
        <!-- Agrega el archivo para hacer la busqueda de un socio en especifico -->
        <script type="text/javascript" src="script/script.js"></script>
	<link rel="stylesheet" type="text/css" href="style/details-shim.min.css">
        <!-- Agrega los iconos usados en el perfil -->
        <script src="https://kit.fontawesome.com/7285c8b4cf.js" crossorigin="anonymous"></script>
	<!-- Link para poner el icono de la lupa en el buscador -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" 
	integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous"
	referrerpolicy="no-referrer"/>
    </head>
    
    <script type="text/javascript">
        function EliminarSocio() {
         var respuesta = confirm("Estas seguro que quieres eliminar a este socio?");
         
         if (respuesta == true) {
            return true;
          } else {
            return false;
          }
        }
    </script>

    <!-- TERMINA HEAD -->

    <!-- INICIA BODY -->
	
    <body>
        
        <div class="row">
                
        <!-- INICIA HEADER -->
                
        <header class="col-12 col-m-12 lg"></header>

        <!-- TERMINA HEADER -->

	<!-- INICIA SECTION -->
			
	<section class="col-9 col-m-9 sec">
            <span class="tituloSocios"> Actualización del directorio Socios </span>
            <br><br>

            <!-- BOTON DE BUSQUEDA -->

            <div class="busqueda">
                <input id="buscador" type="text" placeholder="Buscar"/>
                <div class="campo-busqueda">
                    <i class="fas fa-search lupa"></i>
                </div>
            </div>

            <br><br><br>

            <!-- INICIA SECCIÓN DE SOCIOS -->

            <c:forEach var="socio" items="${lista}">
                <article class="Socios clasificacion">
                    <img src="img-socios/<c:out value="${socio.foto}"></c:out>" alt="<c:out value="${socio.nombre}"></c:out>" class="ImagenesSocios">
                    <div class="TextoSocios">
                    <div class="seccion-datos">
                    <!-- Datos de contacto -->
                    <div class="datos-socios">
                        <ul class="lista-datos">
                            <h3><li><c:out value="${socio.nombre}"></c:out> | <c:out value="${socio.pais}"></c:out></li></h3>
                                <li><i class="fa-solid fa-user-large"></i> No. de socio: <c:out value="${socio.id}"></c:out></li>
                                <li><i class="fa-solid fa-earth-americas" class="busca"></i> Ubicación: <c:out value="${socio.pais}"></c:out></li>
                                <li><i class="fa-solid fa-building-columns" class="busca"></i> Instituto: <c:out value="${socio.instituto}"></c:out> </li>
                                <li class="clasificacion" ><i class="fa-solid fa-bacterium" class="busca"></i> Especialidad: <c:out value="${socio.especialidad}"></c:out></li>
                                <li><i class="fa-solid fa-phone"></i> Teléfono: <c:out value="${socio.telefono}"></c:out></li>
                                <li><i class="fa-solid fa-envelope" class="busca"></i> E-mail: <c:out value="${socio.email}"></c:out></li>
                                <div class="redes-sociales">
                                    <br>
                                    <a href="<c:out value="${socio.linkedin}" ></c:out>" target="_blank" class="boton-redes linkedin fa-brands fa-linkedin-in"><i class="icon-linkedin"></i></a>
                                    <a href="mailto:<c:out value="${socio.email}?Subject=Me%20interesa%20saber%20más%20sobre%20el%20tema">"></c:out>" class="boton-redes email fa-solid fa-at"><i class="icon-email"></i></a>
                                </div>
                                <br>
                                <a href="socios?opcion=eliminar&id=<c:out value="${socio.id}"></c:out>"><input type="button" value="Eliminar" class="boton-eliminar" onclick="return EliminarSocio()"></a>
                                <a href="socios?opcion=actualizar&id=<c:out value="${socio.id}"></c:out>"><input type="button" value="Actualizar" class="boton-actualizar"></a>
                        </ul>
                        
                    </div>	
                    </div>
                    </div>
                </article>
	
                <br><br>
                
		</c:forEach>
                
                <br><br>
                    
                <a href="menuOpciones.jsp"><input type="button" value="Regresar al menú" class="boton-login"></a>
				
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