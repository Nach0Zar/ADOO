package modelos;

import adaptador.autenticar.AdapterAutenticador;
import adaptador.autenticar.Autenticador;
import modelos.dtos.UsuarioDTO;
import enums.TipoUsuario;

public class Usuario {
	private AdapterAutenticador adaptadorAuntentidor ;
    private Boolean autenticacion = false;
    private String nombre;
    private String email;
    private TipoUsuario tipoUsuario;
    
    
    public Usuario(String nombre, String email, TipoUsuario tipoUsuario) {
    	this.adaptadorAuntentidor = new Autenticador();
    	this.nombre = nombre;
    	this.email = email;
    	this.tipoUsuario = tipoUsuario;
    }
       
    public boolean autenticarse() {
    	this.autenticacion = this.adaptadorAuntentidor.autenticarse(this.email, this.nombre);
        return this.autenticacion;
    }	
    
    public UsuarioDTO toDTO() {
    	return new UsuarioDTO(this.nombre, this.email, this.tipoUsuario);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}