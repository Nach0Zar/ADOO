package estrategias.recordatorio;


import java.util.*;

import modelos.dtos.RecordatorioDTO;

/**
 * 
 */
public interface RecordatorioStrategy {

    /**
     * @param recordatorio 
     * @return
     */
    public void enviarRecordatorio(RecordatorioDTO recordatorio);

}