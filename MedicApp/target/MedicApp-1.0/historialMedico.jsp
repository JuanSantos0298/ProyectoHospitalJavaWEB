<%-- 
    Document   : historialMedico
    Created on : Nov 30, 2021, 2:44:24 PM
    Author     : alex4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <title>Historia clinica</title>
</head>

<body>
    <!-- BINVENIDA -->
        <header class="py-1" style="background-color: #5080BF">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-white">
                    <h1 class="display-6 fw-bolder">Historial Medico</h1>
                    <p class="lead fw-normal text-white-50 mb-0">Paciente: ${paciente.getNombre()} ${paciente.getApellidoPaterno()}  ${paciente.getApellidoMaterno()}</p>
                </div>
            </div>
        </header>
         <div class="d-grid gap-2 mt-5">
             <form action="Controlador?menu=Pacientes" method="POST">
                <div class="input-group mb-3">
                    <input type="text" value="Agregar" name="palabraBuscada" class="form-control" placeholder="Buscar un paciente" aria-label="Recipient's username" aria-describedby="button-addon2">
                    <button value="AgregarPaciente" class="btn btn-outline-secondary" type="submit" id="button-addon2">Buscar</button>
                </div>
             </form>
        </div>
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Peso</th>
                    <th>Altura</th>
                    <th>Antecedentes</th>
                    <th>Motivo de consulta</th>
                    <th>Alergias</th>
                    <th>Fecha de creacion</th>
                    <th>Medicacion</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="historia" items="${historias}">
                    <tr>
                        <td>${historia.getIdHistoria()}</td>
                        <td>${historia.getPeso()}</td>
                        <td>${historia.getAltura()}</td>
                        <td>${historia.getAntecedentes()}</td>
                        <td>${historia.getMotivoConsulta()}</td>
                        <td>${historia.getAlergias()}</td>
                        <td>${historia.getFechaIngreso()}</td>
                        <td>${historia.getMedicacion()}</td>                        
                        <td>
                            <a href="#" class="btn btn-danger" tabindex="-1" role="button" aria-disabled="true">Eliminar</a>
                        </td>
                    </tr> 
                </c:forEach>
            </tbody>
        </table>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>  
</body>

</html>