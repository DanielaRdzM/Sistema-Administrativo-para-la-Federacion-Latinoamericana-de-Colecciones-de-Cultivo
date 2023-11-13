/*  Clase que contiene el pool de conexiones */

package com.mycompany.web.servlets;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;

public class Conexion {

    /* Objeto de tipo BasicDataSource estatito ya que adentro estaran las conexiones */
    private static BasicDataSource dataSource=null;

    /* Metodo con las propiedades de las conexiones */
    private static DataSource getDataSource(){
        if(dataSource==null){
            /* Parametros de conexiones */
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName("org.postgresql.Driver"); /* Driver de conexion */
            dataSource.setUsername("administradorFelacc"); /* Nombre del usuario asociado a la BD del proyecto */
            dataSource.setPassword("administradorFelacc123"); /* Contraseña del usuario asociado a la BD del proyecto */
            dataSource.setUrl("jdbc:postgresql://localhost:5432/base-miembros-felacc?currentSchema=webapp"); /* URL de conexion (servidor, puerto, bd y esquema la que accede) */
            dataSource.setInitialSize(20); /* Conexiones con las que inocia */
            dataSource.setMaxIdle(15); /* Conexiones que pueden estar activas */
            dataSource.setMaxTotal(20); /* Total de conexiones que puede haber */
            dataSource.setMaxWaitMillis(5000); /* Tiempo de espera hasta que se define una conexin a la bd */
        }
        return dataSource;
    }

    /* Metodo para retornar la conexion en el DAO */
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    
}
