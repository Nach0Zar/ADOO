package test;

import java.util.*;

import java.time.Duration;

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

        // crear usuario visitador y autenticar
        System.out.println("Crear y autenticar usuario visitador: ");
        String emailVisitador = controladorUsuario.agregarUsuario( "lumolina@uade.edu.ar","Lucas",
                TipoUsuario.VISITADOR);
        controladorUsuario.autenticar(emailVisitador);

        // crear usuario veterinario y autenticar
        System.out.println("Crear y autenticar usuario veterinario: ");
        controladorUsuario.agregarUsuario( "caesquivel@uade.edu.ar","Candela", TipoUsuario.VETERINARIO);
        controladorUsuario.autenticar("caesquivel@uade.edu.ar");

        // Crear 3 animales

        int legajo = controladorAnimal.ingresarAnimal(true, (float) 2.0, (float) 3.0, 5, true, TipoAnimal.GATO,
                "Shona");
        int legajo2 = controladorAnimal.ingresarAnimal(true, (float) 2.0, (float) 3.0, 2, true, TipoAnimal.PERRO,
                "Panchito");
        int legajo3 = controladorAnimal.ingresarAnimal(true, (float) 2.0, (float) 3.0, 3, true, TipoAnimal.GATO,
                "Luna");
        AnimalDTO animalEncontrado = controladorAnimal.obtenerAnimalDTO(legajo);
        System.out.println("El animal " + animalEncontrado.getNombre() + " fue cargado con el legajo : "
                + animalEncontrado.getLegajo());
        AnimalDTO animalEncontrado2 = controladorAnimal.obtenerAnimalDTO(legajo2);
        System.out.println("El animal " + animalEncontrado2.getNombre() + " fue cargado con el legajo : "
                + animalEncontrado2.getLegajo());
        AnimalDTO animalEncontrado3 = controladorAnimal.obtenerAnimalDTO(legajo3);
        System.out.println("El animal " + animalEncontrado3.getNombre() + " fue cargado con el legajo : "
                + animalEncontrado3.getLegajo());

        // Cargar tratamiento al animal 3

        int numeroDeTratamiento = controladorFichaMedica.crearTratamiento("Vacuna", "Vacuna contra la rabia",new Date(),new Date(), legajo3);
       
        // Crear una alarma de tratamiento para el animal 3
        Duration preriodicidad = Duration.ofDays(1);
        controladorAlarma.crearAlarma(preriodicidad, legajo3, "lumolina@uade.edu.ar", numeroDeTratamiento);

        // Crear una alarma de control para el animal 2
        controladorAlarma.crearAlarma(preriodicidad, legajo3, "lumolina@uade.edu.ar");
 
        // adoptar un animal
        int numeroAdopcion = controladorAdopcion.crearAdopcion(legajo, clienteEncontrado.getEmail(),
                "Por que quiero una mascota", "lumolina@uade.edu.ar");
        AdopcionDTO adopcionEncontrada = controladorAdopcion.buscarAdopcionDTO(numeroAdopcion);
        System.out.println("Se cargo la adopcion del animal " +
                adopcionEncontrada.getAnimalDTO().getNombre()
                + " del cliente : " + adopcionEncontrada.getClienteDTO().getNombre());

        //adoptar segundo animal

        int numeroAdopcion2 = controladorAdopcion.crearAdopcion(legajo2, clienteEncontrado.getEmail(),
                "Por que quiero otra mascota", "lumolina@uade.edu.ar");
        AdopcionDTO adopcionEncontrada2 = controladorAdopcion.buscarAdopcionDTO(numeroAdopcion2);
        System.out.println("Se cargo la adopcion del animal " +
                adopcionEncontrada2.getAnimalDTO().getNombre()
                + " del cliente : " + adopcionEncontrada2.getClienteDTO().getNombre());

        // Creo un seguimiento para el animal

        Seguimiento seguimientoEncontrado = controladorSeguimiento
                .agregarSeguimientoAnimal(adopcionEncontrada.getNumeroAdopcion());
        System.out.println(" Se agrego el seguimiento de la adopcion " + seguimientoEncontrado.getNumeroSeguimiento());

        // enviar una notificacion
        RecordatorioDTO recordatorio = controladorAdopcion.enviarNotificacion(numeroAdopcion);
        System.out.println("Recordatorio creado para destinatario : " + recordatorio.getDestinatario().getNombre());

        // crear una visita y una encuesta posterior

        controladorSeguimiento.agregarVisita(seguimientoEncontrado.getNumeroSeguimiento(), "El animal está mejorando.",
        Calificacion.BUENO, Calificacion.MALO, Calificacion.REGULAR);

        controladorSeguimiento.agregarVisita(seguimientoEncontrado.getNumeroSeguimiento(), "El animal está mal.",
        Calificacion.MALO, Calificacion.MALO, Calificacion.REGULAR);

        // exportar ficha medica en ambos formatos

        FichaMedicaDTO fichaMedicaDTO1 = controladorFichaMedica.obtenerFichaMedicaDTO(legajo);
        FichaMedicaDTO fichaMedicaDTO2 = controladorFichaMedica.obtenerFichaMedicaDTO(legajo2);
        controladorFichaMedica.exportarFichaMedica(fichaMedicaDTO1.getLegajo(), TipoExportacion.EXCEL);
        controladorFichaMedica.exportarFichaMedica(fichaMedicaDTO2.getLegajo(), TipoExportacion.PDF);

    }
}
