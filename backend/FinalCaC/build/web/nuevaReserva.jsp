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
        <div class="row mt-2  mb-2 justify-content-center">
            <div class="col">
                <h3>Usuario: ${usuario}. Nueva reserva </h3>
                <form action="reservar" method="POST">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="fechaInicio">Fecha inicio de Estadia</label>
                            <input type="date" class="form-control" id="fechaInicio" name="fechaInicio"
                                onchange="diaInicial(event);">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="fechaFin">Fecha fin de Estadia</label>
                            <input type="date" class="form-control" id="fechaFin" name="fechaFin" 
                                onchange="diaFinal(event);">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="cantidad">Cantidad de personas (Hasta 10 por reserva)</label>
                            <select class="form-control" aria-label="Cantidad" id="cantidad" name="cantidad">
                                <option value="1" selected>1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                            </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="tipo">Tipo de estadia</label>
                            <select class="form-control" aria-label="Tipo de estadia" id="tipo" name="tipo">
                                <option value="basico" selected>Basico</option>
                                <option value="familiar">Familiar</option>
                                <option value="vip">VIP</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="camas">Tipo de camas</label>
                            <select class="form-control" aria-label="Tipo de estadia" id="camas" name="camas">
                                <option value="simple" selected>Simple</option>
                                <option value="queen">Queen</option>
                                <option value="king">King</option>
                            </select>
                        </div>

                        <div class="form-group col-md-6">
                            <label for="adicionales">Adicionales</label>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="visitas" name="visitas">
                                <label class="form-check-label" for="visitas">
                                    Visitas guiadas (Necochea)
                                </label>
                            </div>
                        </div>

                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="comidas" name="comidas">
                                <label class="form-check-label" for="comidas">
                                    Desayunos y almuerzos incluidos
                                </label>
                            </div>
                        </div>
                        <div class="form-group col-md-6">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="estacionamiento" name="estacionamiento">
                                <label class="form-check-label" for="estacionamiento">
                                    Estacionamiento
                                </label>
                            </div>
                        </div>

                    </div>

                    <div class="form-row">
                        <div class="form-group col-md-3">
                            <label for="total">Total</label>
                        </div>
                        <div class="form-group col-md-3">
                            <p name="total" id="total" name="total">$ 0</p>
                        </div>

                    </div>


                    <button type="submit" class="btn btn-primary">Reservar</button>
                    <br><br>
                </form>
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