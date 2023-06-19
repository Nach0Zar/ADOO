package modelos;

import java.util.ArrayList;

import adaptador.autenticar.AdapterAutenticador;
import adaptador.autenticar.Autenticador;
import modelos.dtos.UsuarioDTO;
import enums.TipoUsuario;

public class Usuario {
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
    
    
    public Usuario(String nombre, String apellido, String telefono, String email, TipoUsuario tipoUsuario, String ocupacion, Boolean otrasMascotas, String motivoAdopcion, ArrayList <String> tipoAnimalesInteresado) {
    	this.adaptadorAuntentidor = new Autenticador();
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
       
    public boolean autenticarse() {
    	this.autenticacion = this.adaptadorAuntentidor.autenticarse(this.email, this.nombre);
        return this.autenticacion;
    }	
    
    public UsuarioDTO toDTO() {
    	return new UsuarioDTO(this.nombre, this.apellido, this.telefono, this.email, this.tipoUsuario, this.ocupacion, this.otrasMascotas, this.motivoAdopcion, this.tipoAnimalesInteresado);
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Boolean getOtrasMascotas() {
		return otrasMascotas;
	}

	public void setOtrasMascotas(Boolean otrasMascotas) {
		this.otrasMascotas = otrasMascotas;
	}

	public String getMotivoAdopcion() {
		return motivoAdopcion;
	}

	public void setMotivoAdopcion(String motivoAdopcion) {
		this.motivoAdopcion = motivoAdopcion;
	}

	public ArrayList<String> getTipoAnimalesInteresado() {
		return tipoAnimalesInteresado;
	}

	public void setTipoAnimalesInteresado(ArrayList<String> tipoAnimalesInteresado) {
		this.tipoAnimalesInteresado = tipoAnimalesInteresado;
	}

}