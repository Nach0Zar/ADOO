package modelos;

import java.util.*;
import modelos.dtos.*;

public class FichaMedica {
    

    private Exportador exportador;
    private ArrayList <Tratamiento> tratamientos;
    private ArrayList <Alarma> alarmas;
    private Animal animal;


    public FichaMedica(Animal animal) {
        this.tratamientos = new ArrayList<Tratamiento>();
        this.alarmas = new ArrayList<Alarma>();
        this.exportador = new Exportador();
    }

    //getters y setters

    public Exportador getExportador() {
        return exportador;
    }

    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(ArrayList<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public ArrayList<Alarma> getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(ArrayList<Alarma> alarmas) {
        this.alarmas = alarmas;
    }
    //Fin getters y setters

    public void exportarFichaMedica(FichaMedicaDTO fichaMedicaDTO) {
        this.exportador.exportarFichaMedica(fichaMedicaDTO);
    }

    //Inicio Tratamientos

    protected Tratamiento buscarTratamiento(int numeroTratamiento) {
        Tratamiento tratamiento = null;
        for (Tratamiento t : tratamientos) {
            if (t.getNumeroTratamiento() == numeroTratamiento) {
                tratamiento = t;
                break;
            }
        }
        return tratamiento;
    }

    //
    //
    // TODO TIENE QUE ESTAR EN ANIMAL
    //
    //
    public void crearTratamiento(String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
        if(animal.getEstadoSaludableAnimal()){                                      //Siempre que el estado no sea saludable, tiene un tratamiento activo
            Tratamiento tratamiento = new Tratamiento(nombre, descripcion, fechaInicio, fechaFin);
            tratamientos.add(tratamiento);
            animal.setEstadoSaludableAnimal(false);
            
            System.out.println("Se ha creado el tratamiento: " + tratamiento.getNombre() + " con id: " + tratamiento.getNumeroTratamiento());
        }else{
            System.out.println("Ya existe un tratamiento en curso, no se puede crear otro");
        }
    }

    public void finalizarTratamiento(int id) {
        Tratamiento tratamiento = buscarTratamiento(id);
        tratamiento.setFinalizado(true);
        animal.setEstadoSaludableAnimal(true);
        System.out.println("Ha finalizado el tratamiento: " + tratamiento.getNombre());
    }

    //
    //
    //TIENE QUE ESTAR EN ANIMAL
    //
    //

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    public FichaMedicaDTO toDTO() {
        ArrayList<TratamientoDTO> tratamientosDTO = new ArrayList<TratamientoDTO>();
        ArrayList<AlarmaDTO> alarmasDTO = new ArrayList<AlarmaDTO>();
        AnimalDTO animalDTO = animal.toDTO();
        for (Tratamiento t : tratamientos) {
            tratamientosDTO.add(t.toDTO());
        }
        for (Alarma a : alarmas) {
            alarmasDTO.add(a.toDTO());
        }
        return new FichaMedicaDTO(tratamientosDTO, alarmasDTO, animalDTO);
    }

    //Fin tratamientos
}