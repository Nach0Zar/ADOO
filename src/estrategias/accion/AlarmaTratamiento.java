package estrategias.accion;

import java.util.ArrayList;

import modelos.Tratamiento;
import modelos.dtos.AccionDTO;
import singleton.Escaner;

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

    @Override
    public void atenderAlarma() {
        System.out.println("Ejecutando alarma de tratamiento");
        for (Accion accion : acciones) {
            System.out.println("Ejecutando accion: " + accion.getNombre());
            System.out.println("Descripcion: " + accion.getDescripcion());
        }
        System.out.println("Alarma de tratamiento atendida");
    }

    private void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma de tratamiento");
        while (true) {
            System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
            String nombreAccion = Escaner.getInstancia().proxLinea();

            if (nombreAccion.equals("x")) {
                break;
            }

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = Escaner.getInstancia().proxLinea();

            Accion accion = new Accion(nombreAccion, descripcionAccion);
            acciones.add(accion);// aca guardamos las acciones de la alarma tratamiento
        }
        if (acciones.size() > 0)
            System.out.println("La alarma quedo seteada para el TRATAMIENTO del animal");
        else
            System.out.println("La alarma sin acciones no puede ser creada");
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public ArrayList<AccionDTO> getAccionesDTO() {
        ArrayList<AccionDTO> accionesDTO = new ArrayList<AccionDTO>();
        for (Accion accion : acciones) {
            AccionDTO accionDTO = new AccionDTO(accion.getNombre(), accion.getDescripcion());
            accionesDTO.add(accionDTO);
        }
        return accionesDTO;
    }
}
