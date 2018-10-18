package actividad5.model;

public class Television extends Electrodomesticos{

    private int resolucion = 20;
    private boolean tdt = false;

    public Television() {
        super();
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void precioFinal(){
        System.out.println(super.precioBase);
        if (this.resolucion > 40) super.precioBase += (super.precioBase * 0.3);
        if (tdt) super.precioBase += 50;
        System.out.println(super.precioBase);
    }
}
