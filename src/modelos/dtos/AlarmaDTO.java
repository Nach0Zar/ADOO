package modelos.dtos;

import java.util.Date;
import java.time.Duration;
import estrategias.alarma.ITipoAlarma;


public class AlarmaDTO {

    private int numeroAlarma;
    private Duration periodicidad;
    private AnimalDTO animalDTO;
    private boolean alarmaAtendida;
    private ITipoAlarma tipoAlarma;
    private UsuarioDTO usuarioDTO;
    private Date ultimaEjecucion;

    public AlarmaDTO(int numeroAlarma, Duration periodicidad, AnimalDTO animalDTO, Boolean estadoAlarma,
            ITipoAlarma tipoAlarma, UsuarioDTO usuarioDTO, Date ultimaEjecucion2) {
        this.numeroAlarma = numeroAlarma;
        this.periodicidad = periodicidad;
        this.animalDTO = animalDTO;
        this.alarmaAtendida = estadoAlarma;
        this.tipoAlarma = tipoAlarma;
        this.usuarioDTO = usuarioDTO;
        this.ultimaEjecucion = ultimaEjecucion2;
    }

    public int getNumeroAlarma() {
        return numeroAlarma;
    }

    public Duration getPeriodicidad() {
        return periodicidad;
    }

    public AnimalDTO getAnimalDTO() {
        return animalDTO;
    }

    public boolean getAlarmaAtendida() {
        return alarmaAtendida;
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public Date getUltimaEjecucion() {
        return ultimaEjecucion;
    }  

    
}