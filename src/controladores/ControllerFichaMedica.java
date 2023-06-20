package controladores;


import java.util.*;

import estrategias.exportacion.ExportacionExcel;
import estrategias.exportacion.ExportacionPDF;
import modelos.FichaMedica;
import modelos.Tratamiento;
import modelos.Animal;
import modelos.dtos.FichaMedicaDTO;
import controladores.ControllerAnimal;
import enums.TipoExportacion;

/**
 * 
 */
public class ControllerFichaMedica {

    private ArrayList<FichaMedica> fichasMedicas;
    private static ControllerFichaMedica instancia;

    private ControllerFichaMedica() {
        fichasMedicas = new ArrayList<FichaMedica>();
    }

    public static ControllerFichaMedica getInstancia() {
        if (instancia == null)
            instancia = new ControllerFichaMedica();
        return instancia;
    }

    public void agregarFichaMedica(FichaMedica fichaMedica) {
        fichasMedicas.add(fichaMedica);
    }

    protected FichaMedica buscarFichaMedica(int legajo ) {
        FichaMedica fichaM = null;
        for (FichaMedica FichaMedica : fichasMedicas) {
            if (FichaMedica.getLegajo() == (legajo)) {
                fichaM = FichaMedica;
                break;
            }
        }
        return fichaM;
    }

    //acá esta tipoExportacion es un String, no un enum. Hay que cambiarlo
    public void exportarFichaMedica(int legajo, TipoExportacion tipoExportacion) {
        FichaMedica ficha = buscarFichaMedica(legajo);
        //Hay que crear los export
        switch(tipoExportacion){
            case PDF:
                ficha.getExportador().setEstrategia(new ExportacionPDF());
                break;
            case EXCEL:
                ficha.getExportador().setEstrategia(new ExportacionExcel());
                break;
        }
        ficha.exportarFichaMedica();
    }

    public void agregarTratamiento(int legajoFichaMedica, String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
        FichaMedica fichaMedica = buscarFichaMedica(legajoFichaMedica);
        fichaMedica.agregarTratamiento(new Tratamiento(nombre, descripcion, fechaInicio, fechaFin));
    }

    public void crearTratamiento(String nombre, String descripcion, Date fechaInicio, Date fechaFin , int legajo) {
            Animal animal = ControllerAnimal.getInstancia().obtenerAnimal(legajo);
            if(animal.getEstadoSaludableAnimal()){                                      //Siempre que el estado no sea saludable, tiene un tratamiento activo
                Tratamiento tratamiento = new Tratamiento(nombre, descripcion, fechaInicio, fechaFin);
                animal.getFichaMedica().agregarTratamiento(tratamiento);
                ControllerAnimal.getInstancia().setEstadoSaludableAnimal(legajo, false);
                System.out.println("Se ha creado el tratamiento: " + tratamiento.getNombre() + " con id: " + tratamiento.getNumeroTratamiento());
            }else{
                System.out.println("Ya existe un tratamiento en curso, no se puede crear otro");
            }
        }

        public void finalizarTratamiento(int legajo, int numeroTratamiento) {
            Animal animal = ControllerAnimal.getInstancia().obtenerAnimal(legajo);
            Tratamiento tratamiento = animal.getFichaMedica().buscarTratamiento(numeroTratamiento);
            tratamiento.setFinalizado(true);
            ControllerAnimal.getInstancia().setEstadoSaludableAnimal(legajo, true);
            System.out.println("Ha finalizado el tratamiento: " + tratamiento.getNombre());
        }

        protected FichaMedica obtenerFichaMedica(int legajo){
            for (FichaMedica fichaMedica : fichasMedicas){
                if (fichaMedica.getLegajo() == legajo){
                    return fichaMedica;
                }
            }
        return null;
        }
        
        public FichaMedicaDTO obtenerFichaMedicaDTO(int legajo){
            FichaMedica fichaMedica = this.obtenerFichaMedica(legajo);
            if(fichaMedica instanceof FichaMedica){
                return fichaMedica.toDTO();
            }
            return null;
        }
}