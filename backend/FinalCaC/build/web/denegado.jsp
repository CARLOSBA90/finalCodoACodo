<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Proyecto CaC</title>

    <link href="./css/estilos.css" rel="stylesheet" type="text/css">
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./css/style.css">

</head>

<body>
    <div id="cabecera">
        <div class="menu">
            <a href="index.html">Inicio</a>
            <a href="loginCliente.html">Clientes</a>
            <a href="descripcionHotel.html">El Hotel</a>
            <div class="despliegue">
                <button class="desplieguebtn">Reservas
                </button>
                <div class="despliegue-content">
                    <a href="reservas.html">Mis reservas</a>
                    <a href="confirmacion.html">Confirmacion</a>
                    <a href="cancelacion.html">Cancelacion</a>
                </div>
            </div>
            <a href="acerca.html" id="acerca" style="float:right">Acerca del sitio</a>
        </div>
    </div>
     <div class="container">
        <div class="row mt-2  mb-2 mb-5 justify-content-center">
            <div class="col">
                <div class="wrap">
                    <div class="p-3 auto">
                        <h1>Acceso denegado</h1>
                        <p>Has suministrado datos incorrectos, por favor vuelva a intentarlo</p>
                            <button class="btn btn-primary" onclick="location.href='loginCliente.html';" >Volver</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <footer>
        <p>Carlos Peña ©</p>
    </footer>

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/reservas.js"></script>
</body>

</html>