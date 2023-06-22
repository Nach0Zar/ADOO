package estrategias.alarma;

import java.util.ArrayList;

import controladores.ControllerScanner;
import modelos.Tratamiento;
import modelos.dtos.AccionDTO;

public class AlarmaTratamiento implements ITipoAlarma {
    // atributos
    private ArrayList<Accion> acciones;
    private Tratamiento tratamiento;

    // constructor
    public AlarmaTratamiento(Tratamiento tratamiento) {
        acciones = new ArrayList<Accion>();
        this.tratamiento = tratamiento;
        crearAlarma();
    }

    private void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma de tratamiento");
        while (true) {
            System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
            String nombreAccion = ControllerScanner.getInstancia().proxLinea();

            if (nombreAccion.equals("x")) {
                break;
            }

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = ControllerScanner.getInstancia().proxLinea();

            Accion accion = new Accion(nombreAccion, descripcionAccion);
            acciones.add(accion);// aca guardamos las acciones de la alarma tratamiento
        }
        System.out.println("La alarma quedo seteada para el TRATAMIENTO del animal");
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

    
    public ArrayList<AccionDTO> getAccionesDTO() {
        ArrayList<AccionDTO> accionesDTO = new ArrayList<AccionDTO>();
        for (Accion accion : acciones) {
            AccionDTO accionDTO = new AccionDTO(accion.getNombre(), accion.getDescripcion());
            accionesDTO.add(accionDTO);
        }
        return accionesDTO;
    }

    public void setAcciones(ArrayList<Accion> acciones) {
        this.acciones = acciones;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

}
