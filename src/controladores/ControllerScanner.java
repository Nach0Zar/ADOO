package controladores;

import java.util.Scanner;


public class ControllerScanner {

   private Scanner scanner;
   private static ControllerScanner instancia;

   private ControllerScanner(){
      scanner = new Scanner(System.in);
   }

   public static ControllerScanner getInstancia() {
      if (instancia == null)
         instancia = new ControllerScanner();
      return instancia;
   }

   public String proxLinea(){
      return scanner.nextLine();
   }

   public void cerrarScanner(){
      scanner.close();
   }
}


