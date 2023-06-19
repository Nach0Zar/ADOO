package modelos.dtos;

import java.util.*;

public class RecordatorioDTO {

    private ClienteAdoptanteDTO destinatario;
    private String mensaje;
    private Date fecha;
    public RecordatorioDTO(String mensaje, Date fecha, ClienteAdoptanteDTO destinatario) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.destinatario = destinatario;
    }
    public ClienteAdoptanteDTO getDestinatario() {
        return destinatario;
    }
    public String getMensaje() {
        return mensaje;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setDestinatario(ClienteAdoptanteDTO destinatario) {
        this.destinatario = destinatario;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}