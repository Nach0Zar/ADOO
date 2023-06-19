package modelos;

import estrategias.recordatorio.RecordatorioPorWhatsApp;
import estrategias.recordatorio.RecordatorioPorEmail;
import estrategias.recordatorio.RecordatorioPorSMS;
import estrategias.recordatorio.RecordatorioStrategy;
import modelos.dtos.RecordatorioDTO;
import enums.TipoNotificacion;

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

   
    public void setEstrategia(TipoNotificacion tipoNotificacion) {
        //Los Recordatorios 
        switch(tipoNotificacion){
            case EMAIL:
                this.estrategiaRecordatorio = new RecordatorioPorEmail();
                break;
            case SMS:
                this.estrategiaRecordatorio = new RecordatorioPorSMS();
                break;
            case WHATSAPP:
                this.estrategiaRecordatorio = new RecordatorioPorWhatsApp();
                break;
        }

    }

}