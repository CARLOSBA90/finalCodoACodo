package com.servicios;
import com.modelo.usuario;
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
       clave     = "";
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://"+ servidor + basedatos, usuario, clave);
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
            conectarse().close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       return rs;
   }
   
   public boolean insercion(usuario us){
       String query = "insert into usuario (usuario, contra, email, fechaNacimiento,"
               + "telefono, nombre, apellido, direccion) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conectarse().prepareStatement(query);
            pst.setString( 1, us.getUsuario());
            pst.setString( 2, us.getContra());
            pst.setString( 3, us.getEmail());
            pst.setDate(   4, us.getFechaNacimiento());
            pst.setInt(    5, us.getTelefono());
            pst.setString( 6, us.getNombre());
            pst.setString( 7, us.getApellido());
            pst.setString( 8, us.getDireccion());
            
            return !pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            return true;
        }
   }
   
   
    
}
