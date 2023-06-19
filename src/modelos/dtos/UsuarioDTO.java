package modelos.dtos;

import java.util.ArrayList;

import adaptador.autenticar.AdapterAutenticador;
import adaptador.autenticar.Autenticador;
import modelos.dtos.UsuarioDTO;
import enums.TipoUsuario;

public class UsuarioDTO {
    
    private AdapterAutenticador adaptadorAuntentidor ;
    private Boolean autenticacion = false;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private TipoUsuario tipoUsuario;
    private String ocupacion;
    private Boolean otrasMascotas;
    private String motivoAdopcion;
    private ArrayList <String> tipoAnimalesInteresado;
    
    public UsuarioDTO(String nombre, String apellido, String telefono, String email, TipoUsuario tipoUsuario, String ocupacion, Boolean otrasMascotas, String motivoAdopcion, ArrayList <String> tipoAnimalesInteresado) {
     	this.adaptadorAuntentidor = new Autenticador(); //?????????????????????????????
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.telefono = telefono;
    	this.email = email;
    	this.tipoUsuario = tipoUsuario;
    	this.ocupacion = ocupacion;
    	this.otrasMascotas = otrasMascotas;
    	this.motivoAdopcion = motivoAdopcion;
    	this.tipoAnimalesInteresado = tipoAnimalesInteresado;
    }

    public AdapterAutenticador getAdaptadorAuntentidor() {
        return adaptadorAuntentidor;
    }

    public Boolean getAutenticacion() {
        return autenticacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public Boolean getOtrasMascotas() {
        return otrasMascotas;
    }

    public String getMotivoAdopcion() {
        return motivoAdopcion;
    }

    public ArrayList<String> getTipoAnimalesInteresado() {
        return tipoAnimalesInteresado;
    }

    
}
