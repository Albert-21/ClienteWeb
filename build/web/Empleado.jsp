<%-- 
    Document   : Empleado
    Created on : 19/12/2020, 01:20:13 PM
    Author     : alberto
--%>

<%@page import="java.util.List"%>
<%@page import="javax.persistence.Embeddable"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.pojos.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.empleado.*" %>
<%
    Empleado emp;
    ClienteEmpleado clienteEmpleado = new ClienteEmpleado();
    String act = request.getParameter("act");

    if (act == null) {
    } else if (act.equals("guardar")) {
        if (request.getParameter("Nombre") != null && request.getParameter("Direccion") != null && request.getParameter("Telefono") != null) {
            try {

                emp = new Empleado();
                emp.setNombre(request.getParameter("Nombre"));
                emp.setDireccion(request.getParameter("Direccion"));
                emp.setTelefono(request.getParameter("Telefono"));
                clienteEmpleado.guardar(emp, Empleado.class);
            } catch (Exception e) {
            }
        }

    } else if (act.equals("actualizar")) {
        try {
            emp = new Empleado();
            emp.setId(Long.parseLong(request.getParameter("Id")));
            emp.setNombre(request.getParameter("Nombre"));
            emp.setDireccion(request.getParameter("Direccion"));
            emp.setTelefono(request.getParameter("Telefono"));
            clienteEmpleado.actualizar(emp, Empleado.class);
        } catch (Exception e) {
        }

    }else if (act.equals("borrar")) {
        try {
            clienteEmpleado.borrar(Empleado.class,request.getParameter("Id"));
        } catch (Exception e) {
        }

    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Empleados</title>
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
        <br>
        <form>
            <div class="form-group row">
                <div class="col-4">
                    <div class="input-group">
                        <div class="input-group-addon"></div> 
                        <input name="Id" placeholder="Id" type="text" class="form-control">
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-4">
                    <div class="input-group">
                        <div class="input-group-addon"></div> 
                        <input name="Nombre" placeholder="Nombre Completo" type="text" class="form-control">
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-4">
                    <div class="input-group">
                        <div class="input-group-addon"></div> 
                        <input name="Direccion" placeholder="Dirección" type="text" class="form-control">
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-4">
                    <div class="input-group">
                        <div class="input-group-addon"></div> 
                        <input name="Telefono" placeholder="Telefono" type="text" class="form-control">
                    </div>
                </div>
            </div> 
            <div class="form-group row">
                <div class="offset col-9">
                    <button name="act" value="guardar" class="btn btn-primary">Guardar</button>
                    <button name="act" value="actualizar" class="btn btn-primary">Actualizar</button>
                    <button name="act" value="borrar" class="btn btn-primary">Borrar</button>
                    <button name="act" value="buscar" class="btn btn-primary">Buscar</button>
                    <button name="act" value="mostar" class="btn btn-primary">Mostrar Todo</button>

                </div>
            </div>
        </form>
    </body>
    <table class="table">
        <thead class="table-dark">
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Nombre</th>
                <th scope="col">Dirección</th>
                <th scope="col">Telefono</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <%   try {                 
                    if (act.equals("buscar")) {
                      
                        Empleado empleado = clienteEmpleado.mostrarById(Empleado.class, request.getParameter("Id"));
                        
                        out.print("<tr>");
                        out.print("<th scope=row>" + empleado.getId() + "</th>");
                        out.print("<td>" + empleado.getNombre() + "</td>");
                        out.print("<td>" + empleado.getDireccion() + "</td>");
                        out.print("<td>" + empleado.getTelefono() + "</td>");
                        out.println("</tr>");
                         
                    }
                  
                    if (act.equals("mostar")) {
                        List<Empleado> list = clienteEmpleado.mostrarTodos(Empleado.class);
                        for (Empleado elem : list) {
                            out.print("<tr>");
                            out.print("<th scope=row>" + elem.getId() + "</th>");
                            out.print("<td>" + elem.getNombre() + "</td>");
                            out.print("<td>" + elem.getDireccion() + "</td>");
                            out.print("<td>" + elem.getTelefono() + "</td>");
                            out.println("</tr>");
                        }
                        

                    } } catch (Exception e) {
                            }

                %>
            </tr>

        </tbody>
    </table>
</html>

