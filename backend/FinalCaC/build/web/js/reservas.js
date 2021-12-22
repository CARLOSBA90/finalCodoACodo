
var hoy = new Date().toISOString().split('T')[0];

document.getElementsByName("fechaInicio")[0].setAttribute('min', hoy);
document.getElementsByName("fechaFin")[0].setAttribute('min', hoy);
var diaInicio = null;
var diaFin = null;

function diaInicial(e){
    var dt = new Date(e.target.value);
    dt.setDate(dt.getDate() + 1);
    var m = dt.toISOString().split('T')[0];
    document.getElementsByName("fechaFin")[0].setAttribute('min', m);
    document.getElementById("fechaFin").valueAsDate = new Date(m);
    diaInicio = new Date(e.target.value);
   if(diaFin!=null)  diaFin = null;
  }

  function diaFinal(e){
    diaFin = new Date(e.target.value);
    if(diaInicio!=null && diaFin!=null){
        var difTiempo = diaFin.getTime() - diaInicio.getTime();
        var difDias = difTiempo / (1000 * 3600 * 24);
        alert(difDias); ///T0D0 -> no funciona con un dia de diferencia, en principio
    };

  }

  /*

  Costos ficticios - Criterios

  Persona por dia: $1000

  Adicionales (por persona)

  Camas: simple-> sin costo - Queen -> $100 - King -> $200  
  
  Desayunos y almuerzo: $200

  (cada 5 personas o menos)
  Estacionamiento: $300
  Visitas guiadas: $500
 

  */

  var total = 666;


  function totales(){
    document.getElementById("total").innerHTML = "$"+total;
  }
