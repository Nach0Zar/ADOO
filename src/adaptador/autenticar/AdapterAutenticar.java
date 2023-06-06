package adaptador.autenticar;

import modelos.Usuario;

/**
 * 
 */
public interface AdapterAutenticar {

    /**
     * @param String email 
     * @param String nombre 
     * @return
     */
    public Usuario autenticarse(String email, String nombre);

}