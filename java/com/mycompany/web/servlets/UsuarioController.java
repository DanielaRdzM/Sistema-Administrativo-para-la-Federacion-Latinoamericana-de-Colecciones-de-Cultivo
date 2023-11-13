/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web.servlets;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;



/**
 *
 * @author dangu
 */

@WebServlet("/login")
public class UsuarioController extends HttpServlet{
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String opcion = req.getParameter("opcion");
        
        if(opcion!=null && opcion.equals("iniciarSesion")){
            System.out.println("Opción iniciar sesion....");
            
            // Redirecciona al formulario login
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(req, resp);
        }else if(opcion!=null && opcion.equals("cerrarSesion")){
            System.out.println("Opción cerrar sesion....");
            
            // Redirecciona al index
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp); 
        }else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp);
        }
               
    }// Termina doGet
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
        String opcion = req.getParameter("opcion");
      
        UsuarioDAO usuarioDAO=new UsuarioDAO();
        
        if(opcion!=null && opcion.equals("iniciarSesion")){
            // Iniciar sesion
            Usuario usuario=new Usuario();
            
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            
            try{
                usuario = usuarioDAO.obtenSocioPorEmailYPassword(email, password);
                
                if (usuario == null) {
                    // usuario no ecotrado
                    req.getRequestDispatcher("index.jsp").forward(req, resp);
                } else {
                    // usuario encontrado
                    HttpSession sesion = req.getSession();
                    sesion.setAttribute("usuario", usuario);
                    resp.sendRedirect("menuPrincipal.jsp");
            }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
            
        }else if(opcion!=null && opcion.equals("cerrarSesion")){
            // cerrar sesion
            HttpSession sesion = req.getSession();
            sesion.invalidate();
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            
        }
      
    }
    
}
