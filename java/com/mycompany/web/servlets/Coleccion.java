
package com.mycompany.web.servlets;

/**
 *
 * @author dangu
 */
public class Coleccion {
    
    private int id;
    private String pais;
    private String coleccion;
    private String acronimo;
    private String instituto;
    private String direccion;
    private String telefono;
    private String curador;
    private String email;
    private String tipo_de_microorganismo;
    private String tipo_de_coleccion;

    public Coleccion() {
    }

    public Coleccion(int id, String pais, String coleccion, String acronimo, String instituto, String direccion, String telefono, String curador, String email, String tipo_de_microorganismo, String tipo_de_coleccion) {
        this.id = id;
        this.pais = pais;
        this.coleccion = coleccion;
        this.acronimo = acronimo;
        this.instituto = instituto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.curador = curador;
        this.email = email;
        this.tipo_de_microorganismo = tipo_de_microorganismo;
        this.tipo_de_coleccion = tipo_de_coleccion;
    }

    @Override
    public String toString() {
        return "Coleccion{" + "id=" + id + ", pais=" + pais + ", coleccion=" + coleccion + ", acronimo=" + acronimo + ", instituto=" + instituto + ", direccion=" + direccion + ", telefono=" + telefono + ", curador=" + curador + ", email=" + email + ", tipo_de_microorganismo=" + tipo_de_microorganismo + ", tipo_de_coleccion=" + tipo_de_coleccion + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurador() {
        return curador;
    }

    public void setCurador(String curador) {
        this.curador = curador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_de_microorganismo() {
        return tipo_de_microorganismo;
    }

    public void setTipo_de_microorganismo(String tipo_de_microorganismo) {
        this.tipo_de_microorganismo = tipo_de_microorganismo;
    }

    public String getTipo_de_coleccion() {
        return tipo_de_coleccion;
    }

    public void setTipo_de_coleccion(String tipo_de_coleccion) {
        this.tipo_de_coleccion = tipo_de_coleccion;
    }
                      
}
