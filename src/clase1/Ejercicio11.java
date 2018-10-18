package clase1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos números vas a insertar?");
        int n = sc.nextInt();

        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i<n; i++){
            System.out.print("Introduce el número " + (i+1) + ":");
            if (sc.nextDouble() < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }

        System.out.println(positivos + " números positivos y " + negativos + " números negativos");
    }
}
