package modelos;


import java.util.*;

import estrategias.exportacion.ExportacionStrategy;
import modelos.dtos.FichaMedicaDTO;

/**
 * 
 */
public class Exportador {

    /**
     * Default constructor
     */
    public Exportador() {
    }

    /**
     * 
     */
    private ExportacionStrategy estrategiaExportacion;

    /**
     * @param fichaMedica
     */
    public void exportarFichaMedica(FichaMedicaDTO fichaMedica) {
        // TODO implement here
    }

    /**
     * @param estrategiaExportacion 
     * @return
     */
    public void setEstrategia(ExportacionStrategy estrategiaExportacion) {
        // TODO implement here
    }

}