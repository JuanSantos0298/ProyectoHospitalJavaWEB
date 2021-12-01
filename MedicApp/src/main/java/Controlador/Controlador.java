/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.HistoriaMedica;
import Modelo.HistoriaMedicaDAO;
import Modelo.Medico;
import Modelo.MedicoDAO;
import Modelo.Paciente;
import Modelo.PacienteDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alex4
 */
public class Controlador extends HttpServlet {    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /* variables paciente */
        Paciente paciente = new Paciente();
        PacienteDAO pacientedao = new PacienteDAO();
        int idPaciente;
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        int edad;
        String telefono;
        String estadoCivil;
        String direccion;
        String seguroMedico;

        /* Variables medico */
        int idMedico;
        /* Variables HistoriaMedica */
        HistoriaMedica hm = new HistoriaMedica();
        HistoriaMedicaDAO hmdao = new HistoriaMedicaDAO();
        int idHistoria;
        String peso, altura, antecedentes, motivoConsulta, alergias, fechaIngreso, medicacion;
        
        
        
        /* VARIABLES CONTROLADOR */
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        RequestDispatcher dispatcher = null;
        
        if(menu.equalsIgnoreCase("Principal")){
            dispatcher = request.getRequestDispatcher("principal.jsp");
            dispatcher.forward(request, response);
        }
        
