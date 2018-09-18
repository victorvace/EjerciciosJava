package clase1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número");
        int num = sc.nextInt();

        String str = String.valueOf(num) ;

        char[] valor = str.toCharArray();
        String respuesta = null;

        for (int i = valor.length-1; i>-1; i--) {
            respuesta+= valor[i]+ " ";
        }
        System.out.print(respuesta);
    }
}
