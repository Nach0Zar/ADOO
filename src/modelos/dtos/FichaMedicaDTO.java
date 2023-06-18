package modelos.dtos;

import java.util.List;

import modelos.Alarma;
import modelos.Exportador;
import modelos.Tratamiento;

public class FichaMedicaDTO {
    
    private Exportador exportador;
    private List<Tratamiento> tratamientos;
    private List<Alarma> alarmas;
    

    public FichaMedicaDTO() {
    }


    public Exportador getExportador() {
        return exportador;
    }


    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }


    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }


    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }


    public List<Alarma> getAlarmas() {
        return alarmas;
    }


    public void setAlarmas(List<Alarma> alarmas) {
        this.alarmas = alarmas;
    }

    
}
