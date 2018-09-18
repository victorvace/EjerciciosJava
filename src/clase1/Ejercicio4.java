package clase1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de kb a convertir en MB");
        double kb = sc.nextDouble();
        sc.close();

        double MB = kb/1024.0;

        System.out.println(kb + " Kilobyte/s son " + MB + " megabyte/s");

    }
}
