package actividad5.model;

public class Lavadora extends Electrodomesticos {

    private double carga = 5;

    public Lavadora() {
        super();
    }

    public Lavadora(double precioBase,  double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void precioFinal(){
        if (this.carga > 80) super.precioBase += 50;
    }


}
