package controladores;


import java.util.*;

import estrategias.exportacion.ExportacionExcel;
import estrategias.exportacion.ExportacionPDF;
import modelos.FichaMedica;
import modelos.Tratamiento;

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
    public void exportarFichaMedica(int legajo, String tipoExportacion) {
        FichaMedica ficha = buscarFichaMedica(legajo);
        //Hay que crear los export
        if (tipoExportacion.equals("Excel")) {
            ficha.getExportador().setEstrategia(new ExportacionExcel());
            System.out.println("Se ha exportado en Excel");
        }
        if (tipoExportacion.equals("PDF")) {
            ficha.getExportador().setEstrategia(new ExportacionPDF());
            System.out.println("Se ha exportado en PDF");
        }

    }

    public void agregarTratamiento(int legajoFichaMedica, String nombre, String descripcion, Date fechaInicio, Date fechaFin) {
        FichaMedica fichaMedica = buscarFichaMedica(legajoFichaMedica);
        fichaMedica.agregarTratamiento(new Tratamiento(nombre, descripcion, fechaInicio, fechaFin));
    }

}