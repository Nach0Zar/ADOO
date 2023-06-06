package estrategias.recordatorio;


import java.util.*;

import adaptador.recordatorio.whatsapp.AdapterRecordadorWhatsApp;
import modelos.dtos.RecordatorioDTO;

/**
 * 
 */
public class RecordatorioPorWhatsApp implements RecordatorioStrategy {

    /**
     * Default constructor
     */
    public RecordatorioPorWhatsApp() {
    }

    /**
     * 
     */
    private AdapterRecordadorWhatsApp adapter;

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