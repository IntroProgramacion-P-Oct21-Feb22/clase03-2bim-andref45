/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}};
        /*
        10      41      40
        1       2       3
         */
        int suma = 0;
        int valor;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];
                if (fila == col) {
                    suma = suma + valor;
                    System.out.printf("Sumando la posición %d, %d\n",
                            fila,
                            col);
                }

            }
        }
        System.out.println();
        System.out.printf("Suma de valores del arreglo: %d\n", suma);
    }

}
