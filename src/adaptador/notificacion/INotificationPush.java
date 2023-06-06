package adaptador.notificacion;


import java.util.*;

import modelos.dtos.AlarmaDTO;

/**
 * 
 */
public interface INotificationPush {

    /**
     * @param AlarmaDTO alarmaNotf 
     * @return
     */
    public void enviarNotificacion(AlarmaDTO alarmaNotf);

}