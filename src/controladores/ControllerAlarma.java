package controladores;

import java.util.ArrayList;
import modelos.Alarma;

public class ControllerAlarma {
    
    private ArrayList<Alarma> alarmas;
    
    private static ControllerAlarma instancia;

    private ControllerAlarma() {
        alarmas = new ArrayList<Alarma>();
    }

    public static ControllerAlarma getInstancia(){
        if (instancia == null)
            instancia = new ControllerAlarma();
        return instancia;
    }

    public void crearAlarma(Alarma alarma) {
        this.alarmas.add(alarma);
    }
    
    private Alarma buscarAlarma(int numeroAlarma) {
        for (Alarma alarma : alarmas) {
            if (alarma.soyAlarma(numeroAlarma)) {
                return alarma;
            }
        }
        return null;
    }

    public void atenderAlarma(int numeroAlarma) {
        Alarma alarma = buscarAlarma(numeroAlarma);
        alarma.atenderAlarma();
    }

    public void enviarNotificacion(int numeroAlarma) {
        Alarma alarma = buscarAlarma(numeroAlarma);
        alarma.enviarNotificacion();
    }    
}