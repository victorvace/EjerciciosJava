package actividad5.controller;

import actividad5.model.Electrodomesticos;
import actividad5.model.Lavadora;
import actividad5.model.Television;
import actividad5.view.ElectrodomesticoView;

public class ElectrodomesticoController {

        private Electrodomesticos[] arrayElec = new Electrodomesticos[10];
        public void addInfo(){
            arrayElec[0] = new Television();
            arrayElec[1] = new Lavadora();
            arrayElec[2] = new Television(220, 20);
            arrayElec[3] = new Lavadora(200,100);
            arrayElec[4] = new Television(600, "metal", 'D', 80, 35 ,false);
            arrayElec[5] = new Lavadora(430, "azul", 'A', 250, 8);
            arrayElec[6] = new Television(1400,"blanco", 'A',120, 65, true);
            arrayElec[7] = new Lavadora(300, "rojo", 'B',230,6);
            arrayElec[8] = new Electrodomesticos();
            arrayElec[9] = new Electrodomesticos(50,"verde", 'F',5);

            for (int i = 0; i < arrayElec.length; i++){
                arrayElec[i].precioFinal();
            }

            ElectrodomesticoView.show(arrayElec);
        }
}
