package adaptador.exportador.excel;

import modelos.dtos.FichaMedicaDTO;

public class AdapterExcel implements AdapterExportadorExcel {
    
    public AdapterExcel() {
    }

    /**
     * @param fichaMedica 
     * @return void
     */
    @Override
    public void exportarFichaMedica(FichaMedicaDTO fichaMedica) {
        System.out.println(
                "Se ha exportado la ficha medica en formato Excel"
        );
    }

}