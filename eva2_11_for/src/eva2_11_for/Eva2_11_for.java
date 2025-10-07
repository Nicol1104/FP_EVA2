/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_11_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir:");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de repeticiones:");
        rep = captu.nextInt();
        for(int i=0; i<rep;i++)
            System.out.println(mensaje);
        
        
        
    }
    
}
