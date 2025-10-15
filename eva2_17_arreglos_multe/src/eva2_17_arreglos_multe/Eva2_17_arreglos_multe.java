/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos_multe;

/**
 *
 * @author nikol
 */
public class Eva2_17_arreglos_multe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arreglo  de dos dimenciones 
        int matriz[][]= new int[3][4];
        //int cubo [][][]= new int[2][2][2];
        matriz [0][0]=100;
        matriz [0][1]=200;
        matriz [0][2]=300;
        matriz [0][3]=400;
          System.out.println(matriz.length);
           System.out.println(matriz [0].length);
           System.out.println(matriz [1].length);
           System.out.println(matriz [2].length);
           
        //ciclos anidados por que esta un for dentro de otro
        //un for dentro del otro para que funcione 
        //matriz [i][j] i=filas j =columnas 
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("{"+matriz[i][j]+"]");
            }
               System.out.println();
        } 
    }
    
}
