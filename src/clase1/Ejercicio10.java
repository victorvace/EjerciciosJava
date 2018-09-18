package clase1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el símbolo a dibujar: ");
        String simbolo = sc.next();
        sc.close();

        System.out.println();
        for(int altura = 1; altura<=filas; altura++){
            for(int espacio = 1; espacio<=filas-altura; espacio++){
                System.out.print(" ");
            }

            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}
