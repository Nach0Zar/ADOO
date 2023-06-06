package modelos;


import java.util.*;

import estrategias.recordatorio.RecordatorioStrategy;
import modelos.dtos.RecordatorioDTO;

/**
 * 
 */
public class Recordador {

    /**
     * Default constructor
     */
    public Recordador() {
    }

    /**
     * 
     */
    private RecordatorioStrategy estrategiaRecordatorio;

    /**
     * 
     */
    private String mensaje;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private String destinatario;

    /**
     * @param recodatorio 
     * @return
     */
    public void enviarRecordatorio(RecordatorioDTO recodatorio) {
        // TODO implement here
    }

    /**
     * @param estrategiaRecordatorio 
     * @return
     */
    public void setEstrategia(RecordatorioStrategy estrategiaRecordatorio) {
        // TODO implement here
    }

}