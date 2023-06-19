package modelos;


import java.time.Duration;
import java.util.*;

import adaptador.notificacion.INotificationPush;
import estados.alarma.IEstadoAlarma;
import estrategias.alarma.ITipoAlarma;
import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public class Alarma {

    /**
     * Atributos
     */
    private static int numeradorAlarma = 1;
    private int numeroAlarma;
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
    public Alarma(Duration periodicidad, Animal animal, INotificationPush notificacion,
            ITipoAlarma tipoAlarma, Usuario veterinario, Date ultimaEjecucion) {
        this.periodicidad = periodicidad;
        this.animal = animal;
        this.estadoAlarma = new estados.alarma.Incompleta(); // por default esta en incompleta
        this.notificacion = notificacion;
        this.tipoAlarma = tipoAlarma;
        this.veterinario = veterinario;
        this.ultimaEjecucion = ultimaEjecucion;
        this.numeroAlarma = numeradorAlarma++;
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

    public int getNumeroAlarma() {
        return numeroAlarma;
    }

    // Metodos

    public void enviarNotificacion() {
        this.notificacion.enviarNotificacion(toDTO());
    }

    
    public void crearAlarma(ITipoAlarma alarma) {
        this.tipoAlarma = alarma;
        this.tipoAlarma.crearAlarma();
    }

    public void atenderAlarma() {//una vez completada , no puede volver a estar incompleta
        this.estadoAlarma.atenderAlarma(this);
    }    

    public boolean soyAlarma(int numeroAlarma) {
        return this.numeroAlarma == numeroAlarma;
    }

    public AlarmaDTO toDTO() {

        boolean alarmaAtendida;
        if(this.estadoAlarma instanceof estados.alarma.Incompleta)
            alarmaAtendida = false;
        else
            alarmaAtendida = true;

        return new AlarmaDTO(this.numeroAlarma, this.periodicidad, this.animal.toDTO(), alarmaAtendida, this.tipoAlarma,
        this.veterinario.toDTO(), this.ultimaEjecucion);
    }
}