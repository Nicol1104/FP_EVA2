/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_tic_tac_toe;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_19_tic_tac_toe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tictac[][]=new int [3][3];
        int fila, col,jug;
        Scanner captu = new Scanner (System.in);
        for (int i=0; i<10;i++){
            System.out.println("Introduce tu jugada.fila ");
            fila=captu.nextInt();
             System.out.println("Introduce tu jugada.fila ");
               col=captu.nextInt();
                 System.out.println("Jugador (1 o 2) ");
                    jug=captu.nextInt();
        }
         for(int j=0; j<tictac.length; j++){
            for(int l=0; l<tictac[j].length; l++){
                System.out.println("{"+tictac[j][l]+"]");
            }
               System.out.println();
        } 
            
    }
    
}
