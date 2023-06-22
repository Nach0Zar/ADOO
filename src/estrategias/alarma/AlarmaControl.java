package estrategias.alarma;

import java.util.ArrayList;
import java.util.Scanner;

public class AlarmaControl implements ITipoAlarma {

    // atributos
    private ArrayList<Accion> acciones;

    // constructor
    public AlarmaControl() {

        acciones = new ArrayList<Accion>();
        crearAlarma();
    }

    public void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma de control");
        Scanner entradaNombre = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese el nombre de la accion, utilize 'x' para salir");
            String nombreAccion = entradaNombre.nextLine();

            if (nombreAccion.equals("x")) {
                break;
            }

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = entradaNombre.nextLine();

            Accion accion = new Accion(nombreAccion, descripcionAccion);
            acciones.add(accion);// aca guardamos las acciones de la alarma tratamiento
        }
        entradaNombre.close();
        System.out.println("La alarma quedo seteada para el CONTROL del animal");
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

}
