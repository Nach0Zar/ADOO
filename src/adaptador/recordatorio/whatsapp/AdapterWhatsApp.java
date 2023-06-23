package adaptador.recordatorio.whatsapp;

import modelos.dtos.RecordatorioDTO;

public class AdapterWhatsApp implements AdapterRecordadorWhatsApp {
    public AdapterWhatsApp() {
    }

    /**
     * @param recordatorio 
     * @return
     */
    @Override
    public void enviarRecordatorio(RecordatorioDTO recordatorio) {
        System.out.println(
                "Se ha enviado un mensaje por Whatsapp al numero " + recordatorio.getDestinatario().getTelefono()
                        + " del Cliente Adoptante " + recordatorio.getDestinatario().getNombre()
                        + " " + recordatorio.getDestinatario().getApellido() +
                        " en la fecha " + recordatorio.getFecha() + " con el mensaje: \"" + recordatorio.getMensaje() + "\""
        );
    }

}