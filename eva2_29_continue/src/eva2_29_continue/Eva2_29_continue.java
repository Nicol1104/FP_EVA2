/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_continue;

/**
 *
 * @author nikol
 */
public class Eva2_29_continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // continue -->detiene la interaccion (repeticion)actual
        //imprimir numeros pares
        for(int i =0; i<100; i++){
            int resi=1%2;
            if(resi !=0)
                continue;//aqui se interupe el ciclo
            System.out.println(i+"-");
        }
    }
    
}
