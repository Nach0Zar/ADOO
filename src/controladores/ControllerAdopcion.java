package controladores;

import java.util.ArrayList;
import java.util.*;
import modelos.Adopcion;
import modelos.ClienteAdoptante;
import modelos.Animal;
import modelos.TipoNotificacion;

public class ControllerAdopcion {

    private ArrayList<Adopcion> adopciones;
    private static ControllerAdopcion instancia;

    public static ControllerAdopcion getInstancia() {
        if (instancia == null)
            instancia = new ControllerAdopcion();
        return instancia;
    }

    public ControllerAdopcion() {
        adopciones = new ArrayList<>();
    }

    public void crearAdopcion(Animal animal, ClienteAdoptante clienteAdoptante, String motivoDeAdopcion) {
        int id = generarId();
        Adopcion adopcion = new Adopcion(
                animal,
                clienteAdoptante,
                id,
                motivoAdopcion(),
                TipoNotificacion.SMS);

        this.adopciones.add(adopcion);
        adopcionNueva(adopcion, clienteAdoptante, animal);
    }

    private void adopcionNueva(Adopcion adopcion, ClienteAdoptante clienteAdoptante, Animal animal) {
        adopcion.adopcionNueva(clienteAdoptante, animal);
    }

    private int generarId() {
        int legajo = 0;
        for (Adopcion adopcion : adopciones) {
            legajo = legajo + 1;
        }
        return legajo + 1;
    }

    private String motivoAdopcion() {
        System.out.println("Motivo de adopcion :");
        Scanner entradaScanner = new Scanner(System.in);
        String motivoAdop = entradaScanner.nextLine();
        entradaScanner.close();
        return motivoAdop;
    }

    public Adopcion buscarAdopcion(int id) {
        Adopcion adopcionBuscada = null;
        for (Adopcion adopcion : adopciones) {
            if (adopcion.getId() == id) {
                adopcionBuscada = adopcion;
            }
        }
        return adopcionBuscada;
    }

}