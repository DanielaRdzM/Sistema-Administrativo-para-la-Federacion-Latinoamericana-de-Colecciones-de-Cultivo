
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
public class ColeccionDAO {
    
    private Connection connection;
    private PreparedStatement statement;
    private boolean estadoOp;
    
    /************ METODOS ************/
    
    // Agregar coleccion
    public boolean agregarC(Coleccion coleccion) throws SQLException{
        String sql=null;
        estadoOp = false;
        connection=obtenerConexion();

        try{
            // Transaccion
            connection.setAutoCommit(false);
            
            // Sentencia sql parametrizada ya que se usa PreparedStatement
            sql="INSERT INTO colecciones (id, pais, coleccion, acronimo, instituto, direccion, telefono, curador, email, tipo_de_microorganismo, tipo_de_coleccion) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            statement=connection.prepareStatement(sql);
            
            // Pasando los parametros al statement

            statement.setInt(1, coleccion.getId());
            statement.setString(2, coleccion.getPais());
            statement.setString(3, coleccion.getColeccion());
            statement.setString(4, coleccion.getAcronimo());
            statement.setString(5, coleccion.getInstituto());
            statement.setString(6, coleccion.getDireccion());
            statement.setString(7, coleccion.getTelefono());
            statement.setString(8, coleccion.getCurador());
            statement.setString(9, coleccion.getEmail());
            statement.setString(10, coleccion.getTipo_de_microorganismo());
            statement.setString(11, coleccion.getTipo_de_coleccion());

            // Envia la sentencia sql para ejecutarla en la BD
            estadoOp=statement.executeUpdate()>0;

            connection.commit();
            statement.close();
            connection.close();
            
        }catch(SQLException e){
            connection.rollback();
            e.printStackTrace();
        }

        return estadoOp;
    }
    
    // Actualizar datos de la coleccion
    public boolean actualizarC(Coleccion coleccion) throws SQLException{
        String sql=null;
        estadoOp = false;
        connection=obtenerConexion();

        try{
            // Transaccion
            connection.setAutoCommit(false);
            
            sql="UPDATE colecciones SET pais=?, coleccion=?, acronimo=?, instituto=?, direccion=?, telefono=?, curador=?, email=?, tipo_de_microorganismo=?, tipo_de_coleccion=? WHERE id=?";
           
            statement=connection.prepareStatement(sql);

            statement.setString(1, coleccion.getPais());
            statement.setString(2, coleccion.getColeccion());
            statement.setString(3, coleccion.getAcronimo());
            statement.setString(4, coleccion.getInstituto());
            statement.setString(5, coleccion.getDireccion());
            statement.setString(6, coleccion.getTelefono());
            statement.setString(7, coleccion.getCurador());
            statement.setString(8, coleccion.getEmail());
            statement.setString(9, coleccion.getTipo_de_microorganismo());
            statement.setString(10, coleccion.getTipo_de_coleccion());
            statement.setInt(11, coleccion.getId());

            estadoOp=statement.executeUpdate()>0;
            
            connection.commit();
            statement.close();
            connection.close();

        }catch(SQLException e){
            connection.rollback();
            e.printStackTrace();
        }

        return estadoOp;
    }
    
    // Eliminar coleccion
    public boolean eliminarC(int idColeccion) throws SQLException{
        String sql=null;
        estadoOp = false;
        connection=obtenerConexion();

        try{
            // Transaccion
            connection.setAutoCommit(false);
            
            sql="DELETE FROM colecciones WHERE id=?";
            
            statement=connection.prepareStatement(sql);

            statement.setInt(1, idColeccion);

            estadoOp=statement.executeUpdate()>0;
            
            connection.commit();
            statement.close();
            connection.close();

        }catch(SQLException e){
            connection.rollback();
            e.printStackTrace();
        }

        return estadoOp;
    }
    
    // Obtener todas las colecciones de la base de datos
    public List<Coleccion> obtenerColecciones() throws SQLException{
        /* Obtiene todos los registros de la tabla socios */
        ResultSet resultSet=null;
        List<Coleccion> listaColecciones = new ArrayList<>();

        String sql=null;
        estadoOp = false;
        connection=obtenerConexion();

        try{
            sql="SELECT * FROM colecciones";
            
            statement=connection.prepareStatement(sql);
            
            resultSet=statement.executeQuery();
            
            /* Obtenendo cada registro a traves de un objeto y poniendolo en una lista*/
            while(resultSet.next()){
                Coleccion c=new Coleccion();
                
                c.setId(resultSet.getInt(1));
                c.setPais(resultSet.getString(2));
                c.setColeccion(resultSet.getString(3));
                c.setAcronimo(resultSet.getString(4));
                c.setInstituto(resultSet.getString(5));
                c.setDireccion(resultSet.getString(6));
                c.setTelefono(resultSet.getString(7));
                c.setCurador(resultSet.getString(8));
                c.setEmail(resultSet.getString(9));
                c.setTipo_de_microorganismo(resultSet.getString(10));
                c.setTipo_de_coleccion(resultSet.getString(11));               
                
                /* Agregar el objeto a la lista*/
                listaColecciones.add(c);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return listaColecciones;
    }
    
    // Obtener coleccion
    public Coleccion obtenerColeccion(int idColeccion) throws SQLException{
        ResultSet resultSet=null; 
        Coleccion c=new Coleccion();

        String sql=null;
        estadoOp = false;
        connection=obtenerConexion();

        try{
            sql="SELECT * FROM colecciones WHERE id =?";
            
            statement=connection.prepareStatement(sql);
            
            statement.setInt(1, idColeccion);

            resultSet=statement.executeQuery();
            
            /* Recorre unicamente el registro correspondiente al id */
            if(resultSet.next()){
                c.setId(resultSet.getInt(1));
                c.setPais(resultSet.getString(2));
                c.setColeccion(resultSet.getString(3));
                c.setAcronimo(resultSet.getString(4));
                c.setInstituto(resultSet.getString(5));
                c.setDireccion(resultSet.getString(6));
                c.setTelefono(resultSet.getString(7));
                c.setCurador(resultSet.getString(8));
                c.setEmail(resultSet.getString(9));
                c.setTipo_de_microorganismo(resultSet.getString(10));
                c.setTipo_de_coleccion(resultSet.getString(11));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return c;
    }
    
    private Connection obtenerConexion() throws SQLException{
        return Conexion.getConnection();
    }
}
