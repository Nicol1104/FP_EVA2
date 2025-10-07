/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_10_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        // TODO code application logic here
        //imprimir del 1 al 20
          System.out.println("");//sirve para salto de linea en los damas ejecuciones 
        for(int i=1; i <= 20 ; i++)
            System.out.println(i+ "-");
        //imprimir al reves
          System.out.println("");
        for(int i=20; i>=1; i--)
             System.out.println(i+ "-");
        //imprimir los pares de 0 a 100
        //0-2-4-6-8......98-100
        //+=,-=,*=,/=
         System.out.println("");
        for( int i=0; i<=100;i+=2)
            System.out.println(i+"-");
        //imprimir en orden inverso
          System.out.println("");
        for(int i=100; i>=0;i-=2)
            System.out.println(i+"-");
        //solicitar dos  numeros al usuario, imprimir la lista
        //entre esos numeros 
         //en orden inverso
         int num1,num2;
         System.out.println("Primer numero :");
         num1=captu.nextInt();
          System.out.println("Segundo numero:");
         num2=captu.nextInt();
//         for(int i=num1;i<=num2;i++)
             System.out.println(i+"-");
             
    //orden inverso
    for(int i=num2;i>=num1;i--)
             System.out.println(i+"-");
        
    }
    
}
