package controladores;

import java.util.ArrayList;
import modelos.Seguimiento;
import modelos.Adopcion;

public class ControllerSeguimiento {
    private ArrayList <Seguimiento> seguimientos;
    private static ControllerSeguimiento instancia;
	
    private ControllerSeguimiento() {
        seguimientos = new ArrayList<Seguimiento>();
    }

    public static ControllerSeguimiento getInstancia(){
        if (instancia == null)
            instancia = new ControllerSeguimiento();
        return instancia;
    }

    public void agregarSeguimientoAnimal(int id) {
        Adopcion adopcion = ControllerAdopcion.getInstancia().buscarAdopcion(id);
        this.seguimientos.add(adopcion.getSeguimiento());
    }



    
}
