package controladores;


import java.util.*;

import modelos.FichaMedica;
import modelos.dtos.FichaMedicaDTO;

/**
 * 
 */
public class ControllerFichaMedica {

    private ArrayList<FichaMedica> fichasMedicas;
    private static ControllerFichaMedica instancia;

    public ControllerFichaMedica() {
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

    protected FichaMedica buscarFichaMedica(String legajo) {
        FichaMedica fichaM = null;
        for (FichaMedica FichaMedica : fichasMedicas) {
            if (FichaMedica.getLegajo().equals(legajo)) {
                fichaM = FichaMedica;
                break;
            }
        }
        return fichaM;
    }

    //acá esta tipoExportacion es un String, no un enum. Hay que cambiarlo
    public void exportarFichaMedica(String legajo, String tipoExportacion) {
        FichaMedica ficha = buscarFichaMedica(legajo);
        //Por que me agrega anObject?
        //Hay que crear los export
        if (tipoExportacion.equals("Excel")) {
            ficha.getExportador().setEstrategiaExportacion(new ExportarExcel());
            System.out.println("Se ha exportado en Excel");
        }
        if (tipoExportacion.equals("PDF")) {
            ficha.getExportador().setEstrategiaExportacion(new ExportarPDF());
            System.out.println("Se ha exportado en PDF");
        }

    }

    public void agregarTratamiento(String legajo, String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
        FichaMedica ficha = buscarFichaMedica(legajo);
        fichaMedica.agregarTratamiento(nombre, descripcion, fechaInicio, fechaFin);
    }

}