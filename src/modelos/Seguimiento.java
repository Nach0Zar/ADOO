package modelos;

import java.util.*;

import enums.Calificacion;
import modelos.dtos.RecordatorioDTO;
import estrategias.recordatorio.RecordatorioPorEmail;
import estrategias.recordatorio.RecordatorioPorWhatsApp;
import estrategias.recordatorio.RecordatorioPorSMS;

public class Seguimiento {
    private static int numeradorSeguiemiento = 1;

    private Boolean continuarSeguimiento;
    private int numeroSeguimiento;
    private Recordador recordador;
    private int frecuenciaVisita; // cada cuanto se repite
    private Encuesta encuesta;
    private ArrayList<Visita> visitas;
    private Usuario visitadorEncargado;

    public Seguimiento() {
        this.recordador = new Recordador(new RecordatorioPorSMS());
        this.numeroSeguimiento = numeradorSeguiemiento++;
        this.visitas = new ArrayList<Visita>();
    }

    public void agregarVisita(String comentario, Calificacion estadoAnimal, Calificacion limpieza,
            Calificacion ambiente) {
        Visita visitaNueva = new Visita(comentario, this.visitadorEncargado);
        visitaNueva.completarEncuesta(estadoAnimal, limpieza, ambiente);
        visitas.add(visitaNueva);
        // solo para probar
        System.out.println("Se creo la visita  con el comentario = " + visitaNueva.getComentario()
                + " Tenes esta cantidad de visitas : " + cantidadVisitas());
    }

    public Boolean getContinuarSeguimiento() {
        return continuarSeguimiento;
    }

    public int cantidadVisitas() {
        return visitas.size();
    }

    public void setContinuarSeguimiento(Boolean continuarSeguimiento) {
        this.continuarSeguimiento = continuarSeguimiento;
    }

    public int getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public Recordador getRecordador() {
        return recordador;
    }

    public void setRecordador(Recordador recordador) {
        this.recordador = recordador;
    }

    public int getFrecuenciaVisita() {
        return frecuenciaVisita;
    }

    public void setFrecuenciaVisita(int frecuenciaVisita) {
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

    public void setVisitador(Usuario visitador) {
        this.visitadorEncargado = visitador;
    }

    /**
     * @param recordatorio
     * @return
     */
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        switch (recordatorio.getDestinatario().getTipoNotificacion()) {
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