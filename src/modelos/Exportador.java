package modelos;

import java.util.*;

import estrategias.exportacion.ExportacionStrategy;
import modelos.dtos.FichaMedicaDTO;
public class Exportador {
    public Exportador(ExportacionStrategy estrategiaExportacion) {
        this.estrategiaExportacion = estrategiaExportacion;
    }
    private ExportacionStrategy estrategiaExportacion;

    /**
     * @param fichaMedica
     */
    public void exportarFichaMedica(FichaMedicaDTO fichaMedica) {
        this.estrategiaExportacion.exportarFichaMedica(fichaMedica);
    }

    /**
     * @param estrategiaExportacion 
     * @return
     */
    public void setEstrategia(ExportacionStrategy estrategiaExportacion) {
        this.estrategiaExportacion = estrategiaExportacion;
    }

}