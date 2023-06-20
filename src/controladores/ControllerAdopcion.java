package controladores;

import java.util.*;
import modelos.Adopcion;
import modelos.Usuario;
import modelos.dtos.AdopcionDTO;
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
        Adopcion adopcion = new Adopcion(
                ControllerAnimal.getInstancia().obtenerAnimal(animal),
                ControllerClienteAdoptante.getInstancia().buscarClienteAdoptante(emailCliente),
                motivoDeAdopcion);

        Usuario visitador = ControllerUsuario.getInstancia().buscarUsuario(emailVisitador);
        adopcion.getSeguimiento().setVisitador(visitador);

        this.adopciones.add(adopcion);
        return adopcion.getnumeroAdopcion();
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

    public Adopcion buscarAdopcion(int numero) {
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
