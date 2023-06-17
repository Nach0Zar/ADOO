package modelos.dtos;

import modelos.ClienteAdoptante;

import java.util.*;
public class RecordatorioDTO {

    private ClienteAdoptante destinatario;
    private String mensaje;
    private Date fecha;
    public RecordatorioDTO(String mensaje, Date fecha, ClienteAdoptante destinatario) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.destinatario = destinatario;
    }
    public ClienteAdoptante getDestinatario() {
        return destinatario;
    }
    public String getMensaje() {
        return mensaje;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setDestinatario(ClienteAdoptante destinatario) {
        this.destinatario = destinatario;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}