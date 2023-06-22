package estrategias.alarma;

import java.util.ArrayList;

import modelos.dtos.AccionDTO;
import controladores.ControllerScanner;

public class AlarmaControl implements ITipoAlarma {

    // atributos
    private ArrayList<Accion> acciones;

    // constructor
    public AlarmaControl() {

        acciones = new ArrayList<Accion>();
        crearAlarma();
    }

    private void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma de control");
        while (true) {
            System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
            String nombreAccion = ControllerScanner.getInstancia().proxLinea();

            if (nombreAccion.equals("x")) {
                break;
            }

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = ControllerScanner.getInstancia().proxLinea();

            Accion accion = new Accion(nombreAccion, descripcionAccion);
            acciones.add(accion);// aca guardamos las acciones de la alarma control
        }
        if (acciones.size() > 0)
            System.out.println("La alarma quedo seteada para el CONTROL del animal");
        else
            System.out.println("La alarma sin acciones no puede ser creada");
    }


    @Override
    public ArrayList<AccionDTO> getAccionesDTO() {
        ArrayList<AccionDTO> accionesDTO = new ArrayList<AccionDTO>();
        for (Accion accion : acciones) {
            AccionDTO accionDTO = new AccionDTO(accion.getNombre(), accion.getDescripcion());
            accionesDTO.add(accionDTO);
        }
        return accionesDTO;
    }

  
}
