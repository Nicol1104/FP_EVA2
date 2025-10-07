/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_13_numeros_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //3 50
         Scanner captu = new Scanner (System.in);
          int num1,num2;
         System.out.println("Primer numero :");
         num1=captu.nextInt();
          System.out.println("Segundo numero:");
         num2=captu.nextInt();
    
    for(int i=num1;i<=num2;i++){
        int resi=i%2;
        if(resi==0)
             System.out.println(i+"-");
    }
    }
    
}
