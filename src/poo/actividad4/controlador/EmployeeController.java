package poo.actividad4.controlador;

import poo.actividad4.modelos.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
    public Employee createEmployee() {

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

    public void showInfo(ArrayList<Employee> listEmployee){
        System.out.println("Selecciona un empleado:");
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println((i + 1) + ". " + listEmployee.get(i).getName());
        }
        Scanner sc = new Scanner(System.in);
        int idEmployee = (sc.nextInt() - 1);
        System.out.println(listEmployee.get(idEmployee).toString());
    }

    public void showList(ArrayList<Employee> listEmployees){
        for (int i = 0; i < listEmployees.size(); i++) {
            System.out.println((i + 1) + ".\t" + listEmployees.get(i).getName());
        }
    }

}
