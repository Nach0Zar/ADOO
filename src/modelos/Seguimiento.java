package modelos;

import java.util.*;
import modelos.dtos.RecordatorioDTO;
import enums.TipoNotificacion;

public class Seguimiento {

    private static int numeradorSeguiemiento = 1;
    
    private Boolean continuarSeguimiento;
    private int numeroSeguimiento;
    private TipoNotificacion tipoNotificacion;
    private Recordador tipoNotificacionNotificador;
    private Recordador recordador;
    private Date frecuenciaVisita;
    private Encuesta encuesta;
    private ArrayList<Visita> visitas;

    public Seguimiento(TipoNotificacion notif) {
        this.tipoNotificacion = notif;
        this.tipoNotificacionNotificador = new Recordador();
        this.numeroSeguimiento = numeradorSeguiemiento++;
        this.visitas = new ArrayList<Visita>();

    }

    public Boolean getContinuarSeguimiento() {
        return continuarSeguimiento;
    }

    public void setContinuarSeguimiento(Boolean continuarSeguimiento) {
        this.continuarSeguimiento = continuarSeguimiento;
    }

    public int getNumeroSeguimientoAnimal() {
        return numeroSeguimiento;
    }

    public TipoNotificacion getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
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
        this.tipoNotificacionNotificador.enviarRecordatorio(recordatorio);
    }

}