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

        // Crear un cliente
        ArrayList<TipoAnimal> tipoAnimales = new ArrayList<TipoAnimal>();
        tipoAnimales.add(TipoAnimal.GATO);
        tipoAnimales.add(TipoAnimal.PERRO);
        controladorClienteAdoptante.crearCliente("John", "Doe", "Soltero", "john.doe@example.com", "123456789",
                "Estudiante", tipoAnimales, false, TipoNotificacion.WHATSAPP, "Amor a los animales", 0);
        ClienteAdoptanteDTO clienteEncontrado = controladorClienteAdoptante
                .buscarClienteAdoptanteDTO("john.doe@example.com");

        System.out.println(
                "El cliente " + clienteEncontrado.getNombre() + " " + clienteEncontrado.getApellido() + " fue cargado");

        // Crear un animal

        int legajo = controladorAnimal.ingresarAnimal(true, (float) 2.0, (float) 3.0, 5, true, TipoAnimal.GATO,
                "Shona");
        int legajo2 = controladorAnimal.ingresarAnimal(true, (float) 2.0, (float) 3.0, 5, true, TipoAnimal.PERRO,
                "Panchito");
        AnimalDTO animalEncontrado = controladorAnimal.obtenerAnimalDTO(legajo);
        System.out.println("El animal " + animalEncontrado.getNombre() + " fue cargado con el legajo : "
                + animalEncontrado.getLegajo());
        AnimalDTO animalEncontrado2 = controladorAnimal.obtenerAnimalDTO(legajo2);
        System.out.println("El animal " + animalEncontrado2.getNombre() + " fue cargado con el legajo : "
                + animalEncontrado2.getLegajo());

        // adoptar un animal
        int numeroAdopcion = controladorAdopcion.crearAdopcion(legajo2, clienteEncontrado.getEmail(),
                "Por que quiero una mascota");
        Adopcion adopcionEncontrada = controladorAdopcion.buscarAdopcion(numeroAdopcion);
        System.out.println("Se cargo la adopcion del animal " + adopcionEncontrada.getAnimal().getNombre()
                + " del cliente : " + adopcionEncontrada.getCliente().getNombre());

    }
}
