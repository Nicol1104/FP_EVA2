/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_triangulo;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_30_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu =new Scanner (System.in);
        int fila,tri=1;
        System.out.println("Cuantas filas quieres que aparescan ");
        fila=captu.nextInt();
        System.out.println("simbolo "+fila+"Fila");
        do{
            for(int i=1; i<=tri;i++){
                System.out.println("*");
            }
            System.out.println("");
            tri++;
        }while(tri<=fila);
    }
}
