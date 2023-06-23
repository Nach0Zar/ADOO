package estrategias.accion;

import java.util.ArrayList;

import modelos.dtos.AccionDTO;
import singleton.Escaner;

public class AlarmaControl implements ITipoAlarma {

    // atributos
    private ArrayList<Accion> acciones;

    // constructor
    public AlarmaControl() {

        acciones = new ArrayList<Accion>();
        crearAlarma();
    }

    @Override
    public void atenderAlarma() {
        System.out.println("Se esta atendiendo la alarma de control");
        for (Accion accion : acciones) {
            System.out.println("Se esta realizando la accion: " + accion.getNombre());
            System.out.println("Descripcion: " + accion.getDescripcion());
        }
        System.out.println("Se termino de atender la alarma de control");
    }

    private void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma de control ");
         System.out.println("ACCIONES POSIBLES : Control de parasitos | Colocar antiparasitarios | Comprobar peso y tamanio | Chequear nutricion | Colocar vacuna ");
        while (true) {
            System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
            String nombreAccion = Escaner.getInstancia().proxLinea();

            if (nombreAccion.equals("x")) {
                break;
            }

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = Escaner.getInstancia().proxLinea();

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
