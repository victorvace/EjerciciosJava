package clase1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la base");
        int base = sc.nextInt();
        System.out.println("Escribe el exponente");
        int exponente = sc.nextInt();
        sc.close();

        double potencia = Math.pow(base, exponente);
        System.out.println("La potencia de la base " + base + " y el exponente " + exponente + " es: " + potencia);
    }
}
