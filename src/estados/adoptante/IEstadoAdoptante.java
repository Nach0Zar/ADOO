package estados.adoptante;


import java.util.*;

import modelos.Animal;
import modelos.ClienteAdoptante;

/**
 * 
 */
public interface IEstadoAdoptante {

    /**
     * @param animal 
     * @param clienteAdoptante 
     * @return
     */
    public void adopcionrAnimal(Animal animal, ClienteAdoptante clienteAdoptante);

}