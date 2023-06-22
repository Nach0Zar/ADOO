package estrategias.alarma;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.Tratamiento;

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

    public void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma de tratamiento");
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
        System.out.println("La alarma quedo seteada para el TRATAMIENTO del animal");
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
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
