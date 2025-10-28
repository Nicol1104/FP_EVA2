/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_27_break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner captu=new Scanner(System.in);
        int valor,adivinar;
        do{
            adivinar=(int)(Math.random()*5);
            System.out.println("Adivina el numero.-1 para terminar el juego");//por que no hacepta numeros negativos 
            valor=captu.nextInt();
            if(valor==adivinar)
                 System.out.println("Adivinastes");
            else if(valor==-1){
                 System.out.println("Gracias por jugar!!");
                 break;//termina la ejecucion del ciclo
            }else{
                System.out.println("No adivinastes!!!!!");
            }
        }while(true);//condicion para repetir "true"
        
    }
    
}
