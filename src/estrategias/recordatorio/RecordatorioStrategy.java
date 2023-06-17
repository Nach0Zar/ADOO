package estrategias.recordatorio;


import java.util.*;

import modelos.dtos.RecordatorioDTO;

/**
 * 
 */
public interface RecordatorioStrategy {

    /**
     * @param recordatorio 
     * @return void
     */
    public void enviarRecordatorio(RecordatorioDTO recordatorio);

}