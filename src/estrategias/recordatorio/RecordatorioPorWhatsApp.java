package estrategias.recordatorio;


import adaptador.recordatorio.whatsapp.AdapterRecordadorWhatsApp;
import modelos.dtos.RecordatorioDTO;

public class RecordatorioPorWhatsApp implements RecordatorioStrategy {
    public RecordatorioPorWhatsApp(AdapterRecordadorWhatsApp adapter) {
        this.adapter =  adapter;
    }
    private AdapterRecordadorWhatsApp adapter;
    /**
     * @param recordatorio
     * @return
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        this.adapter.enviarRecordatorio(recordatorio);
    }

}