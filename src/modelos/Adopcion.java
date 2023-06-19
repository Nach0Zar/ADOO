package modelos;

import estados.adoptante.Habilitado;
import estados.adoptante.IEstadoAdoptante;
import modelos.dtos.RecordatorioDTO;

public class Adopcion {

    private static int numeradorAdopcion = 1;

    private Animal animal;
    private ClienteAdoptante cliente;
    private int numeroAdopcion;
    private String motivoAdopcion;
    private Seguimiento seguimiento;
    private IEstadoAdoptante estadoAdopcion;

    public Adopcion(Animal animal, ClienteAdoptante cliente, String motivoAdopcion) {
        this.animal = animal;
        this.cliente = cliente;
        this.numeroAdopcion = numeradorAdopcion++;
        this.motivoAdopcion = motivoAdopcion;
        this.seguimiento = new Seguimiento();// creamos el seguimiento cuando creamos la adopcion
        this.estadoAdopcion = new Habilitado(); // Va estar hablitado
    }

    public void adopcionNueva(ClienteAdoptante cliente, Animal animal) {
        estadoAdopcion.adopcionAnimal(animal, cliente, this);
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setCliente(ClienteAdoptante cliente) {
        this.cliente = cliente;
    }

    public void setMotivoAdopcion(String motivoAdopcion) {
        this.motivoAdopcion = motivoAdopcion;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

    public void cambiarEstado(IEstadoAdoptante estadoAdopcion) {
        this.estadoAdopcion = estadoAdopcion;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public ClienteAdoptante getCliente() {
        return this.cliente;
    }

    public Integer getnumeroAdopcion() {
        return this.numeroAdopcion;
    }

    public String getMotivoAdopcion() {
        return this.motivoAdopcion;
    }

    public Seguimiento getSeguimiento() {
        return this.seguimiento;
    }

    public IEstadoAdoptante getEstadoAdopcion() {
        return this.estadoAdopcion;
    }

    public void enviarNotificacion(RecordatorioDTO recordatorio) {
        this.seguimiento.enviarRecordatorio(recordatorio);
    }

}