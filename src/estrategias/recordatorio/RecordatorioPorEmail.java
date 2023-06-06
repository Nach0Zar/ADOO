package estrategias.recordatorio;


import java.util.*;

import adaptador.recordatorio.email.AdapterRecordadorEmail;
import modelos.dtos.RecordatorioDTO;

/**
 * 
 */
public class RecordatorioPorEmail implements RecordatorioStrategy {

    /**
     * Default constructor
     */
    public RecordatorioPorEmail() {
    }

    /**
     * 
     */
    private AdapterRecordadorEmail adapter;

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