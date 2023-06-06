package estrategias.recordatorio;


import java.util.*;

import adaptador.recordatorio.sms.AdapterRecordadorSMS;
import modelos.dtos.RecordatorioDTO;

/**
 * 
 */
public class RecordatorioPorSMS implements RecordatorioStrategy {

    /**
     * Default constructor
     */
    public RecordatorioPorSMS() {
    }

    /**
     * 
     */
    private AdapterRecordadorSMS adapter;

    /**
     * @param recordatorio 
     * @return
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarRecordatorio'");
    }

}