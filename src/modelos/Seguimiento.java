package modelos;

import java.util.*;
import modelos.dtos.RecordatorioDTO;
import estrategias.recordatorio.RecordatorioPorEmail;
import estrategias.recordatorio.RecordatorioPorWhatsApp;
import estrategias.recordatorio.RecordatorioPorSMS;

public class Seguimiento {

    private static int numeradorSeguiemiento = 1;
    
    private Boolean continuarSeguimiento;
    private int numeroSeguimiento;
    private Recordador recordador;
    private Date frecuenciaVisita;
    private Encuesta encuesta;
    private ArrayList<Visita> visitas;

    public Seguimiento() {
        this.recordador = new Recordador(new RecordatorioPorSMS());
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
        switch(recordatorio.getDestinatario().getTipoNotificacion()){
            case EMAIL:
                recordador.setEstrategia(new RecordatorioPorEmail());
                break;
            case SMS:
                recordador.setEstrategia(new RecordatorioPorSMS());
                break;
            case WHATSAPP:
                recordador.setEstrategia(new RecordatorioPorWhatsApp());
                break;
        }
        this.recordador.enviarRecordatorio(recordatorio);
    }

}