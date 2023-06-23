package adaptador.recordatorio.whatsapp;

import modelos.dtos.RecordatorioDTO;
import color.ConsoleColors;

public class AdapterWhatsApp implements AdapterRecordadorWhatsApp {
    public AdapterWhatsApp() {
    }

    /**
     * @param recordatorio 
     * @return
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        System.out.println(ConsoleColors.GREEN + 
                "Se ha enviado un mensaje por Whatsapp al numero " + recordatorio.getDestinatario().getTelefono()
                        + " del Cliente Adoptante " + recordatorio.getDestinatario().getNombre()
                        + " " + recordatorio.getDestinatario().getApellido() +
                        " en la fecha " + recordatorio.getFecha() + " con el mensaje: \"" + recordatorio.getMensaje() + "\"" + ConsoleColors.RESET
        );
    }

}