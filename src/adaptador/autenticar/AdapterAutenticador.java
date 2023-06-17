package adaptador.autenticar;

public class AdapterAutenticador implements Autenticador {
    public AdapterAutenticador() {
    }
    public boolean autenticarse(String email, String nombre) {
    	System.out.print("El usuario se autenticó correctamente");
        return true;
    }

}