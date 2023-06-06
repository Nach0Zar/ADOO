package estados.alarma;


import java.util.*;

import modelos.Alarma;

/**
 * 
 */
public interface IEstadoAlarma {

    /**
     * @param Alarma alarma 
     * @return
     */
    public void atenderAlarma(Alarma alarma);

}