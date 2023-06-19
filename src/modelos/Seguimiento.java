package modelos;

import java.util.*;
import modelos.dtos.RecordatorioDTO;

public class Seguimiento {

    private Date candenciaVisitas;
    private Boolean continuarSeguimiento;
    private int idSeguimientoAnimal;
    private TipoNotificacion tipoNotficacion;
    private Recordador tipoNotificacionNotificador;
    private Recordador recordador;
    private Date frecuenciaVisita;
    private Encuesta encuesta;
    private ArrayList<Visita> visitas;

    public Seguimiento(int idSeguimiento, TipoNotificacion notif) {
        this.idSeguimientoAnimal=idSeguimiento;
        this.tipoNotficacion = notif;
        this.tipoNotificacionNotificador = new Recordador();
        this.idSeguimientoAnimal = idSeguimiento;
        this.visitas = new ArrayList<Visita>();

    }
    
    public Date getCandenciaVisitas() {
        return candenciaVisitas;
    }

    public void setCandenciaVisitas(Date candenciaVisitas) {
        this.candenciaVisitas = candenciaVisitas;
    }

    public Boolean getContinuarSeguimiento() {
        return continuarSeguimiento;
    }

    public void setContinuarSeguimiento(Boolean continuarSeguimiento) {
        this.continuarSeguimiento = continuarSeguimiento;
    }

    public int getIdSeguimientoAnimal() {
        return idSeguimientoAnimal;
    }

    public void setIdSeguimientoAnimal(int idSeguimientoAnimal) {
        this.idSeguimientoAnimal = idSeguimientoAnimal;
    }

    public TipoNotificacion getTipoNotficacion() {
        return tipoNotficacion;
    }

    public void setTipoNotficacion(TipoNotificacion tipoNotficacion) {
        this.tipoNotficacion = tipoNotficacion;
    }

    public Recordador getTipoNotificacionNotificador() {
        return tipoNotificacionNotificador;
    }

    public void setTipoNotificacionNotificador(Recordador tipoNotificacionNotificador) {
        this.tipoNotificacionNotificador = tipoNotificacionNotificador;
    }

    public Recordador getRecordador() {
        return recordador;
    }

    public void setRecordador(Recordador recordador) {
        this.recordador = recordador;
    }

    public Date getFrecuenciaVisita() {
        return frecuenciaVisita;
    }

    public void setFrecuenciaVisita(Date frecuenciaVisita) {
        this.frecuenciaVisita = frecuenciaVisita;
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Visita> visitas) {
        this.visitas = visitas;
    }
    
    /**
     * @param recordatorio
     * @return
     */
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        // TODO implement here
    }

}