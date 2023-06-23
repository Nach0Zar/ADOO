package adaptador.notificacion;

import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public class AdapterNotificacionPush implements INotificationPush {

    /**
     * Default constructor
     */
    public AdapterNotificacionPush() {
    }

    /**
     * @param AlarmaDTO alarmaNotf 
     * @return
     */
    @Override
    public void enviarNotificacion(AlarmaDTO alarmaDTO) {
        System.out.println("Enviando notificacion push del animal " + alarmaDTO.getAnimalDTO().getNombre());
    }

}