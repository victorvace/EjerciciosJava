package clase1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int numero;
        ArrayList arrayList = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números vas a añadir?");
        int iteracion = sc.nextInt();

        for (int a = 0; a < iteracion; a++) {
            System.out.println("Introduce el número " + (a+1) + ":");
            numero = sc.nextInt();
            arrayList.add(numero);
        }
        sc.close();

        System.out.println("Los números se han introducido en este orden: ");
        System.out.println(arrayList);
        System.out.println("Los números en orden inverso son así: ");
        Collections.reverse(arrayList);
        System.out.println(arrayList);


    }
}
