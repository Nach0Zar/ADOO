package estados.alarma;

import modelos.Alarma;

/**
 * 
 */
public class Incompleta implements IEstadoAlarma {

    private Alarma alarma;
  
    public Incompleta(Alarma alarma) {
        this.alarma = alarma;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

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