package estrategias.recordatorio;

import java.util.*;

import adaptador.recordatorio.email.AdapterRecordadorEmail;
import modelos.dtos.RecordatorioDTO;

public class RecordatorioPorEmail implements RecordatorioStrategy {
    public RecordatorioPorEmail(AdapterRecordadorEmail adapter) {
        this.adapter = adapter;
    }
    private AdapterRecordadorEmail adapter;

    /**
     * @param recordatorio 
     * @return void
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        this.adapter.enviarRecordatorio(recordatorio);
    }

}