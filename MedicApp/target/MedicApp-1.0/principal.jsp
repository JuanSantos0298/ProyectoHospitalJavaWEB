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
                        <a class="nav-link btn btn-outline-dark" style="color: white; border: none; margin-left: 15px" href="Controlador?menu=Resumen" target="myFrame">Resumen</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-outline-dark" style="color: white; border: none; margin-left: 15px" href="Controlador?menu=Pacientes&accion=Listar" target="myFrame">Listado paciente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-outline-dark" style="color: white; border: none; margin-left: 15px" href="Controlador?menu=Pacientes&accion=NuevoPaciente&idMedico=${medico.getIdMedico()}" target="myFrame">Nuevo paciente</a>
                    </li>
                </ul>
            </div>
            <!-- BARRA NAVEGACION - LISTADO DE OPCIONES DE PERFIL -->
            <div class="dropstart">
                <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                  ${medico.getNombre()}
                </a>
                
                <ul class="dropdown-menu text-center dropdown-menu-dark" aria-labelledby="dropdownMenuLink">
                  <li><a class="dropdown-item" href="#">
                        <img src="Imagenes/usuario.png" alt="60" width="60"/>
                   </a></li>
                  <li><a class="dropdown-item" href="Controlador?menu=EditarPerfil" target="myFrame">Editar Perfil</a></li>
                  <li>
                      <form action="Validar" method="POST">
                          
                          <button name="accion" value="Salir" class="dropdown-item" href="#">Cerrar Sesión</button>
                      </form>
                  </li>
                </ul>
            </div>
        </div>
    </nav>
    
    <div class="m-4" style="height: 850px">
        <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
    </div>
    
                
    <!-- Footer -->
    <footer class="text-center text-white" style="background-color: #2F3D59;">
      <!-- Grid container -->
      <div class="container p-4 pb-0">
        <!-- Section: CTA -->
        <section class="">
          <p class="d-flex justify-content-center align-items-center">
            <span class="me-3">MedApp</span>
          </p>
          <p>
            Una aplicación para una mejor atención a quienes la más lo
            necesitan
          </p>
        </section>
        <!-- Section: CTA -->
      </div>
      <!-- Grid container -->
  
      <!-- Copyright -->
      <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        © 2021 Copyright: MedicApp
      </div>
      <!-- Copyright -->
    </footer>
    <!-- Footer -->
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>

</html>