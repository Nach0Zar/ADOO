package modelos;

import java.util.*;

import modelos.dtos.RecordatorioDTO;
import modelos.TipoNotificacion;;
import modelos.Recordador;

/**
 * 
 */
public class Seguimiento {

    private Date candenciaVisitas;
    private Boolean continuarSeguimiento;
    private int idSeguimientoAnimal;
    private TipoNotificacion tipoNotficacion;
    private Recordador tipoNotificacionNotificador;

    private List<Visita> visitas;

    public Seguimiento(int idSeguimiento, TipoNotificacion notif) {
        this.idSeguimientoAnimal=idSeguimiento;
        this.tipoNotficacion = notif;
        this.tipoNotificacionNotificador = new Recordador(notif);
        this.idSeguimientoAnimal = idSeguimiento;
        this.visitas = new ArrayList<Visita>();

    }

    /**
     * 
     */
    private Recordador recordador;

    /**
     * 
     */
    private Date frecuenciaVisita;

    /**
     * 
     */
    private Encuesta encuesta;

    /**
     * @param recordatorio
     * @return
     */
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        // TODO implement here
    }

}