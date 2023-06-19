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
    public void enviarNotificacion(AlarmaDTO alarmaNotf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarNotificacion'");
    }

}