package controladores;

import java.util.*;
import modelos.Usuario;

public class ControllerUsuario {
    private ArrayList<Usuario> usuarios;
    private static ControllerUsuario instancia;

    public ControllerUsuario() {
        usuarios = new ArrayList<Usuario>();
    }

    public static ControllerUsuario getInstancia(){
        if (instancia == null)
            instancia = new ControllerUsuario();
        return instancia;
    }
    
    public void crearUsuario(String email, String nombre) {
      Usuario nuevoUsuario = new Usuario(email, nombre);
      usuarios.add(nuevoUsuario);
    }

    public boolean autenticar(String email) throws Exception {
        Usuario usuario = buscarUsuario(email);
        if (usuario == null) {
        	throw new Exception("Usuario inexistente");
        }
        return usuario.autenticarse();
    }

    private Usuario buscarUsuario(String email) {
        Usuario usuarioEncontrado = null;
        for (Usuario u : usuarios) {
            if (u.getEmail() == email){
                usuarioEncontrado = u;
            }
        }
        return usuarioEncontrado;
    }

}