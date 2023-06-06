package modelos;

import java.util.*;

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