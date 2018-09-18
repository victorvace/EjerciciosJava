package poo;

import java.util.ArrayList;
import java.util.Scanner;

class Empresa {
    String nombre, anyodefundacion;

    public Empresa() {
    }

    public Empresa(String nombre, String anyodefundacion) {
        this.nombre = nombre;
        this.anyodefundacion = anyodefundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyodefundacion() {
        return anyodefundacion;
    }

    public void setAnyodefundacion(String anyodefundacion) {
        this.anyodefundacion = anyodefundacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anyodefundacion='" + anyodefundacion + '\'' +
                '}';
    }
}

class Empleado {

    String nombre, apellidos, fechanacimiento, fechaContrato;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String fechanacimiento, String fechaContrato) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.fechaContrato = fechaContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechanacimiento='" + fechanacimiento + '\'' +
                ", fechaContrato='" + fechaContrato + '\'' +
                '}';
    }

}

public class Actividad4 {
    public static void main(String[] args) {

        ArrayList<Empresa> listaEmpresa = new ArrayList<>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int selection;

        do {
            System.out.println("Selecciona una opción: ");
            System.out.println("1.\tCrear nueva empresa.");
            System.out.println("2.\tAñadir empleado a empresa existente.");
            System.out.println("3.\tListado de empresas.");
            System.out.println("4.\tInformacion de una empresa en particular.");
            System.out.println("5.\tCrear empleado.");
            System.out.println("6.\tListado de empleados.");
            System.out.println("7.\tInformación de un empleado en particular.");
            System.out.println("8.\tSalir");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    listaEmpresa.add(createCompany());
                    break;
                case 2:
                    // addEmployee();
                    break;
                case 3:
                    for (int i = 0; i < listaEmpresa.size(); i++) {
                        System.out.println((i + 1) + ".\t" + listaEmpresa.get(i).nombre);
                    }
                    break;
                case 4:
                    System.out.println("Selecciona una empresa:");
                    for (int i = 0; i < listaEmpresa.size(); i++) {
                        System.out.println((i + 1) + ".\t" + listaEmpresa.get(i).nombre);
                    }
                    int NumeroID = (sc.nextInt()-1);
                    System.out.println((NumeroID + 1) + ".\t" + listaEmpresa.get(NumeroID).nombre + "\tAño de fundación:\t" + listaEmpresa.get(NumeroID).anyodefundacion);
                    break;
                case 5:
                    listaEmpleados.add(createEmployee());
                    break;
                case 6:
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        System.out.println((i + 1) + ".\t" + listaEmpleados.get(i).nombre);
                    }
                    break;
                case 7:
                    System.out.println("Selecciona un empleado:");
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        System.out.println((i + 1) + ". " + listaEmpleados.get(i).getNombre());
                    }
                    int idEmpleado = (sc.nextInt()-1);
                    System.out.println((idEmpleado + 1) + ". " + listaEmpleados.get(idEmpleado).getApellidos() + ", "
                            + listaEmpleados.get(idEmpleado).getNombre()
                            + "\n\tFecha de nacimiento:\t" + listaEmpleados.get(idEmpleado).getFechanacimiento()
                            + "\n\tFecha de contratación: \t" + listaEmpleados.get(idEmpleado).getFechaContrato());
                    break;
                case 8:
                    break;
                default:
                    break;
            }

        } while (selection != 8);
        sc.close();

    }

    public static Empresa createCompany() {

        Empresa empresa = new Empresa();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre de la empresa nueva: ");
        empresa.nombre = sc.nextLine();
        System.out.println("Año de fundación de la empresa: ");
        empresa.anyodefundacion = sc.nextLine();

        return empresa;

    }

    public static Empleado createEmployee() {
        Empleado epl = new Empleado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        epl.setNombre(sc.nextLine());
        System.out.println("Apellidos:");
        epl.setApellidos(sc.nextLine());
        System.out.println("Fecha de nacimiento:");
        epl.setFechanacimiento(sc.nextLine());
        System.out.println("Fecha de contrato:");
        epl.setFechaContrato(sc.nextLine());

        return epl;
    }
}
