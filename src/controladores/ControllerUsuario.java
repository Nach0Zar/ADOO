package controladores;

import java.util.*;
import modelos.Usuario;

public class ControllerUsuario {
    private ArrayList<Usuario> usuarios;
    private static ControllerUsuario instancia;

    private ControllerUsuario() {
        usuarios = new ArrayList<Usuario>();
    }

    public static ControllerUsuario getInstancia(){
        if (instancia == null)
            instancia = new ControllerUsuario();
        return instancia;
    }
    
    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
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