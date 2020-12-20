package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import javax.persistence.Embeddable;
import java.util.ArrayList;
import org.pojos.Empleado;
import org.empleado.*;

public final class Empleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>Empleados</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-addon\"></div> \n");
      out.write("                        <input name=\"Id\" placeholder=\"Id\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-addon\"></div> \n");
      out.write("                        <input name=\"Nombre\" placeholder=\"Nombre Completo\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-addon\"></div> \n");
      out.write("                        <input name=\"Direccion\" placeholder=\"Dirección\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-addon\"></div> \n");
      out.write("                        <input name=\"Telefono\" placeholder=\"Telefono\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <div class=\"offset col-9\">\n");
      out.write("                    <button name=\"act\" value=\"guardar\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("                    <button name=\"act\" value=\"actualizar\" class=\"btn btn-primary\">Actualizar</button>\n");
      out.write("                    <button name=\"act\" value=\"borrar\" class=\"btn btn-primary\">Borrar</button>\n");
      out.write("                    <button name=\"act\" value=\"buscar\" class=\"btn btn-primary\">Buscar</button>\n");
      out.write("                    <button name=\"act\" value=\"mostar\" class=\"btn btn-primary\">Mostrar Todo</button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    <table class=\"table\">\n");
      out.write("        <thead class=\"table-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">ID</th>\n");
      out.write("                <th scope=\"col\">Nombre</th>\n");
      out.write("                <th scope=\"col\">Dirección</th>\n");
      out.write("                <th scope=\"col\">Telefono</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                ");
                    
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

                    }

                
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
