package com.servicios;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
    
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement ps;
    private ResultSetMetaData rsm;
   

   public String servidor, basedatos, usuario, clave, ejecutar;
   
   public Connection conectarse(){
       servidor  = "localhost:3306/";
       basedatos = "cac";
       usuario   = "root";
       clave     = " ";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://"+ servidor + basedatos+"?autoReconnect=true&useSSL=false", usuario, clave);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return cn;
   }
   
   public ResultSet consultaSQL(String busqueda){
       
        try {
            ps = conectarse().prepareStatement(busqueda);
            rs = ps.executeQuery();
            rsm = (ResultSetMetaData) rs.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return rs;
   }
    
}
