/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Paciente;
import Modelo.PacienteDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alex4
 */
public class Controlador extends HttpServlet {

    Paciente paciente = new Paciente();
    PacienteDAO pacientedao = new PacienteDAO();
    int idPaciente;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if(menu.equals("Principal")){
            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        if(menu.equals("Resumen")){
            switch (accion) {
                case "ListarResumen":
                    
                    break;
                case "VerConsulta":
                    
                    break;
            }
            request.getRequestDispatcher("resumen.jsp").forward(request, response);
        }
        if(menu.equals("Pacientes")){
            switch (accion) {
                case "Listar":
                    List lista = pacientedao.listar();
                    request.setAttribute("pacientes", lista);
                    break;
                case "VerHistorialMedico":
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    Paciente pacienteHistorial = pacientedao.listarId(idPaciente);
                    request.setAttribute("paciente", pacienteHistorial);
                    request.getRequestDispatcher("historialMedico.jsp").forward(request, response);
                    break;
                case "EditarPaciente":
                    

                    break;
                case "EliminarPaciente":
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    pacientedao.delete(idPaciente);
                    request.getRequestDispatcher("Controlador?menu=Pacientes&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("pacientes.jsp").forward(request, response);
        }
        if(menu.equals("NuevoPaciente")){
            switch (accion) {
                case "AgregarPaciente":
                    
                    break;
            }
            request.getRequestDispatcher("nuevoPaciente.jsp").forward(request, response);
        }
        if(menu.equals("EditarPerfil")){
            
            request.getRequestDispatcher("editarPerfil.jsp").forward(request, response);
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
