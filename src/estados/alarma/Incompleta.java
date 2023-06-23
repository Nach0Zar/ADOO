package estados.alarma;

import estrategias.accion.Accion;

/**
 * 
 */
public class Incompleta implements IEstadoAccion {

    public Incompleta() {
    }

    /**
     * @param Alarma alarma
     * @return
     */
    @Override
    public void atenderAccion(Accion accion) {
        System.out.println("Atendiendo accion: " + accion.getNombre());
        accion.setEstadoAlarma(new Completa());
    }

    @Override
    public boolean getFinalizada() {
        // TODO Auto-generated method stub
        return false;
    }

}