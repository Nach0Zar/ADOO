package estados.alarma;

import estrategias.accion.Accion;

/**
 * 
 */
public class Completa implements IEstadoAccion {

    public Completa() {
    }

    @Override
    public void atenderAccion(Accion accion) {
        System.out.println("Acción ya atendida");
    }

    @Override
    public boolean getFinalizada() {
        return true;
    }

}