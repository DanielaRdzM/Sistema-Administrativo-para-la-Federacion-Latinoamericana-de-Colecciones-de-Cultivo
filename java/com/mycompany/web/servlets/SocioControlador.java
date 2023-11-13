/* Servlet controlador que administra las peticiones de la tabla socios */

package com.mycompany.web.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;


//http://localhost:8080/intro-servlets/
// URL que mapea las peticiones hacia el controlador
@WebServlet("/socios")
public class SocioControlador extends HttpServlet{
    
    // lista para almacenar los objetos que contienen los datos
    List<Socio> lista = new ArrayList<>();

    // para que atienda peticiones get
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String opcion = req.getParameter("opcion");
        
        // evalua la opcion de la peticion (agregar o mostrar)
        if(opcion!=null && opcion.equals("agregar")){
            System.out.println("Opción agregar socios....");
            
            // Redirecciona al formulario para agregar socios
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("agregar.jsp");
            requestDispatcher.forward(req, resp);
        }else if(opcion!=null && opcion.equals("mostrar")){
            // Mostrando los datos de la bd
            SocioDAO usuarioDAO = new SocioDAO();
            
            try{
                lista = usuarioDAO.obtenerSocios();
                // Imprime los productos por consola
                for(Socio socio : lista){
                    System.out.println(socio);
                }
                // envia el parametro a la vista
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarSocios.jsp");
                requestDispatcher.forward(req, resp);
            }catch(SQLException e){
                e.printStackTrace();
            }

            System.out.println("Opción mostrar socios....");
        }else if(opcion!=null && opcion.equals("actualizar")){
            int id = Integer.parseInt(req.getParameter("id"));
            System.out.println("Editar id: " + id);

            SocioDAO usuarioDAO = new SocioDAO();
            Socio s = new Socio();
            try {
                s = usuarioDAO.obtenerSocio(id);
                System.out.println(s);
                
                // envia el parametro a la vista
                req.setAttribute("socio", s);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("actualizar.jsp");
                requestDispatcher.forward(req, resp);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else if(opcion!=null && opcion.equals("eliminar")){
            SocioDAO usuarioDAO = new SocioDAO();
            int id = Integer.parseInt(req.getParameter("id"));
            System.out.println("Eliminar id: " + id);
            try {
                usuarioDAO.eliminar(id);
                System.out.println("Registro eliminado satisfactoriamente....");
                
                lista = usuarioDAO.obtenerSocios();
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarSocios.jsp");
                requestDispatcher.forward(req, resp);
            } catch (SQLException ex) {
                Logger.getLogger(SocioControlador.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp);
        }
    }// Termina doGet

    // para que atienda peticiones post
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String opcion = req.getParameter("opcion");
        System.out.println(opcion);
        SocioDAO usuarioDAO = new SocioDAO();

        if(opcion!=null && opcion.equals("agregar")){
            Socio socio = new Socio();
            // Paso de valores
            socio.setId(Integer.parseInt(req.getParameter("id")));
            socio.setNombre(req.getParameter("nombre"));
            socio.setEspecialidad(req.getParameter("especialidad"));
            socio.setInstituto(req.getParameter("instituto"));
            socio.setPais(req.getParameter("pais"));
            socio.setTelefono(req.getParameter("telefono"));
            socio.setEmail(req.getParameter("email"));
            socio.setLinkedin(req.getParameter("linkedin"));
            socio.setFoto(req.getParameter("foto"));

            try{
                usuarioDAO.agregar(socio);
                
                System.out.println("El usuario ha sido agregado correctamente....");
                
                lista = usuarioDAO.obtenerSocios();
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarSocios.jsp");
                requestDispatcher.forward(req, resp);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(opcion!=null && opcion.equals("actualizar")){
            Socio s = new Socio();
            SocioDAO usuaDao = new SocioDAO();

            // Paso de valores
            s.setId(Integer.parseInt(req.getParameter("id")));
            s.setNombre(req.getParameter("nombre"));
            s.setEspecialidad(req.getParameter("especialidad"));
            s.setInstituto(req.getParameter("instituto"));
            s.setPais(req.getParameter("pais"));
            s.setTelefono(req.getParameter("telefono"));
            s.setEmail(req.getParameter("email"));
            s.setLinkedin(req.getParameter("linkedin"));
            s.setFoto(req.getParameter("foto"));
            try {
                usuaDao.actualizar(s);
                System.out.println("Los datos han sido actualizados exitosamente....");
                
                lista = usuarioDAO.obtenerSocios();
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarSocios.jsp");
                requestDispatcher.forward(req, resp);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }   
    }
    
}
