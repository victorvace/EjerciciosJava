package actividad5.view;

import actividad5.model.Electrodomesticos;
import actividad5.model.Lavadora;
import actividad5.model.Television;

public class ElectrodomesticoView {
    public static void show(Electrodomesticos[] arrayElec){
        System.out.println("El precio de los televisores:");
        for (int i = 0; i < arrayElec.length; i++) {
            if (arrayElec[i] instanceof Television) {
                System.out.println(arrayElec[i].getPrecioBase());
            }
        }

        System.out.println("El precio de las lavadoras:");
        for (int i = 0; i < arrayElec.length; i++) {
            if (arrayElec[i] instanceof Lavadora) {
                System.out.println(arrayElec[i].getPrecioBase());
            }
        }

        System.out.println("El precio de los electrodomésticos:");
        for (int i = 0; i < arrayElec.length; i++) {
            if (arrayElec[i] instanceof Electrodomesticos) {
                System.out.println(arrayElec[i].getPrecioBase());
            }
        }



    }
}
