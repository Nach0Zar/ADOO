package estrategias.exportacion;

import java.util.*;

import adaptador.exportador.excel.AdapterExportadorExcel;
import modelos.dtos.FichaMedicaDTO;

public class ExportacionPDF implements ExportacionStrategy {

    public ExportacionPDF(AdapterExportadorExcel adapter) {
        this.adapter = adapter;
    }

    AdapterExportadorExcel adapter;

    /**
     * @param fichaMedica 
     * @return
     */

    @Override
    public void exportarFichaMedica(FichaMedicaDTO fichaMedica) {
        System.out.println(
                "Se ha exportado la ficha medica en formato PDF"
        );
    }

}