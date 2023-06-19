package estrategias.alarma;

import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public interface ITipoAlarma {

    /**
     * @param alarma 
     * @return
     */
    public void crearAlarma(AlarmaDTO alarma);

}