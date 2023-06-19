package estados.adoptante;

import modelos.Animal;
import modelos.ClienteAdoptante;
import modelos.Adopcion;

/**
 * 
 */
public class Habilitado implements IEstadoAdoptante {

    @Override
    public void adopcionAnimal(Animal animal, ClienteAdoptante clienteAdoptante, Adopcion adopcion) {
        if (clienteAdoptante.getCantidadAdopciones() >= 2 || animal.getTipoDeAnimal().equals("salvaje") ||
                animal.getEstadoSaludableAnimal() == true) {
            adopcion.cambiarEstado(new NoHabilitado());// cambio del estado
            System.out.println("Adopcion en estado NO habilitada");
        } else {
            clienteAdoptante.setCantidadAdopciones(clienteAdoptante.getCantidadAdopciones() + 1);
            System.out.println("Adopcion confirmada!");
        }
    }

}