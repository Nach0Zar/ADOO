package estados.alarma;

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