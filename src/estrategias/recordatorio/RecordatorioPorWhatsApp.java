package estrategias.recordatorio;

import adaptador.recordatorio.whatsapp.AdapterRecordadorWhatsApp;
import adaptador.recordatorio.whatsapp.AdapterWhatsApp;
import modelos.dtos.RecordatorioDTO;

public class RecordatorioPorWhatsApp implements RecordatorioStrategy {
    
    private AdapterRecordadorWhatsApp adapter;
    
    public RecordatorioPorWhatsApp() {
        this.adapter = new AdapterWhatsApp();
    }

    public RecordatorioPorWhatsApp(AdapterRecordadorWhatsApp adapter) {
        super();
        this.adapter = adapter;
    }
 
    /**
     * @param recordatorio
     * @return
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        this.adapter.enviarRecordatorio(recordatorio);
    }

}