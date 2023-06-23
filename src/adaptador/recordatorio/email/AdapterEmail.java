package adaptador.recordatorio.email;

import modelos.dtos.RecordatorioDTO;
import color.ConsoleColors;
/**
 * 
 */
public class AdapterEmail implements AdapterRecordadorEmail {

    /**
     * Default constructor
     */
    public AdapterEmail() {
    }

    /**
     * @param recordatorio 
     * @return
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        System.out.println(ConsoleColors.GREEN + 
                "Se ha enviado un mensaje por Email al correo " + recordatorio.getDestinatario().getEmail()
                        + " del Cliente Adoptante " + recordatorio.getDestinatario().getNombre()
                        + " " + recordatorio.getDestinatario().getApellido() +
                        " en la fecha " + recordatorio.getFecha() + " con el mensaje: \"" + recordatorio.getMensaje() + "\"" + ConsoleColors.RESET
        );
    }

}