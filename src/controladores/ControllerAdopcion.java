package controladores;

import java.util.ArrayList;
import java.util.*;
import modelos.Adopcion;
import modelos.ClienteAdoptante;
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

    public void crearAdopcion(Animal animal, ClienteAdoptante clienteAdoptante, String motivoDeAdopcion) {
        Adopcion adopcion = new Adopcion(
                animal,
                clienteAdoptante,
                this.motivoAdopcion()
                );
                

        this.adopciones.add(adopcion);
        adopcionNueva(adopcion, clienteAdoptante, animal);
    }

    public void enviarNotificacion(int numeroAdopcion ){
        Adopcion adopcion = this.buscarAdopcion(numeroAdopcion);
        RecordatorioDTO recordatorioDTO = new RecordatorioDTO(this.mensajeRecordatorio(), new Date(),adopcion.getCliente().toDTO());
        adopcion.enviarNotificacion(recordatorioDTO);
    }

    private void adopcionNueva(Adopcion adopcion, ClienteAdoptante clienteAdoptante, Animal animal) {
        adopcion.adopcionNueva(clienteAdoptante, animal);
    }

    private String motivoAdopcion() {
        System.out.println("Motivo de adopcion :");
        Scanner entradaScanner = new Scanner(System.in);
        String motivoAdop = entradaScanner.nextLine();
        entradaScanner.close();
        return motivoAdop;
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

}