package adaptador.autenticar;

public class Autenticador implements AdapterAutenticador {
    public Autenticador() {
    }
    public boolean autenticarse(String email, String nombre) {
    	System.out.print("El usuario se autenticó correctamente");
        return true;
    }

}