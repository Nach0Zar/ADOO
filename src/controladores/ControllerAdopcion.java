package controladores;

import java.util.ArrayList;
import enums.TipoNotificacion;
import java.util.*;
import modelos.Adopcion;
import modelos.ClienteAdoptante;
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
                motivoAdopcion(),
                TipoNotificacion.SMS);//default en SMS
                

        this.adopciones.add(adopcion);
        adopcionNueva(adopcion, clienteAdoptante, animal);
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