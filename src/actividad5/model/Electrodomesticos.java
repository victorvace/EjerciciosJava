package actividad5.model;

public class Electrodomesticos {

    protected double precioBase = 200;
    protected String color = "blanco";
    protected char consumoEnergetico = 'B';
    protected double peso = 5;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A') this.consumoEnergetico = letra;
        if (letra == 'B') this.consumoEnergetico = letra;
        if (letra == 'C') this.consumoEnergetico = letra;
        if (letra == 'D') this.consumoEnergetico = letra;
        if (letra == 'E') this.consumoEnergetico = letra;
        if (letra == 'F') this.consumoEnergetico = letra;
    }

    public void comprobarColor(String color) {
        if (color.toLowerCase().equals("blanco")) this.color = color;
        if (color.toLowerCase().equals("metal")) this.color = color;
        if (color.toLowerCase().equals("rojo")) this.color = color;
        if (color.toLowerCase().equals("verde")) this.color = color;
        if (color.toLowerCase().equals("azúl")) this.color = color;
    }

    public void precioFinal() {
        if (this.consumoEnergetico == 'A') this.precioBase += 100;
        if (this.consumoEnergetico == 'B') this.precioBase += 85;
        if (this.consumoEnergetico == 'C') this.precioBase += 60;
        if (this.consumoEnergetico == 'D') this.precioBase += 50;
        if (this.consumoEnergetico == 'E') this.precioBase += 30;
        if (this.consumoEnergetico == 'F') this.precioBase += 10;
        if (this.peso > 0 && this.peso < 19) this.precioBase += 10;
        if (this.peso > 20 && this.peso < 49) this.precioBase += 50;
        if (this.peso > 50 && this.peso < 79) this.precioBase += 80;
        if (this.peso > 80) this.precioBase += 100;
    }

}
