/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while_pwd;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Eva2_21_do_while_pwd {
final static String USUARIO="admi";
final static String PWD="admi";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu= new Scanner (System.in);
        String usu,contra;
        do{
        System.out.println("Acceso al sistema....");
        System.out.println("Usuario:");
        usu=captu.nextLine();
        System.out.println("Contraseña");
         contra=captu.nextLine();
        }while(!(usu.equals(USUARIO)&& contra.equals(PWD)));
        System.out.println("Bienvenido al sistemsa:");
    }
    
}
