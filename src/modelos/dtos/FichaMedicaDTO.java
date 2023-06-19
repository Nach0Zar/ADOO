package modelos.dtos;

import java.util.ArrayList;
public class FichaMedicaDTO {
    
    private ArrayList<TratamientoDTO> tratamientosDTO;
    private ArrayList<AlarmaDTO> alarmasDTO;

    public FichaMedicaDTO(ArrayList<TratamientoDTO> tratamientosDTO, ArrayList<AlarmaDTO> alarmasDTO) {
        this.tratamientosDTO = tratamientosDTO;
        this.alarmasDTO = alarmasDTO;
    }
    
    public ArrayList<TratamientoDTO> getTratamientosDTO() {
        return tratamientosDTO;
    }

    public ArrayList<AlarmaDTO> getAlarmasDTO() {
        return alarmasDTO;
    }
}
