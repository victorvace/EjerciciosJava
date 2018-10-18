package poo;

import java.util.Scanner;

class Cuenta {
    public double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getBalance() {
        return saldo;
    }

    public void deposit (double deposito) {
        this.saldo = this.saldo + deposito;
    }

    public void withdrar (double retirar) {
        this.saldo = this.saldo - retirar;
    }

    @Override
    public String toString() {
        return "El saldo es de " + saldo + ".";
    }
}
public class Actividad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cuenta c = new Cuenta(10000.0);
        System.out.println("Saldo:" + c.getBalance());
        System.out.println("Cuanto dinero quieres depositar");
        c.deposit(sc.nextDouble());
        System.out.println(c.toString());
        System.out.println("Cuanto dinero quieres retirar");
        c.withdrar(sc.nextDouble());
        System.out.println(c.toString());
        System.out.println(c);
    }

}
