package modelos.dtos;

import java.time.Duration;
import java.util.*;

import modelos.Animal;

/**
 * 
 */
public class AlarmaDTO {

    /**
     * Default constructor
     */
    public AlarmaDTO() {
    }

    /**
     * 
     */
    private Duration periocidad;

    /**
     * 
     */
    private Animal animal;

    /**
     * 
     */
    private Boolean estadoAlarma;

    /**
     * 
     */
    private INotificacionPush notificacion;

    /**
     * 
     */
    private ITipoAlarma tipoAlarma;

}