package modelos.dtos;

import java.util.List;

public class ClienteAdoptanteDTO {
     
    public String nombre;
    public String apellido;
    public String estadoCivil;
    public String email;
    public String telefono;
    public String ocupacion;
    public List<String> tipoDeAnimalesInteresados;
    public int cantidadAdopciones;
    
    public ClienteAdoptanteDTO(String nombre, String apellido, String estadoCivil, String email, String telefono,
            String ocupacion, List<String> tipoDeAnimalesInteresados, int cantidadAdopciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.tipoDeAnimalesInteresados = tipoDeAnimalesInteresados;
        this.cantidadAdopciones = cantidadAdopciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public List<String> getTipoDeAnimalesInteresados() {
        return tipoDeAnimalesInteresados;
    }

    public void setTipoDeAnimalesInteresados(List<String> tipoDeAnimalesInteresados) {
        this.tipoDeAnimalesInteresados = tipoDeAnimalesInteresados;
    }

    public int getCantidadAdopciones() {
        return cantidadAdopciones;
    }

    public void setCantidadAdopciones(int cantidadAdopciones) {
        this.cantidadAdopciones = cantidadAdopciones;
    }

    

}
