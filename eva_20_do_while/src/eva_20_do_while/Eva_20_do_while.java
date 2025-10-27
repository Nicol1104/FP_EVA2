/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_20_do_while;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva_20_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu=new Scanner(System.in);
        int opcion;
        do{
        System.out.println("menu principal....");
        System.out.println("Preciona la opcion");
        System.out.println("1.pedidos");
        System.out.println("2.provedores");
        System.out.println("3.Facturacion");
        System.out.println("4.Salir");
        opcion=captu.nextInt();
        switch(opcion){
            case 1:
                System.out.println("pedidos del sistema");
                break;
            case 2 :
            System.out.println("provedores del sistema");
            break;
             case 3 :
            System.out.println("Facturacion del sistema");
            break;
       
        }
        }while(opcion!=4);//esto segnifica mientras la opcion sea diferente de 4 
        System.out.println("Fin del programa");
    }
    
}
