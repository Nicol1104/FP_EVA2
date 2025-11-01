/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_32_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor,resu=1;
        System.out.println("Escribe el numero a sacar");
        valor=captu.nextInt();
        for(int i=1; i<=valor; i++){
            resu=resu*1;
        }
         System.out.println("El resultado es"+resu);
        
    }
    
}
