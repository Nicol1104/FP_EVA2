/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_acumuladores;

/**
 *
 * @author nikol
 */
public class Eva2_16_acumuladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acum=1000;
        System.out.println(acum);
        //el igual en este caso esta diciendo que en la variable acum se le van acumular lo demas  
        acum = acum+200;
         System.out.println(acum);
         acum=acum+500;
          System.out.println(acum);
          acum=acum-1200;
           System.out.println(acum);
           //es lo mismo  nada mas diferente escrito
           acum=+100;//acum =acum+100; 
         System.out.println(acum);
    }
    
}
