/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_15_captura_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int tema;
        System.out.println("¿Cuatas calificaciones quieres capturar?");
        tema=captu.nextInt();
        int califa[]=new int [tema];
        //captura
        for(int i =0; i<califa.length;i++){
            System.out.println("Calificacion #"+(i+1)+":");
        califa[i]=captu.nextInt();
        }
        //lectura 
        for(int i =0; i<califa.length;i++){
            System.out.println("["+califa[i]+"]");
        }
        //promedio del grupo?
        //sumar todas las calificaciones 
        int sumaCalifa =0;
        for(int i =0; i<califa.length;i++){
             sumaCalifa= sumaCalifa+califa[i];
             //sumaCalifa+= califa[i]
         
        }
           System.out.println("acumulado="+ sumaCalifa);
           double promedio= sumaCalifa/(double )califa.length;
            System.out.println("promedio:"+ promedio);
    }
    
}
