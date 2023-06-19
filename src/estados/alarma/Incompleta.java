package estados.alarma;

import modelos.Alarma;

/**
 * 
 */
public class Incompleta implements IEstadoAlarma {
  
    public Incompleta() {
    }

    /**
     * @param Alarma alarma 
     * @return
     */
    @Override
    public void atenderAlarma(Alarma alarma) {
        System.out.println("atendiendo alarma");
        alarma.setEstadoAlarma(new Completa());
    }

}