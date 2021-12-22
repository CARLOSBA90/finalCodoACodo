package com.servicios;
import com.modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class accesoUsuario {
    
    conexion con = new conexion();
    String cadena = "";
    
    public usuario acceder(String usuario, String contra){
        usuario us = new usuario();
        ResultSet rs = con.consultaSQL("SELECT * FROM usuario WHERE usuario='"+usuario+"' AND contra='"+contra+"'");
        
        if(rs != null){
            try {
                while(rs.next())
                us = new usuario(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5), rs.getInt(6), rs.getString(7),rs.getString(8),rs.getString(9));
            } catch (SQLException ex) {
                Logger.getLogger(accesoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else us.setId(0);
        return us;
    }

    

    public usuario nuevoUsuario(usuario us) {
        boolean insertado = con.insercion(us);
        if(insertado)
            return acceder(us.getUsuario(),us.getContra());
        return null;
    }

    
}
