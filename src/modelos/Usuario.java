package modelos;
import adaptador.autenticar.AdapterAutenticador;
import adaptador.autenticar.Autenticador;
import modelos.dtos.UsuarioDTO;

public class Usuario {
	private AdapterAutenticador adaptadorAuntentidor ;
    private Boolean autenticacion = false;
    private String nombre;
    private String email;
    
    public Usuario(String email, String nombre) {
    	this.adaptadorAuntentidor = new Autenticador();
    	this.email = email;
    	this.nombre = nombre;
    }
       
    public boolean autenticarse() {
    	this.autenticacion = this.adaptadorAuntentidor.autenticarse(this.email, this.nombre);
        return this.autenticacion;
    }	
    
    public String getEmail() {
    	return this.email;
    }

}