package estrategias.exportacion;

import java.util.*;

import adaptador.exportador.excel.AdapterExportadorExcel;
import modelos.dtos.FichaMedicaDTO;

public class ExportacionExcel implements ExportacionStrategy {

    public ExportacionExcel(AdapterExportadorExcel adapter) {
        this.adapter = adapter;
    }

    AdapterExportadorExcel adapter;

    /**
     * @param fichaMedica 
     * @return void
     */
    @Override
    public void exportarFichaMedica(FichaMedicaDTO fichaMedica) {
        this.adapter.exportarFichaMedica(fichaMedica);
    }

}