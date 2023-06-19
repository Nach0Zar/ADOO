package estados.alarma;

import modelos.Alarma;

/**
 * 
 */
public class Completa implements IEstadoAlarma {

    public Completa( ) {
    }

    @Override
    public void atenderAlarma(Alarma alarma) {
        System.out.println("Alarma ya atendida");
    }

}