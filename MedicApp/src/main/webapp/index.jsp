<%-- 
    Document   : index
    Created on : Nov 28, 2021, 11:34:31 PM
    Author     : alex4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>MedicApp</title>
        <style>
        /* Bordered form */
        form {
            border: 3px solid #f1f1f1;
        }
    
        /* Full-width inputs */
        input[type=text],
        input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
    
        /* Set a style for all buttons */
        button {
            background-color: #04AA6D;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }
    
        /* Add a hover effect for buttons */
        button:hover {
            opacity: 0.8;
        }
    
        /* The "Forgot password" text */
        span.psw {
            float: right;
            padding-top: 16px;
        }
    
        /* Extra style for the cancel button (red) */
        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }
    
        /* Center the avatar image inside this container */
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
        }
    
    
        /* Add padding to containers */
        .container {
            padding: 16px;
        }
    
        /* The "Forgot password" text */
        span.registrar {
            float: right;
            padding-top: 16px;
        }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-center" style="background-color: #5080BF">
        <div class="container-md" class="text-center">
            <a class="navbar-brand" style="color: white;">Iniciar sesion</a>
        </div>
        </nav>
        <div class="container">
            <form action="Validar" method="POST">
                <div class="mb-3">
                    <label for="id_Medico" class="form-label">ID</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" name="usuario" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
                </div>
                <button type="submit" name="accion" value="Ingresar">Ingresar</button>
            </form>
        </div>        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>
