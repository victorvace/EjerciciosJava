package clase1;

import java.util.Scanner;

public class Ejercicio6 {

    final static double g = 9.81;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desde que altura en metros cae el objeto?");
        double metros = sc.nextDouble();
        sc.close();

        double tiempo = Math.sqrt(2*metros/g);
        System.out.println("Tarda: " + tiempo);
    }
}
