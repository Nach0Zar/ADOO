package modelos.dtos;

import adaptador.autenticar.AdapterAutenticador;
import adaptador.autenticar.Autenticador;
import modelos.dtos.UsuarioDTO;
import enums.TipoUsuario;

public class UsuarioDTO {
    
    private AdapterAutenticador adaptadorAuntentidor ;
    private Boolean autenticacion = false;
    private String nombre;
    private String email;
    private TipoUsuario tipoUsuario;
    
    
    public UsuarioDTO(String nombre, String email, TipoUsuario tipoUsuario) {
     	this.adaptadorAuntentidor = new Autenticador(); //?????????????????????????????
    	this.nombre = nombre;
    	this.email = email;
    	this.tipoUsuario = tipoUsuario;
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

    public String getEmail() {
        return email;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    
}
