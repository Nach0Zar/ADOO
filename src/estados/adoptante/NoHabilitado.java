package estados.adoptante;


import java.util.*;

import modelos.Animal;
import modelos.ClienteAdoptante;

/**
 * 
 */
public class NoHabilitado implements IEstadoAdoptante {

    /**
     * Default constructor
     */
    public NoHabilitado() {
    }

    /**
     * @param animal 
     * @param clienteAdoptante 
     * @return
     */
    @Override
    public void adopcionrAnimal(Animal animal, ClienteAdoptante clienteAdoptante) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adopcionrAnimal'");
    }

}