package controladores;

import java.util.*;

import enums.TipoAnimal;
import modelos.Animal;
import modelos.dtos.AnimalDTO;
import modelos.dtos.FichaMedicaDTO;

public class ControllerAnimal {

    private ArrayList<Animal> animales;
    private static ControllerAnimal instancia;
    public static int proximoLegajo = 1;    //de esta forma creo un legajo automatico

    public ControllerAnimal() {
        animales = new ArrayList<Animal>();
    }

    public static ControllerAnimal getInstancia() {
        if (instancia == null)
            instancia = new ControllerAnimal();
        return instancia;
    }

    public void ingresarAnimal(AnimalDTO animalDTO) {
        Animal animal = new Animal(
            animalDTO.getDomestico(), 
            animalDTO.getAltura(), 
            animalDTO.getPeso(),
            animalDTO.getEdad(), 
            animalDTO.getEstadoSaludableAnimal(), 
            animalDTO.getTipoDeAnimal(),
            animalDTO.getNombre(), 
            proximoLegajo++ 
        );
        animal.crearFichaMedica();
        animales.add(animal);
    }
 
    public AnimalDTO obtenerAnimal(String legajo) {
        Animal animalBuscar = null;

        for (Animal animal : animales) {
            if (animal.getLegajo().equals(legajo)) {
                animalBuscar = animal;
                break;
            }
        }
        return animalBuscar.getDTO();
    }


    public FichaMedicaDTO obtenerFichaMedica(String legajo) {
        Animal animal = obtenerAnimal(legajo);
        return animal.getFichaMedica().getDTO();
    }

  
    public void ingresarAnimal(Boolean domestico, Float altura, Float peso, int edad, Boolean estadoAnimal, TipoAnimal tipoDeAnimal, String nombre, String legajo) {
        Animal animal = new Animal(domestico, altura, peso, edad, estadoAnimal, tipoDeAnimal, nombre, legajo);
        animales.add(animal);
    }

}