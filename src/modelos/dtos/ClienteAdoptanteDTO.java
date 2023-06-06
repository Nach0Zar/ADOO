package modelos.dtos;

import java.util.List;

public class ClienteAdoptanteDTO {
    /**
     * Default constructor
     */
    public ClienteAdoptanteDTO() {
    }

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public String apellido;
    /**
     * 
     */
    public String estadoCivil;
    /**
     * 
     */
    public String email;
    /**
     * 
     */
    public String telefono;
    /**
     * 
     */
    public String ocupacion;
    /**
     * 
     */
    public List<String> tipoDeAnimalesInteresados;
    /**
     * 
     */
    public int cantidadAdopciones;
}
