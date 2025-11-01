/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_34_primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu=new Scanner (System.in);
        int num,contador=0;
        System.out.println("Escribe el numero");
        num=captu.nextInt();
          for(int i=1;i<=num;i++){
        if(num % i==0){
            contador++;
        }
     
    }
          if(contador == 2){
              System.out.println(num+"Es primo");
          }else{
              System.out.println(num+"No es primo");
          }
    }
    
}
