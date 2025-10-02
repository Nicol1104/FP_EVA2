/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_fp_examne1;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva_2_fp_examne1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int natacion,ciclismo,carrera;
        int tiempoTotal;
        Scanner captu= new Scanner (System.in);
        System.out.println("Tienmpo en natacion:");
        natacion=captu.nextInt();
         System.out.println("Tienmpo enciclismo:");
       ciclismo=captu.nextInt();
         System.out.println("Tienmpo en carrera:");
       carrera=captu.nextInt();
       tiempoTotal=natacion+ciclismo+carrera;
       if((tiempoTotal < 120 )&&((natacion < 60 )&&(ciclismo 60 )&&(carrera < 60)))
       System.out.println("Excelente");
    else if ((tiempoTotal < 150)||((natacion < 70)&&(ciclismo < 70)&&(carrera <70)))
               System.out.println("Excelente");
    else
            System.out.println("Regular");

    }
    
}
