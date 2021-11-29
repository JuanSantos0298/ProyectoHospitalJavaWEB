<%-- 
    Document   : principal
    Created on : Nov 28, 2021, 11:35:04 PM
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>MedicApp - Dashboard</title>
</head>

<body>
    <!-- BARRA DE NAVEGACION -->
    <nav class="navbar navbar-expand-lg" style="background-color: #2F3D59">
        <div class="container-fluid">
            <a class="navbar-brand" style="color: white;">MedicApp</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link btn btn-outline-dark" style="color: white; border: none; margin-left: 15px" href="#">Resumen</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-outline-dark" style="color: white; border: none; margin-left: 15px" href="#">Listado paciente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-outline-dark" style="color: white; border: none; margin-left: 15px" href="#">Nuevo paciente</a>
                    </li>
                </ul>
            </div>
            <!-- BARRA NAVEGACION - LISTADO DE OPCIONES DE PERFIL -->
            <div class="dropdown">
                <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown link
                </a>

                <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
            </div>
        </div>
    </nav>
    
    <!-- BIENVENIDA AL USUARIO -->
    <header class="py-5" style="background-color: #5080BF">
    <div class="container px-4 px-lg-5 my-5">
        <div class="text-center text-white">
            <h1 class="display-6 fw-bolder">Bienvenido(a) </h1>
            <p class="lead fw-normal text-white-50 mb-0">¡Gestiona tus consultas y pacientes!</p>
        </div>
    </div>
    </header>
    
   
    <!-- Footer -->
    <footer class="text-center text-lg-start " style="background-color: #2F3D59">
        <!-- Section: Links  -->
        <section class="">
            <div class="container text-center text-md-start mt-5">
                <!-- Grid row -->
                <div class="row mt-3">
                    <!-- Grid column -->
                    <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                        <!-- Content -->
                        <h6 class="text-uppercase  mb-4" style="color: white">
                            <i class="fas fa-gem me-3"></i>MedApp
                        </h6>
                        <p style="color: white;">
                            Una aplicación para una mejor atención a quienes la más lo
                            necesitan
                        </p>
                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
                        <!-- Links -->
                        <h6 style="color: white" class="text-uppercase  mb-4">
                            links
                        </h6>
                        <p style="color: white;">
                            <a href="#!" class="text-reset">Pacientes</a>
                        </p>
                        <p style="color: white;">
                            <a href="#!" class="text-reset">Agregar paciente</a>
                        </p>
                    </div>
                    <!-- Grid column -->




                    <!-- Copyright -->
                    <div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05); box-shadow: grey ">
                        © 2021 Copyright
                    </div>
                    <!-- Copyright -->
    </footer>
    <!-- Footer -->
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>

</html>