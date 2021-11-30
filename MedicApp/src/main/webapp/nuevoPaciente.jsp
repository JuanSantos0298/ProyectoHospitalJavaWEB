<%-- 
    Document   : Pacientes
    Created on : Nov 29, 2021, 7:01:56 PM
    Author     : alex4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <!-- BINVENIDA -->
        <header class="py-1" style="background-color: #5080BF">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-white">
                    <h1 class="display-6 fw-bolder">Nuevo Paciente</h1>
                    <p class="lead fw-normal text-white-50 mb-0">Ingresa los datos de tu paciente</p>
                </div>
            </div>
        </header>
        
        <div class="container mt-5 ">
            <form action="Controlador?menu=Pacientes" method="POST">
                <input type="hidden" class="form-control" name="idMedico" value="${idMedico}">
                <div class="row align-items-start">
                    <div class="col">
                        <label for="Nombre" class="form-label">Nombre:</label>
                        <input type="text" class="form-control" name="Nombre" placeholder="Ingrese nombre">
                    </div>
                    <div class="col">
                        <label for="ApellidoPaterno" class="form-label">Apellido Paterno:</label>
                        <input type="text" class="form-control" name="ApellidoPaterno" placeholder="Ingrese apellido paterno">
                    </div>
                    <div class="col">
                        <label for="ApellidoMaterno" class="form-label">Apellido Materno:</label>
                        <input type="text" class="form-control" name="ApellidoMaterno" placeholder="Ingrese apellido materno">
                    </div>
                </div>
                <div class="row align-items-start mt-4">
                    <div class="col">
                        <label for="Edad" class="form-label">Edad:</label>
                        <input type="number" class="form-control" name="Edad" placeholder="Ingrese la edad">
                    </div>
                    <div class="col">
                        <label for="Telefono" class="form-label">Teléfono:</label>
                        <input type="tel" class="form-control" name="Telefono" placeholder="Ingrese el teléfono">
                    </div>
                    <div class="col">
                        <label for="EstadoCivil" class="form-label">Estado Civil</label>
                        <select name="EstadoCivil" class="form-select" aria-label="Default select example">
                            <option selected>Selecciona una opción</option>
                            <option value="Soltero(a)">Soltero(a)</option>
                            <option value="Casado(a)">Casado(a)</option>
                            <option value="Viudo(a)">Viudo(a)</option>
                        </select>
                    </div>   
                 </div>
                <div class="row align-items-start mt-4 mb-5">
                    <div class="col">
                        <label for="Direccion" class="form-label">Dirección:</label>
                        <input type="text" class="form-control" name="Direccion" placeholder="Ingrese la dirección">
                    </div>
                    <div class="col">
                        <label for="Seguro" class="form-label">Seguro</label>
                        <select name="Seguro" class="form-select" aria-label="Default select example">
                            <option selected>Selecciona una opción</option>
                            <option value="Completo">Completo</option>
                            <option value="Mixto">Mixto</option>
                        </select>
                    </div>
                </div>
                <div class="d-grid gap-2 mt-5">
                    <input type="submit" name="accion" value = "Agregar Paciente" class="btn">
                </div>
                
                
            </form>
        <div/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
