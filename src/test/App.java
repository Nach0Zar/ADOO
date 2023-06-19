package test;

import java.util.ArrayList;

import controladores.*;
import modelos.*;
import modelos.dtos.*;
import enums.*;

public class App {

    public static void main(String[] args) throws Exception {

        
        ControllerAdopcion controllerAdopcion = ControllerAdopcion.getInstancia();
        ControllerAlarma controllerAlarma = ControllerAlarma.getInstancia();
        ControllerAnimal controllerAnimal = ControllerAnimal.getInstancia();
        ControllerFichaMedica controllerFichaMedica = ControllerFichaMedica.getInstancia();
        ControllerSeguimiento controllerSeguimiento = ControllerSeguimiento.getInstancia();
        ControllerUsuario controllerUsuario = ControllerUsuario.getInstancia();

        ArrayList <String> tipoAnimales = new ArrayList <String>();
		tipoAnimales.add("perro");
		tipoAnimales.add("gato");

        ArrayList <String> tipoAnimales2 = new ArrayList <String>();
		tipoAnimales2.add("perro");
		tipoAnimales2.add("gato");

        ArrayList <String> tipoAnimales3 = new ArrayList <String>();
		tipoAnimales3.add("perro");
		tipoAnimales3.add("gato");

        ArrayList <String> tipoAnimales4 = new ArrayList <String>();
		tipoAnimales3.add("perro");
		tipoAnimales3.add("gato");


        //crear im un usuario
        UsuarioDTO usuario1 = new UsuarioDTO("John", "Doe", "123456789", "john.doe@example.com", TipoUsuario.VISITADOR, "Estudiante", false, "Amor a los animales", tipoAnimales);
        UsuarioDTO usuario2 = new UsuarioDTO("Jane", "Smith", "987654321", "jane.smith@example.com", TipoUsuario.VISITADOR, "Profesional", true, "Compañía para otra mascota", tipoAnimales2);
        UsuarioDTO usuario3 = new UsuarioDTO("Alice", "Johnson", "555555555", "alice.johnson@example.com", TipoUsuario.VISITADOR, "Trabajadora", true, "Apoyo emocional", tipoAnimales3);
        UsuarioDTO usuario4 = new UsuarioDTO("Bob", "Brown", "111111111", "bob.brown@example.com", TipoUsuario.VISITADOR, "Desempleado", false, "Diversión y compañía", tipoAnimales4);

        


    }
}
