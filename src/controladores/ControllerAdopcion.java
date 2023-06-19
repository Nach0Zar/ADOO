package controladores;

import java.util.*;
import modelos.Adopcion;
import modelos.ClienteAdoptante;
import modelos.dtos.AdopcionDTO;
import modelos.dtos.ClienteAdoptanteDTO;
import modelos.dtos.RecordatorioDTO;
import modelos.Animal;

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

    public int crearAdopcion(int animal, String emailCliente, String motivoDeAdopcion) {
        Adopcion adopcion = new Adopcion(
                ControllerAnimal.getInstancia().obtenerAnimal(animal),
                ControllerClienteAdoptante.getInstancia().buscarClienteAdoptante(emailCliente),
                motivoDeAdopcion);
        this.adopciones.add(adopcion);
        return adopcion.getnumeroAdopcion();
    }

    public void enviarNotificacion(int numeroAdopcion) {
        Adopcion adopcion = this.buscarAdopcion(numeroAdopcion);
        RecordatorioDTO recordatorioDTO = new RecordatorioDTO(this.mensajeRecordatorio(), new Date(),
                adopcion.getCliente().toDTO());
        adopcion.enviarNotificacion(recordatorioDTO);
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
        if(adopcion instanceof Adopcion){
            return adopcion.toDTO();
        }
        return null;
    }

      
    }

