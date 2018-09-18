package poo;

import java.util.ArrayList;


class Polynomial {

    private int degree;
    private ArrayList<Double> coeff;

    public Polynomial() {
        degree = 0;
        coeff = new ArrayList<>();
        coeff.add(0.0);
    }

    public Polynomial(String coefficient) {
        String[] arr = coefficient.split("\\s");
        double k;
        coeff = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            k = Double.parseDouble(arr[i]);
            coeff.add(k);
        }
        degree = coeff.size() - 1;
    }

    public Polynomial(int degree2, ArrayList<Double> coefficient) {

        degree = degree2;
        coeff = new ArrayList();

        for (int i = 0; i < coefficient.size(); i++) {
            coeff.add(coefficient.get(i));
        }
    }

    public static void negate(Polynomial a) {
        for (int i = 0; i <= a.degree; i++) {
            a.coeff.set(i, -1 * a.coeff.get(i));
        }
    }

    public static Polynomial add(Polynomial a, Polynomial b) {

        Polynomial addP = new Polynomial();

        int aS = a.coeff.size();
        int bS = b.coeff.size();
        int max = Math.max(aS, bS);

        addP.degree = max - 1;
        addP.coeff.set(0, a.coeff.get(0) + b.coeff.get(0));

        for (int i = 1; i <= max; i++) {
            addP.coeff.add(0.0);
        }
        for (int i = 1; i < aS; i++) {
            addP.coeff.set(i, addP.coeff.get(i) + a.coeff.get(i));
        }
        for (int i = 1; i < bS; i++) {
            addP.coeff.set(i, addP.coeff.get(i) + b.coeff.get(i));
        }

        return addP;
    }

    public static Polynomial substract(Polynomial a, Polynomial b) {

        Polynomial subs;
        negate(b);
        subs = add(a, b);
        return subs;
    }

    public static Polynomial multiply(Polynomial a, Polynomial b) {

        Polynomial addP = new Polynomial();

        int aS = a.coeff.size();
        int bS = b.coeff.size();
        int max = Math.max(aS, bS);

        addP.degree = max - 1;
        addP.coeff.set(0, a.coeff.get(0) * b.coeff.get(0));

        for (int i = 1; i <= max; i++) {
            addP.coeff.add(0.0);
        }
        for (int i = 1; i < aS; i++) {
            addP.coeff.set(i, addP.coeff.get(i) * a.coeff.get(i));
        }
        for (int i = 1; i < bS; i++) {
            addP.coeff.set(i, addP.coeff.get(i) * b.coeff.get(i));
        }

        return addP;
    }

    public int equals(Polynomial x){

        return 0;

    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "degree=" + degree +
                ", coeff=" + coeff +
                '}';
    }
}

public class Actividad3 {
    public static void main(String[] args) {

    }
}
