package estrategias.alarma;

import java.util.ArrayList;

import modelos.dtos.AccionDTO;

/**
 * 
 */
public interface ITipoAlarma {
    public ArrayList<AccionDTO> getAccionesDTO();
}