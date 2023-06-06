package modelos;

import java.util.*;

import estados.adoptante.IEstadoAdoptante;

public class Adopcion {

    private Animal animal;
    private Seguimiento seguimiento;
    private String motivoDeAdopcion;
    private IEstadoAdoptante estadoAdopcion;
    private ClienteAdoptante clienteAdoptante;

    public Adopcion() {
    }
    
    public void adopcionAnimal(ClienteAdoptante cliente, Animal animal) {
    }

    public void cambiarEstadoAdopcion(IEstadoAdoptante estadoAdopcion) {
    }

}