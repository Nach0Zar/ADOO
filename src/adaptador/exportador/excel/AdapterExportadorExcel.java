package adaptador.exportador.excel;

import java.util.*;

import modelos.dtos.FichaMedicaDTO;

public interface AdapterExportadorExcel {

    /**
     * @param fichaMedica 
     * @return void
     */
    public void exportarFichaMedica(FichaMedicaDTO fichaMedica);

}