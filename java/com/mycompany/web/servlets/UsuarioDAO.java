
package com.mycompany.web.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


/**
 *
 * @author dangu
 */
public class UsuarioDAO {
    
    private Connection connection;
    
    private PreparedStatement statement;

    private boolean estadoOperacion;
    
    // login
    public Usuario obtenSocioPorEmailYPassword(String email, String password) throws SQLException{
        ResultSet resultSet=null; 
        Usuario u=new Usuario();

        String sql=null;
        estadoOperacion = false;
        connection=obtenerConexion();
        
            sql="SELECT * FROM usuarios WHERE email =? AND password=?";
            
            statement=connection.prepareStatement(sql);
            
            statement.setString(1, email);
            statement.setString(2, password);

            resultSet=statement.executeQuery();
            
            if(resultSet.next()){
                u.setEmail(resultSet.getString(1));
                u.setPassword(resultSet.getString(2));
            }

        return u;
    }
    
     // Obtener la conexion desde el pool de conexiones
    private Connection obtenerConexion() throws SQLException{
        return Conexion.getConnection();
    }
    
}
