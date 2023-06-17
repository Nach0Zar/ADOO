package controladores;

import java.util.*;
import modelos.Usuario;
import modelos.dtos.UsuarioDTO;

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
    
    public void crearUsuario(UsuarioDTO usuario) {
      Usuario nuevoUsuario = new Usuario(usuario);
      usuarios.add(nuevoUsuario);
    }

    public boolean autenticar(UsuarioDTO u) throws Exception {
        Usuario usuario = buscarUsuario(u);
        if (u == null) {
        	throw new Exception("Usuario inexistente");
        }
        return usuario.autenticarse();
    }

    private Usuario buscarUsuario(UsuarioDTO usuarioBuscado) {
        Usuario usuarioEncontrado = null;
        for (Usuario u : usuarios) {
            if (u.getEmail() == usuarioBuscado.getEmail()){
                usuarioEncontrado = u;
                break; 
            }
        }
        return usuarioEncontrado;
    }

}