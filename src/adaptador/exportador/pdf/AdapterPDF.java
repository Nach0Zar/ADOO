package adaptador.exportador.pdf;

import modelos.dtos.FichaMedicaDTO;

public class AdapterPDF implements AdapterExportadorPDF {

    public AdapterPDF() {
    }

    /**
     * @param fichaMedica 
     * @return void
     */
    @Override
    public void exportarFichaMedica(FichaMedicaDTO fichaMedica) {
        System.out.println(
                "Se ha exportado la ficha medica de legajo: "+ fichaMedica.getLegajo() + " en formato PDF"
        );
    }

}