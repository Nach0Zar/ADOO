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
     * Default constructor
     */
    public Alarma() {
    }

    /**
     * 
     */
    private Duration periodicidad;

    /**
     * 
     */
    private Animal animal;

    /**
     * 
     */
    private IEstadoAlarma estadoAlarma;

    /**
     * 
     */
    private INotificationPush notificacion;

    /**
     * 
     */
    private ITipoAlarma tipoAlarma;

    /**
     * 
     */
    private Usuario veterinario;

    /**
     * 
     */
    private Date ultimaEjecucion;

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