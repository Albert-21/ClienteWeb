<%-- 
    Document   : index
    Created on : 18/12/2020, 05:02:29 PM
    Author     : alberto
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Inicio</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <!-- Container wrapper -->
            <div class="container-fluid">
                <!-- Toggle button -->
                <button
                    class="navbar-toggler"
                    type="button"
                    data-mdb-toggle="collapse"
                    data-mdb-target="#navbarLeftAlignExample"
                    aria-controls="navbarLeftAlignExample"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
                    >
                    <i class="fas fa-bars"></i>
                </button>

                <!-- Collapsible wrapper -->
                <div class="collapse navbar-collapse" id="navbarLeftAlignExample">
                    <!-- Left links -->
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.jsp">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Empleado.jsp">Empleados</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Departamentos.jsp">Despartamentos</a>
                        </li>
                    </ul>
                    <!-- Left links -->

                </div>

                <!-- Collapsible wrapper -->
            </div>
            <!-- Container wrapper -->
        </nav>
    <marquee class="font-weight-bold" behavior="scroll" direction="left" scrollamount="10">
        <FONT SIZE=100>
        CRUD
        </FONT>
    </marquee>
    <marquee class="font-weight-bold" behavior="scroll" direction="right" scrollamount="10" >
        <FONT SIZE=100>
        BIENVENIDO
        </FONT>
    </marquee>

</body>
</html>
