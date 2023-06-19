package controladores;

import modelos.Animal;
import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public class ControllerAlarma {
    
    private Animal animal;
    private AlarmaDTO alarma;

    /**
     * Default constructor
     */
    
    public ControllerAlarma(Animal animal, AlarmaDTO alarma) {
        this.animal = animal;
        this.alarma = alarma;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public AlarmaDTO getAlarma() {
        return alarma;
    }

    public void setAlarma(AlarmaDTO alarma) {
        this.alarma = alarma;
    }

    /**
     * @param AlarmaDTO alarma 
     * @return
     */
    public void crearAlarma(AlarmaDTO alarmaDTO) {
        // TODO implement here
    }

    /**
     * @param AlarmaDTO alarma 
     * @return
     */
    public void atenderAlarma(AlarmaDTO alarmaDTO) {
        // TODO implement here
    }

}