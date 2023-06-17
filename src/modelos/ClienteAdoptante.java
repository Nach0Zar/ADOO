package modelos;


import java.util.*;

/**
 * 
 */
public class ClienteAdoptante {

    private String nombre;
    private String apellido;
    private String estadoCivil;
    private String email;
    private String telefono;
    private String ocupacion;
    private List<String> tipoDeAnimalesInteresados;
    private int cantidadAdopciones;

    public ClienteAdoptante() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setTipoDeAnimalesInteresados(List<String> tipoDeAnimalesInteresados) {
        this.tipoDeAnimalesInteresados = tipoDeAnimalesInteresados;
    }

    public void setCantidadAdopciones(int cantidadAdopciones) {
        this.cantidadAdopciones = cantidadAdopciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public List<String> getTipoDeAnimalesInteresados() {
        return tipoDeAnimalesInteresados;
    }

    public int getCantidadAdopciones() {
        return cantidadAdopciones;
    }

}