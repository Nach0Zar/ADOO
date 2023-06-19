package modelos;

import estrategias.recordatorio.RecordatorioPorWhatsApp;
import estrategias.recordatorio.RecordatorioStrategy;
import modelos.dtos.RecordatorioDTO;

public class Recordador {
    
    private RecordatorioStrategy estrategiaRecordatorio;

    public Recordador() {
        this.estrategiaRecordatorio = new RecordatorioPorWhatsApp();
    }
    /**
     * @param recodatorio 
     * @return void
     */
    public void enviarRecordatorio(RecordatorioDTO recodatorio) {
        this.estrategiaRecordatorio.enviarRecordatorio(recodatorio);
    }

    /**
     * @param estrategiaRecordatorio 
     * @return void
     */
    public void setEstrategia(RecordatorioStrategy estrategiaRecordatorio) {
        this.estrategiaRecordatorio = estrategiaRecordatorio;
    }

}