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
    public void atenderAlarma(Accion accion) {
        System.out.println("atendiendo alarma");
        accion.setEstadoAlarma(new Completa());
    }

}