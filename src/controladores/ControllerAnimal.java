package controladores;


import java.util.*;

import modelos.Animal;
import modelos.dtos.AnimalDTO;
import modelos.dtos.FichaMedicaDTO;

/**
 * 
 */
public class ControllerAnimal {

    /**
     * Default constructor
     */
    public ControllerAnimal() {
    }

    /**
     * 
     */
    private List<Animal> animales;

    /**
     * @param String legajo 
     * @return
     */
    public AnimalDTO obtenerAnimal(String legajo) {
        // TODO implement here
        return null;
    }

    /**
     * @param String legajo 
     * @return
     */
    public FichaMedicaDTO obtenerFichaMedica(String legajo) {
        // TODO implement here
        return null;
    }

    /**
     * @param String tipo 
     * @param Float altura 
     * @param Float peso 
     * @param Int edad 
     * @param Boolean estadoAnimal 
     * @return
     */
    public void ingresarAnimal(String tipo, Float altura, Float peso, int edad, Boolean estadoAnimal) {
        // TODO implement here
    }

}