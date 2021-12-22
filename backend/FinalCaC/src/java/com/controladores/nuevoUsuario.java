/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.servicios.*;
import com.modelo.*;
import java.sql.Date;

/**
 *
 * @author cepr1_000
 */
@WebServlet(name = "nuevoUsuario", urlPatterns = {"/nuevoUsuario"})
public class nuevoUsuario extends HttpServlet {
    accesoUsuario acc = new accesoUsuario();
   
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario   = request.getParameter("usuario");
        String nombre    = request.getParameter("nombre");
        String apellido  = request.getParameter("apellido");
        String correo    = request.getParameter("correo");
        String contra    = request.getParameter("contra");
        String direccion = request.getParameter("direccion");
        Date   fechaEdad = Date.valueOf(request.getParameter("fechaEdad"));
        int    telefono  = Integer.parseInt(request.getParameter("telefono")); 
        
        
         usuario us = new usuario(1,usuario,contra,correo,fechaEdad,telefono,nombre,apellido,direccion);
         
        us = acc.nuevoUsuario(us);
        
        if(us!=null){
        request.setAttribute("id", us.getId());
        request.setAttribute("nombre", us.getNombre());
        request.setAttribute("apellido", us.getApellido());
        request.getRequestDispatcher("nuevaReserva.jsp").forward(request, response);
        }else{
            request.setAttribute("mensaje", "FALLO EN EL REGISTRO!");
             request.getRequestDispatcher("mensaje.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
