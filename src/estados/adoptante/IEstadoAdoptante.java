package estados.adoptante;

import modelos.Adopcion;
import modelos.Animal;
import modelos.ClienteAdoptante;

public interface IEstadoAdoptante {

    public void adopcionAnimal(Animal animal, ClienteAdoptante clienteAdoptante, Adopcion adopcion);
    // TODO No se utiliza en ningun lado, lo implementamos o lo borramos?
}