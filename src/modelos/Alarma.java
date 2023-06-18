package modelos;


import java.time.Duration;
import java.util.*;

import adaptador.notificacion.INotificationPush;
import estados.alarma.IEstadoAlarma;
import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public class Alarma {

    /**
     * Atributos
     */
    private Duration periodicidad;
    private Animal animal;
    private IEstadoAlarma estadoAlarma;
    private INotificationPush notificacion;
    private ITipoAlarma tipoAlarma;
    private Usuario veterinario;
    private Date ultimaEjecucion;

    /**
     * Default constructor
     */
    public Alarma(Duration periodicidad, Animal animal, IEstadoAlarma estadoAlarma, INotificationPush notificacion,
            ITipoAlarma tipoAlarma, Usuario veterinario, Date ultimaEjecucion) {
        this.periodicidad = periodicidad;
        this.animal = animal;
        this.estadoAlarma = estadoAlarma;
        this.notificacion = notificacion;
        this.tipoAlarma = tipoAlarma;
        this.veterinario = veterinario;
        this.ultimaEjecucion = ultimaEjecucion;
    }

    // Getters y Setters

    public Duration getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Duration periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public IEstadoAlarma getEstadoAlarma() {
        return estadoAlarma;
    }

    public void setEstadoAlarma(IEstadoAlarma estadoAlarma) {
        this.estadoAlarma = estadoAlarma;
    }

    public INotificationPush getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(INotificationPush notificacion) {
        this.notificacion = notificacion;
    }

    public ITipoAlarma getTipoAlarma() {
        return tipoAlarma;
    }

    public void setTipoAlarma(ITipoAlarma tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    public Usuario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Usuario veterinario) {
        this.veterinario = veterinario;
    }

    public Date getUltimaEjecucion() {
        return ultimaEjecucion;
    }

    public void setUltimaEjecucion(Date ultimaEjecucion) {
        this.ultimaEjecucion = ultimaEjecucion;
    }

    // Metodos

    /**
     * @param iAlarmaDTO alarmaNotf 
     * @return
     */
    public void enviarNotificacion(AlarmaDTO alarmaNotf) {
        // TODO implement here
    }
    /**
     * @param AlarmaDTO alarma 
     * @return
     */
    public void crearAlarma(AlarmaDTO alarma) {
        // TODO implement here
    }

    /**
     * @param IEstadoAlarma estadoAlarma  
     * @return
     */
    public void cambiarEstadoAlarma(IEstadoAlarma estadoAlarma ) {
        // TODO implement here
    }

    /**
     * 
     */
    public void atenderAlarma() {
        // TODO implement here
    }    

}