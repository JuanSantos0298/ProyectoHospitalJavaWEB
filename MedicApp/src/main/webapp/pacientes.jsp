<%-- 
    Document   : Pacientes
    Created on : Nov 29, 2021, 7:01:56 PM
    Author     : alex4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <title>Listado Pacientes</title>
    </head>
    <body>
        <!-- BIENVENIDA -->
        <header class="py-1" style="background-color: #5080BF">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-white">
                    <h1 class="display-6 fw-bolder">Lista Pacientes</h1>
                    <p class="lead fw-normal text-white-50 mb-0">¡Gestiona tus pacientes e historias médicas!</p>
                </div>
            </div>
        </header>
         <div class="d-grid gap-2 mt-5">
             <form action="Controlador?menu=Pacientes&accion=BuscarPaciente" method="POST">
                <div class="input-group mb-3">
                    <input type="hidden" value="${idMedico}" name="idMedico" class="form-control" placeholder="Buscar un paciente" aria-label="Recipient's username" aria-describedby="button-addon2">
                    <input type="text" value="" name="palabraBuscada" class="form-control" placeholder="Buscar un paciente" aria-label="Recipient's username" aria-describedby="button-addon2">
                    <button class="btn btn-outline-secondary" type="submit" id="button-addon2">Buscar</button>
                </div>
             </form>
        </div>
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido Paterno</th>
                    <th>Apellido Materno</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Edad</th>
                    <th>Estado Civil</th>
                    <th>Seguro Medico</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="paciente" items="${pacientes}">
                    <tr>
                        <td>${paciente.getIdPaciente()}</td>
                        <td>${paciente.getNombre()}</td>
                        <td>${paciente.getApellidoPaterno()}</td>
                        <td>${paciente.getApellidoMaterno()}</td>
                        <td>${paciente.getDireccion()}</td>
                        <td>${paciente.getTelefono()}</td>
                        <td>${paciente.getEdad()}</td>
                        <td>${paciente.getEstadoCivil()}</td>
                        <td>${paciente.getSeguroMedico()}</td>
                        <td>
                            <div class="dropdown">
                                <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                                  Acciones
                                </a>
                            
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                  <li><a class="dropdown-item" href="Controlador?menu=Pacientes&accion=VerHistorialMedico&idPaciente=${paciente.getIdPaciente()}">Historial médico</a></li>
                                  <li><a class="dropdown-item" href="Controlador?menu=Pacientes&accion=NuevaHistoriaMedica&idPaciente=${paciente.getIdPaciente()}&idMedico=${idMedico}">Agregar historial</a></li>
                                  <li><a class="dropdown-item" href="Controlador?menu=Pacientes&accion=EditarPaciente&idPaciente=${paciente.getIdPaciente()}">Editar</a></li>
                                  <li><a class="dropdown-item"  href="Controlador?menu=Pacientes&accion=EliminarPaciente&idPaciente=${paciente.getIdPaciente()}">Eliminar</a></li>
                                </ul>
                              </div>
                        </td>
                    </tr> 
                </c:forEach>
            </tbody>
        </table>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
