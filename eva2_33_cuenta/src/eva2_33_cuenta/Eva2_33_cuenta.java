/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_33_cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int saldo,reti;
        System.out.println("Bienvenido");
         System.out.println("su saldo inicial es :$");
          saldo=captu.nextInt();
             while(saldo>=0){
                 System.out.println("Cuanto quieres retirar?");
                 reti=captu.nextInt();
                 saldo-=reti;
            if(saldo<=0){
                 System.out.println("Tu cuenta esta en rojos!!!!!");
            }else if(saldo==0){
                System.out.println("Ya no tienes dinero!!!!!");
                System.out.println("saldo restante!!!!!"+saldo);
            }else{
                System.out.println("Sigues con dinero!!!!!");
            }
        }
    }
    
}
