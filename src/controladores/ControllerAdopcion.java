package controladores;

import java.util.*;
import modelos.Adopcion;
import modelos.Animal;
import modelos.ClienteAdoptante;
import modelos.Usuario;
import modelos.dtos.AdopcionDTO;
import modelos.dtos.ClienteAdoptanteDTO;
import modelos.dtos.RecordatorioDTO;

public class ControllerAdopcion {

    private ArrayList<Adopcion> adopciones;
    private static ControllerAdopcion instancia;

    public static ControllerAdopcion getInstancia() {
        if (instancia == null)
            instancia = new ControllerAdopcion();
        return instancia;
    }

    private ControllerAdopcion() {
        adopciones = new ArrayList<>();
    }

    public int crearAdopcion(int animal, String emailCliente, String motivoDeAdopcion, String emailVisitador) {
        ClienteAdoptante cliente1 = ControllerClienteAdoptante.getInstancia().buscarClienteAdoptante(emailCliente);
        Animal animal1 = ControllerAnimal.getInstancia().obtenerAnimal(animal);

        if (cliente1.getCantidadAdopciones() == 2) {
            System.out.println("El cliente ya tiene 2 adopciones , no se puede adoptar");
        } else {
            if (animal1.getEstadoSaludableAnimal()) {
                Adopcion adopcion = new Adopcion(
                        animal1,
                        cliente1,
                        motivoDeAdopcion);
                cliente1.setCantidadAdopciones(cliente1.getCantidadAdopciones() + 1);
                Usuario visitador = ControllerUsuario.getInstancia().buscarUsuario(emailVisitador);
                adopcion.getSeguimiento().setVisitador(visitador);
                this.adopciones.add(adopcion);
                System.out.println("El animal fue adoptado!");
                return adopcion.getnumeroAdopcion();

            } else {
                System.out.println("El animal NO esta saludable , no se puede adoptar");
            }

        }

        return -1;
    }

    public RecordatorioDTO enviarNotificacion(int numeroAdopcion) {
        Adopcion adopcion = this.buscarAdopcion(numeroAdopcion);
        RecordatorioDTO recordatorioDTO = new RecordatorioDTO(this.mensajeRecordatorio(), new Date(),
                adopcion.getCliente().toDTO());
        adopcion.enviarNotificacion(recordatorioDTO);
        return recordatorioDTO;
    }

    private String mensajeRecordatorio() {
        System.out.println("Mensaje de recordatorio  :");
        Scanner entradaScanner = new Scanner(System.in);
        String mensajeRecordatorio = entradaScanner.nextLine();
        entradaScanner.close();
        return mensajeRecordatorio;
    }

    protected Adopcion buscarAdopcion(int numero) {
        Adopcion adopcionBuscada = null;
        for (Adopcion adopcion : adopciones) {
            if (adopcion.getnumeroAdopcion() == numero) {
                adopcionBuscada = adopcion;
            }
        }
        return adopcionBuscada;
    }

    public AdopcionDTO buscarAdopcionDTO(int numeroAdopcion) {
        Adopcion adopcion = this.buscarAdopcion(numeroAdopcion);
        if (adopcion instanceof Adopcion) {
            return adopcion.toDTO();
        }
        return null;
    }

}
