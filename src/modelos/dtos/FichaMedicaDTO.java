package modelos.dtos;

import java.util.ArrayList;
public class FichaMedicaDTO {
    
    private ArrayList<TratamientoDTO> tratamientosDTO;
    private ArrayList<AlarmaDTO> alarmasDTO;
    private AnimalDTO animalDTO;

    public FichaMedicaDTO(ArrayList<TratamientoDTO> tratamientosDTO, ArrayList<AlarmaDTO> alarmasDTO, AnimalDTO animalDTO) {
        this.tratamientosDTO = tratamientosDTO;
        this.alarmasDTO = alarmasDTO;
        this.animalDTO = animalDTO;
    }
    
    public ArrayList<TratamientoDTO> getTratamientosDTO() {
        return tratamientosDTO;
    }

    public ArrayList<AlarmaDTO> getAlarmasDTO() {
        return alarmasDTO;
    }

    public AnimalDTO getAnimalDTO() {
        return animalDTO;
    }    
}
