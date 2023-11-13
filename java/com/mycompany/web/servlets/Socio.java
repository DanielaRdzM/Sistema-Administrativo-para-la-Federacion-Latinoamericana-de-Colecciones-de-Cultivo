/* Clase que contiene un modelo que mapea las variables de la base de datos */

package com.mycompany.web.servlets;

public class Socio {

    /**** VARIABLES ****/

    private int id;
    private String nombre;
    private String especialidad;
    private String pais;
    private String instituto;
    private String email;
    private String telefono;
    private String linkedin;
    private String foto;

    /**** CONSTRUCTORES POR DEFECTO ****/

    public Socio() {    
        
    }

    /**** CONSTRUCTOR CON ARGUMENTOS ****/

    public Socio(int id, String nombre, String especialidad, String pais, String instituto, String email, String telefono, String linkedin, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pais = pais;
        this.instituto = instituto;
        this.email = email;
        this.telefono = telefono;
        this.linkedin = linkedin;
        this.foto = foto;
    }

    /**** METODO ToString ****/
    
    @Override    
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", pais=" + pais + ", instituto=" + instituto + ", email=" + email + ", telefono=" + telefono + ", linkedin=" + linkedin + ", foto=" + foto + '}';
    }

    /**** GETTERS Y SETTERS ****/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}