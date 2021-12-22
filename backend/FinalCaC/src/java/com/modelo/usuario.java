package com.modelo;
import java.sql.Date;

/**
 *
 * @author cepr1_000
 */
public class usuario { 
   private int id;
   private String usuario;
   private String contra;
   private String email;
   private Date fechaNacimiento;
   private int telefono;
   private String nombre;
   private String apellido;
   private String direccion;

    public usuario() {
    }
   

    public usuario(int id, String usuario, String contra, String email, Date fechaNacimiento, int telefono) {
        this.id = id;
        this.usuario = usuario;
        this.contra = contra;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public usuario(int id, String usuario, String contra, String email, Date fechaNacimiento, int telefono, String nombre, String apellido, String direccion) {
        this.id = id;
        this.usuario = usuario;
        this.contra = contra;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", usuario=" + usuario + ", contra=" + contra + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }
   
    
}
