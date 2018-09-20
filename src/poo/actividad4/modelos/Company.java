package poo.actividad4.modelos;

import java.util.ArrayList;

public class Company {
    private String name, foundationYear;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name, String foundationYear, ArrayList<Employee> employees) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(String foundationYear) {
        this.foundationYear = foundationYear;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Nombre de empresa:\t" + name + "\n"
                + "Año de fundación: \t" + foundationYear + "\n"
                + "Empleados: " + employees + "\n";
    }
}