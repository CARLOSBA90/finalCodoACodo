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
   
    
}
