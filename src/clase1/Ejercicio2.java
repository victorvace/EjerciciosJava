package clase1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.print("Introduce un número de un máximo de 4 cifras: ");
            x = sc.nextInt();
            sc.close();
        } while (x < 1 || x > 9999);
        System.out.println(x + " en números romanos es: " + numerosRomanos(x));
    }

    public static String numerosRomanos(int numero){
        int miles, centenas, decenas, unidades, i;
        String numeroRomano = "";
        miles = numero/1000;
        centenas = numero/100 % 10;
        decenas = numero/10 % 10;
        unidades = numero % 10;

        if ( miles == 9 ) {
            numeroRomano = numeroRomano + "IX";
        } else if ( miles == 8 ) {
            numeroRomano = numeroRomano + "VIII";
        } else if ( miles == 7 ) {
            numeroRomano = numeroRomano + "VII";
        } else if ( miles == 6 ) {
            numeroRomano = numeroRomano + "VI";
        } else if ( miles == 5 ) {
            numeroRomano = numeroRomano + "V";
        } else if ( miles == 4 ) {
            numeroRomano = numeroRomano + "IV";
        } else {
            for (i = 1; i <= miles; i++) {
                numeroRomano = numeroRomano + "M";
            }
        }

        if (centenas == 9) {
            numeroRomano = numeroRomano + "CM";
        } else if (centenas >= 5) {
            numeroRomano = numeroRomano + "D";
            for (i = 6; i <= centenas; i++) {
                numeroRomano = numeroRomano + "C";
            }
        } else if (centenas == 4) {
            numeroRomano = numeroRomano + "CD";
        } else {
            for (i = 1; i <= centenas; i++) {
                numeroRomano = numeroRomano + "C";
            }
        }

        if (decenas == 9) {
            numeroRomano = numeroRomano + "XC";
        } else if (decenas >= 5) {
            numeroRomano = numeroRomano + "L";
            for (i = 6; i <= decenas; i++) {
                numeroRomano = numeroRomano + "X";
            }
        } else if (decenas == 4) {
            numeroRomano = numeroRomano + "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                numeroRomano = numeroRomano + "X";
            }
        }

        if (unidades == 9) {
            numeroRomano = numeroRomano + "IX";
        } else if (unidades >= 5) {
            numeroRomano = numeroRomano + "V";
            for (i = 6; i <= unidades; i++) {
                numeroRomano = numeroRomano + "I";
            }
        } else if (unidades == 4) {
            numeroRomano = numeroRomano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                numeroRomano = numeroRomano + "I";
            }
        }

        return numeroRomano;
    }
}
