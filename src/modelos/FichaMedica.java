package modelos;


import java.util.*;
import modelos.Animal;
import modelos.Tratamiento;
import modelos.dtos.FichaMedicaDTO;

public class FichaMedica {
    //ponemos la lista de alarmas aca?
    private Exportador exportador;
    private ArrayList <Tratamiento> tratamientos;
    private String legajo;
    private Animal animal;


    public FichaMedica(String legajo, Animal animal) {
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

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    //Fin getters y setters

    public void exportarFichaMedica(FichaMedicaDTO fichaMedicaDTO) {
        this.exportador.exportarFichaMedica(fichaMedicaDTO);
    }

    //Tratamientos

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
        Tratamiento tratamiento = new Tratamiento(nombre, descripcion, fechaInicio, fechaFin, tratamientos.size() + 1); //Esta parte no estoy seguro de como identificar los tratamientos con el id
        tratamientos.add(tratamiento);
        animal.setEstaEnTratamiento(true);
        System.out.println("Se ha creado el tratamiento: " + tratamiento.getNombre());
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    //Si no, como indico que finalizó? Lo pongo acá o en animal
    public void finalizarTratamiento(int id) {
        Tratamiento tratamiento = buscarTratamiento(id);
        tratamiento.setFinalizado(true);
        animal.setEstaEnTratamiento(true);
        System.out.println("Ha finalizado el tratamiento: " + tratamiento.getNombre());
    }

    //Fin tratamientos
}