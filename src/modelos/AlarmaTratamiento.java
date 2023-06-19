package modelos;


import java.util.*;

import estrategias.alarma.ITipoAlarma;
import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public class AlarmaTratamiento implements ITipoAlarma {

    private Date fechaInicio;
    private Date fechaFin;
    private String nombre;
    private String descripcion;
    private List<Accion> acciones;
    private Tratamiento tratamiento;

    public AlarmaTratamiento(Date fechaInicio, Date fechaFin, String nombre, String descripcion, List<Accion> acciones,
            Tratamiento tratamiento) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.acciones = acciones;
        this.tratamiento = tratamiento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Accion> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<Accion> acciones) {
        this.acciones = acciones;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    /**
     * @param AlarmaDTO alarma
     */
    @Override
    public void crearAlarma(AlarmaDTO alarma) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearAlarma'");
    }

}