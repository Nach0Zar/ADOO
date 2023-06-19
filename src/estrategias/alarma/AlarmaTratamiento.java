package estrategias.alarma;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.Tratamiento;

public class AlarmaTratamiento implements ITipoAlarma{
    //atributos
    private ArrayList<Accion> acciones;
    private Tratamiento tratamiento;

    //constructor
    public AlarmaTratamiento(Tratamiento tratamiento) {        
        acciones = new ArrayList<Accion>();
        this.tratamiento = tratamiento;
        crearAlarma();
    }
    
    public void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma, utilize -1 para salir");
        while (true){
            System.out.println("Ingrese el nombre de la accion");
            Scanner entradaNombre = new Scanner(System.in); 
            String nombreAccion = entradaNombre.nextLine();
            entradaNombre.close();

            if (nombreAccion.equals("-1")) {
                break;
            }

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = entradaNombre.nextLine();

            Accion accion = new Accion(nombreAccion, descripcionAccion);
            acciones.add(accion);

        }
        System.out.println("La alarma quedo seteada para el control del animal");        
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
