package modelos;

import java.util.*;

import estrategias.alarma.ITipoAlarma;
import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public class AlarmaControl implements ITipoAlarma {

    private List<Accion> acciones;

    public AlarmaControl(List<Accion> acciones) {
        this.acciones = acciones;
    }

    public List<Accion> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<Accion> acciones) {
        this.acciones = acciones;
    }

    /**
     * @param AlarmaDTO alarma
     */
    @Override
    public void crearAlarma(AlarmaDTO alarma) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearAlarma'");
    }



}