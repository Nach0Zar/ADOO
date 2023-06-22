package controladores;

import java.time.Duration;
import java.util.ArrayList;

import estrategias.alarma.AlarmaControl;
import estrategias.alarma.AlarmaTratamiento;
import estrategias.alarma.ITipoAlarma;
import modelos.Alarma;
import modelos.Animal;
import modelos.FichaMedica;
import modelos.Tratamiento;
import modelos.Usuario;
import modelos.dtos.AlarmaDTO;

public class ControllerAlarma {

    private static ControllerAlarma instancia;

    private ArrayList<Alarma> alarmas;

    private ControllerAlarma() {
        alarmas = new ArrayList<Alarma>();
    }

    public static ControllerAlarma getInstancia() {
        if (instancia == null)
            instancia = new ControllerAlarma();
        return instancia;
    }

    public int crearAlarma(
            Duration periodicidad,
            int legajoAnimal,
            String emailVeterinario) {
        ITipoAlarma tipoAlarma = new AlarmaControl();
        Animal animal = ControllerAnimal.getInstancia().obtenerAnimal(legajoAnimal);
        Usuario veterinario = ControllerUsuario.getInstancia().buscarUsuario(emailVeterinario);
        Alarma alarma = new Alarma(periodicidad, animal, tipoAlarma, veterinario);
        this.alarmas.add(alarma);

        return alarma.getNumeroAlarma();
    }

    public int crearAlarma(
            Duration periodicidad,
            int legajoAnimal,
            String emailVeterinario,
            int numeroDetratamiento) {
        Animal animal = ControllerAnimal.getInstancia().obtenerAnimal(legajoAnimal);
        Usuario veterinario = ControllerUsuario.getInstancia().buscarUsuario(emailVeterinario);
        FichaMedica fichaMedica = ControllerFichaMedica.getInstancia().buscarFichaMedica(legajoAnimal);
        Tratamiento tratamiento = fichaMedica.buscarTratamiento(numeroDetratamiento);
        ITipoAlarma tipoAlarma = new AlarmaTratamiento(tratamiento);
        Alarma alarma = new Alarma(periodicidad, animal, tipoAlarma, veterinario);
        this.alarmas.add(alarma);

        return alarma.getNumeroAlarma();
    }

    protected Alarma buscarAlarma(int numeroAlarma) {
        for (Alarma alarma : alarmas) {
            if (alarma.soyAlarma(numeroAlarma)) {
                return alarma;
            }
        }
        return null;
    }

    public AlarmaDTO obtenerAlarmaDTO(int numeroAlarma) {
        Alarma alarma = buscarAlarma(numeroAlarma);
        return alarma.toDTO();
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