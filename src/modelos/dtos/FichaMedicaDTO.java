package modelos.dtos;

import java.util.ArrayList;
import modelos.Animal;

public class FichaMedicaDTO {
    
    private ArrayList<TratamientoDTO> tratamientosDTO;
    private ArrayList<AlarmaDTO> alarmasDTO;
    private Animal animal;

    public FichaMedicaDTO(ArrayList<TratamientoDTO> tratamientosDTO, ArrayList<AlarmaDTO> alarmasDTO, Animal animal) {
        this.tratamientosDTO = tratamientosDTO;
        this.alarmasDTO = alarmasDTO;
        this.animal = animal;
    }
    
    public ArrayList<TratamientoDTO> getTratamientosDTO() {
        return tratamientosDTO;
    }

    public ArrayList<AlarmaDTO> getAlarmasDTO() {
        return alarmasDTO;
    }

    public Animal getAnimal(){
        return animal;
    }
}
