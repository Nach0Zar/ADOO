package estados.alarma;

import estrategias.accion.Accion;

/**
 * 
 */
public class Completa implements IEstadoAccion {

    public Completa() {
    }

    @Override
    public void atenderAlarma(Accion accion) {
        System.out.println("Alarma ya atendida");
    }

}