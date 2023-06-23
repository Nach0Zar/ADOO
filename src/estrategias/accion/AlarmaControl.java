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
            accion.atenderAccion();
        }
        System.out.println("Se termino de atender la alarma de control");
    }

    private void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma de control");
        System.out.println("Acciones disponibles: ");
        System.out.println("1. Control de parasitos");
        System.out.println("2. Colocar antiparasitos");
        System.out.println("3. Comprobar peso y tamaño");
        System.out.println("4. Chequear nutricion");
        System.out.println("5. Colocar vacuna");

        System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
        String nombreAccion = Escaner.getInstancia().proxLinea();

        while (nombreAccion.equals("x")) {
            System.out.println("La alarma sin acciones no puede ser creada");
            System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
            nombreAccion = Escaner.getInstancia().proxLinea();
        }

        while (!nombreAccion.equals("x")) {

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = Escaner.getInstancia().proxLinea();

            Accion accion = new Accion(nombreAccion, descripcionAccion);
            acciones.add(accion);// aca guardamos las acciones de la alarma control

            System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
            nombreAccion = Escaner.getInstancia().proxLinea();
        }
        System.out.println("La alarma quedo seteada para el CONTROL del animal");
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
