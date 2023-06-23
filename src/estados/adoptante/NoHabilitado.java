package estados.adoptante;

import modelos.Adopcion;
import modelos.Animal;
import modelos.ClienteAdoptante;

/**
 * 
 */
public class NoHabilitado implements IEstadoAdoptante {

    @Override
    public void adopcionAnimal(Animal animal, ClienteAdoptante clienteAdoptante, Adopcion adopcion) {
        System.out.println("NO esta habilitada la adopcion del animal");
    }

}