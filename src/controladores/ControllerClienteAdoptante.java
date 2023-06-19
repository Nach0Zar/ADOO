package controladores;

import java.util.*;
import modelos.*;
import modelos.dtos.*;

public class ControllerClienteAdoptante{
    private ArrayList <ClienteAdoptante> clientes;
    private static ControllerClienteAdoptante instancia;

    public ControllerClienteAdoptante(){
        clientes = new ArrayList<ClienteAdoptante>();
    }

    public static ControllerClienteAdoptante getInstancia(){
        if (instancia == null)
            instancia = new ControllerClienteAdoptante();
        return instancia;
    }

    public void crearCliente(ClienteAdoptanteDTO clienteAdoptanteDTO) {
        ClienteAdoptante clienteAdoptante = new ClienteAdoptante(
            clienteAdoptanteDTO.getNombre(), 
            clienteAdoptanteDTO.getApellido(),
            clienteAdoptanteDTO.getEstadoCivil(),
            clienteAdoptanteDTO.getEmail(),
            clienteAdoptanteDTO.getTelefono(),
            clienteAdoptanteDTO.getOcupacion(),
            clienteAdoptanteDTO.getTipoDeAnimalesInteresados(),
            clienteAdoptanteDTO.getOtrasMascotas(),
            clienteAdoptanteDTO.getTipoNotificacion(),
            clienteAdoptanteDTO.getMotivoAdopcion(),
            clienteAdoptanteDTO.getCantidadAdopciones()
         );
        this.clientes.add(clienteAdoptante);
    }

    


}