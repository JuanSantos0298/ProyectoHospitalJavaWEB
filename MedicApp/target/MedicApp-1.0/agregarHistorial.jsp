<%-- 
    Document   : agregarHistorial
    Created on : Nov 30, 2021, 8:18:45 PM
    Author     : alex4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
  
   <!-- BIENVENIDA -->
    <header class="py-1" style="background-color: #5080BF">
        <div class="container px-4 px-lg-5 my-5">
            <div class="text-center text-white">
                <h1 class="display-6 fw-bolder">Nuevo historial clínico</h1>
                <p class="lead fw-normal text-white-50 mb-0">Ingresa los datos clínicos del paciente</p>
            </div>
        </div>
    </header>

  
  <div class="container mt-5">
      <form action="Controlador?menu=Pacientes&accion=AgregarHistorial" method="POST">  
        <input name="idMedico" type="hidden" class="form-control"  value="${idMedico}" required>
        <input name="idPaciente" type="hidden" class="form-control" value="${idPaciente}" required> 
        <div class="row align-items-start">
            <div class="col">
            <label for="peso_paciente" class="form-label">Peso</label>
            <input name="peso" type="text" class="form-control" id="peso_paciente" value="" required>
        </div>
        <div class="col">
            <label for="altura_p" class="form-label">Altura</label>
            <input name="altura" type="text" class="form-control" id="altura_p" value="" required>
        </div>
         <div class="col">
        <label for="fecha_ingreso_p" class="form-label">Fecha de ingreso</label>
        <input name="fechaIngreso" type="text" class="form-control" id="fecha_ingreso_p" value="" required>
      </div>
    </div>
      
      <div class="mt-3">
        <label for="antecendentes_p" class="form-label">Antecedentes</label>
        <input name="antecedentes" type="text" class="form-control" id="antecendentes_p" value="" required>
      </div>
      <div class="mt-3">
        <label for="motivo_p" class="form-label">Motivo de consulta</label>
        <input name="motivoConsulta" type="text" class="form-control" id="motivo_p" value="" required>
      </div>
        <div class="mt-3">
          <label for="medicacion_p" class="form-label">Medicacion</label>
          <input name="medicacion" type="text" class="form-control" id="medicacion_p" value="" required>
        </div>
        <div class="mt-3">
          <label for="alergias_p" class="form-label">Alergias</label>
          <input name="alergias" type="text" class="form-control" id="alergias_p" value="" required>
        </div>
        
        <div class="d-grid gap-2 mt-5">
            <button style="color: white; background-color: #26a69a " class="btn float-end" type="submit">Agregar</button>
        </div>
  </div>
  </form>

</body>

</html>