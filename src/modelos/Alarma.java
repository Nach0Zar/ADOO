package modelos;

import java.time.Duration;
import java.util.*;

import adaptador.notificacion.AdapterNotificacionPush;
import adaptador.notificacion.INotificationPush;
import estados.alarma.IEstadoAlarma;
import estrategias.alarma.ITipoAlarma;
import modelos.dtos.AlarmaDTO;

public class Alarma {

    // Atributos
    private static int numeradorAlarma = 1;
    private int numeroAlarma;
    private Duration periodicidad;
    private Animal animal;
    private IEstadoAlarma estadoAlarma;
    private INotificationPush notificacion;
    private ITipoAlarma tipoAlarma;
    private Usuario veterinario; // TODO: revisar si es necesario o si en realidad es el usuario que la creo
    private Date ultimaEjecucion;

    // Constructor
    public Alarma(Duration periodicidad, Animal animal,
            ITipoAlarma tipoAlarma, Usuario veterinario) {
        this.periodicidad = periodicidad;
        this.animal = animal;
        this.estadoAlarma = new estados.alarma.Incompleta(); // por default esta en incompleta
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
    public void crearAlarma(ITipoAlarma alarma) {
        this.tipoAlarma = alarma;
        this.tipoAlarma.crearAlarma();
    }
    */
   
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

    // Getters
    public Duration getPeriodicidad() {
        return periodicidad;
    }

    public Animal getAnimal() {
        return animal;
    }

    public IEstadoAlarma getEstadoAlarma() {
        return estadoAlarma;
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

    //Setters 
    //TODO REVISAR
    /* ENTIENDO QUE NO SE PUEDEN MODIFICAR EL ANIMAL DE LA ALARMA
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    */
    public void setEstadoAlarma(IEstadoAlarma estadoAlarma) {
        this.estadoAlarma = estadoAlarma;
    }

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

}