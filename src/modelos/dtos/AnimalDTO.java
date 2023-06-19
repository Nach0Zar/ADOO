package modelos.dtos;

import enums.TipoAnimal;

import modelos.FichaMedica;


public class AnimalDTO {

    private Boolean domestico;
    private Float altura;
    private Float peso;
    private int edad;
    private Boolean estadoSaludableAnimal;
    private TipoAnimal tipoDeAnimal;
    private String nombre;
    private String legajo;
    private FichaMedica fichaMedica;

    public AnimalDTO(Boolean domestico, Float altura, Float peso, int edad, Boolean estadoSaludableAnimal, TipoAnimal tipoDeAnimal, String nombre, String legajo, FichaMedica fichaMedica) {
        this.domestico = domestico;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.estadoSaludableAnimal = estadoSaludableAnimal;
        this.tipoDeAnimal = tipoDeAnimal;
        this.nombre = nombre;
        this.legajo = legajo;
        this.fichaMedica = fichaMedica;
    }

    public void setDomestico(Boolean domestico) {
        this.domestico = domestico;
    }

    public Boolean getDomestico() {
        return this.domestico;
    }
        
    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getAltura() {
        return this.altura;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    public Float getPeso() {
        return this.peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEstadoSaludableAnimal(Boolean estadoSaludableAnimal) {
        this.estadoSaludableAnimal = estadoSaludableAnimal;
    }

    public Boolean getEstadoSaludableAnimal() {
        return this.estadoSaludableAnimal;
    }

    public void setTipoDeAnimal(TipoAnimal tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public TipoAnimal getTipoDeAnimal() {
        return this.tipoDeAnimal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getLegajo() {
        return this.legajo;
    }

    public void setFichaMedica(FichaMedica fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    public FichaMedica getFichaMedica() {
        return this.fichaMedica;
    }

}