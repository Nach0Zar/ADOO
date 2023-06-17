package modelos;
import adaptador.autenticar.AdapterAutenticador;
import adaptador.autenticar.Autenticador;
import modelos.dtos.UsuarioDTO;

public class Usuario {
	private Autenticador adaptadorAuntentidor ;
    private Boolean autenticacion = false;
    private String nombre;
    private String email;
    
    public Usuario(UsuarioDTO usuario) {
    	this.adaptadorAuntentidor = new AdapterAutenticador();
    	this.nombre = usuario.getNombre();
    	this.email = usuario.getEmail();
    }
       
    public boolean autenticarse() {
    	this.autenticacion = this.adaptadorAuntentidor.autenticarse(this.email, this.nombre);
        return this.autenticacion;
    }	
    
    public String getEmail() {
    	return this.email;
    }

}