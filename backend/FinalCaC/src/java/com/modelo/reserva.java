package com.modelo;
import java.sql.Date;

public class reserva {
    
    private int idReserva;
    private Date inicio;
    private Date fin;
    private int cantidad;
    private String tipo;
    private String camas;
    private boolean guias;
    private boolean comidas;
    private boolean parking;
    private double total;

    public reserva() {
    }
    

    public reserva(int idReserva, Date inicio, Date fin, int cantidad, String tipo, String camas, boolean guias, boolean comidas, boolean parking, double total) {
        this.idReserva = idReserva;
        this.inicio = inicio;
        this.fin = fin;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.camas = camas;
        this.guias = guias;
        this.comidas = comidas;
        this.parking = parking;
        this.total = total;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCamas() {
        return camas;
    }

    public void setCamas(String camas) {
        this.camas = camas;
    }

    public boolean isGuias() {
        return guias;
    }

    public void setGuias(boolean guias) {
        this.guias = guias;
    }

    public boolean isComidas() {
        return comidas;
    }

    public void setComidas(boolean comidas) {
        this.comidas = comidas;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
}
