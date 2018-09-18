package clase1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[4][5];

        int contador = 1;
        int fila, columna, sumFila, sumColumna;

        System.out.println("Introduce 20 números enteros en un array");
        for(fila = 0; fila < 4; fila++) {
            for(columna = 0; columna < 5; columna++) {
                System.out.print("Número "+ contador + ":\t");
                array[fila][columna] = sc.nextInt();
                contador++;
            }
        }
        sc.close();

        //Filas y suma filas
        for(fila = 0; fila < 4; fila++) {
            sumFila = 0;
            for(columna = 0; columna < 5; columna++) {
                System.out.print("|\t" +  array[fila][columna] + "\t");
                sumFila += array[fila][columna];
            }
            System.out.print("|\t" + sumFila + "\n");
        }

        //suma total
        int sumaTotal = 0;
        for(columna = 0; columna < 5; columna++) {
            sumColumna = 0;
            for(fila = 0; fila < 4; fila++) {
                sumColumna += array[fila][columna];
            }

            sumaTotal += sumColumna;
            System.out.print("|\t" + sumColumna + "\t");
        }
        System.out.print("|\t" + sumaTotal);

    }
}