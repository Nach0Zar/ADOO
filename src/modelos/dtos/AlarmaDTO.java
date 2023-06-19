package modelos.dtos;

import java.time.Duration;

import adaptador.notificacion.INotificationPush;
import estados.alarma.IEstadoAlarma;
import estrategias.alarma.ITipoAlarma;
import modelos.Animal;


public class AlarmaDTO {

    
    private Duration periodicidad;
    private Animal animal;
    private Boolean estadoAlarma;
    private INotificationPush notificacion;
    private ITipoAlarma tipoAlarma;
    
    public AlarmaDTO(Duration periodicidad, Animal animal, Boolean estadoAlarma, INotificationPush notificacion,
            ITipoAlarma tipoAlarma) {
        this.periodicidad = periodicidad;
        this.animal = animal;
        this.estadoAlarma = estadoAlarma;
        this.notificacion = notificacion;
        this.tipoAlarma = tipoAlarma;
    }

    public Duration getperiodicidad() {
        return periodicidad;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Boolean getEstadoAlarma() {
        return estadoAlarma;
    }

    public INotificationPush getNotificacion() {
        return notificacion;
    }

    public ITipoAlarma getTipoAlarma() {
        return tipoAlarma;
    }

    public void setperiodicidad(Duration periodicidad) {
        this.periodicidad = periodicidad;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setEstadoAlarma(Boolean estadoAlarma) {
        this.estadoAlarma = estadoAlarma;
    }

    public void setNotificacion(INotificationPush notificacion) {
        this.notificacion = notificacion;
    }

    public void setTipoAlarma(ITipoAlarma tipoAlarma) {
        this.tipoAlarma = tipoAlarma;
    }

    

}