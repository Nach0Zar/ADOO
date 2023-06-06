package modelos;


import java.util.*;

import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public class AlarmaTratamiento implements ITipoAlarma {

    /**
     * Default constructor
     */
    public AlarmaTratamiento() {
    }

    /**
     * 
     */
    private Date fechaInicio;

    /**
     * 
     */
    private Date fechaFin;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private List<Accion> acciones;

    /**
     * 
     */
    private Tratamiento tratamiento;

    /**
     * @param AlarmaDTO alarma
     */
    @Override
    public void crearAlarma(AlarmaDTO alarma) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearAlarma'");
    }

}