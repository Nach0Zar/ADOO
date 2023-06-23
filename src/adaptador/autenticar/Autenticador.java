package adaptador.autenticar;

public class Autenticador implements AdapterAutenticador {
    public Autenticador() {
    }
    public boolean autenticarse(String email, String nombre) {
    	System.out.println("El usuario " + email +  " se autenticó correctamente");
        return true;
    }

}