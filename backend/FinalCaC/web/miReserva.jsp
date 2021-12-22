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
                        <h1>Mi Reserva actual</h1>

                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">Datos</th>
                                    <th scope="col"></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th scope="row">Nombre y Apellido</th>
                                    <td>Fulano Does</td>
                                </tr>
                                <tr>
                                    <th scope="row">Telefono</th>
                                    <td>666</td>
                                </tr>
                                <tr>
                                    <th scope="row">Fecha inicio estadia</th>
                                    <td>hoy</td>
                                </tr>
                                <tr>
                                    <th scope="row">Fecha fin estadia</th>
                                    <td>Mañana</td>
                                </tr>
                                  <tr>
                                    <th scope="row">Cantidad de personas</th>
                                    <td>2</td>
                                </tr>
                                  <tr>
                                    <th scope="row">Tipo de estadia</th>
                                    <td>VIP</td>
                                </tr>
                                  <tr>
                                    <th scope="row">Tipo de camas</th>
                                    <td>Queen</td>
                                </tr>
                                  <tr>
                                    <th scope="row">Adicionales/th>
                                    <td> -Guias- -Comidas- -Estacionamiento-  </td>
                                </tr>
                                
                            </tbody>
                        </table>

                        <button class="btn btn-primary" onclick="location.href='logeo';" >Nueva reserva</button>
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