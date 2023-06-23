package adaptador.recordatorio.sms;

import modelos.dtos.RecordatorioDTO;
import color.ConsoleColors;

public class AdapterSMS implements AdapterRecordadorSMS {
    public AdapterSMS() {
    }

    /**
     * @param recordatorio 
     * @return
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        System.out.println(ConsoleColors.GREEN + 
                "Se ha enviado un mensaje por SMS al numero " + recordatorio.getDestinatario().getTelefono()
                        + " del Cliente Adoptante " + recordatorio.getDestinatario().getNombre()
                        + " " + recordatorio.getDestinatario().getApellido() +
                        " en la fecha " + recordatorio.getFecha() + " con el mensaje: \"" + recordatorio.getMensaje() + "\"" + ConsoleColors.RESET
        );
    }

}