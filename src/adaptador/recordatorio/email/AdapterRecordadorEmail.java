package adaptador.recordatorio.email;

import java.util.*;

import modelos.dtos.RecordatorioDTO;

public interface AdapterRecordadorEmail {

    /**
     * @param recordatorio 
     * @return void
     */
    public void enviarRecordatorio(RecordatorioDTO recordatorio);

}