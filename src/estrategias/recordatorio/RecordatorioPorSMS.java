package estrategias.recordatorio;

import adaptador.recordatorio.sms.AdapterRecordadorSMS;
import modelos.dtos.RecordatorioDTO;
public class RecordatorioPorSMS implements RecordatorioStrategy {
    public RecordatorioPorSMS(AdapterRecordadorSMS adapter) {
        this.adapter = adapter;
    }
    private AdapterRecordadorSMS adapter;

    /**
     * @param recordatorio 
     * @return void
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        this.adapter.enviarRecordatorio(recordatorio);
    }

}