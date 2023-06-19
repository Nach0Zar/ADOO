package test;

import java.util.ArrayList;

import controladores.*;
import modelos.*;
import modelos.dtos.*;
import enums.*;

public class App {

    public static void main(String[] args) throws Exception {

        
        ControllerAdopcion controladorAdopcion = ControllerAdopcion.getInstancia();
        ControllerAlarma controladorAlarma = ControllerAlarma.getInstancia();
        ControllerAnimal controladorAnimal = ControllerAnimal.getInstancia();
        ControllerFichaMedica controladorFichaMedica = ControllerFichaMedica.getInstancia();
        ControllerSeguimiento controladorSeguimiento = ControllerSeguimiento.getInstancia();
        ControllerUsuario controladorUsuario = ControllerUsuario.getInstancia();
        ControllerClienteAdoptante controladorClienteAdoptante = ControllerClienteAdoptante.getInstancia();
        

        ArrayList <String> tipoAnimales = new ArrayList <String>();
		tipoAnimales.add("perro");
		tipoAnimales.add("gato");


        //crear im un usuario
        ClienteAdoptanteDTO cliente = new ClienteAdoptanteDTO("John", "Doe", "Soltero", "john.doe@example.com","123456789", "Estudiante", tipoAnimales, false, TipoNotificacion.WHATSAPP, "Amor a los animales", 0);
        controladorClienteAdoptante.crearCliente(cliente);

        


    }
}
