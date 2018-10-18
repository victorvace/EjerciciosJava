package clase1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radio");
        double radio = sc.nextDouble();
        System.out.println("Altura");
        double altura = sc.nextDouble();
        sc.close();

        double volumen  = ((Math.PI*(Math.pow(radio, 2))*altura)/3);
        System.out.println("Volumen del cono: " + volumen);
    }

}
