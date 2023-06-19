package modelos.dtos;

public class AdopcionDTO {

    private AnimalDTO animal;
    private ClienteAdoptanteDTO cliente;
    private int numeroAdopcion;
    private String motivoAdopcion;

    public AdopcionDTO(AnimalDTO animal, ClienteAdoptanteDTO cliente, int numeroAdopcion, String motivoAdopcion) {
        this.animal = animal;
        this.cliente = cliente;
        this.numeroAdopcion = numeroAdopcion;
        this.motivoAdopcion = motivoAdopcion;
    }

    public AnimalDTO getAnimalDTO() {
        return animal;
    }

    public ClienteAdoptanteDTO getClienteDTO() {
        return cliente;
    }

    public int getNumeroAdopcion() {
        return numeroAdopcion;
    }

    public String getMotivoAdopcion() {
        return motivoAdopcion;
    }

}
