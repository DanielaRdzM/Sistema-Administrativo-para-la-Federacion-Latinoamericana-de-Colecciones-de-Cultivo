/* Clase que contiene el dato que se encarga de la percistencia de datos de una tabla que enlista las operaciones crud de una tabla como actualizar, agregar y borrar */

package com.mycompany.web.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


public class SocioDAO {

    /* Obtenemos la conexion del pool de conexiones */
    private Connection connection;
    
    /* Creando el statement para generar el canal de conexion que envie la sentencia sql */
    private PreparedStatement statement;

    /* Variable que determina cuando se crea una sentencia sql */
    private boolean estadoOperacion;

    /************ METODOS ************/

    // Agregar socio
    public boolean agregar(Socio socio) throws SQLException{
        String sql=null;
        estadoOperacion = false;
        connection=obtenerConexion();

        try{
            // Transaccion
            connection.setAutoCommit(false);
            
            // Sentencia sql parametrizada ya que se usa PreparedStatement
            sql="INSERT INTO socios (id, nombre, especialidad, pais, instituto, email, telefono, linkedin, foto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            statement=connection.prepareStatement(sql);
            
            // Pasando los parametros al statement

            statement.setInt(1, socio.getId());
            statement.setString(2, socio.getNombre());
            statement.setString(3, socio.getEspecialidad());
            statement.setString(4, socio.getPais());
            statement.setString(5, socio.getInstituto());
            statement.setString(6, socio.getEmail());
            statement.setString(7, socio.getTelefono());
            statement.setString(8, socio.getLinkedin());
            statement.setString(9, socio.getFoto());

            // Envia la sentencia sql para ejecutarla en la BD
            estadoOperacion=statement.executeUpdate()>0;

            connection.commit();
            statement.close();
            connection.close();
            
        }catch(SQLException e){
            connection.rollback();
            e.printStackTrace();
        }

        return estadoOperacion;
    }
    
    // Actualizar datos del socio
    public boolean actualizar(Socio socio) throws SQLException{
        String sql=null;
        estadoOperacion = false;
        connection=obtenerConexion();

        try{
            // Transaccion
            connection.setAutoCommit(false);
            
            sql="UPDATE socios SET nombre=?, especialidad=?, pais=?, instituto=?, email=?, telefono=?, linkedin=?, foto=? WHERE id=?";
           
            statement=connection.prepareStatement(sql);

            statement.setString(1, socio.getNombre());
            statement.setString(2, socio.getEspecialidad());
            statement.setString(3, socio.getPais());
            statement.setString(4, socio.getInstituto());
            statement.setString(5, socio.getEmail());
            statement.setString(6, socio.getTelefono());
            statement.setString(7, socio.getLinkedin());
            statement.setString(8, socio.getFoto());
            statement.setInt(9, socio.getId());

            estadoOperacion=statement.executeUpdate()>0;
            
            connection.commit();
            statement.close();
            connection.close();

        }catch(SQLException e){
            connection.rollback();
            e.printStackTrace();
        }

        return estadoOperacion;
    }

    // Eliminar socio
    public boolean eliminar(int idSocio) throws SQLException{
        String sql=null;
        estadoOperacion = false;
        connection=obtenerConexion();

        try{
            // Transaccion
            connection.setAutoCommit(false);
            
            sql="DELETE FROM socios WHERE id=?";
            
            statement=connection.prepareStatement(sql);

            statement.setInt(1, idSocio);

            estadoOperacion=statement.executeUpdate()>0;
            
            connection.commit();
            statement.close();
            connection.close();

        }catch(SQLException e){
            connection.rollback();
            e.printStackTrace();
        }

        return estadoOperacion;
    }

    // Obtener todos los socios de la base de datos
    public List<Socio> obtenerSocios() throws SQLException{
        /* Obtiene todos los registros de la tabla socios */
        ResultSet resultSet=null;
        List<Socio> listaSocios = new ArrayList<>();

        String sql=null;
        estadoOperacion = false;
        connection=obtenerConexion();

        try{
            sql="SELECT * FROM socios";
            
            statement=connection.prepareStatement(sql);
            
            resultSet=statement.executeQuery();
            
            /* Obtenendo cada registro a traves de un objeto y poniendolo en una lista*/
            while(resultSet.next()){
                Socio s=new Socio();
                
                s.setId(resultSet.getInt(1));
                s.setNombre(resultSet.getString(2));
                s.setEspecialidad(resultSet.getString(3));
                s.setPais(resultSet.getString(4));
                s.setInstituto(resultSet.getString(5));
                s.setEmail(resultSet.getString(6));
                s.setTelefono(resultSet.getString(7));
                s.setLinkedin(resultSet.getString(8));
                s.setFoto(resultSet.getString(9));
                
                /* Agregar el objeto a la lista*/
                listaSocios.add(s);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return listaSocios;
    }

    // Obtener socio
    public Socio obtenerSocio(int idSocio) throws SQLException{
        ResultSet resultSet=null; 
        Socio s=new Socio();

        String sql=null;
        estadoOperacion = false;
        connection=obtenerConexion();

        try{
            sql="SELECT * FROM socios WHERE id =?";
            
            statement=connection.prepareStatement(sql);
            
            statement.setInt(1, idSocio);

            resultSet=statement.executeQuery();
            
            /* Recorre unicamente el registro correspondiente al id */
            if(resultSet.next()){
                s.setId(resultSet.getInt(1));
                s.setNombre(resultSet.getString(2));
                s.setEspecialidad(resultSet.getString(3));
                s.setPais(resultSet.getString(4));
                s.setInstituto(resultSet.getString(5));
                s.setEmail(resultSet.getString(6));
                s.setTelefono(resultSet.getString(7));
                s.setLinkedin(resultSet.getString(8));
                s.setFoto(resultSet.getString(9));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }

        return s;
    }

    // Obtener la conexion desde el pool de conexiones
    private Connection obtenerConexion() throws SQLException{
        return Conexion.getConnection();
    }

}