        if(menu.equals("Pacientes")){
            switch (accion) 
            {
                case "Listar": //OK
                    System.out.println("Listar pacientes");
                    List lista = pacientedao.listar();
                    idMedico = Integer.parseInt(request.getParameter("idMedico"));
                    request.setAttribute("idMedico", idMedico);
                    request.setAttribute("pacientes", lista);
                    dispatcher = request.getRequestDispatcher("pacientes.jsp");
                    dispatcher.forward(request, response);
                    break;
                case "VerHistorialMedico":  //Pendiente
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    System.out.println("Historial Paciente: " + idPaciente);
                    Paciente pacienteHistoria = pacientedao.listarId(idPaciente);
                    request.setAttribute("paciente", pacienteHistoria);
                    List listaHM = hmdao.listar(idPaciente);
                    System.out.println(listaHM.size());
                    dispatcher = request.getRequestDispatcher("historialMedico.jsp");
                    request.setAttribute("historias", listaHM);
                    dispatcher.forward(request, response);            
                    break;
                case "EditarPaciente": //OK
                    System.out.println("Editar paciente");
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    Paciente pacienteEdicion = pacientedao.listarId(idPaciente);
                    dispatcher = request.getRequestDispatcher("editarPaciente.jsp");
                    request.setAttribute("paciente", pacienteEdicion);
                    dispatcher.forward(request, response);
                    break;
                case "ActualizarPaciente": //OK
                    System.out.println("Actualizar Paciente");
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    nombre= request.getParameter("Nombre");
                    apellidoPaterno= request.getParameter("ApellidoPaterno");
                    apellidoMaterno= request.getParameter("ApellidoMaterno");
                    edad = Integer.parseInt(request.getParameter("Edad"));
                    telefono= request.getParameter("Telefono");
                    estadoCivil= request.getParameter("EstadoCivil");
                    direccion= request.getParameter("Direccion");
                    seguroMedico= request.getParameter("Seguro");
                    
                    paciente.setIdPaciente(idPaciente);
                    paciente.setNombre(nombre);
                    paciente.setApellidoPaterno(apellidoPaterno);
                    paciente.setApellidoMaterno(apellidoMaterno);
                    paciente.setEdad(edad);
                    paciente.setTelefono(telefono);
                    paciente.setEstadoCivil(estadoCivil);
                    paciente.setDireccion(direccion);
                    paciente.setSeguroMedico(seguroMedico);
                    
                    pacientedao.actualizar(paciente);
                    
                    
                    lista = pacientedao.listar();
                    dispatcher = request.getRequestDispatcher("pacientes.jsp");
                    request.setAttribute("pacientes", lista);
                    dispatcher.forward(request, response);
                    //request.getRequestDispatcher("Controlador?menu=Pacientes&accion=Listar").forward(request, response);
                    break;
                case "NuevoPaciente": //OK
                    System.out.println("Nuevo Paciente");
                    idMedico = Integer.parseInt(request.getParameter("idMedico"));
                    request.setAttribute("idMedico", idMedico);
                    request.getRequestDispatcher("nuevoPaciente.jsp").forward(request, response);
                    break;
                case "Agregar Paciente": //OK
                    System.out.print("Estoy agregando paciente");
                    nombre= request.getParameter("Nombre");
                    apellidoPaterno= request.getParameter("ApellidoPaterno");
                    apellidoMaterno= request.getParameter("ApellidoMaterno");
                    edad = Integer.parseInt(request.getParameter("Edad"));
                    telefono= request.getParameter("Telefono");
                    estadoCivil= request.getParameter("EstadoCivil");
                    direccion= request.getParameter("Direccion");
                    seguroMedico= request.getParameter("Seguro");
                    idMedico = Integer.parseInt(request.getParameter("idMedico"));
                    
                    paciente.setNombre(nombre);
                    paciente.setApellidoPaterno(apellidoPaterno);
                    paciente.setApellidoMaterno(apellidoMaterno);
                    paciente.setEdad(edad);
                    paciente.setTelefono(telefono);
                    paciente.setEstadoCivil(estadoCivil);
                    paciente.setDireccion(direccion);
                    paciente.setSeguroMedico(seguroMedico);
                    paciente.setMedicoAsignado(idMedico);
                    
                    pacientedao.agregar(paciente);
                    //request.getRequestDispatcher("Controlador?menu=Pacientes&accion=Listar").forward(request, response);
                    
                    lista = pacientedao.listar();
                    request.setAttribute("pacientes", lista);
                    dispatcher = request.getRequestDispatcher("pacientes.jsp");
                    dispatcher.forward(request, response);
                    break;
                    
                case "EliminarPaciente": //OK
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    pacientedao.delete(idPaciente);
                    
                    System.out.print(idPaciente);
                    System.out.println("Eliminar paciente");
                    
                    
                    lista = pacientedao.listar();
                    request.setAttribute("pacientes", lista);
                    dispatcher = request.getRequestDispatcher("pacientes.jsp");
                    dispatcher.forward(request, response);
                    break;
                case "NuevaHistoriaMedica":
                    System.out.println("Nueva historia clinica");
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    idMedico = Integer.parseInt(request.getParameter("idMedico"));
                    System.out.println(idPaciente);
                    System.out.println(idMedico);
                    request.setAttribute("idMedico", idMedico);
                    request.setAttribute("idPaciente", idPaciente);
                    request.getRequestDispatcher("agregarHistorial.jsp").forward(request, response);
                    break;
                case "AgregarHistorial":
                    System.out.print("Estoy agregando paciente");
                    peso = request.getParameter("peso");
                    altura = request.getParameter("altura");
                    antecedentes = request.getParameter("antecedentes");
                    motivoConsulta = request.getParameter("motivoConsulta");
                    alergias = request.getParameter("alergias");
                    fechaIngreso = request.getParameter("fechaIngreso");
                    medicacion = request.getParameter("medicacion");
                    
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    idMedico = Integer.parseInt(request.getParameter("idMedico"));
                    
                    hm.setPeso(peso);
                    hm.setAltura(altura);
                    hm.setAntecedentes(antecedentes);
                    hm.setMotivoConsulta(motivoConsulta);
                    hm.setAlergias(alergias);
                    hm.setFechaIngreso(fechaIngreso);
                    hm.setMedicacion(medicacion);
                    hm.setHistorialMedico(idMedico);
                    hm.setHistorialPaciente(idPaciente);
                    
                    hmdao.agregar(hm);
                    
                    listaHM = hmdao.listar(idPaciente);
                    //System.out.println(listaHM.size());
                    dispatcher = request.getRequestDispatcher("historialMedico.jsp");
                    request.setAttribute("historias", listaHM);
                    dispatcher.forward(request, response);  
                    break;
                case "BuscarPaciente":
                    System.out.println("buscar pacientes");
                    String palabraBuscada = request.getParameter("palabraBuscada");                    
                    idMedico = Integer.parseInt(request.getParameter("idMedico"));
                    lista = pacientedao.buscar(palabraBuscada,idMedico);

                    request.setAttribute("idMedico", idMedico);
                    request.setAttribute("pacientes", lista);
                    dispatcher = request.getRequestDispatcher("pacientes.jsp");
                    dispatcher.forward(request, response);
                    break;
                case "EliminarHistoria":
                    
                    idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
                    idHistoria = Integer.parseInt(request.getParameter("idHistoria"));
                    paciente = pacientedao.listarId(idPaciente);
                    request.setAttribute("paciente", paciente);

                    hmdao.delete(idHistoria);
                    listaHM = hmdao.listar(idPaciente);
                    //System.out.println(listaHM.size());
                    dispatcher = request.getRequestDispatcher("historialMedico.jsp");
                    request.setAttribute("historias", listaHM);
                    dispatcher.forward(request, response);
                    System.out.println("Eliminar historia");

                    break;
            }
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
