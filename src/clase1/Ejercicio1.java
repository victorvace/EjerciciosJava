package clase1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un año: ");
        int any = sc.nextInt();

        if (anyBixest(any)) {
            System.out.println("Bisiesto");
        } else {
            System.out.println("No bisiesto");
        }

    }

    public static boolean anyBixest(int any){
        return ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0)))?  false : true;
    }
}
