package modelos.dtos;

public class UsuarioDTO {
    private String nombre;
    private String email;
    
    public UsuarioDTO(String nombre, String email) { 
    	this.nombre = nombre;
    	this.email = email;
    }
    
    public String getNombre () {
    	return this.nombre;
    }
    
    public String getEmail () {
    	return this.email;
    }
    
    public void setNombre (String nombre) {
    	this.nombre = nombre;
    }
    
    public void setEmail (String email) {
    	 this.email = email;
    }
    
}
