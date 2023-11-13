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

/**
 *
 * @author dangu
 */

//http://localhost:8080/intro-servlets/
// URL que mapea las peticiones hacia el controlador
@WebServlet("/colecciones")
public class ColeccionController extends HttpServlet{
    
    // lista para almacenar los objetos que contienen los datos
    List<Coleccion> lista = new ArrayList<>();

    // para que atienda peticiones get
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String opcion = req.getParameter("op");
        
        // evalua la opcion de la peticion (agregar o mostrar)
        if(opcion!=null && opcion.equals("agregarc")){
            System.out.println("Opción agregar colecciones....");
            
            // Redirecciona al formulario para agregar socios
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("agregarColecciones.jsp");
            requestDispatcher.forward(req, resp);
        }else if(opcion!=null && opcion.equals("mostrarc")){
            // Mostrando los datos de la bd
            ColeccionDAO coleccionDAO = new ColeccionDAO();
            
            try{
                lista = coleccionDAO.obtenerColecciones();
                // Imprime los productos por consola
                for(Coleccion coleccion : lista){
                    System.out.println(coleccion);
                }
                // envia el parametro a la vista
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarColecciones.jsp");
                requestDispatcher.forward(req, resp);
            }catch(SQLException e){
                e.printStackTrace();
            }

            System.out.println("Opción mostrar colecciones....");
        }else if(opcion!=null && opcion.equals("actualizarc")){
            int id = Integer.parseInt(req.getParameter("id"));
            System.out.println("Editar id: " + id);

            ColeccionDAO coleccionDAO = new ColeccionDAO();
            Coleccion c = new Coleccion();
            try {
                c = coleccionDAO.obtenerColeccion(id);
                System.out.println(c);
                
                // envia el parametro a la vista
                req.setAttribute("colecciones", c);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("actualizarColecciones.jsp");
                requestDispatcher.forward(req, resp);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else if(opcion!=null && opcion.equals("eliminarc")){
            ColeccionDAO coleccionDAO = new ColeccionDAO();
            int id = Integer.parseInt(req.getParameter("id"));
            System.out.println("Eliminar id: " + id);
            try {
                coleccionDAO.eliminarC(id);
                System.out.println("Registro eliminado satisfactoriamente....");
                
                lista = coleccionDAO.obtenerColecciones();
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarColecciones.jsp");
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
        String opcion = req.getParameter("op");
        System.out.println(opcion);
        ColeccionDAO coleccionDAO = new ColeccionDAO();

        if(opcion!=null && opcion.equals("agregarc")){
            Coleccion coleccion = new Coleccion();
            // Paso de valores
            coleccion.setId(Integer.parseInt(req.getParameter("id")));
            coleccion.setPais(req.getParameter("pais"));
            coleccion.setColeccion(req.getParameter("coleccion"));
            coleccion.setAcronimo(req.getParameter("acronimo"));
            coleccion.setInstituto(req.getParameter("instituto"));
            coleccion.setDireccion(req.getParameter("direccion"));
            coleccion.setTelefono(req.getParameter("telefono"));
            coleccion.setCurador(req.getParameter("curador"));
            coleccion.setEmail(req.getParameter("email"));
            coleccion.setTipo_de_microorganismo(req.getParameter("tipo_de_microorganismo"));
            coleccion.setTipo_de_coleccion(req.getParameter("tipo_de_coleccion"));

            try{
                coleccionDAO.agregarC(coleccion);
                
                System.out.println("La coleccion ha sido agregada correctamente....");
                
                lista = coleccionDAO.obtenerColecciones();
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarColecciones.jsp");
                requestDispatcher.forward(req, resp);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else if(opcion!=null && opcion.equals("actualizarc")){
            Coleccion c = new Coleccion();
            ColeccionDAO coleccionDao = new ColeccionDAO();

            // Paso de valores
            c.setId(Integer.parseInt(req.getParameter("id")));
            c.setPais(req.getParameter("pais"));
            c.setColeccion(req.getParameter("coleccion"));
            c.setAcronimo(req.getParameter("acronimo"));
            c.setInstituto(req.getParameter("instituto"));
            c.setDireccion(req.getParameter("direccion"));
            c.setTelefono(req.getParameter("telefono"));
            c.setCurador(req.getParameter("curador"));
            c.setEmail(req.getParameter("email"));
            c.setTipo_de_microorganismo(req.getParameter("tipo_de_microorganismo"));
            c.setTipo_de_coleccion(req.getParameter("tipo_de_coleccion"));
            
            try {
                coleccionDao.actualizarC(c);
                System.out.println("Los datos han sido actualizados exitosamente....");
                
                lista = coleccionDAO.obtenerColecciones();
                req.setAttribute("lista", lista);
                
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("mostrarColecciones.jsp");
                requestDispatcher.forward(req, resp);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }   
    }
    
}
