package modelos.dtos;

import java.util.ArrayList;
import java.util.Date;

import estrategias.accion.ITipoAlarma;
import modelos.Animal;

import java.time.Duration;

public class AlarmaDTO {

    private int numeroAlarma;
    private Duration periodicidad;
    private Animal animal;
    private ITipoAlarma tipoAlarma;
    private UsuarioDTO usuarioDTO;
    private Date ultimaEjecucion;

    public AlarmaDTO(int numeroAlarma, Duration periodicidad, Animal animal,
            ITipoAlarma tipoAlarma, UsuarioDTO usuarioDTO, Date ultimaEjecucion2) {
        this.numeroAlarma = numeroAlarma;
        this.periodicidad = periodicidad;
        this.animal = animal;
        this.tipoAlarma = tipoAlarma;
        this.usuarioDTO = usuarioDTO;
        this.ultimaEjecucion = ultimaEjecucion2;
    }

    public int getNumeroAlarma() {
        return numeroAlarma;
    }

    public Duration getPeriodicidad() {
        return periodicidad;
    }

    public Animal getAnimalDTO() {
        return animal;
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public Date getUltimaEjecucion() {
        return ultimaEjecucion;
    }

    public ArrayList<AccionDTO> getAcciones() {
        return tipoAlarma.getAccionesDTO();
    }

    public void printAcciones() {
        for (AccionDTO accion : tipoAlarma.getAccionesDTO()) {
            System.out.println("Nombre: " + accion.getNombre());
            System.out.println("Descripcion: " + accion.getDescripcion());
        }
    }

}