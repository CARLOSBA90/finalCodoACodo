package com.servicios;
import com.modelo.*;

public class accesoUsuario {
    
    conexion con = new conexion();
    String cadena = "";
    
    public usuario acceder(String usuario, String contra){
        usuario us = new usuario();
        
        if (usuario.equals("1") && contra.equals("1")) {
            us.setId(1);
        } else {
            us.setId(0);
        }
        /*
        cadena = "SELECT * FROM USUARIO WHERE nombre='"+usuario+"' AND contra='"
                +contra+"'";
        //us = con.query(usuario, contra);*/
        return us;
    }
   
    
}
