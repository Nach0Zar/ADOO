package modelos;

import java.time.Duration;
import java.util.*;

import adaptador.notificacion.AdapterNotificacionPush;
import adaptador.notificacion.INotificationPush;
import estrategias.accion.ITipoAlarma;
import modelos.dtos.AlarmaDTO;

public class Alarma {

    // Atributos
    private static int numeradorAlarma = 1;
    private int numeroAlarma;
    private Duration periodicidad;
    private Animal animal;
    private INotificationPush notificacion;
    private ITipoAlarma tipoAlarma;
    private Usuario veterinario; // TODO: revisar si es necesario o si en realidad es el usuario que la creo
    private Date ultimaEjecucion;

    // Constructor
    public Alarma(Duration periodicidad, Animal animal,
            ITipoAlarma tipoAlarma, Usuario veterinario) {
        this.periodicidad = periodicidad;
        this.animal = animal;
        this.notificacion = new AdapterNotificacionPush();
        this.tipoAlarma = tipoAlarma;
        this.veterinario = veterinario;
        this.ultimaEjecucion = new Date();
        this.numeroAlarma = numeradorAlarma++;
    }

    // Metodos

    public void enviarNotificacion() {
        this.notificacion.enviarNotificacion(toDTO());
    }

    /*
     * public void crearAlarma(ITipoAlarma alarma) {
     * this.tipoAlarma = alarma;
     * this.tipoAlarma.crearAlarma();
     * }
     */

    public boolean soyAlarma(int numeroAlarma) {
        return this.numeroAlarma == numeroAlarma;
    }

    public AlarmaDTO toDTO() {
        return new AlarmaDTO(this.numeroAlarma, this.periodicidad, this.animal.toDTO(), this.tipoAlarma,
                this.veterinario.toDTO(), this.ultimaEjecucion);
    }

    // Getters
    public Duration getPeriodicidad() {
        return periodicidad;
    }

    public Animal getAnimal() {
        return animal;
    }

    public INotificationPush getNotificacion() {
        return notificacion;
    }

    public ITipoAlarma getTipoAlarma() {
        return tipoAlarma;
    }

    public Usuario getVeterinario() {
        return veterinario;
    }

    public Date getUltimaEjecucion() {
        return ultimaEjecucion;
    }

    public int getNumeroAlarma() {
        return numeroAlarma;
    }

    // Setters
    // TODO REVISAR
    /*
     * ENTIENDO QUE NO SE PUEDEN MODIFICAR EL ANIMAL DE LA ALARMA
     * public void setAnimal(Animal animal) {
     * this.animal = animal;
     * }
     */

    public void setPeriodicidad(Duration periodicidad) {
        this.periodicidad = periodicidad;
    }

    public void setNotificacion(INotificationPush notificacion) {
        this.notificacion = notificacion;
    }

    public void setTipoAlarma(ITipoAlarma tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    public void setVeterinario(Usuario veterinario) {
        this.veterinario = veterinario;
    }

    public void setUltimaEjecucion(Date ultimaEjecucion) {
        this.ultimaEjecucion = ultimaEjecucion;
    }

    public void atenderAlarma() {
        tipoAlarma.atenderAlarma();
    }

}