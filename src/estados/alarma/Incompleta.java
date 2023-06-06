package estados.alarma;


import java.util.*;

import modelos.Alarma;

/**
 * 
 */
public class Incompleta implements IEstadoAlarma {

    /**
     * Default constructor
     */
    public Incompleta() {
    }

    /**
     * 
     */
    private Alarma alarma;

    /**
     * @param Alarma alarma 
     * @return
     */
    @Override
    public void atenderAlarma(Alarma alarma) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atenderAlarma'");
    }

}