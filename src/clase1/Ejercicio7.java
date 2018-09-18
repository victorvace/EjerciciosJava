package clase1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números vas a añadir?");
        int numeros = sc.nextInt();

        ArrayList arrayList = new ArrayList();
        int contador = 0;

        for ( int i = 0; i < numeros; i++) {
            System.out.println("Introduce el número " + (i+1) + " de " + numeros + "." );
            arrayList.add(sc.nextInt());
        }
        sc.close();

        for (int i = 0; i < arrayList.size(); i++) {
            contador = contador + (int) arrayList.get(i);
        }

        double media = contador/arrayList.size();
        System.out.println("La media de los " + arrayList.size() + " números es: " + media);

    }
}
