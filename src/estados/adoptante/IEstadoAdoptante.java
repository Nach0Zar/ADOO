package estados.adoptante;


import java.util.*;

import modelos.Adopcion;
import modelos.Animal;
import modelos.ClienteAdoptante;


public interface IEstadoAdoptante {


    public void adopcionAnimal(Animal animal, ClienteAdoptante clienteAdoptante , Adopcion adopcion);

}