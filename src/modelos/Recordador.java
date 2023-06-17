package modelos;


import java.util.*;

import estrategias.recordatorio.RecordatorioStrategy;
import modelos.dtos.RecordatorioDTO;

public class Recordador {
    public Recordador(RecordatorioStrategy recordatorioStrategy) {
        this.estrategiaRecordatorio = recordatorioStrategy;
    }
    private RecordatorioStrategy estrategiaRecordatorio;

    /**
     * @param recodatorio 
     * @return void
     */
    public void enviarRecordatorio(RecordatorioDTO recodatorio) {
        this.estrategiaRecordatorio.enviarRecordatorio(recodatorio);
    }

    /**
     * @param estrategiaRecordatorio 
     * @return void
     */
    public void setEstrategia(RecordatorioStrategy estrategiaRecordatorio) {
        this.estrategiaRecordatorio = estrategiaRecordatorio;
    }

}