package clase1;

public class Ejercicio13 {
    public static void main(String[] args) {
        int resultadoPartido;
        int columnas = 3;

        for (int fila = 1; fila <= 15; fila++) {
            System.out.print(fila + "\t-> ");

            if (fila == 15) {
                columnas = 1;
            }

            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
                resultadoPartido = (int)(Math.random() * 3);
                switch(resultadoPartido) {
                    case 0:
                        System.out.print(" X |");
                        break;
                    case 1:
                        System.out.print(" 1 |");
                        break;
                    case 2:
                        System.out.print(" 2 |");
                    default:
                }
            }
            System.out.println();
        }
    }
}
