package modelos;

import java.util.*;
import modelos.dtos.FichaMedicaDTO;

public class FichaMedica {
    //ponemos la lista de alarmas aca?
    private Exportador exportador;
    private ArrayList <Tratamiento> tratamientos;
    private int legajo;
    private Animal animal;


    public FichaMedica(int legajo, Animal animal) {
        this.tratamientos = new ArrayList<Tratamiento>();
        this.exportador = new Exportador();
        this.legajo = legajo;
        this.animal = animal;
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

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    //Fin getters y setters

    public void exportarFichaMedica(FichaMedicaDTO fichaMedicaDTO) {
        this.exportador.exportarFichaMedica(fichaMedicaDTO);
    }

    //Inicio Tratamientos

    protected Tratamiento buscarTratamiento(int id) {
        Tratamiento tratamiento = null;
        for (Tratamiento t : tratamientos) {
            if (t.getIdTratamiento() == id) {
                tratamiento = t;
                break;
            }
        }
        return tratamiento;
    }

    public void crearTratamiento(String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
        if(animal.getEstadoSaludableAnimal()){                                      //Siempre que el estado no sea saludable, tiene un tratamiento activo
            Tratamiento tratamiento = new Tratamiento(nombre, descripcion, fechaInicio, fechaFin);
            tratamientos.add(tratamiento);
            animal.setEstadoSaludableAnimal(false);
            
            System.out.println("Se ha creado el tratamiento: " + tratamiento.getNombre() + " con id: " + tratamiento.getIdTratamiento());
        }else{
            System.out.println("Ya existe un tratamiento en curso, no se puede crear otro");
        }
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    public void finalizarTratamiento(int id) {
        Tratamiento tratamiento = buscarTratamiento(id);
        tratamiento.setFinalizado(true);
        animal.setEstadoSaludableAnimal(true);
        System.out.println("Ha finalizado el tratamiento: " + tratamiento.getNombre());
    }

    public FichaMedicaDTO getDTO() {
        return null;
    }

    //Fin tratamientos
}