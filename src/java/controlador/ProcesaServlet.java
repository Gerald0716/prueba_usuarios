
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.registro;


@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String ciudad = request.getParameter("ciudad");
        String pais = request.getParameter("pais");
        
        registro regi = new registro();
        
        regi.setNombre (nombre);
        regi.setApellido (apellido);
        regi.setEmail (email);
        regi.setTelefono (telefono);
        regi.setCiudad (ciudad);
        regi.setPais (pais);

        request.setAttribute("miregistro", regi);
        request.getRequestDispatcher("salida.jsp").forward(request, response);
                
     
    }

}
