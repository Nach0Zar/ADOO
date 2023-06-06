package adaptador.recordatorio.sms;


import java.util.*;

import modelos.dtos.RecordatorioDTO;

/**
 * 
 */
public interface AdapterRecordadorSMS {

    /**
     * @param recordatorio 
     * @return
     */
    public void enviarRecordatorio(RecordatorioDTO recordatorio);

}