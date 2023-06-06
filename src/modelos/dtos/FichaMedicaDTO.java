package modelos.dtos;

import java.util.List;

import modelos.Alarma;
import modelos.Exportador;
import modelos.Tratamiento;

public class FichaMedicaDTO {
    /**
     * Default constructor
     */
    public FichaMedicaDTO() {
    }

    /**
     * 
     */
    public Exportador exportador;

    /**
     * 
     */
    public List<Tratamiento> tratamientos;

    /**
     * 
     */
    public List<Alarma> alarmas;
}
