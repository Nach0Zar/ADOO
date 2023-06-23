package estrategias.accion;

import estados.alarma.IEstadoAccion;

public class Accion {

    private String nombre;
    private String descripcion;
    private IEstadoAccion estadoAlarma;

    public Accion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.estadoAlarma = new estados.alarma.Incompleta(); // por default esta en incompleta
        this.descripcion = descripcion;
    }

    public void atenderAlarma() {// una vez completada , no puede volver a estar incompleta
        this.estadoAlarma.atenderAlarma(this);
    }

    public IEstadoAccion getEstadoAlarma() {
        return estadoAlarma;
    }

    public void setEstadoAlarma(IEstadoAccion estadoAlarma) {
        this.estadoAlarma = estadoAlarma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
