package estrategias.alarma;

import java.util.ArrayList;
import java.util.Scanner;

public class AlarmaControl implements ITipoAlarma {
    
    //atributos
    private ArrayList<Accion> acciones;    

    //constructor
    public AlarmaControl() {
        
        acciones = new ArrayList<Accion>();
        crearAlarma();
    }
    
    public void crearAlarma() {
        System.out.println("Ingrese las acciones a realizar para esta alarma, utilize -1 para salir");
        Scanner entradaNombre = new Scanner(System.in); 
        while (true){
            System.out.println("Ingrese el nombre de la accion");
            String nombreAccion = entradaNombre.nextLine();

            //TODO: fix this
            if (nombreAccion == "-1") {
                break;
            }

            System.out.println("Ingrese la descripcion de la accion");
            String descripcionAccion = entradaNombre.nextLine();

            Accion accion = new Accion(nombreAccion, descripcionAccion);
            acciones.add(accion);

        }
        entradaNombre.close();
        System.out.println("La alarma quedo seteada para el control del animal");     
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

}
