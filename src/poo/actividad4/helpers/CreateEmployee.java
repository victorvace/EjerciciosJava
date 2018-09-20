package poo.actividad4.helpers;

import poo.actividad4.modelos.Employee;

import java.util.Scanner;

public class CreateEmployee {
    public static Employee createEmployee() {

        Employee employee = new Employee();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        employee.setName(sc.nextLine());
        System.out.println("Apellidos:");
        employee.setLastName(sc.nextLine());
        System.out.println("Fecha de nacimiento:");
        employee.setBirthday(sc.nextLine());
        System.out.println("Fecha de contrato:");
        employee.setContractDate(sc.nextLine());

        return employee;
    }
}
